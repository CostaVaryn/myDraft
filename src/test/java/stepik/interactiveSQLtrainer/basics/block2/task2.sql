-- Выбрать авторов, название книг и их цену из таблицы book.

SELECT author, title, price FROM book;

/*
Query result:
+------------------+-----------------------+--------+
| author           | title                 | price  |
+------------------+-----------------------+--------+
| Булгаков М.А.    | Мастер и Маргарита    | 670.99 |
| Булгаков М.А.    | Белая гвардия         | 540.50 |
| Достоевский Ф.М. | Идиот                 | 460.00 |
| Достоевский Ф.М. | Братья Карамазовы     | 799.01 |
| Есенин С.А.      | Стихотворения и поэмы | 650.00 |
+------------------+-----------------------+--------+
Affected rows: 5
*/