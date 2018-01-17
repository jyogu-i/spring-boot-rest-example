INSERT INTO public."Chat" (user_id,ca_id,score) SELECT /* chat.getUserId() */'ddd3aqrdobmwhpyh',/* chat.getCaId() */'16',/* chat.getScore() */16
WHERE NOT EXISTS (SELECT user_id,ca_id FROM public."Chat" WHERE user_id=/* chat.getUserId() */'ddd3aqrdobmwhpyh' AND ca_id=/* chat.getCaId() */'16');

