/* Отобрать различные (уникальные) элементы столбца amount таблицы book. */

SELECT DISTINCT amount
FROM book;

/*
Query result:
+--------+
| amount |
+--------+
| 3      |
| 5      |
| 10     |
| 15     |
+--------+
Affected rows: 4
*/