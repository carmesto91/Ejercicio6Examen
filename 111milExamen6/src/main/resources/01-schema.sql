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

