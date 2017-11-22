UPDATE public."User_hope" SET
	company_name=/* userhope.getCompanyName() */'hogeCom',
	place_id=/* userhope.getPlaceId() */'1',
	scale_type_id=/* userhope.getScaleTypeId() */'1',
	scale_number_id=/* userhope.getScaleNumberId() */'1',
	work_id=/* userhope.getWorkId() */'1',
	job_category_id=/* userhope.getJobCategoryId() */'1',
	income=/* userhope.getIncome() */500
	WHERE user_id=/* userhope.getUserId() */'U1';