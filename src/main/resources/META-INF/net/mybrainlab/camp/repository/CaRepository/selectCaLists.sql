SELECT public."Ca".ca_id, ca_name, ca_company, ca_img, pr_message, max_flg, ca_company_place, phone_number, gender_id, place_id, ca_company_url, ca_yomigana, intro_message
FROM public."Ca"
JOIN public."Chat"
ON public."Ca".ca_id=public."Chat".ca_id
WHERE public."Chat".user_id=/* chat.getUserId() */'test01' AND public."Chat".flg=2;