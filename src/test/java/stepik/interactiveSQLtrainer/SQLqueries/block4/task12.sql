/* Придумайте один или несколько запросов на выборку для предметной области «Интернет-магазин книг». */

SELECT name_genre, Количество
FROM
    (SELECT name_genre, SUM(amount_first) as Количество
        FROM (
            SELECT book_id, SUM(amount) AS amount_first
            FROM buy_book
            GROUP BY book_id
        ) AS temp
    INNER JOIN book ON temp.book_id = book.book_id
    INNER JOIN genre ON book.genre_id = genre.genre_id
    GROUP BY name_genre
    ) AS val
    WHERE val.Количество IN (
         SELECT MIN(val_min.Количество) AS res
         FROM (
             SELECT name_genre, SUM(amount_first) as Количество
             FROM (
                 SELECT book_id, SUM(amount) AS amount_first
                 FROM buy_book
                 GROUP BY book_id
             ) AS temp
             INNER JOIN book ON temp.book_id = book.book_id
             INNER JOIN genre ON book.genre_id = genre.genre_id
             GROUP BY name_genre) AS val_min);

/*
Query result:
+------------+------------+
| name_genre | Количество |
+------------+------------+
| Поэзия     | 4          |
+------------+------------+
Affected rows: 1
*/