create table category
(
id IDENTITY,
name VARCHAR(50),
description VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,

CONSTRAINT pk_category_id PRIMARY KEY (id)
);



insert into category(name,description,image_url,is_active)
values('laptop','this is discription for laptop category!','1.png',true);

insert into category(name,description,image_url,is_active)
values('television','this is discription for television category!','2.png',true);

insert into category(name,description,image_url,is_active)
values('mobile','this is discription for mobile category!','3.png',true);


create table user_detail(
id IDENTITY,
first_name VARCHAR(50),
last_name VARCHAR(50),
role VARCHAR(45),
enabled BOOLEAN,
password VARCHAR(50),
email VARCHAR(100),
contact_number VARCHAR(100),
CONSTRAINT pk_user_id PRIMARY KEY(id)

);


INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email,
contact_number)VALUES ('Virat', 'Kohli', 'ADMIN', true, 'admin', 'vk@gmail.com',
'8888888888');

INSERT INTO user_detail(first_name, last_name, role, enabled, password, email,
contact_number)VALUES ('Ravindra', 'Jadeja', 'SUPPLIER', true, '12345',
'rj@gmail.com', '9999999999');

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email,
contact_number) VALUES ('Ravichandra', 'Ashwin', 'SUPPLIER', true, '12345',
'ra@gmail.com', '7777777777');


CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);	


INSERT INTO product (code, name, brand, description, unit_price,
quantity, is_active, category_id, supplier_id)VALUES ('PRDABC123DEFX', 'iPhone 5s', 'apple', 'This is one of
the best phone available in the market right now!', 18000, 5, true, 3,
2 );

INSERT INTO product (code, name, brand, description, unit_price,
quantity, is_active, category_id, supplier_id)
VALUES ('PRDDEF123DEFX', 'Samsung s7', 'samsung', 'A smart phone
by samsung!', 32000, 2, true, 3, 3 );

INSERT INTO product (code, name, brand, description, unit_price,
quantity, is_active, category_id, supplier_id)
VALUES ('PRDPQR123WGTX', 'Google Pixel', 'google', 'This is one
of the best android smart phone available in the market right now!',
57000, 5, true, 3, 2 );

INSERT INTO product (code, name, brand, description, unit_price,
quantity, is_active, category_id, supplier_id)
VALUES ('PRDMNO123PQRX', ' Macbook Pro', 'apple', 'This is one of
the best laptops available in the market right now!', 54000, 3, true,
1, 2 );

INSERT INTO product (code, name, brand, description, unit_price,
quantity, is_active, category_id, supplier_id)VALUES ('PRDABCXYZDEFX', 'Dell Latitude E6510', 'dell', 'This is
one of the best laptop series from dell that can be used!', 48000, 5,
true, 1, 3 );


