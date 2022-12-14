/* Вывести информацию о командировках во все города кроме Москвы и Санкт-Петербурга
(фамилии и инициалы сотрудников, город, длительность командировки в днях,
при этом первый и последний день относится к периоду командировки).
Последний столбец назвать Длительность.
Информацию вывести в упорядоченном по убыванию длительности поездки,
а потом по убыванию названий городов (в обратном алфавитном порядке). */

SELECT name, city, DATEDIFF(date_last, date_first) + 1 AS Длительность
FROM trip
WHERE city NOT IN('Москва', 'Санкт-Петербург')
ORDER BY 3 DESC;

/*
Query result:
+---------------+-------------+--------------+
| name          | city        | Длительность |
+---------------+-------------+--------------+
| Ильиных Г.Р.  | Владивосток | 22           |
| Баранов П.Е.  | Новосибирск | 17           |
| Колесов С.П.  | Новосибирск | 15           |
| Абрамова К.А. | Владивосток | 14           |
| Лебедев Т.К.  | Томск       | 12           |
| Абрамова К.А. | Владивосток | 12           |
| Федорова А.Ю. | Новосибирск | 11           |
| Колесов С.П.  | Новосибирск | 10           |
| Федорова А.Ю. | Томск       | 7            |
| Баранов П.Е.  | Воронеж     | 7            |
+---------------+-------------+--------------+
Affected rows: 10
*/