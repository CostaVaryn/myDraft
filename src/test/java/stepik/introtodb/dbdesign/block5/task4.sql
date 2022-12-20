/*
Добавьте в таблицу 'sale_has_good' следующие поля:
Название: `num`, тип данных: INT, возможность использования неопределенного значения: Нет
Название: `price`, тип данных: DECIMAL(18,2), возможность использования неопределенного значения: Нет
*/

ALTER TABLE sale_has_good
    ADD COLUMN num INT NOT NULL,
    ADD COLUMN price DECIMAL(18,2) NOT NULL;

-- Affected rows: 0