DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
   id INT PRIMARY KEY,
   'name' VARCHAR(255),
);

DROP TABLE IF EXISTS Book;

CREATE TABLE Book (
   id INT PRIMARY KEY,
   'name' VARCHAR(255),
   email VARCHAR(255),
   'role' VARCHAR(255);
);

DROP TABLE IF EXISTS Counter_Party;

CREATE TABLE Counter_Party (
   id INT PRIMARY KEY,
   'name' VARCHAR(255)
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

DROP TABLE IF EXISTS Trade;

CREATE TABLE Trade (
   id INT NOT NULL AUTO_INCREMENT,
   book_id INT,
   security_id int,
   counter_party_id int,
   currency VARCHAR(4),
   'status' VARCHAR(50),
   quantity INT,
   unit_price real,
   buy_sell VARCHAR(50),
   trade_date DATE,
   settlement_date DATE,
   PRIMARY KEY (id),
   FOREIGN KEY (book_id) REFERENCES Book(id),
   FOREIGN KEY (security_id) REFERENCES Security(id),
   FOREIGN KEY (counter_party_id) REFERENCES Security(id),
);

DROP TABLE IF EXISTS Book_User;

CREATE TABLE Book_User (
   user_id INT,
   book_id INT,
   PRIMARY KEY (user_id, book_id),
   FOREIGN KEY (user_id) REFERENCES Users(id),
   FOREIGN KEY (book_id) REFERENCES Book(id)
);