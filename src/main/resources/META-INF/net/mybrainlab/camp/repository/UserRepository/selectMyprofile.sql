select public."User".user_id,gender,age,school,major,times,english,term_id,skill,timing_id,last_name,first_name,cellphone
,update,h_company_name,place_id,scale_number,scale_type_id,work_id,big_industry,middle_industry,small_industry,
big_category,middle_category,small_category,income,p_company_name,joined_year
from public."User"
JOIN public."User_hope" ON public."User".user_id=public."User_hope".user_id
JOIN public."User_previous" ON public."User".user_id=public."User_previous".user_id
JOIN public."Gender" ON public."User".gender_id=public."Gender".gender_id
join public."Major" on public."Major".major_id=public."User".major_id
join public."English" on public."English".english_id=public."User".english_id
join public."Times" on public."Times".times_id=public."User".times_id
join public."Scale_number" on public."Scale_number".scale_number_id=public."User_hope".scale_number_id
join public."Industry" on public."User_hope".h_industry_id=public."Industry".industry_id
join public."JobCategory" on public."User_hope".h_job_category_id=public."JobCategory".job_category_id
where public."User".user_id=/* chat.getUserId() */'U1';