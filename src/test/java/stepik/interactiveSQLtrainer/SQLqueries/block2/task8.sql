/* Если в таблицах supply  и book есть одинаковые книги, которые имеют равную цену,  вывести их название и автора,
а также посчитать общее количество экземпляров книг в таблицах supply и book, столбцы назвать Название, Автор  и Количество. */

SELECT book.title AS Название, name_author AS Автор, book.amount + supply.amount AS Количество
FROM author
    INNER JOIN book USING (author_id)
    INNER JOIN supply ON book.title = supply.title AND author.name_author = supply.author
WHERE supply.price = book.price;

/*
Query result:
+----------------+-------------+------------+
| Название       | Автор       | Количество |
+----------------+-------------+------------+
| Черный человек | Есенин С.А. | 12         |
+----------------+-------------+------------+
Affected rows: 1
*/