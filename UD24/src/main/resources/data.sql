create table empleados(
id integer auto_increment PRIMARY KEY,
nombre varchar(250),
trabajo varchar(10),
salario integer
);

insert into empleados(nombre,trabajo) values('Martin','JEFE');
insert into empleados(nombre,trabajo) values('Juansito','SENIOR');
insert into empleados(nombre,trabajo) values('Alvaro','JUNIOR');

update empleados set salario = 50000 where trabajo = 'JEFE';
update empleados set salario = 40000 where trabajo = 'SENIOR';
update empleados set salario = 20000 where trabajo = 'JUNIOR';