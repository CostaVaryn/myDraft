/* Придумайте один или несколько запросов корректировки данных к  таблицам book и  supply. */

INSERT INTO book (title, author, price, amount)
SELECT title, author, price, amount
FROM supply
WHERE author NOT IN
    (SELECT author
    FROM book)
;
DELETE FROM book
WHERE author IN
    (SELECT author
    FROM supply
    GROUP BY author
    HAVING amount > 2)
;
SELECT * FROM book;

/*
Affected rows: 1
Affected rows: 4
Query result:
+---------+-------------------+------------------+--------+--------+
| book_id | title             | author           | price  | amount |
+---------+-------------------+------------------+--------+--------+
| 4       | Братья Карамазовы | Достоевский Ф.М. | 799.01 | 2      |
| 6       | Лирика            | Пастернак Б.Л.   | 518.99 | 2      |
+---------+-------------------+------------------+--------+--------+
Affected rows: 2
*/