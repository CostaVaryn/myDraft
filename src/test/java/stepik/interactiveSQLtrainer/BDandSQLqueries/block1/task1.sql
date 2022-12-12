/* Вывести студентов, которые сдавали дисциплину «Основы баз данных», указать дату попытки и результат.
Информацию вывести по убыванию результатов тестирования. */

SELECT name_student, date_attempt, result
FROM attempt
INNER JOIN student USING(student_id)
INNER JOIN subject USING(subject_id)
WHERE subject_id = 2
ORDER BY 3 DESC;

/*
Query result:
+-----------------+--------------+--------+
| name_student    | date_attempt | result |
+-----------------+--------------+--------+
| Яковлева Галина | 2020-04-21   | 100    |
| Баранов Павел   | 2020-03-23   | 67     |
| Яковлева Галина | 2020-03-26   | 0      |
+-----------------+--------------+--------+
Affected rows: 3
*/