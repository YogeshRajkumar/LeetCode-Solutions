select a1.name from employee a1
inner join (
    select managerId from employee
    group by managerId
    having count(managerId)>=5
)as a2
on a1.id=a2.managerId;