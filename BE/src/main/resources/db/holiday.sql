CREATE TABLE HOLIDAY (
    id bigint generated by default as identity,
    holiday_date varchar(30) NOT NULL,
    description varchar(100) NOT NULL,
    primary key (id)
);

INSERT INTO HOLIDAY VALUES (1, '2022-03-01', '3.1절');


--CREATE TABLE HOLIDAY (
--    id MEDIUMINT NOT NULL AUTO_INCREMENT,
--    date_name CHAR(30) NOT NULL,
--    loc_date CHAR(100) NOT NULL,
--    PRIMARY KEY (id)
--);