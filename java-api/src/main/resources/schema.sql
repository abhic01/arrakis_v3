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

DROP TABLE IF EXISTS 'security';

CREATE TABLE security (
  id INT NOT NULL AUTO_INCREMENT,
  isin VARCHAR(50),  
  cusip VARCHAR(50),
  issuer_name VARCHAR(255) NOT NULL,
  maturity_date DATE NOT NULL,
  coupon REAL NOT NULL,
  'type' VARCHAR(255) NOT NULL,
  face_value REAL NOT NULL,
  currency VARCHAR(10) NOT NULL,
  status VARCHAR(32),
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS trades;

CREATE TABLE trades (
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