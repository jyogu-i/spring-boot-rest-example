UPDATE public."User" SET
	gender_id=/* user.getGenderId() */'1',
	age=/* user.getAge() */25,
	academic_id=/* user.getAcademicId() */'1',
	school=/* user.getSchool() */'univ',
	major_id=/* user.getMajorId() */'1',
	times_id=/* user.getTimesId() */'1',
	english_id=/* user.getEnglishId() */'1',
	term_id=/* user.getTermId() */'1',
	skill=/* user.getSkill() */'hge',
	timing_id=/* user.getTimingId() */'1',
	name=/* user.getName() */'sekine',
    yomigana=/* user.getYomigana() */'sekine'
    WHERE user_id=/* user.getUserId() */'U1';