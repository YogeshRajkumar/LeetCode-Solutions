delete a2 from person a1
left join person a2
on a1.email=a2.email
where a1.id<a2.id;