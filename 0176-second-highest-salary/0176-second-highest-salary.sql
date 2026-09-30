# Write your MySQL query statement below
select distinct max(salary) as SecondHighestSalary from Employee
WHERE salary < (select max(salary) from Employee )
order by salary desc
limit 1;

-- SELECT MAX(salary)
-- FROM Employee
-- WHERE salary < (
--     SELECT MAX(salary)
--     FROM Employee
-- );