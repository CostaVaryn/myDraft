/* Вывести образовательные программы, которые имеют самый большой план набора,  вместе с этой величиной. */

SELECT name_program, plan
FROM program
GROUP BY name_program, plan
HAVING plan = (
    SELECT plan
    FROM program
    WHERE plan = 3
);

/*
Query result:
+-----------------------------+------+
| name_program                | plan |
+-----------------------------+------+
| Мехатроника и робототехника | 3    |
+-----------------------------+------+
Affected rows: 1
*/