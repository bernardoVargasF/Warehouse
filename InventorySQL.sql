CREATE DATABASE if not exists inventory;
CREATE SCHEMA IF NOT EXISTS inventory;
CREATE USER IF NOT EXISTS 'inventoryuser'@'localhost' IDENTIFIED BY '04021986';
GRANT ALL PRIVILEGES ON inventory.* TO 'inventoryuser'@'localhost';
FLUSH PRIVILEGES;
CREATE TABLE IF NOT EXISTS inventory.warehouses(id int PRIMARY KEY,
    warehouseName varchar(255),
    minProduct int,
    maxProduct int
);
CREATE TABLE IF NOT EXISTS inventory.products(id int PRIMARY KEY,
    productName varchar(255),
    total int,
    remaining int,
    warehouse_id int NOT NULL
    /*FOREIGN KEY (warehouse_id) REFERENCES inventory.warehouses(id)*/
);
                                
CREATE OR REPLACE VIEW report AS SELECT a.productName, a.remaining AS 'on stock', (a.total-a.remaining) AS sold, 
								(a.remaining + (a.total- a.remaining)) AS total,a.warehouse_id, b.minProduct AS min, b.maxProduct AS max
                                FROM inventory.products a, inventory.warehouses b
                                WHERE a.warehouse_id = b.id;
