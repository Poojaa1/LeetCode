# Write your MySQL query statement below
#select score,RANK() over(order  by score DESC) as `Rank` from Scores;

SELECT Score, 
       DENSE_RANK() OVER(ORDER BY Score DESC) as `Rank` from Scores order by `Rank`;