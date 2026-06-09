-- Write your query below
select s.seller_name 
from seller s
LEFT JOIN  orders o
on o.seller_id=s.seller_id  and  EXTRACT(YEAR FROM o.sale_date) ='2020'
where o.order_id is NULL
order by s.seller_name;
