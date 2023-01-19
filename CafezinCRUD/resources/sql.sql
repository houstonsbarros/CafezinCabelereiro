CREATE DATABASE agenda;

USE agenda;

CREATE TABLE cabeleireiro(
    idCabelereiro int not null AUTO_INCREMENT,
    nome varchar(30) not null,
    dataNasc date not null,
    anosProfissao int not null,
    especialidade varchar(50) not null,
    horariosDeTrabalho varchar(50) not null,
    primary key(idCabelereiro));

CREATE TABLE cliente(
    idCliente int not null AUTO_INCREMENT,
    nome varchar(50) not null,
    telefone varchar(30) not null,
    sexo varchar(10) not null,
    primary key(idCliente));
    
CREATE TABLE agendamento(
    idAgenda int not null AUTO_INCREMENT,
    hora varchar(10) not null,
    dataAgenda varchar(10) not null,
    valor int not null,
    servico varchar(50) not null,
    formaPagamento varchar(50) not null,
    statusPG varchar(20) not null,
    idCabelereiro int not null,
    idCliente int not null,
    PRIMARY KEY(idAgenda),
    FOREIGN KEY(idCabelereiro) REFERENCES cabeleireiro(idCabelereiro),
    FOREIGN KEY(idCliente) REFERENCES cliente(idCliente));
