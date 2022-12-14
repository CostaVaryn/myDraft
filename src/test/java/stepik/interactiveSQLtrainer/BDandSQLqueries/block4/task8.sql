/* Придумайте один или несколько запросов корректировки данных для предметной области «Абитуриент». */

ALTER TABLE enrollee_achievement ADD str_num INT FIRST;
SET @row_num := 0;
UPDATE enrollee_achievement
    SET str_num = (@row_num := @row_num + 1);
SELECT * FROM enrollee_achievement;

/*
Affected rows: 0
Affected rows: 0
Affected rows: 6
Query result:
+---------+--------------------+-------------+----------------+
| str_num | enrollee_achiev_id | enrollee_id | achievement_id |
+---------+--------------------+-------------+----------------+
| 1       | 1                  | 1           | 2              |
| 2       | 2                  | 1           | 3              |
| 3       | 3                  | 3           | 1              |
| 4       | 4                  | 4           | 4              |
| 5       | 5                  | 5           | 1              |
| 6       | 6                  | 5           | 3              |
+---------+--------------------+-------------+----------------+
Affected rows: 6
*/