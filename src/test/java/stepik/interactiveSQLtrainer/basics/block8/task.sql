/* Поиск по ключевым словам */

-- Запрос 1. Поиск шагов, в которых встречается заданное ключевое слово, в примере MAX:
SELECT CONCAT(module_id,'.',lesson_position,".",step_position," ", CONCAT(LEFT(step_name, 50), '...')) AS Шаг
,note AS Примечание
FROM step
    INNER JOIN lesson USING(lesson_id)
    INNER JOIN module USING(module_id)
    INNER JOIN step_keyword USING(step_id)
    INNER JOIN keyword USING(keyword_id)
WHERE keyword_name = 'MAX'
ORDER BY 1;

-- Запрос 2. Поиск шагов, в которых встречаются два заданных ключевых слова одновременно, в примере MAX и AVG:
SELECT CONCAT(module_id,'.',lesson_position,".",step_position," ", CONCAT(LEFT(step_name, 30), '...')) AS Шаг
,link AS Ссылка_на_шаг
FROM step
    INNER JOIN lesson USING(lesson_id)
    INNER JOIN module USING(module_id)
    INNER JOIN step_keyword USING(step_id)
    INNER JOIN keyword USING(keyword_id)
WHERE keyword_name IN ('MAX', 'AVG')
GROUP BY ШАГ, Ссылка_на_шаг
HAVING count(*) = 2
ORDER BY 1;

--  Запрос 3. Поиск шагов, в которых встречаются три заданных ключевых слова одновременно, в примере MAX, MIN и AVG:
SELECT CONCAT(module_id,'.',lesson_position,".",step_position," ",step_name) AS Шаг
FROM step
    INNER JOIN lesson USING(lesson_id)
    INNER JOIN module USING(module_id)
    INNER JOIN step_keyword USING(step_id)
    INNER JOIN keyword USING(keyword_id)
WHERE keyword_name IN ('MAX', 'AVG', 'MIN')
GROUP BY ШАГ
HAVING COUNT(*) = 3
ORDER BY 1;

/*
Query result:
+---------------------------------------------------------------------------+
| Шаг                                                                       |
+---------------------------------------------------------------------------+
| 1.3.4 Выборка данных, групповые функции MIN, MAX и AVG                    |
| 3.3.4 Задание. Вывести статистическую информацию по каждому предмету  ЕГЭ |
+---------------------------------------------------------------------------+
Affected rows: 2
*/