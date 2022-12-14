/* Поскольку при добавлении дополнительных баллов, абитуриенты по каждой образовательной программе могут следовать
не в порядке убывания суммарных баллов, необходимо создать новую таблицу applicant_order на основе таблицы applicant.
При создании таблицы данные нужно отсортировать сначала по id образовательной программы, потом по убыванию итогового балла.
А таблицу applicant, которая была создана как вспомогательная, необходимо удалить. */

CREATE TABLE applicant_order AS
SELECT applicant.program_id, applicant.enrollee_id, applicant.itog
FROM applicant
GROUP BY program_id, enrollee_id, itog
ORDER BY program_id, itog DESC;
DROP TABLE applicant;
SELECT * FROM applicant_order;

/*
Affected rows: 12
Affected rows: 0

Query result:
+------------+-------------+------+
| program_id | enrollee_id | itog |
+------------+-------------+------+
| 1          | 3           | 235  |
| 1          | 2           | 226  |
| 1          | 1           | 219  |
| 2          | 6           | 276  |
| 2          | 3           | 235  |
| 2          | 2           | 226  |
| 3          | 6           | 270  |
| 3          | 4           | 239  |
| 3          | 5           | 200  |
| 4          | 6           | 270  |
| 4          | 3           | 247  |
| 4          | 5           | 200  |
+------------+-------------+------+
Affected rows: 12
*/