select * from public."Ca_result_job_category" JOIN public."JobCategory"
ON public."Ca_result_job_category".job_category_id=public."JobCategory".job_category_id
where public."Ca_result_job_category".ca_id=/* ca.getCaId() */'N1';