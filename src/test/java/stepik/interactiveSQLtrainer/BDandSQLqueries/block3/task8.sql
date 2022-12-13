/* Вывести образовательные программы, на которые для поступления необходимы предмет
«Информатика» и «Математика» в отсортированном по названию программ виде. */

SELECT name_program
FROM program
JOIN program_subject USING(program_id)
JOIN subject USING(subject_id)
WHERE name_subject IN("Информатика", "Математика")
GROUP BY name_program
HAVING COUNT(subject_id) = 2
ORDER BY name_program;

/*
Query result:
+-------------------------------------+
| name_program                        |
+-------------------------------------+
| Математика и компьютерные науки     |
| Прикладная математика и информатика |
+-------------------------------------+
Affected rows: 2
*/