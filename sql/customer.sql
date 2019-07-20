/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2019-07-20 20:09:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `age` int(3) NOT NULL,
  `sex` varchar(10) NOT NULL COMMENT '0：男；1：女',
  `tel` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `level` int(1) NOT NULL DEFAULT '0' COMMENT '0：初级；1：中级；2：高级；3：特级',
  `job` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;
