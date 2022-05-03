INSERT INTO customer(customer_id, name, surname, phone_number) VALUES (1, 'Mirosław','Karwowski','111222333');
INSERT INTO customer(customer_id, name, surname, phone_number) VALUES (2, 'Maciej', 'Klimiuk', '222333444');
INSERT INTO customer(customer_id, name, surname, phone_number) VALUES (3, 'Paweł', 'Karabowicz', '322555444');

INSERT INTO pizza(pizza_id, name, price) VALUES (1, 'Capricciosa', '25');
INSERT INTO pizza(pizza_id, name, price) VALUES (2, 'Margherita', '19');
INSERT INTO pizza(pizza_id, name, price) VALUES (3, 'Pepperoni', '23');
INSERT INTO pizza(pizza_id, name, price) VALUES (4, 'Hawajska', '23');
INSERT INTO pizza(pizza_id, name, price) VALUES (5, 'Neapolitańska', '27');
INSERT INTO pizza(pizza_id, name, price) VALUES (6, 'Siciliana', '28');

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



