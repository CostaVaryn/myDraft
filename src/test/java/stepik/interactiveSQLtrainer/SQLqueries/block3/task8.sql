/* Придумайте один или несколько запросов корректировки данных для таблиц book,  author, genre и supply. */

UPDATE book
SET genre_id = 2
WHERE book_id = 10;
UPDATE book
SET genre_id =
      (SELECT genre_id
       FROM genre
       WHERE name_genre = 'Приключения')
WHERE book_id = 11;

DELETE FROM author
USING author
    INNER JOIN book USING(author_id)
    INNER JOIN genre USING(genre_id)
WHERE name_genre = 'Роман';

SELECT * FROM author;

SELECT * FROM book;

/*
Affected rows: 0
Affected rows: 0
Affected rows: 2

Query result:
+-----------+----------------+
| author_id | name_author    |
+-----------+----------------+
| 3         | Есенин С.А.    |
| 4         | Пастернак Б.Л. |
| 5         | Лермонтов М.Ю. |
+-----------+----------------+
Affected rows: 3

Query result:
+---------+-----------------------+-----------+----------+--------+--------+
| book_id | title                 | author_id | genre_id | price  | amount |
+---------+-----------------------+-----------+----------+--------+--------+
| 6       | Стихотворения и поэмы | 3         | 2        | 650.00 | 15     |
| 7       | Черный человек        | 3         | 2        | 570.20 | 6      |
| 8       | Лирика                | 4         | 2        | 518.99 | 2      |
+---------+-----------------------+-----------+----------+--------+--------+
Affected rows: 3
*/