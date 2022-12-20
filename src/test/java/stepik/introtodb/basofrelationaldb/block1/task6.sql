/*
Выведите названия товаров, которые относятся к категории
'Cakes' или фигурируют в заказах текущий статус которых 'delivering'.
Результат не должен содержать одинаковых записей.
В запросе необходимо использовать оператор UNION для объединения выборок по разным условиям.
*/

SELECT good.name FROM good
    INNER JOIN category_has_good ON good.id = category_has_good.good_id
    INNER JOIN category ON category.id = category_has_good.category_id WHERE category.name = "Cakes"
UNION
SELECT good.name FROM good
    INNER JOIN sale_has_good ON good.id = sale_has_good.good_id
    INNER JOIN sale ON sale.id = sale_has_good.sale_id
    INNER JOIN status ON status.id = sale.status_id WHERE status.name = "delivering";

/*
Query result:
+--------------+
| name         |
+--------------+
| Trust-Dax    |
| Konksing     |
| Sancof       |
| Geo-Ity      |
| Transtraxing |
| Sailjob      |
| Volt Fan     |
| Zaam Warm    |
| Saoplus      |
| Statcom      |
| Re Hattip    |
| Saltsoft     |
+--------------+
Affected rows: 12
*/