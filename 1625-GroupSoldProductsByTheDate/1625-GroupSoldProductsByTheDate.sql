-- Last updated: 8/13/2026, 3:44:19 PM
# Write your MySQL query statement below
SELECT
  sell_date,
  COUNT(DISTINCT product) AS num_sold,
  GROUP_CONCAT(DISTINCT product ORDER BY product) AS products
FROM Activities
GROUP BY 1;