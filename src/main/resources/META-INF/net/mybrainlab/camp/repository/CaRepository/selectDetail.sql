select public."Ca".ca_id,ca_name,ca_company,ca_img,pr_message,max_flg,ca_company_place,phone_number,gender_id,place_id
,ca_company_url,ca_yomigana,intro_message,favo
from public."Ca"
JOIN public."Chat"
ON public."Ca".ca_id=public."Chat".ca_id
where public."Ca".ca_id=/* chat.getCaId() */'N1' and user_id=/* chat.getUserId() */'N1';