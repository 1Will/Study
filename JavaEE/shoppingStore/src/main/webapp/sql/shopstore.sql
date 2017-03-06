-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.15 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5142
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 shopstore 的数据库结构
DROP DATABASE IF EXISTS `shopstore`;
CREATE DATABASE IF NOT EXISTS `shopstore` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shopstore`;

-- 导出  表 shopstore.alcohol 结构
DROP TABLE IF EXISTS `alcohol`;
CREATE TABLE IF NOT EXISTS `alcohol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) DEFAULT NULL,
  `at_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_alcohol_product` (`at_id`),
  CONSTRAINT `FK_alcohol_product` FOREIGN KEY (`at_id`) REFERENCES `alltype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  shopstore.alcohol 的数据：~0 rows (大约)
DELETE FROM `alcohol`;
/*!40000 ALTER TABLE `alcohol` DISABLE KEYS */;
INSERT INTO `alcohol` (`id`, `type`, `at_id`) VALUES
	(1, '葡萄酒', 1),
	(2, '白酒', 1);
/*!40000 ALTER TABLE `alcohol` ENABLE KEYS */;

-- 导出  表 shopstore.alltype 结构
DROP TABLE IF EXISTS `alltype`;
CREATE TABLE IF NOT EXISTS `alltype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  shopstore.alltype 的数据：~2 rows (大约)
DELETE FROM `alltype`;
/*!40000 ALTER TABLE `alltype` DISABLE KEYS */;
INSERT INTO `alltype` (`id`, `type`) VALUES
	(1, '食品'),
	(2, '生活用品');
/*!40000 ALTER TABLE `alltype` ENABLE KEYS */;

-- 导出  表 shopstore.product_detail 结构
DROP TABLE IF EXISTS `product_detail`;
CREATE TABLE IF NOT EXISTS `product_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `original_price` double DEFAULT NULL,
  `real_price` double DEFAULT NULL,
  `jifen` double DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `No` varchar(50) DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `p_Place` varchar(50) DEFAULT NULL,
  `image1` varchar(50) DEFAULT NULL,
  `image2` varchar(50) DEFAULT NULL,
  `image3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  shopstore.product_detail 的数据：~2 rows (大约)
DELETE FROM `product_detail`;
/*!40000 ALTER TABLE `product_detail` DISABLE KEYS */;
INSERT INTO `product_detail` (`id`, `name`, `original_price`, `real_price`, `jifen`, `brand`, `No`, `weight`, `p_Place`, `image1`, `image2`, `image3`) VALUES
	(1, '王朝 干红葡萄酒 750ml*6瓶/箱', 229, 198, 2, '王朝', '1865308', 3.8, '法国', '\\images\\sp1.jpg', '\\images\\01.jpg', '\\images\\por.jpg'),
	(2, '长城 白葡萄酒 750ml', 125, 99, 1, '长城', '222222', 1, '中国', '\\images\\sp3.jpg', '\\images\\hdp4.jpg', '\\images\\por.jpg');
/*!40000 ALTER TABLE `product_detail` ENABLE KEYS */;

-- 导出  表 shopstore.shoppingcart 结构
DROP TABLE IF EXISTS `shoppingcart`;
CREATE TABLE IF NOT EXISTS `shoppingcart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_shoppingcart_user` (`user_id`),
  KEY `FK_shoppingcart_productdetail` (`p_id`),
  CONSTRAINT `FK_shoppingcart_productdetail` FOREIGN KEY (`p_id`) REFERENCES `product_detail` (`id`),
  CONSTRAINT `FK_shoppingcart_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shopstore.shoppingcart 的数据：~0 rows (大约)
DELETE FROM `shoppingcart`;
/*!40000 ALTER TABLE `shoppingcart` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcart` ENABLE KEYS */;

-- 导出  表 shopstore.user 结构
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_phone` varchar(50) NOT NULL,
  `user_passwd` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_phone` (`user_phone`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 正在导出表  shopstore.user 的数据：~4 rows (大约)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `user_name`, `user_phone`, `user_passwd`) VALUES
	(1, 'zhangsan', '13300112233', 'sss'),
	(2, 'zhangsan', '13300112237', 'sss'),
	(3, 'zhangsan', '13300112238', 'sss'),
	(4, 'zhangsan', '13300112239', 'sss');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- 导出  表 shopstore.wine 结构
DROP TABLE IF EXISTS `wine`;
CREATE TABLE IF NOT EXISTS `wine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `al_id` int(11) DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__alcohol` (`al_id`),
  KEY `FK_wine_productdetail` (`p_id`),
  CONSTRAINT `FK__alcohol` FOREIGN KEY (`al_id`) REFERENCES `alcohol` (`id`),
  CONSTRAINT `FK_wine_productdetail` FOREIGN KEY (`p_id`) REFERENCES `product_detail` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  shopstore.wine 的数据：~2 rows (大约)
DELETE FROM `wine`;
/*!40000 ALTER TABLE `wine` DISABLE KEYS */;
INSERT INTO `wine` (`id`, `name`, `al_id`, `p_id`) VALUES
	(1, '红葡萄酒', 1, 1),
	(2, '白葡萄酒', 1, 2);
/*!40000 ALTER TABLE `wine` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
