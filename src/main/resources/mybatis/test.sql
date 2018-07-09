/*
Navicat MySQL Data Transfer

Source Server         : jiafan
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2018-06-29 18:10:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `product_name` varchar(255) DEFAULT NULL COMMENT '产品型号',
  `product_num` int(10) unsigned zerofill DEFAULT NULL COMMENT '生产数量',
  `user_name` varchar(255) DEFAULT NULL COMMENT '操作员',
  `remnant_num` int(10) unsigned zerofill DEFAULT '0000000000' COMMENT '剩余库存',
  `use_num` int(10) DEFAULT NULL COMMENT '当天消耗数量',
  `purchase_num` int(10) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `product_type` int(10) unsigned zerofill DEFAULT NULL COMMENT '产品类别',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', 'PCB', '0000000100', 'xiaoxiao', '0000003000', '350', '0', '', '0000000003', '2018-06-26 15:58:44');

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) DEFAULT NULL COMMENT '产品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_type
-- ----------------------------
INSERT INTO `product_type` VALUES ('1', '硅胶');
INSERT INTO `product_type` VALUES ('2', '外壳');
INSERT INTO `product_type` VALUES ('3', '线路板');
INSERT INTO `product_type` VALUES ('4', '发射管');
INSERT INTO `product_type` VALUES ('5', '五金');
INSERT INTO `product_type` VALUES ('6', 'ic');
INSERT INTO `product_type` VALUES ('7', '其他材料');

-- ----------------------------
-- Table structure for sudent
-- ----------------------------
DROP TABLE IF EXISTS `sudent`;
CREATE TABLE `sudent` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `name` varchar(225) DEFAULT NULL,
  `class` varchar(225) DEFAULT NULL,
  `gage` double(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sudent
-- ----------------------------
INSERT INTO `sudent` VALUES ('1', '张三', '语文', '20');
INSERT INTO `sudent` VALUES ('2', '张三', '数学', '30');
INSERT INTO `sudent` VALUES ('3', '张三', '英语', '40');
INSERT INTO `sudent` VALUES ('4', '李四', '语文', '45');
INSERT INTO `sudent` VALUES ('5', '李四', '数学', '65');
INSERT INTO `sudent` VALUES ('6', '李四', '英语', '87');

-- ----------------------------
-- Table structure for trabe
-- ----------------------------
DROP TABLE IF EXISTS `trabe`;
CREATE TABLE `trabe` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `version` int(10) DEFAULT NULL,
  `stock` int(10) DEFAULT NULL,
  `trabe_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trabe
-- ----------------------------
INSERT INTO `trabe` VALUES ('1', '10001', '100', '海飞丝');
