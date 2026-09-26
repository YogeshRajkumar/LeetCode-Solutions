select user_id,email from users
where email REGEXP '^[a-zA-Z0-9]+@+[a-z]+\\.com$'
order by user_id;