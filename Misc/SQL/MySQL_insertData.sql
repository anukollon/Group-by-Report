insert into customer_location ( name, address, contact) values ("Cust A", "C Address A", "+122334444");
insert into customer_location ( name, address, contact) values ("Cust B", "C Address B", "+122335555");

delete from customer_location;

insert into distributor_location ( name, address, contact) values ("Dist A", "D Address A", "+111114444");
insert into distributor_location ( name, address, contact) values ("Dist B", "D Address B", "+121115555");
insert into distributor_location ( name, address, contact) values ("Dist C", "D Address C", "+1211152225");

insert into manufacturer_location ( name, address, contact) values ("Manuf A", "M Address A", "+111110001");
insert into manufacturer_location ( name, address, contact) values ("Manuf B", "M Address B", "+111110002");
insert into manufacturer_location ( name, address, contact) values ("Manuf C", "M Address C", "+111110003");
insert into manufacturer_location ( name, address, contact) values ("Manuf D", "M Address D", "+111110004");
insert into manufacturer_location ( name, address, contact) values ("Manuf E", "M Address E", "+111110005");

insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Almonds",123 , "1", "1");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Almonds",123 , "2", "1");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Ketchup",124 , "3", "1");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Eggs",125 , "1", "2");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Russet Potatoes",126 , "1", "3");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Onions",127 , "2", "4");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Onions",127 , "3", "4");
insert into product (description, product_code, distributor_location_id, manufacturer_location_id) values ("Mayonnaisse",128 , "3", "5");


insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1111,"10/22/2020", "35", 8, 1);
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1111,"10/22/2020", "50", "8", "1");
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1111,"10/22/2020", "120", "8", "1");
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1112,"10/24/2020", "70", "9", "2");
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1112,"10/24/2020", "70" ,"9", "2");
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1113,"10/26/2020", "108", "8", "3");
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1113,"10/26/2020", "62.5", "8", "3");
insert into invoice ( invoice_number, purchase_date, total_purchases, customer_location_id, distributor_location_id) values (1113,"10/26/2020", "70" ,"8", "3");

insert into invoice_line ( quantity, weight, unit_of_measure, unit_price, product_id, invoice_id) values (5,50, "Case", 7, 1, 1);
insert into invoice_line ( quantity, weight, unit_of_measure, unit_price, product_id, invoice_id) values (10,20, "Case", 5, 3, 2);
insert into invoice_line (  weight, unit_of_measure, unit_price, product_id, invoice_id) values (40, "Weight", 3, 4, 3);
insert into invoice_line ( quantity, weight, unit_of_measure, unit_price, product_id, invoice_id) values (10,100, "Case", 7, 7, 4);
insert into invoice_line ( weight, unit_of_measure, unit_price, product_id, invoice_id) values (30, "Weight", 2.5, 5, 5);
insert into invoice_line ( quantity, weight, unit_of_measure, unit_price, product_id, invoice_id) values (12,100, "Case", 9, 2, 6);
insert into invoice_line ( weight, unit_of_measure, unit_price, product_id, invoice_id) values (25, "Weight", 2.5, 8, 7);
insert into invoice_line ( quantity, weight, unit_of_measure, unit_price, product_id, invoice_id) values (7,70, "Case",10, 6, 8);


