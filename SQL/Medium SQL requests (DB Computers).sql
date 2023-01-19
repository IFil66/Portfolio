-- Схема БД состоит из четырех таблиц:
-- Product(maker, model, type)
-- PC(code, model, speed, ram, hd, cd, price)
-- Laptop(code, model, speed, ram, hd, price, screen)
-- Printer(code, model, color, type, price)

-- Таблица Product представляет производителя (maker), номер модели (model) и тип ('PC' - ПК, 'Laptop' - ПК-блокнот или 'Printer' - принтер).
-- Предполагается, что номера моделей в таблице Product уникальны для всех производителей и типов продуктов.
-- В таблице PC для каждого ПК, однозначно определяемого уникальным кодом – code, указаны модель – model (внешний ключ к таблице Product),
-- скорость - speed (процессора в мегагерцах), объем памяти - ram (в мегабайтах), размер диска - hd (в гигабайтах),
-- скорость считывающего устройства - cd (например, '4x') и цена - price (в долларах).
-- Таблица Laptop аналогична таблице РС за исключением того, что вместо скорости CD содержит размер экрана -screen (в дюймах).
-- В таблице Printer для каждой модели принтера указывается, является ли он цветным - color ('y', если цветной),
-- тип принтера - type (лазерный – 'Laser', струйный – 'Jet' или матричный – 'Matrix') и цена - price.


-- 1.Найдите номер модели, скорость и размер жесткого диска для всех ПК стоимостью менее 500 дол. Вывести: model, speed и hd.
SELECT model, speed, hd
FROM pc
WHERE price<500

-- 2.Найдите производителей принтеров. Вывести: maker.
SELECT DISTINCT maker
FROM product
WHERE type = 'Printer'

-- 3.Найдите номер модели, объем памяти и размеры экранов ПК-блокнотов, цена которых превышает 1000 дол.
SELECT model, ram, screen
FROM laptop
WHERE price > 1000

-- 4.Найдите все записи таблицы Printer для цветных принтеров.
SELECT *
FROM printer
WHERE color = 'y'

-- 5.Найдите номер модели, скорость и размер жесткого диска ПК, имеющих 12x или 24x CD и цену менее 600 дол.
SELECT model, speed, hd
FROM pc
WHERE (cd = '12x' or cd = '24x') AND price < 600

-- 6.Для каждого производителя, выпускающего ПК-блокноты c объёмом жесткого диска не менее 10 Гбайт, найти скорости таких ПК-блокнотов. Вывод: производитель, скорость.
SELECT DISTINCT maker, speed
FROM product INNER JOIN laptop ON product.model = laptop.model
WHERE hd >= 10

-- 7.Найдите номера моделей и цены всех имеющихся в продаже продуктов (любого типа) производителя B (латинская буква).
SELECT pc.model, pc.price
FROM product INNER JOIN pc ON product.model = pc.model
WHERE maker = 'B'

UNION

SELECT laptop.model, laptop.price
FROM product INNER JOIN laptop ON product.model = laptop.model
WHERE maker = 'B'

UNION

SELECT printer.model, printer.price
FROM product INNER JOIN printer ON product.model = printer.model
WHERE maker = 'B'

-- 8.Найдите производителя, выпускающего ПК, но не ПК-блокноты.
SELECT maker
FROM product
WHERE type ='pc'
GROUP BY maker

EXCEPT

SELECT maker
FROM product
WHERE type ='laptop'
GROUP BY maker

-- 9.Найдите производителей ПК с процессором не менее 450 Мгц. Вывести: Maker.
SELECT maker
FROM product INNER JOIN pc ON product.model = pc.model
WHERE speed >=450
GROUP BY maker

-- 10.Найдите модели принтеров, имеющих самую высокую цену. Вывести: model, price.
SELECT model, price
FROM printer
WHERE price = (
SELECT MAX(price)
FROM printer
)

-- 11.Найдите среднюю скорость всех ПК.
SELECT AVG(speed)
FROM pc

-- 12.Найдите среднюю скорость ПК-блокнотов, цена которых превышает 1000 долларов.
SELECT AVG(speed)
FROM laptop
WHERE price > 1000

-- 13.Найдите среднюю скорость ПК, выпущенных производителем A.
SELECT AVG(speed)
FROM product INNER JOIN pc ON product.model = pc.model
WHERE maker = 'A'

-- 14.Найдите размеры жестких дисков, совпадающих у двух и более PC. Вывести: HD.
SELECT hd
FROM pc
GROUP BY hd
HAVING COUNT(pc.code) >= 2

-- 15.Найдите пары моделей PC, имеющих одинаковые скорость и RAM.
-- В результате каждая пара указывается только один раз, т.е. (i,j), но не (j,i).
-- Порядок вывода: модель с большим номером, модель с меньшим номером, скорость и RAM.
SELECT DISTINCT a.model, b.model, a.speed, b.ram
FROM pc AS a, pc AS b
WHERE a.speed = b.speed AND a.ram = b.ram AND a.model > b.model

-- 16.Найдите модели ПК-блокнотов, скорость которых меньше скорости каждого из ПК. Вывести: type, model, speed.
SELECT type, laptop.model, laptop.speed
FROM laptop INNER JOIN product ON laptop.model = product.model
WHERE laptop.speed < (
SELECT MIN(pc.speed)
FROM pc
)

-- 17.Найдите производителей самых дешевых цветных принтеров. Вывести: maker, price.
SELECT maker, price
FROM printer INNER JOIN product ON printer.model = product.model
WHERE color = 'y' AND price = (
SELECT MIN(price)
FROM printer
WHERE color = 'y'
)

-- 18.Для каждого производителя, имеющего модели в таблице Laptop, найдите средний размер экрана выпускаемых им ПК-блокнотов.
-- Вывести: maker, средний размер экрана.
SELECT maker, AVG(screen)
FROM laptop INNER JOIN product ON laptop.model = product.model
GROUP BY maker

-- 19.Найдите производителей, выпускающих по меньшей мере три различных модели ПК. Вывести: Maker, число моделей ПК.
SELECT maker, COUNT(model) AS COUNT_model
FROM product
WHERE type = 'pc'
GROUP BY maker HAVING COUNT(model) >= 3

-- 20.Найдите максимальную цену ПК, выпускаемых каждым производителем, у которого есть модели в таблице PC.
-- Вывести: maker, максимальная цена.
SELECT maker, MAX(price)
FROM product INNER JOIN pc ON product.model = pc.model
GROUP BY maker

-- 21.Для каждого значения скорости ПК, превышающего 600 МГц, определите среднюю цену ПК с такой же скоростью. Вывести: speed, средняя цена.
SELECT speed, AVG(price)
FROM pc
WHERE speed > 600
GROUP BY speed

-- 22.Найдите производителей, которые производили бы как ПК со скоростью не менее 750 МГц, так и Ноутбуки со скоростью не менее 750 МГц.
-- Вывести: Maker.
SELECT maker
FROM pc INNER JOIN product ON pc.model = product.model
WHERE speed >= 750

INTERSECT

SELECT maker
FROM laptop INNER JOIN product ON laptop.model = product.model
WHERE speed >= 750

-- 23.Перечислите номера моделей любых типов, имеющих самую высокую цену по всей имеющейся в базе данных продукции.
WITH result_table AS (
SELECT pc.model, product.type, pc.price
FROM product INNER JOIN pc ON product.model = pc.model

UNION

SELECT laptop.model, product.type, laptop.price
FROM product INNER JOIN laptop ON product.model = laptop.model

UNION

SELECT printer.model, product.type, printer.price
FROM product INNER JOIN printer ON product.model = printer.model)

SELECT model
FROM result_table
WHERE price = (
SELECT MAX(price)
FROM result_table
)

-- 24.Найдите среднюю цену ПК и ПК-блокнотов, выпущенных производителем A (латинская буква). Вывести: одна общая средняя цена.
SELECT AVG(price)
FROM 
(SELECT price
FROM pc INNER JOIN product ON pc.model = product.model
WHERE maker = 'a'

UNION ALL

SELECT  price
FROM laptop INNER JOIN product ON laptop.model = product.model
WHERE maker = 'a') AS x

-- 25.Найдите средний размер диска ПК каждого из тех производителей, которые выпускают и принтеры. Вывести: maker, средний размер HD.
SELECT maker, AVG(x.hd) AS AVG_hd
FROM (
SELECT hd, maker
FROM pc INNER JOIN product ON pc.model = product.model
WHERE maker in (SELECT maker
FROM printer INNER JOIN product ON printer.model = product.model)
) AS x
GROUP BY maker

-- 26.Используя таблицу Product, определить количество производителей, выпускающих по одной модели.
SELECT COUNT (maker) AS qty 
FROM product
GROUP BY maker HAVING COUNT(model) = 1









