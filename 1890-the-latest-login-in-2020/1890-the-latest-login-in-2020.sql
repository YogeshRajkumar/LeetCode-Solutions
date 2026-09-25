select user_id,max(time_stamp) as last_stamp from logins
where '2020-01-01'<=time_stamp and time_stamp<'2021-01-01'
group by user_id;
