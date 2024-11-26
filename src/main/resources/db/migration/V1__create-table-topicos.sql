create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(5000) not null,
    data_criacao datetime not null,
    status tinyint default 1,
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)

);