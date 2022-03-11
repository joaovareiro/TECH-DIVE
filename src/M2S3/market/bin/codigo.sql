create table produto(
    id serial primary key,
    nome_produto varchar(100) not null,
    preco numeric(4,2) not null
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

