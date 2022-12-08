/* Создать общий счет (таблицу buy_pay) на оплату заказа с номером 5.
Куда включить номер заказа, количество книг в заказе (название столбца Количество)
и его общую стоимость (название столбца Итого).
Для решения используйте ОДИН запрос. */

CREATE TABLE buy_pay
SELECT buy_id, SUM(buy_book.amount) AS Количество, SUM(book.price * buy_book.amount) AS Итого
FROM buy_book
JOIN book USING(book_id)
WHERE buy_id = 5;
SELECT * FROM buy_pay;

/*
Affected rows: 1

Query result:
+--------+------------+---------+
| buy_id | Количество | Итого   |
+--------+------------+---------+
| 5      | 3          | 1578.48 |
+--------+------------+---------+
Affected rows: 1
*/