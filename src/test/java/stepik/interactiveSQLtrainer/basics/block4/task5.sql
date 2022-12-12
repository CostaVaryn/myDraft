/* Посчитать сколько и каких экземпляров книг нужно заказать поставщикам, чтобы на складе стало одинаковое количество
экземпляров каждой книги, равное значению самого большего количества экземпляров одной книги на складе.
Вывести название книги, ее автора, текущее количество экземпляров на складе и количество заказываемых экземпляров книг.
Последнему столбцу присвоить имя Заказ. В результат не включать книги, которые заказывать не нужно. */

SELECT title, author, amount,
    (SELECT MAX(amount)
    FROM book) - amount AS Заказ
FROM book
WHERE amount NOT IN
    (SELECT MAX(amount)
    FROM book)
;

/*
Query result:
+--------------------+------------------+--------+-------+
| title              | author           | amount | Заказ |
+--------------------+------------------+--------+-------+
| Мастер и Маргарита | Булгаков М.А.    | 3      | 12    |
| Белая гвардия      | Булгаков М.А.    | 5      | 10    |
| Идиот              | Достоевский Ф.М. | 10     | 5     |
| Братья Карамазовы  | Достоевский Ф.М. | 3      | 12    |
| Игрок              | Достоевский Ф.М. | 10     | 5     |
+--------------------+------------------+--------+-------+
Affected rows: 5
*/