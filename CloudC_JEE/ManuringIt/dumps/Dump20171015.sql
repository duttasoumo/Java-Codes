CREATE DATABASE  IF NOT EXISTS `manuringit` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `manuringit`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: manuringit
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `crop`
--

DROP TABLE IF EXISTS `crop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crop` (
  `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cropid_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crop`
--

LOCK TABLES `crop` WRITE;
/*!40000 ALTER TABLE `crop` DISABLE KEYS */;
INSERT INTO `crop` VALUES (1,'Wheat'),(2,'Rice'),(3,'SunFlower'),(4,'Pluses'),(5,'Gram');
/*!40000 ALTER TABLE `crop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `custinfo`
--

DROP TABLE IF EXISTS `custinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `custinfo` (
  `cid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `aid` varchar(12) NOT NULL,
  `name` varchar(30) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `sex` varchar(1) DEFAULT 'M',
  `village` varchar(30) DEFAULT '""',
  `block` varchar(30) DEFAULT '""',
  `dist` varchar(30) DEFAULT '""',
  `city` varchar(30) DEFAULT '""',
  `state` varchar(30) DEFAULT '""',
  `size` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid_UNIQUE` (`cid`),
  UNIQUE KEY `aid_UNIQUE` (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=10000004 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `custinfo`
--

LOCK TABLES `custinfo` WRITE;
/*!40000 ALTER TABLE `custinfo` DISABLE KEYS */;
INSERT INTO `custinfo` VALUES (10000000,'123409874556','Soumo','8100744940','M','random','4568','Meerut','Budaun','Uttar Pradesh',7),(10000001,'741285238523','Chayan','9632587412','M','Village','8523','Darjeeling','Cooch Behar','West Bengal',2),(10000002,'852396327412','Sumit','8523963274','M','4578','85632','Chitrakoot','Lakhimpur','Uttar Pradesh',2),(10000003,'753258963456','Ritu','9874563215','M','','748563','Moradabad','Mahoba','Uttar Pradesh',3);
/*!40000 ALTER TABLE `custinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `farminput`
--

DROP TABLE IF EXISTS `farminput`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `farminput` (
  `cid` int(11) unsigned NOT NULL,
  `pesticide` int(11) DEFAULT '0',
  `fertilizer` varchar(15) DEFAULT '""',
  `fertiquant` int(11) DEFAULT '0',
  `manure` int(11) DEFAULT '0',
  `tools` tinyint(2) unsigned zerofill DEFAULT '00',
  `price` float unsigned NOT NULL DEFAULT '0',
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sowing` tinyint(2) DEFAULT '0',
  `harvesting` tinyint(2) DEFAULT '0',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `farminput`
--

LOCK TABLES `farminput` WRITE;
/*!40000 ALTER TABLE `farminput` DISABLE KEYS */;
INSERT INTO `farminput` VALUES (10000000,25,'Phosphorous',23,0,01,14800,'2017-08-19 15:49:06',6,9),(10000002,56,'Phosphorous',856,0,02,75996,'2017-08-19 16:46:47',6,9);
/*!40000 ALTER TABLE `farminput` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kharifcombi`
--

DROP TABLE IF EXISTS `kharifcombi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kharifcombi` (
  `cid` int(10) unsigned NOT NULL,
  `sowing` tinyint(2) DEFAULT '0',
  `harvesting` tinyint(2) DEFAULT '0',
  `crop1` tinyint(3) unsigned DEFAULT '0',
  `crop2` tinyint(3) unsigned DEFAULT '0',
  `crop3` tinyint(3) unsigned DEFAULT '0',
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid_UNIQUE` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kharifcombi`
--

LOCK TABLES `kharifcombi` WRITE;
/*!40000 ALTER TABLE `kharifcombi` DISABLE KEYS */;
INSERT INTO `kharifcombi` VALUES (10000000,7,10,2,3,0),(10000002,7,10,2,3,0),(10000003,7,10,2,3,0);
/*!40000 ALTER TABLE `kharifcombi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rabicombi`
--

DROP TABLE IF EXISTS `rabicombi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rabicombi` (
  `cid` int(10) unsigned NOT NULL,
  `sowing` tinyint(2) DEFAULT '0',
  `harvesting` tinyint(2) DEFAULT '0',
  `crop1` tinyint(3) unsigned DEFAULT '0',
  `crop2` tinyint(3) unsigned DEFAULT '0',
  `crop3` tinyint(3) unsigned DEFAULT '0',
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid_UNIQUE` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rabicombi`
--

LOCK TABLES `rabicombi` WRITE;
/*!40000 ALTER TABLE `rabicombi` DISABLE KEYS */;
INSERT INTO `rabicombi` VALUES (10000000,10,3,1,4,0),(10000002,10,3,1,4,0),(10000003,10,3,1,4,0);
/*!40000 ALTER TABLE `rabicombi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `cid` int(11) unsigned NOT NULL,
  `sub` tinyint(1) unsigned zerofill DEFAULT '0',
  `payment` tinyint(1) unsigned zerofill DEFAULT '0',
  `amount` float unsigned zerofill DEFAULT '000000000000',
  `payDate` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (10000000,1,0,000000004800,NULL),(10000002,1,1,000000076000,'2017-08-19 00:00:00');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `summercombi`
--

DROP TABLE IF EXISTS `summercombi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `summercombi` (
  `cid` int(10) unsigned NOT NULL,
  `sowing` tinyint(2) DEFAULT '0',
  `harvesting` tinyint(2) DEFAULT '0',
  `crop1` tinyint(3) unsigned DEFAULT '0',
  `crop2` tinyint(3) unsigned DEFAULT '0',
  `crop3` tinyint(3) unsigned DEFAULT '0',
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid_UNIQUE` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `summercombi`
--

LOCK TABLES `summercombi` WRITE;
/*!40000 ALTER TABLE `summercombi` DISABLE KEYS */;
INSERT INTO `summercombi` VALUES (10000000,3,7,2,1,0),(10000002,3,7,2,1,0),(10000003,3,7,2,1,0);
/*!40000 ALTER TABLE `summercombi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tools`
--

DROP TABLE IF EXISTS `tools`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tools` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL DEFAULT '""',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tools`
--

LOCK TABLES `tools` WRITE;
/*!40000 ALTER TABLE `tools` DISABLE KEYS */;
INSERT INTO `tools` VALUES (1,'seed planter'),(2,'normal planter'),(3,'harvestor');
/*!40000 ALTER TABLE `tools` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_login` (
  `user` varchar(6) NOT NULL,
  `password` varchar(64) NOT NULL,
  `login` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
INSERT INTO `user_login` VALUES ('admin','623f0b5584eb86d9f905e52679a9ce3bca0bd91a950a03e0eaa1b2f8bb3e9908','2017-08-28 16:07:52');
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-15  0:26:45
