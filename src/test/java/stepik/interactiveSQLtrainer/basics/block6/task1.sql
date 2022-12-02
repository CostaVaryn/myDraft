/* Вывести из таблицы trip информацию о командировках тех сотрудников, фамилия которых заканчивается на букву «а»,
в отсортированном по убыванию даты последнего дня командировки виде.
В результат включить столбцы name, city, per_diem, date_first, date_last. */

SELECT name, city, per_diem, date_first, date_last
FROM trip
WHERE name LIKE "_%а %"
ORDER BY date_last DESC;

/*
Query result:
+---------------+-----------------+----------+------------+------------+
| name          | city            | per_diem | date_first | date_last  |
+---------------+-----------------+----------+------------+------------+
| Абрамова К.А. | Владивосток     | 450.00   | 2020-07-02 | 2020-07-13 |
| Федорова А.Ю. | Томск           | 450.00   | 2020-06-20 | 2020-06-26 |
| Абрамова К.А. | Санкт-Петербург | 700.00   | 2020-05-28 | 2020-06-04 |
| Федорова А.Ю. | Новосибирск     | 450.00   | 2020-05-25 | 2020-06-04 |
| Абрамова К.А. | Москва          | 700.00   | 2020-04-06 | 2020-04-14 |
| Абрамова К.А. | Москва          | 700.00   | 2020-02-23 | 2020-03-01 |
| Абрамова К.А. | Владивосток     | 450.00   | 2020-01-14 | 2020-01-27 |
+---------------+-----------------+----------+------------+------------+
Affected rows: 7
*/