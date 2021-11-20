SET DateStyle TO European;

DROP TABLE IF EXISTS cc_users;

CREATE TABLE cc_users (
   id   INT     PRIMARY KEY     NOT NULL,
   username VARCHAR(500) UNIQUE NOT NULL,
   password VARCHAR(500) NOT NULL,
   active BOOLEAN NOT NULL,
   roles VARCHAR(500)
);