# Write your MySQL query statement below

select p.firstName,p.lastName,a.city,a.state from person p
left join address a
on p.personid=a.personid;

-- select person.firstName,person.lastName,address.city,address.state from person
-- left join address
-- on person.personid=address.personid;