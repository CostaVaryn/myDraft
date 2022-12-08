/* Создать счет (таблицу buy_pay) на оплату заказа с номером 5, в который включить название книг,
их автора, цену, количество заказанных книг и  стоимость. Последний столбец назвать Стоимость.
Информацию в таблицу занести в отсортированном по названиям книг виде. */

CREATE TABLE buy_pay(
    title VARCHAR(50),
    name_author VARCHAR(30),
    price DECIMAL(8,2),
    amount INT,
    Стоимость decimal(8,2));
INSERT INTO buy_pay (title, name_author, price, amount, Стоимость)
SELECT book.title, author.name_author, book.price, buy_book.amount, book.price*buy_book.amount
FROM author
INNER JOIN book USING(author_id)
INNER JOIN buy_book USING(book_id)
WHERE buy_book.buy_id = 5
ORDER BY title;
SELECT title, name_author, price, amount, Стоимость
FROM buy_pay;

/*
Affected rows: 0

Affected rows: 2

Query result:
+---------------+----------------+--------+--------+-----------+
| title         | name_author    | price  | amount | Стоимость |
+---------------+----------------+--------+--------+-----------+
| Белая гвардия | Булгаков М.А.  | 540.50 | 1      | 540.50    |
| Лирика        | Пастернак Б.Л. | 518.99 | 2      | 1037.98   |
+---------------+----------------+--------+--------+-----------+
Affected rows: 2
*/