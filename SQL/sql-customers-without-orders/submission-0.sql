-- Write your query below
select c.name from customers c LEFT JOIN orders o on  c.id=o.customer_id where o.id is NULL;