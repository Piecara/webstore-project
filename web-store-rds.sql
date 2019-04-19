DROP TABLE AnOrder CASCADE CONSTRAINTS;
DROP TABLE AnOrder_Product CASCADE CONSTRAINTS;
DROP TABLE Product CASCADE CONSTRAINTS;
DROP TABLE AnClient CASCADE CONSTRAINTS;
DROP TABLE Payment CASCADE CONSTRAINTS;
DROP TABLE Delivery CASCADE CONSTRAINTS;
DROP TABLE Address CASCADE CONSTRAINTS;


CREATE TABLE An_Order(
	id number(6) PRIMARY KEY,
	id_client number(6),
	id_delivery number(6),
	id_payment number(6)
);
/
CREATE TABLE An_Order_Product(
    id number(6) PRIMARY KEY,
	id_anOrder number(6), 
	id_product number(6)	
);
/

CREATE TABLE Product (
	id number(6) PRIMARY KEY,
	name varchar2(21),
	price number(6),
	category varchar2(21),
	description varchar2(21),
	in_stock number(6),
	sold number(6)
);
/
CREATE TABLE An_Client (
	id number(6) PRIMARY KEY,
	name varchar2(21),
	surname varchar2(21),
	id_address number(6),
	telephone varchar2(21)
);
    
/
CREATE TABLE Payment (
	id number(6) PRIMARY KEY,
	Payment_Type varchar2(21)
);
/

CREATE TABLE Delivery (
	id number(6) PRIMARY KEY,
	id_address number(6),
	delivery_Type varchar2(21)
);
/
CREATE TABLE Address(
    id number(6) PRIMARY KEY,
    building_Number number(6),
    street varchar2(21),
    city varchar2(21),
    country varchar2(21)
);
/


ALTER TABLE An_Order ADD FOREIGN KEY (id_client) REFERENCES An_Client(id);
ALTER TABLE An_Order ADD FOREIGN KEY (id_delivery) REFERENCES Delivery(id);
ALTER TABLE An_Order ADD FOREIGN KEY (id_payment) REFERENCES Payment(id); 


ALTER TABLE Delivery ADD FOREIGN KEY (id_address) REFERENCES Address(id);
ALTER TABLE An_Client ADD FOREIGN KEY (id_address) REFERENCES Address(id);


ALTER TABLE An_Order_Product ADD FOREIGN KEY (id_product) REFERENCES Product(id);


INSERT INTO Product VALUES(1,'mydlo',200,'non','non-desc',35,10);



insert into Product (id, category, description, in_stock, name, price, sold) values (1, 'Baby', 'vel nulla eget eros elementum pellentesque quisque porta', 425, 'Potatoes - Purple, Organic', 83, 45);
insert into Product (id, category, description, in_stock, name, price, sold) values (2, 'Beauty', 'a feugiat et eros vestibulum', 370, 'Cookies Almond Hazelnut', 7, 47);
insert into Product (id, category, description, in_stock, name, price, sold) values (3, 'Books', 'velit donec diam neque vestibulum eget', 838, 'Brandy Cherry - Mcguinness', 35, 21);
insert into Product (id, category, description, in_stock, name, price, sold) values (4, 'Outdoors', 'habitasse platea dictumst aliquam augue quam sollicitudin vitae consectetuer eget rutrum at lorem integer tincidunt ante vel ipsum', 970, 'Tart Shells - Sweet, 3', 64, 40);
insert into Product (id, category, description, in_stock, name, price, sold) values (5, 'Beauty', 'mattis pulvinar nulla pede', 449, 'Dried Peach', 40, 64);
insert into Product (id, category, description, in_stock, name, price, sold) values (6, 'Computers', 'nulla integer pede justo lacinia eget tincidunt eget tempus vel pede morbi porttitor lorem', 269, 'Wine - Red, Marechal Foch', 39, 90);
insert into Product (id, category, description, in_stock, name, price, sold) values (7, 'Movies', 'dui luctus rutrum nulla tellus in sagittis dui vel nisl duis ac nibh fusce lacus purus aliquet at feugiat non', 951, 'Island Oasis - Peach Daiquiri', 90, 15);
insert into Product (id, category, description, in_stock, name, price, sold) values (8, 'Home', 'phasellus id', 792, 'Pork - Sausage, Medium', 54, 13);
insert into Product (id, category, description, in_stock, name, price, sold) values (9, 'Music', 'sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo', 601, 'Wine - Cousino Macul Antiguas', 81, 42);
insert into Product (id, category, description, in_stock, name, price, sold) values (10, 'Industrial', 'nunc nisl', 406, 'Wine - Casillero Deldiablo', 22, 67);
insert into Product (id, category, description, in_stock, name, price, sold) values (11, 'Home', 'a feugiat et eros vestibulum ac est lacinia nisi', 379, 'Beans - French', 50, 54);
insert into Product (id, category, description, in_stock, name, price, sold) values (12, 'Baby', 'convallis morbi odio odio elementum eu interdum', 78, 'Cheese - La Sauvagine', 64, 31);
insert into Product (id, category, description, in_stock, name, price, sold) values (13, 'Movies', 'vel nulla eget eros elementum pellentesque quisque porta volutpat erat', 791, 'Sping Loaded Cup Dispenser', 50, 47);
insert into Product (id, category, description, in_stock, name, price, sold) values (14, 'Home', 'rutrum at lorem integer tincidunt ante vel ipsum praesent blandit lacinia erat vestibulum sed magna at nunc commodo placerat praesent', 392, 'Russian Prince', 69, 92);
insert into Product (id, category, description, in_stock, name, price, sold) values (15, 'Shoes', 'felis eu sapien', 284, 'Pop - Club Soda Can', 63, 18);
insert into Product (id, category, description, in_stock, name, price, sold) values (16, 'Automotive', 'quam turpis adipiscing lorem vitae mattis nibh ligula nec sem duis aliquam convallis nunc proin at', 129, 'Cheese - Brick With Pepper', 53, 53);
insert into Product (id, category, description, in_stock, name, price, sold) values (17, 'Clothing', 'pretium nisl ut volutpat', 198, 'Radish - Black, Winter, Organic', 71, 49);
insert into Product (id, category, description, in_stock, name, price, sold) values (18, 'Games', 'mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis', 140, 'The Pop Shoppe Pinapple', 51, 94);
insert into Product (id, category, description, in_stock, name, price, sold) values (19, 'Computers', 'odio elementum eu interdum eu tincidunt in leo maecenas', 25, 'Lettuce - Lolla Rosa', 1, 6);
insert into Product (id, category, description, in_stock, name, price, sold) values (20, 'Music', 'ullamcorper augue a suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra dapibus', 444, 'Pears - Bartlett', 74, 99);
