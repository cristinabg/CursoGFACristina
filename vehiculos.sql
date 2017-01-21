/*
SQLyog Community v12.1 (64 bit)
MySQL - 5.7.16-log : Database - vehiculos
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vehiculos` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `vehiculos`;

/*Table structure for table `auto` */

DROP TABLE IF EXISTS `auto`;

CREATE TABLE `auto` (
  `idAuto` varchar(10) NOT NULL,
  `kilometros` double DEFAULT NULL,
  `vuela` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idAuto`),
  CONSTRAINT `auto_ibfk_1` FOREIGN KEY (`idAuto`) REFERENCES `vehiculo` (`idVehiculo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `auto` */

LOCK TABLES `auto` WRITE;

UNLOCK TABLES;

/*Table structure for table `camioneta` */

DROP TABLE IF EXISTS `camioneta`;

CREATE TABLE `camioneta` (
  `idCamioneta` varchar(10) NOT NULL,
  `numPuertas` int(11) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idCamioneta`),
  CONSTRAINT `camioneta_ibfk_1` FOREIGN KEY (`idCamioneta`) REFERENCES `vehiculo` (`idVehiculo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `camioneta` */

LOCK TABLES `camioneta` WRITE;

UNLOCK TABLES;

/*Table structure for table `moto` */

DROP TABLE IF EXISTS `moto`;

CREATE TABLE `moto` (
  `idMoto` varchar(10) NOT NULL,
  `anio` int(11) DEFAULT NULL,
  `tipo` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`idMoto`),
  KEY `ref_vehiculo_moto` (`idMoto`),
  CONSTRAINT `moto_ibfk_1` FOREIGN KEY (`idMoto`) REFERENCES `vehiculo` (`idVehiculo`),
  CONSTRAINT `moto_ibfk_2` FOREIGN KEY (`idMoto`) REFERENCES `vehiculo` (`idVehiculo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `moto` */

LOCK TABLES `moto` WRITE;

UNLOCK TABLES;

/*Table structure for table `vehiculo` */

DROP TABLE IF EXISTS `vehiculo`;

CREATE TABLE `vehiculo` (
  `idVehiculo` varchar(10) NOT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `modelo` varchar(30) DEFAULT NULL,
  `costo` double DEFAULT NULL,
  PRIMARY KEY (`idVehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vehiculo` */

LOCK TABLES `vehiculo` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
