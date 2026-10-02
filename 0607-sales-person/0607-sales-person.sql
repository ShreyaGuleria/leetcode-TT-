# Write your MySQL query statement below
select name from SalesPerson
WHERE sales_id NOT IN(
    SELECT o.sales_id from Orders as o
    Join Company as c
    ON o.com_id = c.com_id
    WHERE c.name = "Red"

);