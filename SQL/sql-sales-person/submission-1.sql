-- Write your query below
select sp.name from sales_person sp
where sp.sales_id not in (
    select o.sales_id from orders o
    JOIN company c
    on o.com_id=c.com_id and
    c.name='CRIMSON'
)