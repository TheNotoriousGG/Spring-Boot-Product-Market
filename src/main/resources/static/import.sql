DROP TABLE Products IF EXISTS;
CREATE TABLE IF NOT EXISTS Products (id bigserial, title varchar2, cost numeric, PRIMARY KEY (id));
INSERT INTO Products (title, cost) VALUES ('IPhone', 80), ('IPad', 80), ('IMac', 80);
select * from Products