CREATE DATABASE  IF NOT EXISTS `xmlcbanka` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `xmlcbanka`;
-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: xmlbanka
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

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
-- Table structure for table `banka`
--

DROP TABLE IF EXISTS `banka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banka` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(255) NOT NULL,
  `swift` varchar(255) NOT NULL,
  `obracunskiRacun` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `naziv` (`naziv`),
  UNIQUE KEY `swift` (`swift`),
  UNIQUE KEY `obracunskiRacun` (`obracunskiRacun`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banka`
--

LOCK TABLES `banka` WRITE;
/*!40000 ALTER TABLE `banka` DISABLE KEYS */;
INSERT INTO `banka` VALUES (1,'Komerc Banka','KOMBRS22','111111111111111111'),(2,'Vulfejnstajn Banka','VULFGR11','222222222222222222');
/*!40000 ALTER TABLE `banka` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `klijent`
--

DROP TABLE IF EXISTS `klijent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `klijent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) NOT NULL,
  `brojRacuna` varchar(255) NOT NULL,
  `banka_id` int(11) NOT NULL,
  `stanje` double NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ime` (`ime`),
  UNIQUE KEY `brojRacuna` (`brojRacuna`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `klijent`
--

LOCK TABLES `klijent` WRITE;
/*!40000 ALTER TABLE `klijent` DISABLE KEYS */;
INSERT INTO `klijent` VALUES (1,'Citroen','000000000000000001',1,0),(2,'Reno','000000000000000002',1,0),(3,'VW','000000000000000003',2,0),(4,'Skoda','000000000000000004',2,0);
/*!40000 ALTER TABLE `klijent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nalog_za_prenos`
--

DROP TABLE IF EXISTS `nalog_za_prenos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nalog_za_prenos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idPoruke` varchar(255) NOT NULL,
  `duznik` varchar(255) NOT NULL,
  `svrhaPlacanja` varchar(255) NOT NULL,
  `primalac` varchar(255) NOT NULL,
  `oznakaValute` varchar(255) NOT NULL,
  `iznos` double NOT NULL,
  `brojRacunaDuznika` varchar(255) NOT NULL,
  `brojModelaDuznika` int(11) NOT NULL,
  `pozivNaBrojDuznika` varchar(255) NOT NULL,
  `brojRacunaPrimaoca` varchar(255) NOT NULL,
  `brojModelaPrimaoca` int(11) NOT NULL,
  `pozivNaBrojPrimaoca` varchar(255) NOT NULL,
  `hitno` tinyint(1) NOT NULL,
  `datumValute` datetime NOT NULL,
  `datumNaloga` datetime NOT NULL,
  `obradjenoDuznik` tinyint(1) NOT NULL,
  `obradjenoPrimaoc` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idPoruke` (`idPoruke`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nalog_za_prenos`
--

LOCK TABLES `nalog_za_prenos` WRITE;
/*!40000 ALTER TABLE `nalog_za_prenos` DISABLE KEYS */;
INSERT INTO `nalog_za_prenos` VALUES (1,'a1','M1','Medjub. ','M2','RSD',500,'000000000000000001',18,'189','000000000000000002',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(2,'a2','M2','Clearing','M3','RSD',500,'000000000000000002',18,'189','000000000000000003',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(3,'a3','M1','RTGS','M4','RSD',300500,'000000000000000001',18,'189','000000000000000004',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(4,'a4','M1','RTGS','M4','RSD',999,'000000000000000001',18,'189','000000000000000004',11,'189',1,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(5,'a5','M4','Clearing','M2','RSD',321,'000000000000000004',18,'189','000000000000000002',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(6,'b1','M1','Clearing ','M3','RSD',500,'000000000000000001',18,'189','000000000000000003',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(7,'b2','M1','Clearing ','M3','RSD',400,'000000000000000001',18,'189','000000000000000003',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1),(8,'b3','M1','Clearing ','M3','RSD',300,'000000000000000001',18,'189','000000000000000003',11,'189',0,'2017-06-26 00:00:00','2017-06-26 00:00:00',1,1);
/*!40000 ALTER TABLE `nalog_za_prenos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servis_nalog`
--

DROP TABLE IF EXISTS `servis_nalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servis_nalog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mtID` varchar(255) NOT NULL,
  `nalogID` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servis_nalog`
--

LOCK TABLES `servis_nalog` WRITE;
/*!40000 ALTER TABLE `servis_nalog` DISABLE KEYS */;
INSERT INTO `servis_nalog` VALUES (1,'kMyoCVe03r','a3'),(2,'nZ8ZhG4kEn','a4'),(3,'zqNJNfuBGi','a5'),(4,'ivz0FvKX0r','a2'),(5,'IZ1ooeplwW','b1'),(6,'IZ1ooeplwW','b2'),(7,'IZ1ooeplwW','b3');
/*!40000 ALTER TABLE `servis_nalog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stavka`
--

DROP TABLE IF EXISTS `stavka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stavka` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `duznik` varchar(255) NOT NULL,
  `svrhaPlacanja` varchar(255) NOT NULL,
  `primalac` varchar(255) NOT NULL,
  `oznakaValute` varchar(255) NOT NULL,
  `iznos` double NOT NULL,
  `brojRacunaDuznika` varchar(255) NOT NULL,
  `brojModelaDuznika` int(11) NOT NULL,
  `pozivNaBrojDuznika` varchar(255) NOT NULL,
  `brojRacunaPrimaoca` varchar(255) NOT NULL,
  `brojModelaPrimaoca` int(11) NOT NULL,
  `pozivNaBrojPrimaoca` varchar(255) NOT NULL,
  `datumValute` datetime NOT NULL,
  `datumNaloga` datetime NOT NULL,
  `smer` varchar(255) NOT NULL,
  `prethodnoStanje` double NOT NULL,
  `trenutnoStanje` double NOT NULL,
  `klijent_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stavka`
--

LOCK TABLES `stavka` WRITE;
/*!40000 ALTER TABLE `stavka` DISABLE KEYS */;
INSERT INTO `stavka` VALUES (1,'M1','Medjub. ','M2','RSD',500,'000000000000000001',18,'189','000000000000000002',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',0,-500,1),(2,'M1','Medjub. ','M2','RSD',500,'000000000000000001',18,'189','000000000000000002',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',0,500,2),(3,'M1','RTGS','M4','RSD',300500,'000000000000000001',18,'189','000000000000000004',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',-500,-301000,1),(4,'M1','RTGS','M4','RSD',300500,'000000000000000001',18,'189','000000000000000004',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',0,300500,4),(5,'M1','RTGS','M4','RSD',999,'000000000000000001',18,'189','000000000000000004',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',-301000,-301999,1),(6,'M1','RTGS','M4','RSD',999,'000000000000000001',18,'189','000000000000000004',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',300500,301499,4),(7,'M4','Clearing','M2','RSD',321,'000000000000000004',18,'189','000000000000000002',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',301499,301178,4),(8,'M4','Clearing','M2','RSD',321,'000000000000000004',18,'189','000000000000000002',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',500,821,2),(9,'M2','Clearing','M3','RSD',500,'000000000000000002',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',821,321,2),(10,'M2','Clearing','M3','RSD',500,'000000000000000002',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',0,500,3),(11,'M1','Clearing ','M3','RSD',500,'000000000000000001',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',-301999,-302499,1),(12,'M1','Clearing ','M3','RSD',400,'000000000000000001',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',-301999,-302399,1),(13,'M1','Clearing ','M3','RSD',300,'000000000000000001',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','T',-301999,-302299,1),(14,'M1','Clearing ','M3','RSD',500,'000000000000000001',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',500,1000,3),(15,'M1','Clearing ','M3','RSD',400,'000000000000000001',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',500,900,3),(16,'M1','Clearing ','M3','RSD',300,'000000000000000001',18,'189','000000000000000003',11,'189','2017-06-26 00:00:00','2017-06-26 00:00:00','K',500,800,3);
/*!40000 ALTER TABLE `stavka` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-26 16:34:01
