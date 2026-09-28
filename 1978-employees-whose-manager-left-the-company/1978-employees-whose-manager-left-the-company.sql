select a1.employee_id from employees a1
left join employees a2
on a1.manager_id=a2.employee_id
where a1.salary<30000 and a1.manager_id is not null and a2.employee_id is null
order by a1.employee_id;