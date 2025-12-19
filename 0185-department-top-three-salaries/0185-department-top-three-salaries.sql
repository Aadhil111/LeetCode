# Write your MySQL query statement below
select 
    d.name as Department ,
    e.name as Employee ,
    e.Salary as Salary
    from Employee e , Department d 
    where e.departmentId = d.id 
    and (select count(distinct Salary) from employee 
    where departmentId = e.departmentId and salary > e.salary) <3
    order by e.departmentId , e.salary desc;

