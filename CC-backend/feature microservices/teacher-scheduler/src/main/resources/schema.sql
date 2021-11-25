SET DateStyle TO European;

DROP TABLE IF EXISTS cc_courses, cc_courses_enrolled;

CREATE TABLE cc_courses (
   id INT PRIMARY KEY NOT NULL,
   coursename VARCHAR(100) NOT NULL,
   coursecode VARCHAR(100) UNIQUE NOT NULL,
   description VARCHAR(500) NOT NULL,
   instructor VARCHAR(100)  NOT NULL,
   backgroundurl VARCHAR(500)  NOT NULL
);


CREATE TABLE cc_courses_enrolled(
   id   INT     PRIMARY KEY     NOT NULL,
   coursecode VARCHAR(100) NOT NULL,
   username VARCHAR(100) NOT NULL,
   FOREIGN KEY (coursecode) REFERENCES cc_courses(coursecode) ON DELETE CASCADE,
   FOREIGN KEY (username) REFERENCES cc_users(username) ON DELETE CASCADE
);