select round(avg(a.event_date is not null),2) as fraction from (
    select player_id,min(event_date) as event_date from activity
    group by player_id
) as t
left join activity a
on a.player_id=t.player_id and a.event_date=DATE_ADD(t.event_date,INTERVAL 1 DAY);