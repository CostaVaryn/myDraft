/* Придумайте один или несколько запросов корректировки данных для предметной области «Тестирование». */

INSERT INTO attempt (student_id, subject_id, date_attempt, result)
SELECT
    (SELECT student_id FROM student WHERE name_student LIKE 'Семенов %'),
    (SELECT subject_id FROM subject WHERE name_subject LIKE 'Основы SQL'),
    NOW(),
    NULL;
INSERT testing (attempt_id, question_id)
SELECT
    (SELECT MAX(attempt_id) FROM attempt),
    question_id
FROM question
INNER JOIN attempt USING (subject_id)
WHERE attempt_id = (SELECT MAX(attempt_id) FROM attempt)
ORDER BY RAND()
LIMIT 3;
UPDATE attempt
SET result = (
    SELECT ROUND((SUM(is_correct)/3)*100, 2)
    FROM answer INNER JOIN testing ON answer.answer_id = testing.answer_id
    WHERE testing.attempt_id = 8)
WHERE attempt.attempt_id = 8;
SELECT * FROM testing;

/*
Affected rows: 1
Affected rows: 3
Affected rows: 0

Query result:
+------------+------------+-------------+-----------+
| testing_id | attempt_id | question_id | answer_id |
+------------+------------+-------------+-----------+
| 1          | 1          | 9           | 25        |
| 2          | 1          | 7           | 19        |
| 3          | 1          | 6           | 17        |
| 4          | 2          | 3           | 9         |
| 5          | 2          | 1           | 2         |
| 6          | 2          | 4           | 11        |
| 7          | 3          | 6           | 18        |
| 8          | 3          | 8           | 24        |
| 9          | 3          | 9           | 28        |
| 10         | 4          | 1           | 2         |
| 11         | 4          | 5           | 16        |
| 12         | 4          | 3           | 10        |
| 13         | 5          | 2           | 6         |
| 14         | 5          | 1           | 2         |
| 15         | 5          | 4           | 12        |
| 16         | 6          | 6           | 17        |
| 17         | 6          | 8           | 22        |
| 18         | 6          | 7           | 21        |
| 19         | 7          | 1           | 3         |
| 20         | 7          | 4           | 11        |
| 21         | 7          | 5           | 16        |
| 22         | 8          | 2           | NULL      |
| 23         | 8          | 4           | NULL      |
| 24         | 8          | 5           | NULL      |
+------------+------------+-------------+-----------+
Affected rows: 24
*/