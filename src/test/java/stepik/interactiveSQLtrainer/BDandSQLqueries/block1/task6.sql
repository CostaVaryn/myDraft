/* Случайным образом отберите 3 вопроса по дисциплине «Основы баз данных».
В результат включите столбцы question_id и name_question. */

SELECT question_id, name_question
FROM question
INNER JOIN subject USING(subject_id)
WHERE subject_id = 2
ORDER BY RAND()
LIMIT 3;

/*
Query result:
+-------------+----------------------------------------+
| question_id | name_question                          |
+-------------+----------------------------------------+
| 6           | База данных - это:                     |
| 7           | Отношение - это:                       |
| 8           | Концептуальная модель используется для |
+-------------+----------------------------------------+
Affected rows: 3
*/