INSERT INTO customer(customer_id, name, surname, phone_number) VALUES (1, 'Mirosław','Karwowski','111222333');
INSERT INTO customer(customer_id, name, surname, phone_number) VALUES (2, 'Maciej', 'Klimiuk', '222333444');
INSERT INTO customer(customer_id, name, surname, phone_number) VALUES (3, 'Paweł', 'Karabowicz', '322555444');

INSERT INTO pizza(pizza_id, name, price, url) VALUES (1, 'PIZZA CAPRICCIOSA', '25', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/capricciosa.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (2, 'PIZZA MARGHERITA', '19', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/margherita.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (3, 'PIZZA PEPPERONI', '23', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/pepperoni.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (4, 'PIZZA HAWAJSKA', '23', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/hawajska.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (5, 'PIZZA KURCZAK', '27', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/Kurczak.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (6, 'PIZZA FARMERSKA', '28', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/farmerska.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (7, 'PIZZA KEBAB', '28', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/kebab.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (8, 'PIZZA SEROWA', '28', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/serowa.jpg');
INSERT INTO pizza(pizza_id, name, price, url) VALUES (9, 'PIZZA WIEJSKA', '28', 'https://raw.githubusercontent.com/mirek5207/springRestApi/develop/src/main/resources/image/wiejska.jpg');

INSERT INTO orders(order_id, description, city, street, house_number, customer_id) VALUES ('1', 'Opis1', 'Lublin', 'Nadbystrzycka', '44A', 1);
INSERT INTO orders(order_id, description, city, street, house_number, customer_id) VALUES ('2', 'Opis2', 'Kraków', 'Głęboka', '30', 2);
INSERT INTO orders(order_id, description, city, street, house_number, customer_id) VALUES ('3', 'Opis3', 'Warszawa', 'Koncertowa', '23', 3);

INSERT INTO order_pizza(order_id, pizza_id) VALUES (1,1);
INSERT INTO order_pizza(order_id, pizza_id) VALUES (1,3);
INSERT INTO order_pizza(order_id, pizza_id) VALUES (1,5);

INSERT INTO order_pizza(order_id, pizza_id) VALUES (2,5);
INSERT INTO order_pizza(order_id, pizza_id) VALUES (2,6);
INSERT INTO order_pizza(order_id, pizza_id) VALUES (2,5);

INSERT INTO order_pizza(order_id, pizza_id) VALUES (3,4);
INSERT INTO order_pizza(order_id, pizza_id) VALUES (3,1);



