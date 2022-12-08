/* Придумайте один или несколько запросов корректировки данных для предметной области «Интернет-магазин книг». */

INSERT INTO buy_step(buy_id, step_id)
SELECT 2, step_id
FROM buy INNER JOIN buy_step USING(buy_id)
CROSS JOIN step USING(step_id)
GROUP BY step_id;
UPDATE buy_step
SET date_step_end = '2020-04-13'
WHERE buy_id = 5 AND step_id = 1;
UPDATE buy_step
SET date_step_beg = '2020-04-13'
WHERE buy_id = 5 AND step_id = 2;
UPDATE buy_step
SET date_step_beg = IF(buy_id = 4, '2021-01-01', '2020-01-01');
UPDATE buy_step
SET date_step_end = IF(buy_id = 4, '2022-01-01', '2021-01-01');
SELECT * FROM buy_step
WHERE step_id = 4;

/*
Affected rows: 4

Affected rows: 0

Affected rows: 0

Affected rows: 20

Affected rows: 20

Query result:
+-------------+--------+---------+---------------+---------------+
| buy_step_id | buy_id | step_id | date_step_beg | date_step_end |
+-------------+--------+---------+---------------+---------------+
| 4           | 1      | 4       | 2020-01-01    | 2021-01-01    |
| 8           | 2      | 4       | 2020-01-01    | 2021-01-01    |
| 12          | 3      | 4       | 2020-01-01    | 2021-01-01    |
| 16          | 4      | 4       | 2021-01-01    | 2022-01-01    |
| 20          | 2      | 4       | 2020-01-01    | 2021-01-01    |
+-------------+--------+---------+---------------+---------------+
Affected rows: 5
*/