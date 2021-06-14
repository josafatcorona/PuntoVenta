-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2021 a las 14:36:12
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2
drop database if exists agropuntoverde;
create database if not exists agropuntoverde;
use agropuntoverde;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agropuntoverde`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_ventas`
--

CREATE TABLE `detalles_ventas` (
  `id_Venta` int(11) NOT NULL,
  `id_Producto` varchar(13) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `Precio_Unitario` float NOT NULL,
  `Precio_total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presentacion`
--

CREATE TABLE `presentacion` (
  `id` varchar(10) NOT NULL,
  `Nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `presentacion`
--

INSERT INTO `presentacion` (`id`, `Nombre`) VALUES
('KG', 'Kilogramo'),
('LT', 'Litro'),
('PZA', 'Pieza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` varchar(13) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Descrip` varchar(45) NOT NULL,
  `P_Compra` float NOT NULL,
  `P_Venta` float NOT NULL,
  `Marca` varchar(30) NOT NULL,
  `Ganancia` float NOT NULL,
  `Presentacion` varchar(10) NOT NULL,
  `Cant` float NOT NULL,
  `Total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Estructura de tabla para la tabla `product_code`
--

CREATE TABLE `product_code` (
  `id` varchar(13) CHARACTER SET utf8 NOT NULL,
  `nombre` varchar(30) CHARACTER SET utf8 NOT NULL,
  `imagencode` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `User` varchar(20) NOT NULL,
  `Pass` varchar(20) NOT NULL,
  `Admin` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Ap_P` varchar(45) NOT NULL,
  `Ap_M` varchar(45) NOT NULL,
  `A_Nac` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`User`, `Pass`, `Admin`, `Nombre`, `Ap_P`, `Ap_M`, `A_Nac`) VALUES
('1234567', 'VIDAL', 0, 'VIDAL', 'LEON', 'GONZALEZ', '1997'),
('dcc1996', 'dajoc96', 1, 'David Josafat', 'Corona', 'Cervantes', '1996'),
('grm1997', '1234567', 0, 'German', 'Rojas', 'Mendez', '1997'),
('qwertyu', 'qwertyu', 0, 'Josafat', 'Corona', 'Reyes', '1950'),
('vlg1997', 'vilgo97', 0, 'Vidal', 'Le?n', 'Gonzalez', '1997');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `Cajero` varchar(20) NOT NULL,
  `Fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  ADD PRIMARY KEY (`id_Venta`,`id_Producto`,`Precio_Unitario`),
  ADD KEY `id_Producto` (`id_Producto`);

--
-- Indices de la tabla `presentacion`
--
ALTER TABLE `presentacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`,`Marca`,`P_Venta`,`Presentacion`),
  ADD KEY `Presentacion` (`Presentacion`);

--
-- Indices de la tabla `product_code`
--
ALTER TABLE `product_code`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`User`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`,`Cajero`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `Cajero` (`Cajero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  MODIFY `id_Venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  ADD CONSTRAINT `detalles_ventas_ibfk_1` FOREIGN KEY (`id_Venta`) REFERENCES `ventas` (`id`),
  ADD CONSTRAINT `detalles_ventas_ibfk_2` FOREIGN KEY (`id_Producto`) REFERENCES `productos` (`id`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`Presentacion`) REFERENCES `presentacion` (`id`);

--
-- Filtros para la tabla `product_code`
--
ALTER TABLE `product_code`
  ADD CONSTRAINT `product_code_ibfk_1` FOREIGN KEY (`id`) REFERENCES `productos` (`id`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`Cajero`) REFERENCES `usuarios` (`User`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
