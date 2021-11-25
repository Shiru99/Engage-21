DROP TABLE IF EXISTS class_sheduled;

CREATE TABLE class_sheduled (
   id INT PRIMARY KEY NOT NULL,
   date DATE NOT NULL,
   starttime TIME NOT NULL,
   endtime TIME NOT NULL,
   classroom VARCHAR(100) NOT NULL,
   coursecode VARCHAR(100) NOT NULL,
   FOREIGN KEY (coursecode) REFERENCES cc_courses(coursecode) ON DELETE CASCADE
);