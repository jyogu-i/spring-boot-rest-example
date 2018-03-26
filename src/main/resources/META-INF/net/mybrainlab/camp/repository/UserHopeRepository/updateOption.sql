UPDATE public."User_hope" SET
	income=/* userhope.getIncome() */'500',
	place_id=/* userhope.getPlaceId() */'1',
	scale_number_id=/* userhope.getScaleNumberId() */'1',
	scale_type_id=/* userhope.getScaleTypeId() */'1',
	work_id=/* userhope.getWorkId() */'1'
WHERE user_id=/* userhope.getUserId() */'U1';