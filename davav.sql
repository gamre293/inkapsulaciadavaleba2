CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    grade VARCHAR(10)
);
CREATE TABLE teachers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    subject_id INT,
    salary DECIMAL(10, 2),
    FOREIGN KEY (subject_id) REFERENCES subjects(id)
);
CREATE TABLE subjects (
    id INT AUTO_INCREMENT PRIMARY KEY,
    subject_name VARCHAR(100) NOT NULL
);
