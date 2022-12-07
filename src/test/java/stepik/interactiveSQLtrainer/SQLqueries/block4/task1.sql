/* Вывести все заказы Баранова Павла (id заказа, какие книги, по какой цене и в каком количестве он заказал)
в отсортированном по номеру заказа и названиям книг виде. */

SELECT buy_book.buy_id, title, price, buy_book.amount
FROM client
INNER JOIN buy USING(client_id)
INNER JOIN buy_book USING(buy_id)
INNER JOIN book USING(book_id)
WHERE name_client = 'Баранов Павел'
ORDER BY buy_id, title;

/*
Query result:
+--------+--------------------+--------+--------+
| buy_id | title              | price  | amount |
+--------+--------------------+--------+--------+
| 1      | Идиот              | 460.00 | 1      |
| 1      | Мастер и Маргарита | 670.99 | 1      |
| 1      | Черный человек     | 570.20 | 2      |
| 4      | Игрок              | 480.50 | 1      |
+--------+--------------------+--------+--------+
Affected rows: 4
*/