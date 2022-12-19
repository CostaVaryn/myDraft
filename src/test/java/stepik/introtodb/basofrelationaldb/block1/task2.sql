/*
Выведите список клиентов (имя, фамилия) и количество заказов данных клиентов, имеющих статус "new".
*/

SELECT client.first_name, client.last_name, count(1) AS new_sale_num
FROM client
INNER JOIN sale ON client.id = sale.client_id
INNER JOIN status ON sale.status_id = status.id WHERE status.name = "new"
GROUP BY first_name, last_name;

/*
Query result:
+------------+-----------+--------------+
| first_name | last_name | new_sale_num |
+------------+-----------+--------------+
| Ellis      | Ortega    | 1            |
| Lowell     | Hamilton  | 3            |
| Bessie     | Reynolds  | 1            |
| Sherman    | Rogers    | 1            |
| Maggie     | Jennings  | 1            |
| Kristy     | Dean      | 1            |
| Brandon    | Porter    | 2            |
+------------+-----------+--------------+
Affected rows: 7
*/