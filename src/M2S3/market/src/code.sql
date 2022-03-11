create database market;

create table produto(
    id serial primary key,
    nome_produto varchar(100) not null,
    descricao varchar(100) not null,
    preco_produto numeric(6,2) not null
);

create table gerente(
    id_gerente serial primary key,
    nome_gerente varchar(120) not null,
    cpf_gerente varchar(11) not null
);

create table funcionario(
    id_funcionario serial primary key,
    nome_funcionario varchar(120) not null,
    cpf_funcionario varchar(11) not null,
    fk_id_funcionario int not null,
    foreign key(fk_id_funcionario) references gerente(id_gerente)
);

insert into produto (nome_produto , preco_produto) values ('Coca-cola 2L',5.99);

insert into gerente (nome_gerente, cpf_gerente) values ('Moacir Silva Pereira','37572049052');

insert into funcionario (nome_funcionario , cpf_funcionario, fk_id_gerente) values ('Marcos Vinicius Batista',310605064,1);

