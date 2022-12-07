/* Посчитать, сколько раз была заказана каждая книга, для книги вывести ее автора
(нужно посчитать, в каком количестве заказов фигурирует каждая книга).
Вывести фамилию и инициалы автора, название книги, последний столбец назвать Количество.
Результат отсортировать сначала  по фамилиям авторов, а потом по названиям книг. */

SELECT name_author, title, COUNT(buy_book.amount) AS Количество
FROM buy_book
RIGHT JOIN book USING(book_id)
INNER JOIN author USING(author_id)
GROUP BY book.title, name_author
ORDER BY name_author, title;

/*
Query result:
+------------------+-----------------------+------------+
| name_author      | title                 | Количество |
+------------------+-----------------------+------------+
| Булгаков М.А.    | Белая гвардия         | 1          |
| Булгаков М.А.    | Мастер и Маргарита    | 2          |
| Достоевский Ф.М. | Братья Карамазовы     | 0          |
| Достоевский Ф.М. | Игрок                 | 1          |
| Достоевский Ф.М. | Идиот                 | 2          |
| Есенин С.А.      | Стихотворения и поэмы | 0          |
| Есенин С.А.      | Черный человек        | 1          |
| Пастернак Б.Л.   | Лирика                | 1          |
+------------------+-----------------------+------------+
Affected rows: 8
*/