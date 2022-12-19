/*
Выведите количество товаров в каждой категории. Результат должен содержать два столбца:
название категории,
количество товаров в данной категории.
*/

SELECT
	category,
    COUNT(product_name) AS quantity
FROM store
GROUP BY category
ORDER BY quantity DESC;

/*
Query result:
+-------------------+----------+
| category          | quantity |
+-------------------+----------+
| Air Fresheners    | 17       |
| Tea & Coffee      | 16       |
| Snacks            | 13       |
| Cakes             | 12       |
| Health & Medicine | 11       |
| Water             | 11       |
| Candy             | 7        |
| Juices            | 6        |
| Bath Products     | 4        |
| Dental Care       | 3        |
+-------------------+----------+
Affected rows: 10
*/