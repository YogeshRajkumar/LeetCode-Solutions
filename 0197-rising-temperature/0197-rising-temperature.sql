select a2.id from weather a1
join weather a2
on datediff(a2.recorddate,a1.recorddate) = 1
where a1.temperature<a2.temperature;