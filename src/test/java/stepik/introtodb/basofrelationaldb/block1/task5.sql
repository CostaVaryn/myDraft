/*
Выведите список всех источников клиентов и суммарный объем заказов по каждому источнику.
Результат должен включать также записи для источников, по которым не было заказов.
*/

SELECT source.name, SUM(sale.sale_sum) FROM source
LEFT OUTER JOIN client ON source.id = client.source_id
LEFT OUTER JOIN sale ON client.id = sale.client_id
GROUP BY source.name;

/*
Query result:
+---------------+--------------------+
| name          | SUM(sale.sale_sum) |
+---------------+--------------------+
| Direct link   | 72362.00           |
| Google search | 17330.00           |
| Campaign      | 49214.00           |
| AdWords       | 21623.00           |
| Advertisement | 89188.00           |
| Banner        | NULL               |
| SN            | 57043.00           |
+---------------+--------------------+
Affected rows: 7
*/