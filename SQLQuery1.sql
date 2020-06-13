--create database exercicioN2;

use exercicioN2;

drop table if exists Person;
create table Person(
	personId int not null,
	personName varchar(255) not null,
	personAge int not null,
	primary key ( personId )
);

drop table if exists Endereco;
create table Endereco(
	enderecoId int not null,
	enderecoCidade varchar(255) not null,
	enderecoRua varchar(255) not null,
	enderecoNumero int not null,
	primary key ( enderecoId )
);

select * from Person;
select * from Endereco;