/* Необходимо в каждом городе провести выставку книг каждого автора в течение 2020 года.
Дату проведения выставки выбрать случайным образом.
Создать запрос, который выведет город, автора и дату проведения выставки.
Последний столбец назвать Дата.
Информацию вывести, отсортировав сначала в алфавитном порядке по названиям городов,
а потом по убыванию дат проведения выставок. */

SELECT name_city, name_author, (DATE_ADD('2020-01-01', INTERVAL FLOOR(RAND() * 365) DAY)) AS Дата
FROM city, author
ORDER BY name_city ASC, Дата DESC;

/*
Query result:
+-----------------+------------------+------------+
| name_city       | name_author      | Дата       |
+-----------------+------------------+------------+
| Владивосток     | Булгаков М.А.    | 2020-12-08 |
| Владивосток     | Пастернак Б.Л.   | 2020-10-24 |
| Владивосток     | Есенин С.А.      | 2020-09-24 |
| Владивосток     | Лермонтов М.Ю.   | 2020-07-08 |
| Владивосток     | Достоевский Ф.М. | 2020-04-01 |
| Москва          | Лермонтов М.Ю.   | 2020-11-26 |
| Москва          | Пастернак Б.Л.   | 2020-08-19 |
| Москва          | Достоевский Ф.М. | 2020-08-18 |
| Москва          | Есенин С.А.      | 2020-08-14 |
| Москва          | Булгаков М.А.    | 2020-04-04 |
| Санкт-Петербург | Есенин С.А.      | 2020-10-05 |
| Санкт-Петербург | Лермонтов М.Ю.   | 2020-09-09 |
| Санкт-Петербург | Достоевский Ф.М. | 2020-06-23 |
| Санкт-Петербург | Пастернак Б.Л.   | 2020-03-19 |
| Санкт-Петербург | Булгаков М.А.    | 2020-01-06 |
+-----------------+------------------+------------+
Affected rows: 15
*/