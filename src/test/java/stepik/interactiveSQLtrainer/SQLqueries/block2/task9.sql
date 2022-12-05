-- Придумайте один или несколько запросов для таблиц book,  author, genre и city.

SELECT title, name_author, name_genre, price, amount
FROM author
    INNER JOIN book ON author.author_id = book.author_id
    INNER JOIN genre ON  book.genre_id = genre.genre_id
WHERE genre.genre_id IN(
    SELECT genre_id
    FROM book
    GROUP BY genre_id
    HAVING count(amount) = (
        SELECT count(amount) AS count_amount
        FROM book
        GROUP BY genre_id
        HAVING count_amount = 3
        LIMIT 1))
ORDER BY title;

/*
Query result:
+-----------------------+----------------+------------+--------+--------+
| title                 | name_author    | name_genre | price  | amount |
+-----------------------+----------------+------------+--------+--------+
| Лирика                | Пастернак Б.Л. | Поэзия     | 518.99 | 2      |
| Стихотворения и поэмы | Есенин С.А.    | Поэзия     | 650.00 | 15     |
| Черный человек        | Есенин С.А.    | Поэзия     | 570.20 | 6      |
+-----------------------+----------------+------------+--------+--------+
Affected rows: 3
*/