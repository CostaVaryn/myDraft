/* В таблицу buy_book добавить заказ с номером 5. Этот заказ должен содержать книгу Пастернака «Лирика»
в количестве двух экземпляров и книгу Булгакова «Белая гвардия» в одном экземпляре. */

INSERT INTO buy_book (buy_id, book_id, amount)
SELECT 5, book_id, 2
FROM book
WHERE book_id =
    (SELECT book_id
    FROM book
    WHERE title = 'Лирика'
    AND author_id = 4)
;
INSERT INTO buy_book (buy_id, book_id, amount)
SELECT 5, book_id, 1
FROM book
WHERE book_id =
    (SELECT book_id
    FROM book
    WHERE title = 'Белая гвардия'
    AND author_id = 1)
;
SELECT * FROM buy_book;

/*
Affected rows: 1

Affected rows: 1

Query result:
+-------------+--------+---------+--------+
| buy_book_id | buy_id | book_id | amount |
+-------------+--------+---------+--------+
| 1           | 1      | 1       | 1      |
| 2           | 1      | 7       | 2      |
| 3           | 1      | 3       | 1      |
| 4           | 2      | 8       | 2      |
| 5           | 3      | 3       | 2      |
| 6           | 3      | 2       | 1      |
| 7           | 3      | 1       | 1      |
| 8           | 4      | 5       | 1      |
| 9           | 5      | 8       | 2      |
| 10          | 5      | 2       | 1      |
+-------------+--------+---------+--------+
Affected rows: 10
*/