/* Придумайте один или несколько запросов на выборку для предметной области «Абитуриент». */

SELECT name_program, name_enrollee, SUM(result) AS itog
FROM enrollee
JOIN program_enrollee ON enrollee.enrollee_id = program_enrollee.enrollee_id
INNER JOIN program ON program_enrollee.program_id = program.program_id
INNER JOIN program_subject ON program.program_id = program_subject.program_id
INNER JOIN subject ON program_subject.subject_id = subject.subject_id
INNER JOIN enrollee_subject ON enrollee_subject.subject_id = subject.subject_id AND enrollee_subject.enrollee_id = enrollee.enrollee_id
GROUP BY name_program, name_enrollee
HAVING SUM(result) > 200
ORDER BY name_program, itog DESC;

/*
Query result:
+-------------------------------------+-----------------+------+
| name_program                        | name_enrollee   | itog |
+-------------------------------------+-----------------+------+
| Математика и компьютерные науки     | Степанова Дарья | 276  |
| Математика и компьютерные науки     | Семенов Иван    | 230  |
| Математика и компьютерные науки     | Абрамова Катя   | 226  |
| Мехатроника и робототехника         | Степанова Дарья | 270  |
| Мехатроника и робототехника         | Семенов Иван    | 242  |
| Прикладная математика и информатика | Семенов Иван    | 230  |
| Прикладная математика и информатика | Абрамова Катя   | 226  |
| Прикладная математика и информатика | Баранов Павел   | 213  |
| Прикладная механика                 | Степанова Дарья | 270  |
| Прикладная механика                 | Яковлева Галина | 238  |
+-------------------------------------+-----------------+------+
Affected rows: 10
*/