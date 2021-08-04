-- MySQL Workbench Forward Engineering
DROP DATABASE IF EXISTS AGROPUNTOVERDE;
CREATE DATABASE IF NOT EXISTS AGROPUNTOVERDE;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema agropuntoverde
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema agropuntoverde
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `agropuntoverde` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `agropuntoverde` ;

-- -----------------------------------------------------
-- Table `agropuntoverde`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agropuntoverde`.`usuarios` (
  `User` VARCHAR(20) NOT NULL,
  `Pass` VARCHAR(20) NOT NULL,
  `Admin` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Ap_P` VARCHAR(45) NOT NULL,
  `Ap_M` VARCHAR(45) NOT NULL,
  `A_Nac` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`User`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `agropuntoverde`.`ventas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agropuntoverde`.`ventas` (
  `id` INT NOT NULL,
  `Cajero` VARCHAR(20) NOT NULL,
  `Fecha` DATETIME NOT NULL,
  `Total` INT NOT NULL,
  `Tipo` VARCHAR(1) NULL,
  PRIMARY KEY (`id`, `Cajero`),
  UNIQUE INDEX `id` (`id` ASC) VISIBLE,
  INDEX `Cajero` (`Cajero` ASC) VISIBLE,
  CONSTRAINT `ventas_ibfk_1`
    FOREIGN KEY (`Cajero`)
    REFERENCES `agropuntoverde`.`usuarios` (`User`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `agropuntoverde`.`presentacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agropuntoverde`.`presentacion` (
  `id` VARCHAR(10) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `agropuntoverde`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agropuntoverde`.`productos` (
  `id` VARCHAR(13) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Descrip` VARCHAR(45) NOT NULL,
  `P_Compra` FLOAT NOT NULL,
  `P_Venta` FLOAT NOT NULL,
  `Marca` VARCHAR(30) NOT NULL,
  `Ganancia` FLOAT NOT NULL,
  `Presentacion` VARCHAR(10) NOT NULL,
  `Cant` FLOAT NOT NULL,
  `Total` FLOAT NOT NULL,
  PRIMARY KEY (`id`, `Marca`, `P_Venta`, `Presentacion`),
  INDEX `Presentacion` (`Presentacion` ASC) VISIBLE,
  CONSTRAINT `productos_ibfk_1`
    FOREIGN KEY (`Presentacion`)
    REFERENCES `agropuntoverde`.`presentacion` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `agropuntoverde`.`detalles_ventas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agropuntoverde`.`detalles_ventas` (
  `id_Venta` INT NOT NULL AUTO_INCREMENT,
  `id_Producto` VARCHAR(13) NOT NULL,
  `cantidad` INT NOT NULL,
  `Precio_Unitario` FLOAT NOT NULL,
  `Precio_total` FLOAT NOT NULL,
  PRIMARY KEY (`id_Venta`, `id_Producto`, `Precio_Unitario`),
  INDEX `id_Producto` (`id_Producto` ASC) VISIBLE,
  CONSTRAINT `detalles_ventas_ibfk_1`
    FOREIGN KEY (`id_Venta`)
    REFERENCES `agropuntoverde`.`ventas` (`id`),
  CONSTRAINT `detalles_ventas_ibfk_2`
    FOREIGN KEY (`id_Producto`)
    REFERENCES `agropuntoverde`.`productos` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 85
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `agropuntoverde`.`product_code`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agropuntoverde`.`product_code` (
  `id` VARCHAR(13) CHARACTER SET 'utf8' NOT NULL,
  `nombre` VARCHAR(30) CHARACTER SET 'utf8' NOT NULL,
  `imagencode` BLOB NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id` (`id` ASC) VISIBLE,
  CONSTRAINT `product_code_ibfk_1`
    FOREIGN KEY (`id`)
    REFERENCES `agropuntoverde`.`productos` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

use agropuntoverde;
select * from usuarios;
insert into usuarios values("dcc1996","dajoc96","1","David Josafat","Corona","Cervantes","1996");




INSERT INTO `presentacion` (`id`, `Nombre`) VALUES
('KG', 'Kilogramo'),
('LT', 'Litro'),
('PZA', 'Pieza');

select * from productos a inner join  product_code b
on a.id = b.id;
select * from presentacion;

INSERT INTO `presentacion` (`id`, `Nombre`) VALUES
('MG', 'Gramos');

delete  from presentacion  where id = "MG";

select * from detalles_ventas;
select * from ventas;
select * from ventas where Fecha between '2021-07-02' and '2021-07-03';
select * from ventas inner join detalles_ventas on ventas.id = detalles_ventas.id_Venta;
