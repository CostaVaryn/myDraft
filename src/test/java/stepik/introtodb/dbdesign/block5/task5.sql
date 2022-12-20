/*
Добавьте в таблицу 'client' поле 'source_id' тип данных:
INT, возможность использования неопределенного значения: Да.
Для данного поля определите ограничение внешнего ключа как ссылку на поле 'id' таблицы 'source'.
*/

ALTER TABLE client
    ADD COLUMN source_id INT NULL,
    ADD CONSTRAINT fk_source_id FOREIGN KEY (source_id) REFERENCES source(id);

-- Affected rows: 0