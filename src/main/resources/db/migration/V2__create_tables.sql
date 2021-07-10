create table customer
(
    id    uuid unique  not null,
    name  varchar(255) not null,
    email varchar(255) not null,
    primary key (id)
);

create table employee
(
    id    uuid unique  not null,
    name  varchar(255) not null,
    email varchar(255) not null,
    primary key (id)
);

