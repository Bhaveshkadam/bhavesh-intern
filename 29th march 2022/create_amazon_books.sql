DROP schema if EXISTS amazon CASCADE;

CREATE SCHEMA amazon AUTHORIZATION postgres;
-- amazon.address definition

-- Drop table

-- DROP TABLE amazon.address;
CREATE TABLE amazon."order" (
	order_id int8 NOT NULL,
	address_id int8 NOT NULL,
	"time_stamp" varchar(100) NOT NULL UNIQUE,
	total float8  NOT NULL,
	seller_id int8 NOT NULL,
	user_id int8 NOT NULL,
	CONSTRAINT order_id_pkey PRIMARY KEY (order_id)
);


CREATE TABLE amazon.address (
	address_id int8 NOT NULL,
	addressline1 varchar(255) NOT NULL,
	addressline2 varchar(255) NULL,
	addressline3 varchar(255) NULL,
	addressline4 varchar(255) NULL,
	city varchar(255) NOT NULL,
	state varchar(255) NOT NULL,
	pincode varchar(255) NOT NULL,
	landmark varchar(255) NULL,
	CONSTRAINT address_id_pkey PRIMARY KEY (address_id)	
);


CREATE TABLE amazon.offer (
	offer_id int8 NOT NULL,
	offer_provider varchar(255)  NOT NULL,
	"offer_type" varchar(255) ,
	percentage float8 NULL ,
	CONSTRAINT offer_pkey PRIMARY KEY (offer_id)
);



-- amazon."user" definition

-- Drop table

-- DROP TABLE amazon."user";

CREATE TABLE amazon."user" (
	user_id int8 NOT NULL,
	name varchar(255) NOT NULL,
	user_password varchar(50) NOT NULL,
	auth_token varchar(255) NOT NULL UNIQUE,
	expired bool NULL,
	order_id int8 NOT NULL ,
	role varchar(255) NOT NULL,
	address_id int8 NOT NULL,
	CONSTRAINT user_id_pkey PRIMARY KEY (user_id),
	CONSTRAINT user_order_id_fkey FOREIGN KEY (order_id) REFERENCES amazon."order"(order_id),
	CONSTRAINT user_address_id_fkey FOREIGN KEY (address_id) REFERENCES amazon."address"(address_id)
	
);

CREATE TABLE amazon."author"(
	author_id int8 NOT NULL,
	author_name varchar(255),
	CONSTRAINT author_id_pkey PRIMARY KEY (author_id)
	);


-- amazon.user_address definition






CREATE TABLE amazon."publisher"(
	publisher_id int8 NOT NULL,
	CONSTRAINT publisher_id_pkey PRIMARY KEY (publisher_id),
	publisher_name varchar(255),
	registration_date varchar(255),
	address_id int8 NOT NULL,
	CONSTRAINT publisher_address_id_fkey FOREIGN KEY (address_id) REFERENCES amazon."address"(address_id)
	);


-- Drop table

-- DROP TABLE amazon.user_address;

-- amazon.book definition

-- Drop table

-- DROP TABLE amazon.book;

CREATE TABLE amazon.book (
	book_id int8 NOT NULL,
	book_name varchar(25)NOT NULL,
	book_description varchar(255) NOT NULL,
	author_id int8 NOT NULL,
	book_edition varchar(100) NOT NULL,
	publisher_id int8 NOT NULL,
	book_price float8 NOT NULL,
	language_type varchar(255) NOT NULL,
	genre_type varchar(255) NOT NULL,
	book_availibility bool NOT NULL,
	added_in_cart bool NULL,
	saved_for_later bool NULL,
	offer_id int8 NOT NULL,
	discount varchar(255) ,
	CONSTRAINT book_pkey PRIMARY KEY (book_id),
	CONSTRAINT book_author_id_fkey FOREIGN KEY (author_id) REFERENCES amazon."author"(author_id),
	CONSTRAINT book_offer_fkey FOREIGN KEY (offer_id) REFERENCES amazon.offer(offer_id),
	
	CONSTRAINT book_publisher_id_fkey FOREIGN KEY (publisher_id) REFERENCES amazon."publisher"(publisher_id)
);



-- amazon."order" definition

-- Drop table

--DROP TABLE amazon."order";


-- amazon.orderitem definition

-- Drop table

--DROP TABLE amazon.order;



-- amazon.review definition

-- Drop table

-- DROP TABLE amazon.review;

CREATE TABLE amazon.review (
	review_id int8 NOT NULL,
	book_id int8 NOT NULL,
	review_tite varchar(255) NULL,
	review_text varchar(255) NULL,
	user_id int8 NOT NULL,
	"time_stamp" varchar(100) NOT NULL UNIQUE,
	stars int8 NOT NULL,
	helpful bool NOT NULL,
	reported bool NOT NULL,
	CONSTRAINT review_pkey PRIMARY KEY (review_id),
	CONSTRAINT review_book_id_fkey FOREIGN KEY (book_id) REFERENCES amazon.book(book_id),
	CONSTRAINT review_user_id_fkey FOREIGN KEY (user_id) REFERENCES amazon."user"(user_id)
);


