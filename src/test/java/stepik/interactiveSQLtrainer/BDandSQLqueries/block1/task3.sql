/* Вывести студентов (различных студентов), имеющих максимальные результаты попыток.
Информацию отсортировать в алфавитном порядке по фамилии студента. */

SELECT name_student, result
FROM attempt
INNER JOIN student USING(student_id)
WHERE result = (SELECT MAX(result)
FROM attempt)
ORDER BY 1;

/*
Query result:
+-----------------+--------+
| name_student    | result |
+-----------------+--------+
| Семенов Иван    | 100    |
| Яковлева Галина | 100    |
+-----------------+--------+
Affected rows: 2
*/