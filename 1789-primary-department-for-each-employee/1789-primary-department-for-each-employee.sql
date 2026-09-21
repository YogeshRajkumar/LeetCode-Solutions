select employee_id,
   case when count(*)=1 then department_id else
   max(case when primary_flag='Y' then department_id end)
   end as department_id 
from employee
group by employee_id;

-- select employee_id,department_id from employee
-- where primary_flag='Y'
-- union
-- select employee_id,department_id from employee
-- group by employee_id
-- having count(*)=1;