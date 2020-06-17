--create database exercicioN2;

use exercicioN2;

drop table if exists Pessoa;
drop table if exists Endereco;
create table Endereco(
	enderecoId int not null,
	enderecoCidade varchar(255) not null,
	enderecoRua varchar(255) not null,
	enderecoNumero int not null,
	primary key ( enderecoId )
);

create table Pessoa(
	pessoaId int not null,
	pessoaNome varchar(255) not null,
	pessoaIdade int not null,
	IdEndereco int not null,
	primary key ( pessoaId ),
	foreign key (IdEndereco) references Endereco (enderecoId)
);

select * from Pessoa;
select * from Endereco;


select distinct p.pessoaId, p.pessoaNome, p.pessoaIdade, enderecoCidade, enderecoRua, enderecoNumero from Pessoa p JOIN Endereco on Endereco.enderecoId = p.pessoaId
