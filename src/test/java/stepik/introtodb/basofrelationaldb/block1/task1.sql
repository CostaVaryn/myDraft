/*
Выведите все позиций списка товаров принадлежащие какой-либо категории с названиями товаров и названиями категорий.
Список должен быть отсортирован по названию товара, названию категории.
Для соединения таблиц необходимо использовать оператор INNER JOIN.
*/

SELECT good.name, category.name FROM category_has_good AS chg
INNER JOIN good ON chg.good_id = good.id
INNER JOIN category ON chg.category_id = category.id
ORDER BY good.name, category.name;

/*
Query result:
+--------------+-------------------+
| name         | name              |
+--------------+-------------------+
| Bio Hotin    | Bath Products     |
| Bio Hotin    | Dental Care       |
| Bio Hotin    | Health & Medicine |
| Bio Hotin    | Juices            |
| Bio Hotin    | Water             |
| Faxtom       | Bath Products     |
| Faxtom       | Dental Care       |
| Faxtom       | Health & Medicine |
| Faxtom       | Juices            |
| Faxtom       | Tea & Coffee      |
| Faxtom       | Water             |
| Geo-Ity      | Air Fresheners    |
| Geo-Ity      | Cakes             |
| Hot Ex       | Candy             |
| Hot Ex       | Juices            |
| Hot Ex       | Snacks            |
| Hot Ex       | Water             |
| K-ing        | Candy             |
| K-ing        | Dental Care       |
| K-ing        | Health & Medicine |
| K-ing        | Snacks            |
| K-ing        | Tea & Coffee      |
| K-ing        | Water             |
| Konksing     | Air Fresheners    |
| Konksing     | Cakes             |
| Konksing     | Health & Medicine |
| Konksing     | Water             |
| Rankeco      | Bath Products     |
| Rankeco      | Candy             |
| Rankeco      | Health & Medicine |
| Rankeco      | Juices            |
| Rankeco      | Snacks            |
| Rankeco      | Tea & Coffee      |
| Re Hattip    | Air Fresheners    |
| Re Hattip    | Bath Products     |
| Re Hattip    | Candy             |
| Re Hattip    | Tea & Coffee      |
| S--Tip       | Bath Products     |
| S--Tip       | Dental Care       |
| S--Tip       | Health & Medicine |
| S--Tip       | Juices            |
| S--Tip       | Snacks            |
| S--Tip       | Tea & Coffee      |
| S--Tip       | Water             |
| Sailjob      | Bath Products     |
| Sailjob      | Cakes             |
| Sailjob      | Health & Medicine |
| Saltsoft     | Bath Products     |
| Saltsoft     | Health & Medicine |
| Saltsoft     | Tea & Coffee      |
| Saltsoft     | Water             |
| Sancof       | Air Fresheners    |
| Sancof       | Cakes             |
| Sancof       | Candy             |
| Sancof       | Dental Care       |
| Sancof       | Juices            |
| Sancof       | Tea & Coffee      |
| Sancof       | Water             |
| Saoplus      | Cakes             |
| Saoplus      | Tea & Coffee      |
| Statcom      | Snacks            |
| Transtraxing | Bath Products     |
| Transtraxing | Cakes             |
| Transtraxing | Candy             |
| Transtraxing | Tea & Coffee      |
| Trust-Dax    | Air Fresheners    |
| Trust-Dax    | Cakes             |
| Trust-Dax    | Health & Medicine |
| Trust-Dax    | Snacks            |
| Volt Fan     | Cakes             |
| Volt Fan     | Health & Medicine |
| Volt Fan     | Tea & Coffee      |
| Zaam Warm    | Bath Products     |
| Zaam Warm    | Cakes             |
| Zaam Warm    | Candy             |
| Zaam Warm    | Dental Care       |
+--------------+-------------------+
Affected rows: 76
*/