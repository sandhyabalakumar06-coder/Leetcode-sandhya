-- Last updated: 8/13/2026, 3:44:30 PM
# Write your MySQL query statement below
SELECT stock_name,
       SUM(
           CASE
               WHEN operation = 'Sell' THEN price
               ELSE -price
           END
       ) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;