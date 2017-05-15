SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
CREATE DATABASE `telbook`
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;
USE `telbook`;
CREATE TABLE IF NOT EXISTS `person` (
  `id`       INT(11) PRIMARY KEY AUTO_INCREMENT,
  `name`     VARCHAR(20),
  `mobile`   VARCHAR(11),
  `telphone` VARCHAR(13),
  `email`    VARCHAR(30),
  `city`     VARCHAR(20)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  AUTO_INCREMENT = 1;

INSERT INTO telbook.person (id, name, mobile, telphone, email, city)
VALUES (1002, '楚子航', '18902003856', '010-4545789', 'czh@c.cc', '北京');
INSERT INTO telbook.person ( name, mobile, telphone, email, city)
VALUES ('路明非', '16849565678', '010-4545789', 'czh@c.cc', '上海');
INSERT INTO telbook.person ( name, mobile, telphone, email, city)
VALUES ('苏茜', '18904567267', '010-4545789', 'czh@c.cc', '杭州');
INSERT INTO telbook.person ( name, mobile, telphone, email, city)
VALUES ( '夏弥', '16849607835', '010-4545789', 'czh@c.cc', '香港');

SELECT *
FROM telbook.person