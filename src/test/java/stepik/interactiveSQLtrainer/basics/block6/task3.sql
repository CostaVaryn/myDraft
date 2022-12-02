/* Для каждого города посчитать, сколько раз сотрудники в нем были.
Информацию вывести в отсортированном в алфавитном порядке по названию городов.
Вычисляемый столбец назвать Количество. */

SELECT city, count(city) AS Количество
FROM trip
GROUP BY city
ORDER BY city;

/*
Query result:
+-----------------+------------+
| city            | Количество |
+-----------------+------------+
| Владивосток     | 3          |
| Воронеж         | 1          |
| Москва          | 7          |
| Новосибирск     | 4          |
| Санкт-Петербург | 3          |
| Томск           | 2          |
+-----------------+------------+
Affected rows: 6
*/