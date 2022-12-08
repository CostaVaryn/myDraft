/* Включить нового человека в таблицу с клиентами. Его имя Попов Илья, его email popov@test, проживает он в Москве. */

INSERT INTO client (name_client, city_id, email)
SELECT 'Попов Илья', city_id, 'popov@test'
FROM city
WHERE city_id = 1;
SELECT * FROM client;

/*
Affected rows: 1

Query result:
+-----------+-----------------+---------+----------------+
| client_id | name_client     | city_id | email          |
+-----------+-----------------+---------+----------------+
| 1         | Баранов Павел   | 3       | baranov@test   |
| 2         | Абрамова Катя   | 1       | abramova@test  |
| 3         | Семенонов Иван  | 2       | semenov@test   |
| 4         | Яковлева Галина | 1       | yakovleva@test |
| 5         | Попов Илья      | 1       | popov@test     |
+-----------+-----------------+---------+----------------+
Affected rows: 5
*/