/* Удалить из таблицы supply книги тех авторов, общее количество экземпляров книг которых в таблице book превышает 10. */

DELETE FROM supply
WHERE author IN
    (SELECT author
    FROM book
    GROUP BY author
    HAVING SUM(amount)>10)
;
SELECT * FROM supply;

/*
Affected rows: 2
Query result:
+-----------+---------------+----------------+--------+--------+
| supply_id | title         | author         | price  | amount |
+-----------+---------------+----------------+--------+--------+
| 1         | Лирика        | Пастернак Б.Л. | 518.99 | 2      |
| 3         | Белая гвардия | Булгаков М.А.  | 540.50 | 7      |
+-----------+---------------+----------------+--------+--------+
Affected rows: 2
*/