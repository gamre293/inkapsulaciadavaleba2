1
CREATE TABLE authors (
    id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL
);
2
CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    author_id INTEGER NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (author_id) REFERENCES authors(id)
);
3
CREATE TABLE sales (
    id SERIAL PRIMARY KEY,
    book_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    sale_date DATE NOT NULL,
    FOREIGN KEY (book_id) REFERENCES books(id)
);
