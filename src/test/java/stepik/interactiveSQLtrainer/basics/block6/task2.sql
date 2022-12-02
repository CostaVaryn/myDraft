/* Вывести в алфавитном порядке фамилии и инициалы тех сотрудников, которые были в командировке в Москве. */

SELECT name
FROM trip
WHERE city IN('Москва')
GROUP BY name
ORDER BY name;

/*
Query result:
+---------------+
| name          |
+---------------+
| Абрамова К.А. |
| Баранов П.Е.  |
| Колесов С.П.  |
| Лебедев Т.К.  |
| Семенов И.В.  |
+---------------+
Affected rows: 5
*/