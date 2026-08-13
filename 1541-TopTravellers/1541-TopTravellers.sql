-- Last updated: 8/13/2026, 3:44:27 PM
# Write your MySQL query statement below
SELECT u.name,
       COALESCE(SUM(r.distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r
    ON u.id = r.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC,
         u.name ASC;