/*
Выведите список всех категорий продуктов и количество продаж товаров, относящихся к данной категории.
Под количеством продаж товаров подразумевается суммарное количество единиц товара данной категории,
фигурирующих в заказах с любым статусом.
*/

SELECT category.name, COUNT(sale.id) FROM category
    LEFT OUTER JOIN category_has_good ON category.id = category_has_good.category_id
    LEFT OUTER JOIN good ON good.id = category_has_good.good_id
    LEFT OUTER JOIN sale_has_good ON good.id = sale_has_good.good_id
    LEFT OUTER JOIN sale ON sale.id = sale_has_good.sale_id
GROUP BY category.name;

/*
Query result:
+---------------------+----------------+
| name                | COUNT(sale.id) |
+---------------------+----------------+
| Air Fresheners      | 25             |
| Bath Products       | 45             |
| Cakes               | 38             |
| Candy               | 39             |
| Dental Care         | 39             |
| Health & Medicine   | 49             |
| Juices              | 39             |
| Snacks              | 31             |
| Tea & Coffee        | 54             |
| Water               | 50             |
| Seasonings & Spices | 0              |
| Pasta & Noodles     | 0              |
| Fruits & Vegetables | 0              |
+---------------------+----------------+
Affected rows: 13
*/