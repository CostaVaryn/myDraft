/* Реализовать поиск по ключевым словам. Вывести шаги, с которыми связаны ключевые слова MAX и AVG одновременно.
Для шагов указать id модуля, позицию урока в модуле, позицию шага в уроке через точку, после позиции шага перед заголовком - пробел.
Позицию шага в уроке вывести в виде двух цифр (если позиция шага меньше 10, то перед цифрой поставить 0).
Столбец назвать Шаг. Информацию отсортировать по первому столбцу в алфавитном порядке. */

SELECT CONCAT(module_id, '.', lesson_position, IF(step_position < 10, CONCAT('.0', step_position), CONCAT('.', step_position)), ' ', step_name) AS Шаг
FROM step_keyword
JOIN step USING(step_id)
JOIN lesson USING(lesson_id)
JOIN module USING(module_id)
JOIN keyword USING(keyword_id)
WHERE keyword_name LIKE '%AVG%' OR keyword_name LIKE '%MAX%'
GROUP BY step_id
HAVING COUNT(keyword_name) = 2
ORDER BY step_position;

/*
Query result:
+---------------------------------------------------------+
| Шаг                                                     |
+---------------------------------------------------------+
| 1.3.04 Выборка данных, групповые функции MIN, MAX и AVG |
| 1.4.06 Вложенный запрос после SELECT                    |
+---------------------------------------------------------+
Affected rows: 2
*/