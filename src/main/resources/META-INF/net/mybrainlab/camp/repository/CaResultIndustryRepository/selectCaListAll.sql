select * from public."Ca_result_industry" JOIN public."Industry"
ON public."Ca_result_industry".industry_id=public."Industry".industry_id
where public."Ca_result_industry".ca_id=/* ca.getCaId() */'N1';