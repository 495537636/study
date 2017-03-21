/**查询班级的总分排名**/
SELECT b.student_id, a.stu_name, SUM(b.scope) AS total
FROM student a, scope b
WHERE a.stu_id = b.student_id
GROUP BY b.student_id;

/**查询班级总分大于600分的同学**/
SELECT b.student_id, a.stu_name, SUM(b.scope) AS total
FROM student a, scope b
WHERE a.stu_id = b.student_id
GROUP BY b.student_id
HAVING total > 600;

/**获取班级的平均分**/
SELECT AVG(c.total) FROM (SELECT SUM(b.scope) total
FROM student a, scope b
WHERE a.stu_id = b.student_id
GROUP BY b.student_id) c;

/**获取班级超过平均分的同学**/
SELECT b.student_id, a.stu_name, SUM(b.scope) AS total
FROM student a, scope b
WHERE a.stu_id = b.student_id
GROUP BY b.student_id

SELECT b.student_id, a.stu_name, SUM(b.scope), AVG(b.scope) AS total FROM student a LEFT JOIN scope b ON a.`stu_id` = b.`student_id` GROUP BY b.`student_id`
