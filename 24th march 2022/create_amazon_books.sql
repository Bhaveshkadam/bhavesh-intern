-- DROP SCHEMA amazon;

CREATE SCHEMA amazon AUTHORIZATION postgres;
-- amazon.address definition

-- Drop table

-- DROP TABLE amazon.address;

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
	CONSTRAINT address_pkey PRIMARY KEY (address_id)
);



-- amazon.discount_provider definition

-- Drop table

-- DROP TABLE amazon.discount_provider;

CREATE TABLE amazon.discount_provider (
	discount_provider_id int8 NOT NULL,
	"name" varchar(255) NULL,
	CONSTRAINT discount_provider_pkey PRIMARY KEY (discount_provider_id)
);



-- amazon.genre definition

-- Drop table

-- DROP TABLE amazon.genre;

CREATE TABLE amazon.genre (
	genre_id int8 NOT NULL,
	"name" varchar(100) NOT NULL,
	CONSTRAINT genre_pkey PRIMARY KEY (genre_id)
);


-- amazon."language" definition

-- Drop table

-- DROP TABLE amazon."language";

CREATE TABLE amazon."language" (
	language_id int8 NOT NULL,
	"name" varchar(100) NULL,
	CONSTRAINT language_pkey PRIMARY KEY (language_id)
);


-- amazon."role" definition

-- Drop table

-- DROP TABLE amazon."role";

CREATE TABLE amazon."role" (
	role_id int8 NOT NULL,
	role_name varchar(255) NOT NULL,
	CONSTRAINT role_pkey PRIMARY KEY (role_id)
);



-- amazon.discount definition

-- Drop table

-- DROP TABLE amazon.discount;

CREATE TABLE amazon.discount (
	discount_id int8 NOT NULL,
	discount_provider_id int8 NULL,
	percentage float8 NOT NULL,
	"name" varchar(255) NOT NULL,
	CONSTRAINT discount_pkey PRIMARY KEY (discount_id),
	CONSTRAINT discount_discount_provider_id_fkey FOREIGN KEY (discount_provider_id) REFERENCES amazon.discount_provider(discount_provider_id)
);



-- amazon."user" definition

-- Drop table

-- DROP TABLE amazon."user";

CREATE TABLE amazon."user" (
	user_id int8 NOT NULL,
	role_id int8 NOT NULL,
	name varchar(255) NOT NULL,
	user_password varchar(50) NOT NULL,
	auth_token varchar(255) NOT NULL UNIQUE,
	expired bool NULL,
	CONSTRAINT user_pkey PRIMARY KEY (user_id),
	CONSTRAINT user_role_id_fkey FOREIGN KEY (role_id) REFERENCES amazon."role"(role_id)
);



-- amazon.user_address definition


CREATE TABLE amazon."author"
	author_id int8 NOT NULL,
	CONSTRAINT author_id_pkey PRIMARY KEY (author_id),
	author_name varchar(255)
	);



CREATE TABLE amazon."publisher"
	publisher_id int8 NOT NULL,
	CONSTRAINT publisher_id_pkey PRIMARY KEY (publisher_id),
	publisher_name varchar(255),
	registration_date varchar(255)
	);

CREATE TABLE amazon."publisher_office_address"
	publisher_office_id int8 NOT NULL,
	address_id int8 NOT NULL,
	CONSTRAINT publisher_office_id_pkey PRIMARY KEY (publisher_office_id),
	CONSTRAINT publisher_address_id_fkey FOREIGN KEY (address_id) REFERENCES amazon.address(address_id),
	CONSTRAINT publisher_id_fkey FOREIGN KEY (publisher_id) REFERENCES amazon.publisher(publisher_id),
	);

 

-- Drop table

-- DROP TABLE amazon.user_address;

CREATE TABLE amazon.user_address (
	useraddress_id int8 NOT NULL,
	user_id int8 NOT NULL,
	address_id int8 NOT NULL,
	CONSTRAINT user_address_pkey PRIMARY KEY (useraddress_id),
	CONSTRAINT user_address_address_id_fkey FOREIGN KEY (address_id) REFERENCES amazon.address(address_id),
	CONSTRAINT user_address_user_id_fkey FOREIGN KEY (user_id) REFERENCES amazon."user"(user_id)
);


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
	language_id int8 NOT NULL,
	genre_id int8 NOT NULL,
	book_availibility bool NOT NULL,
	added_in_cart bool NULL,
	saved_for_later bool NULL,
	discount_id int8 NOT NULL,
	CONSTRAINT book_pkey PRIMARY KEY (book_id),
	CONSTRAINT book_author_id_fkey FOREIGN KEY (author_id) REFERENCES amazon."author"(author_id),
	CONSTRAINT book_discount_id_fkey FOREIGN KEY (discount_id) REFERENCES amazon.discount(discount_id),
	CONSTRAINT book_genre_id_fkey FOREIGN KEY (genre_id) REFERENCES amazon.genre(genre_id),
	CONSTRAINT book_language_id_fkey FOREIGN KEY (language_id) REFERENCES amazon."language"(language_id),
	CONSTRAINT book_publisher_id_fkey FOREIGN KEY (publisher_id) REFERENCES amazon."publisher"(user_id)
);



-- amazon."order" definition

-- Drop table

-- DROP TABLE amazon."order";

CREATE TABLE amazon."order" (
	order_id int8 NOT NULL,
	useraddress_id int8 NOT NULL,
	"time_stamp" varchar(100) NOT NULL UNIQUE,
	total float8  NOT NULL,
	seller_id int8 NOT NULL,
	CONSTRAINT order_pkey PRIMARY KEY (order_id),
	CONSTRAINT order_seller_id_fkey FOREIGN KEY (seller_id) REFERENCES amazon."user"(user_id),
	CONSTRAINT order_useraddress_id_fkey FOREIGN KEY (useraddress_id) REFERENCES amazon.user_address(useraddress_id)
);

-- amazon.orderitem definition

-- Drop table

-- DROP TABLE amazon.orderitem;

CREATE TABLE amazon.orderitem (
	orderitem_id int8 NOT NULL,
	book_id int8 NOT NULL,
	order_id int8 NOT NULL,
	CONSTRAINT orderitem_pkey PRIMARY KEY (orderitem_id),
	CONSTRAINT orderitem_book_id_fkey FOREIGN KEY (book_id) REFERENCES amazon.book(book_id),
	CONSTRAINT orderitem_order_id_fkey FOREIGN KEY (order_id) REFERENCES amazon."order"(order_id)
);


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

