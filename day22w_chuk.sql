-- drop database if exists 
DROP DATABASE IF EXISTS day22w_chuk; 

-- create database 
CREATE DATABASE day22w_chuk; 

-- select database 
USE day22w_chuk; 

-- create rsvp table 
CREATE TABLE rsvp ( 
    rsvp_id int AUTO_INCREMENT, 
    email varchar(128) NOT NULL, 
    phone varchar(128) NOT NULL, 
    confirmation_date date NOT NULL, 
    comments text,
    CONSTRAINT pk_rsvp_id PRIMARY KEY (rsvp_id)
);

-- drop user if exists
DROP USER IF EXISTS 'day22w_chuk'@'%';

-- create user + flush
CREATE USER 'day22w_chuk'@'%' IDENTIFIED BY 'password';
FLUSH PRIVILEGES;

-- grant priviliges + flush
GRANT ALL PRIVILEGES ON day22w_chuk.* TO 'day22w_chuk'@'%';
FLUSH PRIVILEGES; 