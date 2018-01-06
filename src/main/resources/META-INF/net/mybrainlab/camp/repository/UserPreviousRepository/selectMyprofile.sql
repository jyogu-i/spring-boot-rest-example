SELECT public."User_previous".user_id,p_company_name,joined_year,
big_category,middle_category,small_category,big_category_id,middle_category_id,small_category_id,
big_industry,middle_industry,small_industry,big_industry_id,middle_industry_id,small_industry_id
FROM public."User_previous"
JOIN public."JobCategory" ON public."User_previous".p_job_category_id = public."JobCategory".job_category_id
JOIN public."Industry" ON public."User_previous".p_industry_id = public."Industry".industry_id
WHERE public."User_previous".user_id=/* userprevious.getUserId() */'test01';