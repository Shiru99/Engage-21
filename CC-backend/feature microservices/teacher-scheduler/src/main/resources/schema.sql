SET DateStyle TO European;

DROP TABLE IF EXISTS cc_courses;

CREATE TABLE cc_courses (
   id   INT     PRIMARY KEY     NOT NULL,
   course_name VARCHAR(100) NOT NULL,
   course_code VARCHAR(100) UNIQUE NOT NULL,
   description VARCHAR(500) NOT NULL,
   instructor VARCHAR(100)  NOT NULL,
   background_url VARCHAR(500)  NOT NULL
);
