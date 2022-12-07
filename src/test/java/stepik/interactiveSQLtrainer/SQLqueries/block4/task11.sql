/* Для каждой отдельной книги необходимо вывести информацию о количестве проданных экземпляров и их стоимости за 2020 и 2019 год.
Вычисляемые столбцы назвать Количество и Сумма. Информацию отсортировать по убыванию стоимости. */

SELECT title, SUM(query_in.sum_amount) AS Количество, SUM(query_in.sum_price) AS Сумма
FROM (
    SELECT title, SUM(buy_archive.amount) AS sum_amount, SUM(buy_archive.amount * buy_archive.price) AS sum_price
    FROM buy_archive
    INNER JOIN book USING(book_id)
    GROUP BY 1
    UNION ALL
    SELECT title, SUM(buy_book.amount) AS sum_amount, SUM(buy_book.amount * book.price) AS sum_price
    FROM book
    INNER JOIN buy_book USING(book_id)
    INNER JOIN buy_step USING(buy_id)
    WHERE step_id = 1 AND date_step_end IS NOT NULL
    GROUP BY 1) AS query_in
GROUP BY 1
ORDER BY 3 DESC;

/*
Query result:
+-----------------------+------------+---------+
| title                 | Количество | Сумма   |
+-----------------------+------------+---------+
| Братья Карамазовы     | 8          | 6247.20 |
| Мастер и Маргарита    | 6          | 4024.38 |
| Идиот                 | 5          | 2281.80 |
| Белая гвардия         | 3          | 1581.10 |
| Черный человек        | 2          | 1140.40 |
| Лирика                | 2          | 1037.98 |
| Игрок                 | 2          | 961.80  |
| Стихотворения и поэмы | 1          | 650.00  |
+-----------------------+------------+---------+
Affected rows: 8
*/