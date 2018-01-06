SELECT * FROM public."Message"
WHERE date=(SELECT MAX(date) FROM public."Message" WHERE chat_id=/* chat.getChatId() */1);