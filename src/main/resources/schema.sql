DROP TABLE IF EXISTS Product_category;
DROP TABLE IF EXISTS Product_availivility;
DROP TABLE IF EXISTS Product_detail CASCADE;
DROP TABLE IF EXISTS Category;
DROP TABLE IF EXISTS Fabricants CASCADE;
DROP TABLE IF EXISTS Product ;

CREATE TABLE Category
(
  id SERIAL PRIMARY KEY UNIQUE,
  name VARCHAR(26) NOT NULL UNIQUE
);

CREATE TABLE Fabricants
(
  id SERIAL PRIMARY KEY UNIQUE NOT NULL,
  company_name VARCHAR(36) NOT NULL UNIQUE,
  logo BYTEA NULL
);
CREATE TABLE Product_detail
(
  id SERIAL PRIMARY KEY UNIQUE,
  model VARCHAR(46) NULL,
  description VARCHAR(440) NULL,
  technical_data TEXT NULL
);

CREATE TABLE Product
(
  code UUID PRIMARY KEY DEFAULT gen_random_uuid() UNIQUE,
  title VARCHAR(46) NOT NULL,
  details INTEGER NOT NULL,
  fabricant INTEGER NULL,
  price FLOAT  NOT NULL DEFAULT 0.0,
  FOREIGN KEY (details) REFERENCES Product_detail(id),
  FOREIGN KEY (fabricant) REFERENCES Fabricants(id)
);
CREATE TABLE Product_availivility
(
  id SERIAL PRIMARY KEY,
  product UUID NULL,
  quantity BIGINT NULL DEFAULT 0,
  quantity_sale BIGINT NULL DEFAULT 0,
  FOREIGN KEY (product) REFERENCES Product(code)
);

CREATE TABLE Product_category
(
  category_id INTEGER NOT NULL,
  product_id  UUID NOT NULL,
  FOREIGN KEY (category_id) REFERENCES Category(id),
  FOREIGN KEY (product_id) REFERENCES Product(code)
);