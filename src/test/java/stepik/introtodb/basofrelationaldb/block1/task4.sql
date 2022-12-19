/*
Выведите список товаров с названиями категорий, в том числе товаров,
не принадлежащих ни к одной из категорий, в том числе категорий не содержащих ни одного товара.
*/

SELECT good.name, category.name FROM good
LEFT OUTER JOIN category_has_good ON good.id = category_has_good.good_id
LEFT OUTER JOIN category ON category.id = category_has_good.category_id
UNION
SELECT good.name, category.name FROM good
RIGHT OUTER JOIN category_has_good ON good.id = category_has_good.good_id
RIGHT OUTER JOIN category ON category.id = category_has_good.category_id;

/*
Query result:
+--------------+---------------------+
| name         | name                |
+--------------+---------------------+
| Trust-Dax    | Air Fresheners      |
| Trust-Dax    | Cakes               |
| Trust-Dax    | Health & Medicine   |
| Trust-Dax    | Snacks              |
| Statcom      | Snacks              |
| Konksing     | Air Fresheners      |
| Konksing     | Cakes               |
| Konksing     | Health & Medicine   |
| Konksing     | Water               |
| Sancof       | Air Fresheners      |
| Sancof       | Cakes               |
| Sancof       | Candy               |
| Sancof       | Dental Care         |
| Sancof       | Juices              |
| Sancof       | Tea & Coffee        |
| Sancof       | Water               |
| Geo-Ity      | Air Fresheners      |
| Geo-Ity      | Cakes               |
| Faxtom       | Bath Products       |
| Faxtom       | Dental Care         |
| Faxtom       | Health & Medicine   |
| Faxtom       | Juices              |
| Faxtom       | Tea & Coffee        |
| Faxtom       | Water               |
| K-ing        | Candy               |
| K-ing        | Dental Care         |
| K-ing        | Health & Medicine   |
| K-ing        | Snacks              |
| K-ing        | Tea & Coffee        |
| K-ing        | Water               |
| Re Hattip    | Air Fresheners      |
| Re Hattip    | Bath Products       |
| Re Hattip    | Candy               |
| Re Hattip    | Tea & Coffee        |
| Transtraxing | Bath Products       |
| Transtraxing | Cakes               |
| Transtraxing | Candy               |
| Transtraxing | Tea & Coffee        |
| Sailjob      | Bath Products       |
| Sailjob      | Cakes               |
| Sailjob      | Health & Medicine   |
| Hot Ex       | Candy               |
| Hot Ex       | Juices              |
| Hot Ex       | Snacks              |
| Hot Ex       | Water               |
| Volt Fan     | Cakes               |
| Volt Fan     | Health & Medicine   |
| Volt Fan     | Tea & Coffee        |
| Zaam Warm    | Bath Products       |
| Zaam Warm    | Cakes               |
| Zaam Warm    | Candy               |
| Zaam Warm    | Dental Care         |
| Saoplus      | Cakes               |
| Saoplus      | Tea & Coffee        |
| Bio Hotin    | Bath Products       |
| Bio Hotin    | Dental Care         |
| Bio Hotin    | Health & Medicine   |
| Bio Hotin    | Juices              |
| Bio Hotin    | Water               |
| S--Tip       | Bath Products       |
| S--Tip       | Dental Care         |
| S--Tip       | Health & Medicine   |
| S--Tip       | Juices              |
| S--Tip       | Snacks              |
| S--Tip       | Tea & Coffee        |
| S--Tip       | Water               |
| Saltsoft     | Bath Products       |
| Saltsoft     | Health & Medicine   |
| Saltsoft     | Tea & Coffee        |
| Saltsoft     | Water               |
| Rankeco      | Bath Products       |
| Rankeco      | Candy               |
| Rankeco      | Health & Medicine   |
| Rankeco      | Juices              |
| Rankeco      | Snacks              |
| Rankeco      | Tea & Coffee        |
| Zenron       | NULL                |
| Pluswarm     | NULL                |
| NULL         | Seasonings & Spices |
| NULL         | Pasta & Noodles     |
| NULL         | Fruits & Vegetables |
+--------------+---------------------+
Affected rows: 81
*/