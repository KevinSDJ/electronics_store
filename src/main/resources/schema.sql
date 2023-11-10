DROP TABLE IF EXISTS products;

DROP TABLE IF EXISTS fabricant;

CREATE TABLE IF NOT EXISTS fabricant(
    id int GENERATED ALWAYS AS indentity NOT NULL UNIQUE, mark_name varchar(60) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS products(
    code uuid PRIMARY KEY NOT NULL UNIQUE DEFAULT gen_random_uuid(),
    title varchar(100) NOT NULL,
    description text NULL,
    fabricant_id bigint NULL,
    model varchar(46) NULL,
    FOREIGN KEY (fabricant_id) REFERENCES fabricant(id)
);