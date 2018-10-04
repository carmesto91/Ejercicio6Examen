create database controlstock;
use controlstock;


create table computadora(
id_computadora int,
nombre varchar (45),
modelo varchar (45),
precio int,
constraint id_pc_pk primary key(id_computadora)
);

create table ItemStock(
Id_stock int,
Id_computadora int,
Cantidad int,
constraint stock_pk primary key (id_stock),
constraint id_pc_fk foreign key (Id_computadora) references computadora(id_computadora)
);

insert into computadora values (1, 'samsung', 'vcp', 20000 );
insert into computadora values (2, 'acer', 'aspire 3',25000 );
insert into computadora values (3, 'acer', 'aspire 5', 30000);
insert into computadora values (4,'asus', 'rog', 40000);
insert into computadora values (5, 'asus', 'vivobook', 24000);
insert into computadora values (6,'hp','omen', 45000);
insert into computadora values (7,'hp', 'pavilion',35000);
insert into computadora values (8,'dell', 'inspiron',28000);
insert into computadora values (9, 'dell', 'latitude', 37000);
insert into computadora values (10,'lenovo', 'thinkpad', 30000);
insert into computadora values (11, 'lenovo', 'legion', 43000);

insert into ItemStock values (1,1,50);
insert into ItemStock values (2,2,45);
insert into ItemStock values (3,3,30);
insert into ItemStock values (4,4,10);
insert into ItemStock values (5,5,40);
insert into ItemStock values (6,6,13);
insert into ItemStock values (7,7,35);
insert into ItemStock values (8,8,30);
insert into ItemStock values (9,9,20);
insert into ItemStock values (10,10,35);
insert into ItemStock values (11,11,9);
