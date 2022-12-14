/* Занесите новую строку в таблицу book (текстовые значения (тип VARCHAR)
заключать либо в двойные, либо в одинарные кавычки) */

INSERT INTO book (title, author, price, amount)
VALUES ('Мастер и Маргарита', 'Булгаков М.А.', 670.99, 3);
SELECT * FROM book;

/*
Результат:

Affected rows: 1
Query result:
+---------+--------------------+---------------+--------+--------+
| book_id | title              | author        | price  | amount |
+---------+--------------------+---------------+--------+--------+
| 1       | Мастер и Маргарита | Булгаков М.А. | 670.99 | 3      |
+---------+--------------------+---------------+--------+--------+
*/