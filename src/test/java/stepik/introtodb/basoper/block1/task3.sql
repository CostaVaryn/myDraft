-- Измените адрес плательщика на 'igor@mail.com' для всех записей таблицы, где адрес плательщика 'alex@mail.com'.

UPDATE billing
SET payer_email='igor@mail.com'
WHERE payer_email='alex@mail.com'

-- Affected rows: 10