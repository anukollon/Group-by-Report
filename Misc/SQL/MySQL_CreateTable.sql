CREATE TABLE `customer_location` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(255),
	`address` text,
    `contact` varchar(255)
);

CREATE TABLE `distributor_location` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(255),
	`address` text,
    `contact` varchar(255)
);

CREATE TABLE `manufacturer_location` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(255),
	`address` text,
    `contact` varchar(255)
);

CREATE TABLE `product` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `description` text,
	`product_code` int,
    `distributor_location_id` int,
    `manufacturer_location_id` int,
     FOREIGN KEY (distributor_location_id)
		REFERENCES distributor_location(id)
		ON DELETE SET NULL,
     FOREIGN KEY (manufacturer_location_id)
		REFERENCES manufacturer_location(id)
		ON DELETE SET NULL
);

CREATE TABLE `invoice` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`invoice_number` int,
	`purchase_date` varchar(255),
    `total_purchases` varchar(255),
    customer_location_id int,
    distributor_location_id int,
    FOREIGN KEY (customer_location_id)
		REFERENCES customer_location(id)
		ON DELETE SET NULL,
    FOREIGN KEY (distributor_location_id)
		REFERENCES distributor_location(id)
		ON DELETE SET NULL
);

CREATE TABLE `invoice_line` (
	`id` INT AUTO_INCREMENT PRIMARY KEY,
	`quantity` int,
	`weight` int,
    `unit_of_measure` varchar(255),
    `unit_price` float,
    product_id int,
    invoice_id int,
	FOREIGN KEY (product_id)
		REFERENCES product(id)
		ON DELETE SET NULL,
    FOREIGN KEY (invoice_id)
		REFERENCES invoice(id)
		ON DELETE SET NULL
);

commit;