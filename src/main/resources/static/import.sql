DROP TABLE if exists Products,Customers;
CREATE TABLE IF NOT EXISTS Customers (id bigserial primary key , name varchar(255));
CREATE TABLE IF NOT EXISTS Products (id bigserial primary key , title varchar(255), cost float8,customer_id bigint,
constraint fk_customers
    foreign key (customer_id)
        REFERENCES Customers (id));

INSERT INTO Customers (name) VALUES ('Аркадий'),('Геннадий');
INSERT INTO Products (title, cost,customer_id) VALUES ('IPhone', 80,1), ('IPad', 81,1), ('IMac', 82,2), ('IWatch', 83,2);
