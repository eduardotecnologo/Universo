drop database if exists listaseries;
create database if not exists listaseries;
use listaseries;

CREATE TABLE CLIENTE(
	codCliente int auto_increment not null,
    nome varchar(50),
    CPF varchar(14),
    endereco varchar(50),
    dtaNascimento Date,
    PRIMARY KEY (codCliente));
    
    CREATE TABLE SERIE(
    codSerie varchar(20),
    titulo varchar (20),
    genero varchar(20),
    sinopse varchar(50),
    temporadas int,
    duracao int,
    PRIMARY KEY (codSerie));
    
    CREATE TABLE TEMPORADA_SERIE(
	codSerie int not null,
    nome varchar(30),
    num_temporada int,
    PRIMARY KEY (codSerie));
    
    CREATE TABLE GENERO(
	codGenero int auto_increment not null,
    codSerie int,
    codCliente int,
    tipo varchar(10),
    PRIMARY KEY(codGenero),
    FOREIGN KEY (codSerie) REFERENCES Serie (codSerie),
    FOREIGN KEY (codCliente) REFERENCES Cliente (codCliente));
