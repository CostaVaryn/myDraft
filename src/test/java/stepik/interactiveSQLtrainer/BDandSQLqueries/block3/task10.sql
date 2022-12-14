/* Вывести название образовательной программы и фамилию тех абитуриентов,
которые подавали документы на эту образовательную программу, но не могут быть зачислены на нее.
Эти абитуриенты имеют результат по одному или нескольким предметам ЕГЭ,
необходимым для поступления на эту образовательную программу, меньше минимального балла.
Информацию вывести в отсортированном сначала по программам, а потом по фамилиям абитуриентов виде. */

SELECT name_program, name_enrollee
FROM enrollee
JOIN program_enrollee ON enrollee.enrollee_id = program_enrollee.enrollee_id
INNER JOIN program ON program_enrollee.program_id = program.program_id
INNER JOIN program_subject ON program.program_id = program_subject.program_id
INNER JOIN subject ON program_subject.subject_id = subject.subject_id
INNER JOIN enrollee_subject ON enrollee_subject.subject_id = subject.subject_id AND enrollee_subject.enrollee_id = enrollee.enrollee_id
WHERE result < min_result
ORDER BY 1,2 ASC;

/*
Query result:
+-----------------------------+---------------+
| name_program                | name_enrollee |
+-----------------------------+---------------+
| Мехатроника и робототехника | Баранов Павел |
| Прикладная механика         | Баранов Павел |
+-----------------------------+---------------+
Affected rows: 2
*/