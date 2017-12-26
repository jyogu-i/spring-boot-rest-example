import pandas as pd
import sys
import boto3
from io import StringIO
import warnings
warnings.filterwarnings('ignore')

args = sys.argv

# ユーザーにマッチングされたCAのIDを格納
match_pair = []
# ユーザーにマッチングされたCAのscoreを格納
match_score = []

def main():
    ca_scoring()
    print_match_pair()

def ca_scoring():
    if len(args) > 3:
        wish_ind, wish_occ, wish_com = get_user_data()
        ca_list, df_ind, df_occ, df_com = get_ca_data()
        df_com['ca_id'] = df_com['ca_id'].astype(str)
    else:
        wish_ind, wish_occ = get_user_data()
        ca_list, df_ind, df_occ = get_ca_data()
    # ユーザーデータの大中項目抽出
    big_ind = str(wish_ind)[:1]
    middle_ind = str(wish_ind)[:2]
    big_occ = str(wish_occ)[:1]
    middle_occ = str(wish_occ)[:2]
    
    
    for ca in ca_list:
        score = 0
        if  len(df_ind[df_ind.ca_id == ca][df_ind.big_industry_id == big_ind]) != 0:
            score += 5
            if len(df_ind[df_ind.ca_id == ca][df_ind.middle_industry_id == middle_ind]) != 0:
                score += 1
                if len(df_ind[df_ind.ca_id == ca][df_ind.industry_id == wish_ind]) != 0:
                    score += 1
        if  len(df_occ[df_occ.ca_id == ca][df_occ.big_jobcategory_id == big_occ]) != 0:
            score += 12
            if len(df_occ[df_occ.ca_id == ca][df_occ.middle_jobcategory_id == middle_occ]) !=0:
                score += 2
                if len(df_occ[df_occ.ca_id == ca][df_occ.job_category_id == wish_occ]) != 0:
                    score += 1
        if len(args) > 3:
            if  len(df_com[df_com.ca_id == ca][df_com.company_name == wish_com]) != 0:
                score += 6
        if score >= 6:
            match_pair.append(ca)
            match_score.append(score)
    
def get_ca_data():
    df_ca, df_ind, df_occ, df_com = get_storage_data()
    ca_list = df_ca['ca_id']
    df_ind['big_industry_id'] = code_change(df_ind['industry_id'], 1)
    df_ind['middle_industry_id'] = code_change(df_ind['industry_id'], 2)
    del(df_ind['result_industry_id'], df_ind['industry_number'], df_ind['industry_closerate'])
    df_occ['big_jobcategory_id'] = code_change(df_occ['job_category_id'], 1)
    df_occ['middle_jobcategory_id'] = code_change(df_occ['job_category_id'], 2)
    del(df_occ['result_job_category_id'], df_occ['job_category_number'], df_occ['job_category_closerate'])
    if len(args) > 3:
        return ca_list, df_ind, df_occ, df_com
    else:
        return ca_list, df_ind, df_occ
    
# シェルコマンドからユーザーの情報を入手
def get_user_data():
    wish_ind = args[1]
    wish_occ = args[2]
    # 基本登録のみの場合は会社名が存在しない
    if len(args) > 3:
        wish_com = args[3]
        return wish_ind, wish_occ, wish_com
    else:
        return wish_ind, wish_occ

# CAの情報をS3から取得
def get_storage_data():
    s3 = boto3.resource('s3')
    bucket = s3.Bucket('co-lab-camp')
    
    # CAのID一覧を取得
    GET_OBJECT_KEY_NAME = 'ca_result/ca.csv'
    obj = bucket.Object(GET_OBJECT_KEY_NAME)
    response = obj.get()
    body = response['Body'].read()
    content = body.decode('utf-8')
    df_ca = pd.read_csv(StringIO(content))
    
    #CAの強い業種を取得
    GET_OBJECT_KEY_NAME = 'ca_result/industry.csv'
    obj = bucket.Object(GET_OBJECT_KEY_NAME)
    response = obj.get()
    body = response['Body'].read()
    content = body.decode('utf-8')
    df_ind = pd.read_csv(StringIO(content))
    
    # CAの強い職種を取得
    GET_OBJECT_KEY_NAME = 'ca_result/job_category.csv'
    obj = bucket.Object(GET_OBJECT_KEY_NAME)
    response = obj.get()
    body = response['Body'].read()
    content = body.decode('utf-8')
    df_occ = pd.read_csv(StringIO(content))
    
    # CAの公開企業名を取得
    GET_OBJECT_KEY_NAME = 'ca_result/company.csv'
    obj = bucket.Object(GET_OBJECT_KEY_NAME)
    response = obj.get()
    body = response['Body'].read()
    content = body.decode('utf-8')
    df_com = pd.read_csv(StringIO(content))
    
    return df_ca, df_ind, df_occ, df_com

# 大項目、中項目の抽出
def code_change(df, int1):
    df = df.astype(str)
    code_list = []
    for code in df:
        code_list.append(code[:int1])
    return code_list

# javaで受け取るために、ca_id、scoreの順で表示
def print_match_pair():
    for i in range(len(match_pair)):
        print (match_pair[i], end='')
        #print(',', end='')
        #print (match_score[i], end='')
        if len(match_pair) > i + 1:
            print(',', end='')

if __name__ == "__main__":
    main()

# python3 match.py 'E000' '1101' '株式会社リクルートコミュニケーションズ'
# python3 match.py 'E000' '1101' 