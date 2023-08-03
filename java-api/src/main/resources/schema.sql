-- DROP DATABASE IF EXISTS `bonds`;
-- CREATE DATABASE `bonds`;
-- use bonds;

-- DROP TABLE IF EXISTS `book`;
-- CREATE TABLE book (
--   id int NOT NULL AUTO_INCREMENT,
--   `name` varchar(255) NOT NULL,
--   PRIMARY KEY (id)
-- );

-- DROP TABLE IF EXISTS `user`;
-- CREATE TABLE `user` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `name` varchar(255) NOT NULL,
--   `email` varchar(255) NOT NULL,
--   `role` varchar(255) NOT NULL,
--   PRIMARY KEY (`id`)
-- );

-- DROP TABLE IF EXISTS `counterparty`;
-- CREATE TABLE `counterparty` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `name` varchar(255) NOT NULL,
--   PRIMARY KEY (`id`)
-- );

-- DROP TABLE IF EXISTS `book_user`;
-- CREATE TABLE `book_user` (
--   `book_id` int NOT NULL,
--   `user_id` int NOT NULL,
--   KEY `FK1_book_id` (`book_id`),
--   KEY `FK_user_id` (`user_id`)
-- );

-- DROP TABLE IF EXISTS `security`;
-- CREATE TABLE `security` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `isin` varchar(50) DEFAULT NULL,
--   `cusip` varchar(50) DEFAULT NULL,
--   `issuer_name` varchar(255) NOT NULL,
--   `maturity_date` datetime NOT NULL,
--   `coupon` float NOT NULL,
--   `type` varchar(255) NOT NULL,
--   `face_value` float NOT NULL,
--   `currency` varchar(10) NOT NULL,
--   `status` varchar(32) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- );

-- DROP TABLE IF EXISTS `trades`;
-- CREATE TABLE `trades` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `book_id` int NOT NULL,
--   `security_id` int NOT NULL,
--   `counterparty_id` int NOT NULL,
--   `currency` varchar(10) NOT NULL,
--   `status` varchar(32) NOT NULL,
--   `quantity` int NOT NULL,
--   `unit_price` float NOT NULL,
--   `buy_sell` varchar(32) NOT NULL,
--   `trade_date` datetime NOT NULL,
--   `settlement_date` datetime NOT NULL,
--   PRIMARY KEY (`id`),
--   KEY `FK_security_id` (`security_id`),
--   KEY `FK_counterparty_id` (`counterparty_id`),
--   KEY `FK_book_id` (`book_id`)
-- );


-- ALTER TABLE book_user ADD PRIMARY KEY(book_id, user_id);

DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
   user_id INT PRIMARY KEY,
   user_name VARCHAR(255),
   user_email VARCHAR(255),
   user_password VARCHAR(255)
);

DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
   book_id INT PRIMARY KEY,
   book_name VARCHAR(255)
);

DROP TABLE IF EXISTS Counter_Party;

CREATE TABLE Counter_Party (
   counter_party_id INT PRIMARY KEY,
   counter_party_name VARCHAR(255)
);

DROP TABLE IF EXISTS Security;

CREATE TABLE Security (
   isin VARCHAR(255) PRIMARY KEY,  
   bond_currency VARCHAR(4),
   cusip VARCHAR(255),
   face_value_mn INT,
   issuer_name VARCHAR(255),
   bond_maturity_date DATE,
   s_status VARCHAR(50),
   s_type VARCHAR(50),
   coupon_percent DECIMAL(8, 2)
);

DROP TABLE IF EXISTS Trade;

CREATE TABLE Trade (
   trade_id INT NOT NULL AUTO_INCREMENT,
   trade_type VARCHAR(50),
   trade_currency VARCHAR(4),
   quantity INT,
   trade_settlement_date DATE,
   trade_status VARCHAR(50),
   trade_date DATE,
   unit_price DECIMAL(10, 2),
   book_id INT,
   isin VARCHAR(255),
   bond_holder VARCHAR(255),
   PRIMARY KEY (trade_id),
   FOREIGN KEY (book_id) REFERENCES Book(book_id),
   FOREIGN KEY (isin) REFERENCES Security(isin)
);

DROP TABLE IF EXISTS Book_User;

CREATE TABLE Book_User (
   user_id INT,
   book_id INT,
   PRIMARY KEY (user_id, book_id),
   FOREIGN KEY (user_id) REFERENCES Users(user_id),
   FOREIGN KEY (book_id) REFERENCES Book(book_id)
);