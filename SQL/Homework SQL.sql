--1. ������� ��� ���� � ��� ������.
SELECT *
FROM students;

 --2. ������� ���� ��������� � �������.
SELECT *
FROM students;

 --3. ������� ������ Id �������������.
SELECT id
FROM students;

 --4. ������� ������ ��� �������������.
SELECT name
FROM students;

 --5. ������� ������ email �������������.
SELECT name
FROM students

 --6. ������� ��� � email �������������.
SELECT name, email
FROM students;

 --7. ������� id, ���, email � ���� �������� �������������.
SELECT id, name, email
FROM students;

 --8. ������� �������������, ��� password 12333.
SELECT *
FROM students
WHERE password = '12333';

 --9. ������� �������������, ������� ���� ������� 2021-03-26 00:00:00.
SELECT *
FROM students
WHERE created_on = '2021-03-26 00:00:00';

 --10. ������� �������������, ��� � ����� ���� ����� Anna.
SELECT *
FROM students
WHERE name LIKE '%Anna%';

 --11. ������� �������������, ��� � ����� � ����� ���� 8.
SELECT *
FROM students
WHERE name LIKE '%8';

 --12. ������� �������������, ��� � ����� � ���� ����� �.
SELECT *
FROM students
WHERE name LIKE '%a%';

 --13. ������� �������������, ������� ���� ������� 2021-07-12 00:00:00.
SELECT *
FROM students
WHERE created_on = '2021-07-12 00:00:00';

 --14. ������� �������������, ������� ���� ������� 2021-07-12 00:00:00 � ����� ������ 1m313.
SELECT *
FROM students
WHERE created_on = '2021-07-12 00:00:00' AND password = '1m313';


 --15. ������� �������������, ������� ���� ������� 2021-07-12 00:00:00 � � ������� � ����� ���� ����� Andrey.
SELECT *
FROM students
WHERE created_on = '2021-07-12 00:00:00' AND name LIKE '%Andrey%';

 --16. ������� �������������, ������� ���� ������� 2021-07-12 00:00:00 � � ������� � ����� ���� ����� 8
SELECT *
FROM students
WHERE created_on = '2021-07-12 00:00:00' AND name LIKE '%8%';

 --17. ������� ������������, � ������� id ����� 120.
SELECT *
FROM students
WHERE id = 110;

 --18. ������� ������������, � ������� id ����� 153.
SELECT *
FROM students
WHERE id = 153;

 --19. ������� ������������, � ������� id ������ 140.
SELECT *
FROM students
WHERE id>140;

 --20. ������� ������������, � ������� id ������ 130.
SELECT *
FROM students
WHERE id<130;

 --21. ������� ������������, � ������� id ������ 127 ��� ������ 188.
SELECT *
FROM students
WHERE id<127 or id>188;

 --22. ������� ������������, � ������� id ������ ���� ����� 137.
SELECT *
FROM students
WHERE id<=137;

 --23. ������� ������������, � ������� id ������ ���� ����� 137.
SELECT *
FROM students
WHERE id>=137;

 --24. ������� ������������, � ������� id ������ 180 �� ������ 190.
SELECT *
FROM students
WHERE id>180 AND id<190;

 --25. ������� ������������, � ������� id ����� 180 � 190.
SELECT *
FROM students
WHERE id BETWEEN 180 AND 190;

 --26. ������� �������������, ��� password ����� 12333, 1m313, 123313.
SELECT *
FROM students
WHERE password IN ('12333', '1m313', '123313');

 --27. ������� �������������, ��� created_on ����� 2020-10-03 00:00:00, 2021-05-19 00:00:00, 2021-03-26 00:00:00.
SELECT *
FROM students
WHERE created_on IN ('2020-10-03 00:00:00', '2021-05-19 00:00:00', '2021-03-26 00:00:00');

 --28. ������� ����������� id.
SELECT min(id) AS min_id
FROM students;

 --29. ������� ������������.
SELECT max(id) AS max_id 
FROM students;

 --30. ������� ���������� �������������.
SELECT count(id) AS students_number
FROM students;

 --31. ������� id ������������, ���, ���� �������� ������������. ������������� �� ������� ����������� ���� ���������� �������������.
SELECT id, name, created_on
FROM students
ORDER BY created_on;

 --32. ������� id ������������, ���, ���� �������� ������������. ������������� �� ������� �������� ���� ���������� �������������.
SELECT id, name, created_on
FROM students
ORDER BY created_on DESC;