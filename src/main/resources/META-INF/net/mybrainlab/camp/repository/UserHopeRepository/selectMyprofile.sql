SELECT public."User_hope".user_id, h_company_name, place_id, scale_number_id, work_id,scale_type_id, income,
big_industry,middle_industry,small_industry,big_industry_id,middle_industry_id,small_industry_id,
big_category,middle_category,small_category,big_category_id,middle_category_id,small_category_id
FROM public."User_hope"
JOIN public."JobCategory" ON public."User_hope".h_job_category_id = public."JobCategory".job_category_id
JOIN public."Industry" ON public."User_hope".h_industry_id = public."Industry".industry_id
WHERE public."User_hope".user_id=/* userhope.getUserId() */'test01';