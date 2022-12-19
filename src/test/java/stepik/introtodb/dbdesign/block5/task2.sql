-- Удалите из таблицы 'client' поля 'code' и 'source_id'.

ALTER TABLE client
    DROP FOREIGN KEY fk_client_source1,
    DROP COLUMN source_id,
    DROP COLUMN code;

-- Affected rows: 0