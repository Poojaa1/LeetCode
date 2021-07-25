# Write your MySQL query statement below
#select Email from Person Group by Email having count(Email)>1;
select DISTINCT p1.Email from person p1, person p2 where p1.email=p2.email and p1.id!=p2.id;