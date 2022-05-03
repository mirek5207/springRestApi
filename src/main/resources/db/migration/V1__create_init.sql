CREATE TABLE customer
(
    customer_id  BIGINT       NOT NULL,
    name         VARCHAR(255) NOT NULL,
    surname      VARCHAR(255) NOT NULL,
    phone_number VARCHAR(9)   NOT NULL,
    CONSTRAINT pk_customer PRIMARY KEY (customer_id)
);

CREATE TABLE `orders`
(
    order_id      BIGINT       NOT NULL,
    `description` VARCHAR(255) NULL,
    city          VARCHAR(255) NOT NULL,
    street        VARCHAR(255) NOT NULL,
    house_number  VARCHAR(255) NOT NULL,
    customer_id   BIGINT       NULL,
    CONSTRAINT pk_order PRIMARY KEY (order_id)
);

CREATE TABLE order_pizza
(
    order_id BIGINT NOT NULL,
    pizza_id BIGINT NOT NULL
);

CREATE TABLE pizza
(
    pizza_id BIGINT       NOT NULL,
    name     VARCHAR(255) NOT NULL,
    price     VARCHAR(255) NOT NULL,
    CONSTRAINT pk_pizza PRIMARY KEY (pizza_id)
);

ALTER TABLE `orders`
    ADD CONSTRAINT FK_ORDER_ON_CUSTOMERID FOREIGN KEY (customer_id) REFERENCES customer (customer_id);

ALTER TABLE order_pizza
    ADD CONSTRAINT fk_ordpiz_on_order FOREIGN KEY (order_id) REFERENCES `orders` (order_id);

ALTER TABLE order_pizza
    ADD CONSTRAINT fk_ordpiz_on_pizza FOREIGN KEY (pizza_id) REFERENCES pizza (pizza_id);