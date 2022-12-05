-- Вывести все жанры, которые не представлены в книгах на складе.

SELECT name_genre
FROM genre LEFT JOIN book
     ON genre.genre_id = book.genre_id
WHERE book.genre_id IS NULL
ORDER BY name_genre;

/*
Query result:
+-------------+
| name_genre  |
+-------------+
| Приключения |
+-------------+
Affected rows: 1
*/