/* Необходимо:
- в таблицу fine занести дату оплаты соответствующего штрафа из таблицы payment;
- уменьшить начисленный штраф в таблице fine в два раза (только для тех штрафов,
информация о которых занесена в таблицу payment),
если оплата произведена не позднее 20 дней со дня нарушения. */

UPDATE fine, payment
SET fine.date_payment = payment.date_payment,
fine.sum_fine = IF(DATEDIFF(payment.date_payment, fine.date_violation) <= 20, fine.sum_fine / 2, fine.sum_fine)
WHERE fine.date_payment IS NULL AND
fine.name = payment.name AND
fine.number_plate = payment.number_plate AND
fine.violation = payment.violation;
SELECT sum_fine, date_payment FROM fine;

/*
Affected rows: 3
Query result:
+----------+--------------+
| sum_fine | date_payment |
+----------+--------------+
| 500.00   | 2020-01-17   |
| 1000.00  | 2020-02-27   |
| 500.00   | 2020-02-23   |
| 250.00   | 2020-01-22   |
| 500.00   | NULL         |
| 2000.00  | 2020-03-06   |
| 2000.00  | NULL         |
| 500.00   | 2020-03-23   |
+----------+--------------+
Affected rows: 8
*/