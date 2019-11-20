delete from pedidos;
delete from pizzas;
delete from clientes;
delete from barrios;

alter sequence seq_pedidos restart with 1;
alter sequence seq_pizzas restart with 1;
alter sequence seq_clientes restart with 1;
alter sequence seq_barrios restart with 1;

insert into pizzas values(nextval('seq_pizzas'), 'Napolitana', 120.0, 15);
insert into pizzas values(nextval('seq_pizzas'), 'Muzzarella', 200.0, 18);
insert into pizzas values(nextval('seq_pizzas'), 'Fugazzeta', 230.0, 20);
insert into pizzas values(nextval('seq_pizzas'), 'Especial', 250.0, 15);



