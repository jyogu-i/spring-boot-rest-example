
# coding: utf-8

# ライブラリ
import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
import codecs
import sys
from sklearn.ensemble import RandomForestClassifier

# データをcsvから取得
with codecs.open("1113_dev_cadata.txt", "r", "UTF-8", "ignore") as file:
    df = pd.read_table(file, delimiter=",")

# 業種大、職種大の変換（大項目、文字列に変更）
def change(str1, str2, int1):
    df[[str1]] = df[[str1]].astype(str)
    list1 = []
    for syokusyu in df[str1]:
        list1.append(syokusyu[:int1])
    df[str2] = list1
    
# 業種大MNV→CAMP専用変換　＊途中
def ind_change(str1, str2, str3):
    df[[str2]] = df[[str1]].astype(str)
    camp_list = []
    for syokusyu in df[str2]:
        camp_list.append(syokusyu[:2])
    df[str3] = camp_list
    ind_mapping = {}
    df[str3] = df[str3].map(ind_mapping)
    #for x, y in zip(camp_list, df[str2]):
        #if
    
# 転職関数連続変数化→null値の処理
def expnum_change():
    df['EXPCOMP_NUM'] = df['EXPCOMP_NUM'].replace(np.NaN, 0)
    
# 性別（１：２：を0:1:に変換）（0で登録されているものは0のままに）
def sex_flg_change():
    sex_mapping = {2:1, 1:0, 0:0}
    df['SEX_FLG'] = df['SEX_FLG'].map(sex_mapping)
    
# 年齢カテゴリー分け→カテゴリー分けすべきか否か？
def age_category(str1, str2):
    list1 = []
    for age in df[str1]:
        if 15 <= age < 20:
            age_category = 15
        elif 20 <= age < 25:
            age_category = 20
        elif 25 <= age < 30:
            age_category = 25
        elif 30 <= age < 35:
            age_category = 30
        elif 35 <= age < 40:
            age_category = 35
        elif 40 <= age < 45:
            age_category = 40
        elif 45 <= age < 50:
            age_category = 45
        elif 50 <= age < 55:
            age_category = 50
        elif 55 <= age < 60:
            age_category = 55
        elif 60 <= age < 65:
            age_category = 60
        elif 65 <= age < 70:
            age_category = 65
        elif 70 <= age < 75:
            age_category = 70
        else:
            age_category = 99
        list1.append(age_category)
    df[str2] = list1
age_category('YEARAGE', 'age_category')

# 各項目に変換関数実行
sex_flg_change()
expnum_change()
change('EXPINDSCTG1_ID', 'EXPgyousyuall', 4)
change('EXPINDSCTG1_ID', 'EXPgyousyu1', 2)
change('EXPOCUPCTG1_ID', 'EXPsyokusyu1', 1)
change('OCUPCTG1_ID', 'syokusyu1', 1)
change('INDSCTG_ID', 'gyousyu', 2)

# 分類のアルゴリズムに適用させるために分類変数をダミー変数を生成 職種詳細などは過学習気味か…？
perfect_df = pd.get_dummies(df[['age_category', 'SEX_FLG', 'EXPCOMP_NUM', 'EXPgyousyu1', 'EXPsyokusyu1', 'gyousyu', 'syokusyu1', 'EXPgyousyuall', 'OCUPCTG1_ID']])

# ユーザーデータ入力
def user_info():
    args = sys.argv
    return [user_data(args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9])]
    #return [user_data(25, 0, 0, "21", "4", "10", "4", "2110", "4206")]

# ユーザーのデータをダミー変数に対応させる
def user_data(age, sex, expcomp, ind, syoku, wish_ind, wish_syoku, ind_detail, syoku_detail):
    user_data = []
    for a in perfect_df.columns:
        if a == "age_category":
            user_data.append(age)
        elif a == "SEX_FLG":
            user_data.append(sex)
        elif a == "EXPCOMP":
            user_data.append(expcomp)
        elif a == "EXPgyousyu1_"+ ind:
            user_data.append(1)
        elif a == "EXPsyokusyu1_"+syoku:
            user_data.append(1)
        elif a == "gyousyu_"+ wish_ind:
            user_data.append(1)
        elif a == "syokusyu1_"+wish_syoku:
            user_data.append(1)
        elif a == "EXPgyousyuall_"+ind_detail:
            user_data.append(1)
        elif a == "OCUPCTG1_ID_"+syoku_detail:
            user_data.append(1)
        else:
            user_data.append(0)
    return user_data
  
# モデルデータ設定
def training_label():
    return df['CAREER_CHARGE_ID'].values

def training_data():
    return perfect_df.values

# RandomForest実行
def output():
    trainingdata = training_data()
    traininglabel = training_label()
    testdata = user_info()
    # 決定木の数何が最適かどうか（10デフォルト）
    model = RandomForestClassifier(n_estimators=10)
    # CAを予測(50回回す)→回せば回すほど増える… やり方は要検討です
    ca_id_list = []
    for var in range(0, 50):
        model.fit(trainingdata, traininglabel)
        output = model.predict(testdata)
        for label in output: ca_id_list.append(label)
    # 一度でも出た場合
    # ca_list_uniq = list(set(ca_id_list))
    # ca_list_uniq
    # 複数出た場合
    match = []
    for cd in ca_id_list:
        if ca_id_list.count(cd) > 1:
            if match.count(cd) < 1:
                match.append(cd)
    #print (model.feature_importances_)
    return print(match)

output()

# 選ばれたCA個人のデータ（割合）
def show_ca_rate(int1, str1):
    G = df[df.CAREER_CHARGE_ID == int1][str1]
    c_detail = G.value_counts()
    print(c_detail)
    # 率
    # print((c_detail / len(G.index)) * 100)
    print(len(G.index))
    # 円グラフ
    # c_detail.plot( kind='pie', y = 'se')

#show_ca_rate(239, 'EXPgyousyu1')
#for per in match:show_ca_rate(per, 'syokusyu1')
#for per in match:show_ca_rate(per, 'EXPgyousyu1')
#for per in match:show_ca_rate(per, 'EXPsyokusyu1')
#for per in match:show_ca_rate(per, 'EXPCOMP_NUM')
#for per in match:show_ca_rate(per, 'SEX_FLG')
#for per in match:show_ca_rate(per, 'EXPgyousyuall')
