/* В таблице fine увеличить в два раза сумму неоплаченных штрафов для отобранных на предыдущем шаге записей. */

UPDATE fine
    ,(SELECT name, number_plate, violation
        FROM fine
        GROUP BY name, number_plate, violation
        HAVING COUNT(violation) > 1
        ORDER BY 1) query_in
SET sum_fine = sum_fine * 2
WHERE date_payment IS NULL AND
fine.violation = query_in.violation AND
fine.name = query_in.name AND
fine.number_plate = query_in.number_plate;
SELECT * FROM fine;

/*
Affected rows: 2
Query result:
+---------+---------------+--------------+----------------------------------+----------+----------------+--------------+
| fine_id | name          | number_plate | violation                        | sum_fine | date_violation | date_payment |
+---------+---------------+--------------+----------------------------------+----------+----------------+--------------+
| 1       | Баранов П.Е.  | Р523ВТ       | Превышение скорости(от 40 до 60) | 500.00   | 2020-01-12     | 2020-01-17   |
| 2       | Абрамова К.А. | О111АВ       | Проезд на запрещающий сигнал     | 1000.00  | 2020-01-14     | 2020-02-27   |
| 3       | Яковлев Г.Р.  | Т330ТТ       | Превышение скорости(от 20 до 40) | 500.00   | 2020-01-23     | 2020-02-23   |
| 4       | Яковлев Г.Р.  | М701АА       | Превышение скорости(от 20 до 40) | 500.00   | 2020-01-12     | NULL         |
| 5       | Колесов С.П.  | К892АХ       | Превышение скорости(от 20 до 40) | 500.00   | 2020-02-01     | NULL         |
| 6       | Баранов П.Е.  | Р523ВТ       | Превышение скорости(от 40 до 60) | 2000.00  | 2020-02-14     | NULL         |
| 7       | Абрамова К.А. | О111АВ       | Проезд на запрещающий сигнал     | 2000.00  | 2020-02-23     | NULL         |
| 8       | Яковлев Г.Р.  | Т330ТТ       | Проезд на запрещающий сигнал     | 1000.00  | 2020-03-03     | NULL         |
+---------+---------------+--------------+----------------------------------+----------+----------------+--------------+
Affected rows: 8
*/