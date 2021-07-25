# Write your MySQL query statement below
#select name as `Customers`from Customers where Id not in
#(select CustomerId from Orders);
select name as `Customers` from customers left join orders on customers.id=orders.customerid where orders.customerid is null;