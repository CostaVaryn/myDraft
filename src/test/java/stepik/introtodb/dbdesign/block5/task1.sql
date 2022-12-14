/*
Добавить таблицу 'best_offer_sale' со следующими полями:
Название: `id`, тип данных: INT, возможность использования неопределенного значения: Нет, первичный ключ
Название: `name`, тип данных: VARCHAR(255), возможность использования неопределенного значения: Да
Название: `dt_start`, тип данных: DATETIME, возможность использования неопределенного значения: Нет
Название: `dt_finish`, тип данных: DATETIME, возможность использования неопределенного значения: Нет
*/

CREATE TABLE IF NOT EXISTS best_offer_sale (
    id INT NOT NULL,
    name VARCHAR(255) NULL,
    dt_start DATETIME NOT NULL,
    dt_finish DATETIME NOT NULL,
    PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

-- Affected rows: 0