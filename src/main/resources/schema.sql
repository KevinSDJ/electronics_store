DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS fabricant;

CREATE TABLE IF NOT EXISTS fabricant(
    id int generated always as indentity not null unique,
    mark_name varchar(60) not null unique
);

CREATE TABLE IF NOT EXISTS products(
    code uuid primary key not null unique default gen_random_uuid(),
    title varchar(100) not null,
    description text null,
    fabricant_id bigint null,
    model varchar(46) null,
    FOREIGN KEY (fabricant_id) references fabricant(id)
);