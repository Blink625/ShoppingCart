DROP TABLE IF EXISTS PRODUCT;
DROP TABLE IF EXISTS SHOPPINGCART;
DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE PRODUCT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    itemNumber VARCHAR(250) NOT NULL,
    itemName VARCHAR(250) NOT NULL,
    brand VARCHAR(250) NOT NULL,
    type VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    cost double not NULL
);

CREATE TABLE CUSTOMER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(250) NOT NULL,
    lastName VARCHAR(250) NOT NULL,
    emailAddress VARCHAR(250) NOT NULL
);


CREATE TABLE SHOPPINGCART (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customerId INT NOT NULL,
    createdDate TIMESTAMP NULL
);

CREATE TABLE SHOPPINGCARTITEM (
    id INT AUTO_INCREMENT PRIMARY KEY,
    shoppingCartId INT NOT NULL,
    productId VARCHAR(250) NOT NULL
);

