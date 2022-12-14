/* Создать вспомогательную таблицу applicant, куда включить id образовательной программы,
id абитуриента, сумму баллов абитуриентов (столбец itog) в отсортированном сначала по id образовательной программы,
а потом по убыванию суммы баллов виде (использовать запрос из предыдущего урока). */

CREATE TABLE applicant AS
    SELECT program.program_id,
    enrollee.enrollee_id,
    SUM(result) AS itog
FROM enrollee
JOIN program_enrollee ON enrollee.enrollee_id = program_enrollee.enrollee_id
INNER JOIN program ON program_enrollee.program_id = program.program_id
INNER JOIN program_subject ON program.program_id = program_subject.program_id
INNER JOIN subject ON program_subject.subject_id = subject.subject_id
INNER JOIN enrollee_subject ON enrollee_subject.subject_id = subject.subject_id AND enrollee_subject.enrollee_id = enrollee.enrollee_id
GROUP BY program.program_id, enrollee.enrollee_id
ORDER BY program.program_id, itog DESC;
SELECT * FROM applicant;

/*
Affected rows: 14

Query result:
+------------+-------------+------+
| program_id | enrollee_id | itog |
+------------+-------------+------+
| 1          | 3           | 230  |
| 1          | 2           | 226  |
| 1          | 1           | 213  |
| 2          | 6           | 276  |
| 2          | 3           | 230  |
| 2          | 2           | 226  |
| 3          | 6           | 270  |
| 3          | 4           | 238  |
| 3          | 5           | 192  |
| 3          | 1           | 179  |
| 4          | 6           | 270  |
| 4          | 3           | 242  |
| 4          | 5           | 192  |
| 4          | 1           | 179  |
+------------+-------------+------+
Affected rows: 14
*/