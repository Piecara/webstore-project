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



