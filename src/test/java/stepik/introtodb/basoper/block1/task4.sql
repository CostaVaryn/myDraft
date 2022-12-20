-- Удалите из таблицы записи, где адрес плательщика или адрес получателя установлен в неопределенное значение или пустую строку.

DELETE FROM billing
WHERE payer_email = ''
OR payer_email IS NULL
OR recipient_email = ''
OR recipient_email IS NULL;

-- Affected rows: 2