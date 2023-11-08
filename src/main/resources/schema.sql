DROP TABLE IF EXISTS products;

CREATE TABLE IF NOT EXISTS products(
    code uuid primary key not null unique default gen_random_uuid(),
    title varchar(100) not null,
    price float default 0.0 not null
);