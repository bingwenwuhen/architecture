/*
SQLyog Ultimate v11.13 (64 bit)
MySQL - 5.5.38 : Database - arch
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`arch` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `arch`;

/*Table structure for table `tbl_cart` */

DROP TABLE IF EXISTS `tbl_cart`;

CREATE TABLE `tbl_cart` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `customerUuid` int(11) DEFAULT NULL,
  `goodsUuid` int(11) DEFAULT NULL,
  `buyNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_cart` */

/*Table structure for table `tbl_customer` */

DROP TABLE IF EXISTS `tbl_customer`;

CREATE TABLE `tbl_customer` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `showName` varchar(100) DEFAULT NULL,
  `trueName` varchar(100) DEFAULT NULL,
  `registerTime` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_customer` */

insert  into `tbl_customer`(`uuid`,`customerId`,`pwd`,`showName`,`trueName`,`registerTime`) values (1,'c1','1233','c1','����','1469934466526'),(2,'c1','1233','c1','zhangsan222','1469935405770'),(3,'c1','1233','c1','zhangsan222','1469935415724'),(4,'c1','1233','c1','zhangsan222','1469935769568'),(5,'c1','1233','c1','zhangsan222','1469936055307'),(6,'c1','1233','c1','zhangsan222','1469938249922'),(7,'c3','123456','12','冰纹','2016-08-01 07:27:42'),(8,'c1','1233','c1','zhangsan222','1470450605432'),(9,'c1','1233','c1','zhangsan222','1470450661505');

/*Table structure for table `tbl_file` */

DROP TABLE IF EXISTS `tbl_file`;

CREATE TABLE `tbl_file` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(1000) DEFAULT NULL,
  `remotePaths` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_file` */

/*Table structure for table `tbl_goods` */

DROP TABLE IF EXISTS `tbl_goods`;

CREATE TABLE `tbl_goods` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `imgPath` varchar(500) DEFAULT NULL,
  `description` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_goods` */

/*Table structure for table `tbl_order` */

DROP TABLE IF EXISTS `tbl_order`;

CREATE TABLE `tbl_order` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `customerUuid` int(11) DEFAULT NULL,
  `orderTime` varchar(100) DEFAULT NULL,
  `totalMoney` float DEFAULT NULL,
  `saveMoney` float DEFAULT NULL,
  `state` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_order` */

/*Table structure for table `tbl_orderdetail` */

DROP TABLE IF EXISTS `tbl_orderdetail`;

CREATE TABLE `tbl_orderdetail` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `orderUuid` int(11) DEFAULT NULL,
  `goodsUuid` int(11) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `money` float DEFAULT NULL,
  `saveMoney` float DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_orderdetail` */

/*Table structure for table `tbl_store` */

DROP TABLE IF EXISTS `tbl_store`;

CREATE TABLE `tbl_store` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `goodsUuid` int(11) DEFAULT NULL,
  `storeNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_store` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
