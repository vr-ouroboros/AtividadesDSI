create database p2_login
go

use p2_login
go

create table usuario
(usuario varchar(10) primary key,
nome varchar(30) default '',
senha char(32) default '')
go