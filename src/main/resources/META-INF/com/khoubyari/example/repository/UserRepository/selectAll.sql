SELECT public."User".user_id, gender_id, age, academic_id, school, major_id, times_id,english_id, term_id, skill, timing_id,
last_name, first_name,previous_id, public."User_previous".company_name, joined_year, public."User_previous".job_category_id,
public."User_previous".industry_id,public."User_hope".place_id,public."User_hope".company_name,scale_number_id,
work_id, public."User_hope".industry_id, public."User_hope".job_category_id, scale_type_id, income
FROM public."User"
JOIN public."User_previous" ON public."User".user_id=public."User_previous".user_id
JOIN public."User_hope" ON public."User".user_id=public."User_hope".user_id
WHERE public."User".user_id=/* user.getUserId() */'U01';