CREATE DATABASE  IF NOT EXISTS `manuringit` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `manuringit`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: manuringit
-- ------------------------------------------------------
-- Server version	5.7.13-log

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
) ENGINE=InnoDB AUTO_INCREMENT=10000020 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-11 19:10:34
