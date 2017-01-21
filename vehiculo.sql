CREATE DATABASE vehiculo

CREATE TABLE vehiculo(
idVehiculo VARCHAR(10) PRIMARY KEY,
marca VARCHAR(20),
modelo VARCHAR(30),
costo DOUBLE
);

CREATE TABLE  auto(
idAuto VARCHAR(10) PRIMARY KEY,
kilometros DOUBLE, 
vuela BOOLEAN	
);

CREATE TABLE camioneta(
idCamioneta VARCHAR(10) PRIMARY KEY,
numPuertas INT, 
color VARCHAR(20)
);

CREATE TABLE moto(
idMoto VARCHAR(10) PRIMARY KEY,
anio INT, 
tipo VARCHAR(40)
);

CREATE INDEX `ref_vehiculo_moto`
  ON `moto`
  (`idMoto`);
  
 ALTER TABLE moto
 ADD FOREIGN KEY (idMoto) REFERENCES vehiculo(idVehiculo)
 ON DELETE CASCADE ON UPDATE CASCADE;
 
 ALTER TABLE camioneta
 ADD FOREIGN KEY (idCamioneta) REFERENCES vehiculo(idVehiculo)
 ON DELETE CASCADE ON UPDATE CASCADE;
 
 ALTER TABLE auto
 ADD FOREIGN KEY (idAuto) REFERENCES vehiculo(idVehiculo)
 ON DELETE CASCADE ON UPDATE CASCADE;