select round(
       avg(case when t.order_date=d.customer_pref_delivery_date then 1.0 else 0.0 end)*100
    ,2) as immediate_percentage
from delivery d
inner join (
    select customer_id,min(order_date) as order_date from delivery
    group by customer_id
) as t
on d.customer_id=t.customer_id and d.order_date=t.order_date