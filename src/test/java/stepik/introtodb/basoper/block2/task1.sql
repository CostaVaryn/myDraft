-- Выведите общее количество заказов компании.

SELECT COUNT(project_name)
FROM project;

/*
Query result:
+---------------------+
| count(project_name) |
+---------------------+
| 100                 |
+---------------------+
Affected rows: 1
*/