--create database exercicioN2;

use exercicioN2;


drop table if exists Pessoa;
create table Pessoa(
	pessoaId int not null,
	pessoaNome varchar(255) not null,
	pessoaIdade int not null,
	primary key ( pessoaId )
);

drop table if exists Endereco;
create table Endereco(
	enderecoId int not null,
	enderecoCidade varchar(255) not null,
	enderecoRua varchar(255) not null,
	enderecoNumero int not null,
	primary key ( enderecoId ),
	foreign key (enderecoId) references Pessoa (pessoaId)
);



select * from Pessoa;
select * from Endereco;


select distinct p.pessoaId, p.pessoaNome, p.pessoaIdade, enderecoCidade, enderecoRua, enderecoNumero from Pessoa p JOIN Endereco on Endereco.enderecoId = p.pessoaId