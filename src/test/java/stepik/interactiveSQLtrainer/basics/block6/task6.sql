/* Вывести информацию о командировках сотрудника(ов), которые были самыми короткими по времени.
В результат включить столбцы name, city, date_first, date_last. */

SELECT name, city, date_first, date_last
FROM trip
WHERE DATEDIFF(date_last, date_first) =
    (SELECT MIN(DATEDIFF(date_last, date_first))
    FROM trip)
;

/*
Query result:
+--------------+-----------------+------------+------------+
| name         | city            | date_first | date_last  |
+--------------+-----------------+------------+------------+
| Семенов И.В. | Санкт-Петербург | 2020-06-01 | 2020-06-03 |
+--------------+-----------------+------------+------------+
Affected rows: 1
*/