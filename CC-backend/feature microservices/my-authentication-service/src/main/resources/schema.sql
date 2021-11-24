SET DateStyle TO European;

DROP TABLE IF EXISTS cc_users,cc_courses_enrolled;

CREATE TABLE cc_users (
   id   INT     PRIMARY KEY     NOT NULL,
   username VARCHAR(100) UNIQUE NOT NULL,
   password VARCHAR(500) NOT NULL,
   active BOOLEAN NOT NULL,
   role VARCHAR(500)
);
