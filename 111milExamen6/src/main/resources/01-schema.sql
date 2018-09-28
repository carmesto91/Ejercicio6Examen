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


