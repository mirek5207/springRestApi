CREATE TABLE Customer
(
    customerId int not null primary key,
    name varchar(255) NOT NULL,
    surname varchar(255) NOT NULL,
    phoneNumber varchar(11) NOT NULL
)

CREATE TABLE Order
(
    orderId     int          not null primary key,
    comment     varchar(255) not null,
    customerId  int          not null,
    city        varchar(255) not null,
    street      varchar(255) not null,
    houseNumber varchar(255) not null,
    FOREIGN KEY (customerId) REFERENCES Customer (CustomerId)
)
CREATE TABLE OrderItem
(
    orderId int not null,
    pizzaId int not null,
    FOREIGN KEY(orderId) REFERENCES Order(orderId),
    FOREIGN KEY(pizzaId) REFERENCES Order(pizzaId)

)
Create Table Pizza
(
    pizzaId int          not null primary key,
    name    varchar(255) not null,
    price   double       not null
)
