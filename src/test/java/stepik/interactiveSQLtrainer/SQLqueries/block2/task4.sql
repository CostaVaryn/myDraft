/*  Вывести информацию о книгах (жанр, книга, автор), относящихся к жанру,
включающему слово «роман» в отсортированном по названиям книг виде. */

SELECT name_genre, title, name_author
FROM
    author
    INNER JOIN  book ON author.author_id = book.author_id
    INNER JOIN genre ON genre.genre_id = book.genre_id
WHERE name_genre IN('Роман')
ORDER BY title;

/*
Query result:
+------------+--------------------+------------------+
| name_genre | title              | name_author      |
+------------+--------------------+------------------+
| Роман      | Белая гвардия      | Булгаков М.А.    |
| Роман      | Братья Карамазовы  | Достоевский Ф.М. |
| Роман      | Игрок              | Достоевский Ф.М. |
| Роман      | Идиот              | Достоевский Ф.М. |
| Роман      | Мастер и Маргарита | Булгаков М.А.    |
+------------+--------------------+------------------+
Affected rows: 5
*/