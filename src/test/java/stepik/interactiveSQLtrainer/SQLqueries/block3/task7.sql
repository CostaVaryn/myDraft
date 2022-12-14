/* Удалить всех авторов, которые пишут в жанре "Поэзия". Из таблицы book удалить все книги этих авторов.
В запросе для отбора авторов использовать полное название жанра, а не его id. */

DELETE FROM author
USING author
    INNER JOIN book USING(author_id)
    INNER JOIN genre USING(genre_id)
WHERE name_genre = 'Поэзия';

SELECT * FROM author;

SELECT * FROM book;

/*
Affected rows: 3

Query result:
+-----------+------------------+
| author_id | name_author      |
+-----------+------------------+
| 1         | Булгаков М.А.    |
| 2         | Достоевский Ф.М. |
| 6         | Стивенсон Р.Л.   |
+-----------+------------------+
Affected rows: 3

Query result:
+---------+--------------------+-----------+----------+--------+--------+
| book_id | title              | author_id | genre_id | price  | amount |
+---------+--------------------+-----------+----------+--------+--------+
| 1       | Мастер и Маргарита | 1         | 1        | 670.99 | 3      |
| 2       | Белая гвардия      | 1         | 1        | 540.50 | 12     |
| 3       | Идиот              | 2         | 1        | 437.11 | 13     |
| 4       | Братья Карамазовы  | 2         | 1        | 799.01 | 3      |
| 5       | Игрок              | 2         | 1        | 480.50 | 10     |
| 11      | Остров сокровищ    | 6         | 3        | 599.99 | 5      |
+---------+--------------------+-----------+----------+--------+--------+
Affected rows: 6
*/