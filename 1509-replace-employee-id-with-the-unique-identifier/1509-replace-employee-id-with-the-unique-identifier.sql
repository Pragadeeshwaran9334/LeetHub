# Write your MySQL query statement 
select EmployeeUNI.unique_id,Employees.name from Employees left join EmployeeUNI on Employees.id=EmployeeUNI.id;