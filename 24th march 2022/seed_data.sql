
DELETE FROM amazon."user";
-- add roles--- 

INSERT INTO amazon."user"
(user_id, role_id, name, user_password, auth_token, expired)
VALUES(1, 1, 'Bhavesh', '', '', false);


INSERT INTO amazon."user"
(user_id, role_id, name, user_password, auth_token, expired)
VALUES(2, 2, 'Hrishi', '', '', false);
 

INSERT INTO amazon."user"
(user_id, role_id, name, user_password, auth_token, expired)
VALUES(3, 3, 'Ketan','', '', false);


INSERT INTO amazon."user"
(user_id, role_id, name, user_password, auth_token, expired)
VALUES(4, 4, 'Jiraya','', '', false);



--join table--

SELECT
	amazon."user".role_id,
	amazon."user".user_id,
	amazon."role".role_name,
	amazon."user".name
FROM
	amazon."user"
INNER JOIN amazon.role ON amazon."user".role_id  = amazon."role".role_id;


--- add language ---

INSERT INTO amazon."language"
(language_id, "name")
VALUES(0, 'English');

INSERT INTO amazon."language"
(language_id, "name")
VALUES(1, 'Marathi');

INSERT INTO amazon."language"
(language_id, "name")
VALUES(2, 'Hindi');

INSERT INTO amazon."language"
(language_id, "name")
VALUES(3, 'Bengali');

INSERT INTO amazon."language"
(language_id, "name")
VALUES(4, 'Gujarati');

 select *from "language" l
 
 ---select genre----
 
 INSERT INTO amazon.genre
(genre_id, "name")
VALUES(0, 'technology');

 INSERT INTO amazon.genre
(genre_id, "name")
VALUES(1, 'function');

 INSERT INTO amazon.genre
(genre_id, "name")
VALUES(2, 'application');


---show discount_provider----

INSERT INTO amazon.discount_provider
(discount_provider_id, "name")
VALUES(0, 'paytm');

INSERT INTO amazon.discount_provider
(discount_provider_id, "name")
VALUES(1, 'amazon pay');

INSERT INTO amazon.discount_provider
(discount_provider_id, "name")
VALUES(2, 'bank');

INSERT INTO amazon.discount_provider
(discount_provider_id, "name")
VALUES(3, 'card');




