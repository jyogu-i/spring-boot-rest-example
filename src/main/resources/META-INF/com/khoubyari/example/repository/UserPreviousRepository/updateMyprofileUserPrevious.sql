UPDATE public."User_previous" SET
	company_name=/* userprevious.getCompanyName() */'com',
	joined_year=/* userprevious.getJoinedYear() */2000,
	job_category_id=/* userprevious.getJobCategoryId() */'1001'
	WHERE user_id=/* userprevious.getUserId() */'01' and previous_id=/* userprevious.getPreviousId() */'01';