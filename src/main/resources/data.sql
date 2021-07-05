
DROP TABLE IF EXISTS cliente;

CREATE TABLE cliente(
    id int AUTO_INCREMENT,
    nombre varchar(250),
    apellido varchar(250),
    direccion varchar(100),
    dni int,
    fecha date
);


INSERT INTO cliente(nombre) VALUES ('Aldo');
INSERT INTO cliente(nombre) VALUES ('Aldo2');
INSERT INTO cliente(nombre) VALUES ('Aldo3');
INSERT INTO cliente(nombre) VALUES ('Aldo4');
INSERT INTO cliente(nombre) VALUES ('Aldo5');
INSERT INTO cliente(nombre) VALUES ('Aldo6');
INSERT INTO cliente(nombre) VALUES ('Aldo7');
INSERT INTO cliente(nombre) VALUES ('Aldo8');

