-- Сформулируйте SQL запрос для создания таблицы "book"

CREATE TABLE book(
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    author VARCHAR(50),
    price DECIMAL(8, 2),
    amount INT
);

/*
Результат:

Affected rows: 0
*/
