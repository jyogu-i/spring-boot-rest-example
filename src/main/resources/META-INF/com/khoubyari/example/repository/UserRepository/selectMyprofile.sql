select * from public."User" JOIN public."User_hope"
ON public."User".user_id=public."User_hope".user_id
JOIN public."User_previous" ON public."User".user_id=public."User_previous".user_id
where public."User".user_id=/* user.getUserId() */'U1';