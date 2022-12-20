/*
Выведите список источников, из которых не было клиентов,
либо клиенты пришедшие из которых не совершали заказов или отказывались от заказов.
Под клиентами, которые отказывались от заказов, необходимо понимать клиентов,
у которых есть заказы, которые на момент выполнения запроса находятся в состоянии 'rejected'.
В запросе необходимо использовать оператор UNION для объединения выборок по разным условиям.
*/

SELECT source.name FROM source
    WHERE NOT EXISTS (SELECT * FROM client WHERE client.source_id = source.id)
UNION
SELECT source.name FROM source
    INNER JOIN client ON source.id = client.source_id
    INNER JOIN sale ON client.id = sale.client_id
    INNER JOIN status ON status.id = sale.status_id WHERE status.name = "rejected";

/*
Query result:
+---------------+
| name          |
+---------------+
| Banner        |
| Google search |
| Direct link   |
| Advertisement |
| Campaign      |
| SN            |
+---------------+
Affected rows: 6
*/