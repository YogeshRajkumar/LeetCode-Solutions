select customers.name as customers from customers
left join orders
on customers.id=orders.customerid
where customerid is null;  