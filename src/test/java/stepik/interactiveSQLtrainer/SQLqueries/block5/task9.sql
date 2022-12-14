/* Завершить этап «Оплата» для заказа с номером 5, вставив в столбец date_step_end дату 13.04.2020,
и начать следующий этап («Упаковка»), задав в столбце date_step_beg для этого этапа ту же дату.
Реализовать два запроса для завершения этапа и начала следующего.
Они должны быть записаны в общем виде, чтобы его можно было применять для любых этапов, изменив только текущий этап.
Для примера пусть это будет этап «Оплата». */

UPDATE buy_step
SET date_step_end = '2020-04-13'
WHERE buy_id = 5 AND step_id = 1;
UPDATE buy_step
SET date_step_beg = '2020-04-13'
WHERE buy_id = 5 AND step_id = 2;
SELECT * FROM buy_step
WHERE buy_id = 5;

/*
Affected rows: 1

Affected rows: 1

Query result:
+-------------+--------+---------+---------------+---------------+
| buy_step_id | buy_id | step_id | date_step_beg | date_step_end |
+-------------+--------+---------+---------------+---------------+
| 17          | 5      | 1       | 2020-04-12    | 2020-04-13    |
| 18          | 5      | 2       | 2020-04-13    | NULL          |
| 19          | 5      | 3       | NULL          | NULL          |
| 20          | 5      | 4       | NULL          | NULL          |
+-------------+--------+---------+---------------+---------------+
Affected rows: 4
*/