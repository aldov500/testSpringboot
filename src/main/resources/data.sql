DROP TABLE IF EXISTS cliente;

CREATE TABLE cliente(
   id double AUTO_INCREMENT,
   nombre varchar(250),
   apellido varchar(250),
   direccion varchar(100),
   dni integer,
   fecha date
);

INSERT INTO cliente (nombre,apellido,direccion,dni,fecha)
VALUES
('Aldo1','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo2','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo3','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo4','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo5','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo6','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo7','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo8','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo9','Vargas','San Pedro Tlaquepaque',1,'1994-05-09'),
('Aldo10','Vargas','San Pedro Tlaquepaque',1,'1994-05-09')