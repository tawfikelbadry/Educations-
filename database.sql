-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema market
--

CREATE DATABASE IF NOT EXISTS market;
USE market;

--
-- Definition of table `cu_pro`
--

DROP TABLE IF EXISTS `cu_pro`;
CREATE TABLE `cu_pro` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `id_fatora` int(10) unsigned NOT NULL,
  `id_product` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cu_pro_1` (`id_product`),
  KEY `FK_cu_pro_2` (`id_fatora`),
  CONSTRAINT `FK_cu_pro_1` FOREIGN KEY (`id_product`) REFERENCES `product` (`proId`),
  CONSTRAINT `FK_cu_pro_2` FOREIGN KEY (`id_fatora`) REFERENCES `fatora` (`idf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cu_pro`
--

/*!40000 ALTER TABLE `cu_pro` DISABLE KEYS */;
/*!40000 ALTER TABLE `cu_pro` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cusId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cus_name` varchar(60) NOT NULL,
  `addr` varchar(100) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `money` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`cusId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`cusId`,`cus_name`,`addr`,`phone`,`money`) VALUES 
 (1,'توفيق','السنطة البلد بجوار مسجد البدري','01021617708',0),
 (3,'ابراهيم محمد علي','السنطة','01265987456',0),
 (5,'ahmed mohamed amjad','next to elferdos mosque','0102617708',0),
 (6,'ahmed mohamed','next to mosque','01021617709',0),
 (7,'ali mohamed ','next to shhdkjh','0126889798',0),
 (9,'dmohamed','elsanta','01265986454',0),
 (11,'dmo8damed','elsanta','01264999454',0),
 (13,'dmo7daed','elsanta','01264964548',0),
 (14,'mo7daed','elsanta','0126964548',0),
 (15,'mo78aed','elsanta','01269645478',0),
 (16,'mo78aedp','elsanta','01269645468',0),
 (20,'jld slkfj sfjk','flsforovmlrfdlrm rr','01255876566',0);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `fatora`
--

DROP TABLE IF EXISTS `fatora`;
CREATE TABLE `fatora` (
  `idf` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `idcu` int(10) unsigned NOT NULL,
  `stell` varchar(45) NOT NULL,
  `mtfo` varchar(45) NOT NULL,
  `idp` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idf`),
  KEY `FK_fatora_1` (`idcu`),
  KEY `FK_fatora_2` (`idp`),
  CONSTRAINT `FK_fatora_1` FOREIGN KEY (`idcu`) REFERENCES `custom` (`cusId`),
  CONSTRAINT `FK_fatora_2` FOREIGN KEY (`idp`) REFERENCES `product` (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fatora`
--

/*!40000 ALTER TABLE `fatora` DISABLE KEYS */;
/*!40000 ALTER TABLE `fatora` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `proId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nproduct` varchar(45) NOT NULL,
  `priceBuy` varchar(45) NOT NULL,
  `pricesail` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `amountneed` varchar(45) NOT NULL,
  PRIMARY KEY (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `store`
--

DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `ids` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idp` int(10) unsigned NOT NULL,
  `amount` varchar(45) NOT NULL,
  `amountneed` varchar(45) NOT NULL,
  PRIMARY KEY (`ids`),
  KEY `FK_store_1` (`idp`),
  CONSTRAINT `FK_store_1` FOREIGN KEY (`idp`) REFERENCES `product` (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `store`
--

/*!40000 ALTER TABLE `store` DISABLE KEYS */;
/*!40000 ALTER TABLE `store` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`,`username`,`password`,`isAdmin`,`name`) VALUES 
 (1,'tawfik','123000',0,'توفيق محمود البدري');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
