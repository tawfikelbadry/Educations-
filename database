-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


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
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cusId` int(10) unsigned NOT NULL auto_increment,
  `cus_name` varchar(60) NOT NULL,
  `addr` varchar(100) NOT NULL default '******',
  `phone` varchar(45) NOT NULL default '******',
  `money` double NOT NULL default '0',
  PRIMARY KEY  (`cusId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`cusId`,`cus_name`,`addr`,`phone`,`money`) VALUES 
 (1,'توفيق محمود البدري','السنطة البلد بجوار مسجد البدري','01021617708',143.5),
 (3,'ابراهيم محمد علي','السنطة','01265987456',50.5),
 (5,'ahmed mohamed amjad','next to elferdos mosque','0102617708',16),
 (6,'محمد احمد البشبيشي','******','******',0),
 (7,'مصطفي عادل النبراوي','بجوتر با يتيق','01021617705',0);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `fat_pro`
--

DROP TABLE IF EXISTS `fat_pro`;
CREATE TABLE `fat_pro` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `id_fatora` int(10) unsigned NOT NULL,
  `pr_name` varchar(45) NOT NULL,
  `prouduct_count` int(10) unsigned NOT NULL,
  `pr_current_price` double NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_cu_pro_2` (`id_fatora`),
  CONSTRAINT `FK_cu_pro_2` FOREIGN KEY (`id_fatora`) REFERENCES `fatora` (`idf`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fat_pro`
--

/*!40000 ALTER TABLE `fat_pro` DISABLE KEYS */;
INSERT INTO `fat_pro` (`id`,`id_fatora`,`pr_name`,`prouduct_count`,`pr_current_price`) VALUES 
 (1,1,'كشكول سلك 100 ورقة',4,8.5),
 (2,1,'كشكول سلك 100 ورقة',4,8.5),
 (3,7,'كشكول سلك 100 ورقة',4,8.5),
 (4,7,'قلم ازرق بريمة',3,1.5),
 (5,8,'قلم ازرق بريمة',4,1.5),
 (6,8,'كشكول سلك 100 ورقة',5,8.5),
 (7,9,'قلم ازرق بريمة',4,1.5),
 (8,10,'قلم ازرق بريمة',4,1.5),
 (9,10,'كشكول سلك 100 ورقة',3,8.5),
 (10,11,'قلم ازرق بريمة',4,1.5),
 (11,11,'كشكول سلك 100 ورقة',2,8.5),
 (12,12,'قلم ازرق بريمة',4,1.5),
 (13,12,'كشكول سلك 100 ورقة',3,8.5),
 (14,13,'كشكول سلك 100 ورقة',4,8.5),
 (15,14,'كشكول سلك 100 ورقة',1,8.5),
 (16,14,'قلم ازرق بريمة',4,1.5),
 (17,15,'كشكول سلك 100 ورقة',1,8.5),
 (18,15,'قلم ازرق بريمة',4,1.5),
 (19,15,'قلم ازرق بريمة',4,1.5),
 (20,15,'قلم ازرق بريمة',4,1.5),
 (21,16,'كشكول سلك 100 ورقة',1,8.5);
INSERT INTO `fat_pro` (`id`,`id_fatora`,`pr_name`,`prouduct_count`,`pr_current_price`) VALUES 
 (22,16,'قلم ازرق بريمة',4,1.5),
 (23,16,'قلم ازرق بريمة',4,1.5),
 (24,16,'قلم ازرق بريمة',4,1.5),
 (25,17,'كشكول سلك 100 ورقة',4,8.5),
 (26,17,'قلم ازرق بريمة',2,1.5),
 (27,18,'كشكول سلك 100 ورقة',22,8.5),
 (28,19,'كشكول سلك 100 ورقة',2,8.5),
 (29,20,'كشكول سلك 100 ورقة',4,8.5),
 (30,21,'كشكول سلك 100 ورقة',2,8.5),
 (31,21,'كشكول سلك 100 ورقة',4,8.5),
 (32,22,'قلم ازرق بريمة',3,1.5),
 (33,22,'كشكول سلك 100 ورقة',4,8.5),
 (34,23,'كشكول سلك 100 ورقة',4,8.5),
 (35,23,'قلم ازرق بريمة',7,1.5);
/*!40000 ALTER TABLE `fat_pro` ENABLE KEYS */;


--
-- Definition of table `fatora`
--

DROP TABLE IF EXISTS `fatora`;
CREATE TABLE `fatora` (
  `idf` int(10) unsigned NOT NULL auto_increment,
  `date` varchar(45) NOT NULL,
  `idcu` int(10) unsigned NOT NULL,
  `allMoney` double NOT NULL default '0',
  `mtfo` double NOT NULL default '0',
  PRIMARY KEY  (`idf`),
  KEY `FK_fatora_2` (`idcu`),
  CONSTRAINT `FK_fatora_2` FOREIGN KEY (`idcu`) REFERENCES `customer` (`cusId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fatora`
--

/*!40000 ALTER TABLE `fatora` DISABLE KEYS */;
INSERT INTO `fatora` (`idf`,`date`,`idcu`,`allMoney`,`mtfo`) VALUES 
 (1,'2016-09-21',5,38.5,20),
 (2,'2016-09-21',3,64,30),
 (3,'2016-09-21',3,38,12),
 (4,'2016-09-22',3,7.5,7.5),
 (5,'2016-09-22',3,7.5,7.5),
 (6,'2016-09-22',1,68,7),
 (7,'2016-09-22',3,38.5,47),
 (8,'2016-09-22',1,48.5,30),
 (9,'2016-09-22',3,57,50),
 (10,'2016-09-22',3,31.5,20),
 (11,'2016-09-22',3,23,15),
 (12,'2016-09-22',3,31.5,20),
 (13,'2016-09-22',3,34,4),
 (14,'2016-09-22',3,14.5,10),
 (15,'2016-09-22',1,26.5,10),
 (16,'2016-09-22',1,26.5,10),
 (17,'2016-09-22',1,37,40),
 (18,'2016-09-22',1,187,100),
 (19,'2016-09-22',6,17,100),
 (20,'2016-09-22',5,34,10),
 (21,'2016-09-22',6,51,40),
 (22,'2016-09-22',1,38.5,12),
 (23,'2016-09-22',3,44.5,40);
/*!40000 ALTER TABLE `fatora` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `proId` int(10) unsigned NOT NULL auto_increment,
  `nproduct` varchar(45) NOT NULL,
  `priceBuy` varchar(45) NOT NULL,
  `pricesail` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `amountneed` varchar(45) NOT NULL,
  PRIMARY KEY  (`proId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`proId`,`nproduct`,`priceBuy`,`pricesail`,`amount`,`amountneed`) VALUES 
 (1,'قلم ازرق بريمة','1','1.5','140','10'),
 (2,'كشكول سلك 100 ورقة','8','8.5','292','10');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `store`
--

DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `ids` int(10) unsigned NOT NULL auto_increment,
  `idp` int(10) unsigned NOT NULL,
  `amount` varchar(45) NOT NULL,
  `amountneed` varchar(45) NOT NULL,
  PRIMARY KEY  (`ids`),
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
  `id` int(10) unsigned NOT NULL auto_increment,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL default '0',
  `name` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
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
