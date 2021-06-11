-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-06-2021 a las 14:46:57
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

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
DROP DATABASE agropuntoverde;
CREATE DATABASE IF NOT EXISTS agropuntoverde;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_ventas`
--
USE agropuntoverde;

CREATE TABLE `detalles_ventas` (
  `id_Venta` int(11) NOT NULL,
  `id_Producto` varchar(13) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `Precio_Unitario` float NOT NULL,
  `Precio_total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalles_ventas`
--

INSERT INTO `detalles_ventas` (`id_Venta`, `id_Producto`, `cantidad`, `Precio_Unitario`, `Precio_total`) VALUES
(1, '3', 2, 850, 1700),
(1, 'AGRAMINA', 1, 450, 450),
(2, '2', 10, 80, 800),
(3, '3', 1, 850, 850),
(4, '2', 1, 80, 80),
(5, '2', 2, 80, 160),
(5, '3', 2, 850, 1700),
(8, '7', 5, 975, 4875),
(8, '9', 2, 650, 1300),
(8, 'AGRAMINA', 10, 450, 4500),
(8, 'Jandi', 1, 100, 100),
(9, '4', 1, 200, 200),
(9, 'AGRAMINA', 5, 450, 2250),
(9, 'Jandi', 10, 100, 1000),
(10, '3', 2, 850, 1700),
(11, '1996', 20, 295, 5900),
(13, '2', 3, 80, 240),
(13, '3', 1, 850, 850),
(13, '7', 4, 975, 3900),
(13, '9', 2, 650, 1300),
(13, 'AGRAMINA', 2, 450, 900),
(14, '7', 3, 975, 2925),
(15, '2', 2, 80, 160),
(15, '7', 2, 975, 1950),
(16, '10', 2, 1150, 2300),
(16, '4', 2, 200, 400),
(17, '2', 3, 80, 240),
(17, '9', 5, 650, 3250),
(18, '2', 3, 80, 240),
(18, '7', 3, 975, 2925),
(19, '2', 3, 80, 240),
(20, '2', 5, 80, 400),
(21, '2', 4, 80, 320),
(22, '2', 3, 80, 240),
(22, '4', 2, 200, 400),
(22, '6', 2, 100, 200),
(23, '2', 3, 80, 240),
(23, '6', 3, 100, 300),
(24, '4', 3, 200, 600),
(24, '6', 3, 100, 300),
(25, '2', 3, 80, 240),
(25, '9', 2, 650, 1300),
(26, '3', 2, 850, 1700),
(27, '2', 1, 80, 80),
(27, '3', 4, 850, 3400),
(28, '2', 3, 80, 240),
(29, '3', 2, 850, 1700),
(29, '7', 2, 975, 1950),
(30, '4', 2, 200, 400),
(30, '6', 2, 100, 200),
(31, '3', 3, 850, 2550),
(31, '7', 1, 975, 975),
(32, '2', 2, 80, 160),
(32, '3', 2, 850, 1700),
(33, '3', 1, 850, 850),
(33, '7', 1, 975, 975),
(34, '2', 1, 80, 80),
(34, '4', 3, 200, 600),
(35, '3', 1, 850, 850),
(35, '4', 2, 200, 400),
(36, '4', 3, 200, 600),
(36, '6', 3, 100, 300),
(37, '6', 1, 100, 100),
(37, '7', 1, 975, 975),
(38, '6', 2, 100, 200),
(38, '7', 1, 975, 975),
(39, '10', 9, 1150, 10350),
(39, '7', 5, 975, 4875),
(40, '4', 2, 200, 400),
(40, '6', 3, 100, 300),
(41, '6', 4, 100, 400),
(41, '7', 2, 975, 1950),
(42, '6', 1, 100, 100),
(42, '7', 2, 975, 1950),
(43, '3', 1, 850, 850),
(43, '7', 1, 975, 975),
(44, '2', 4, 80, 320),
(45, '6', 2, 100, 200),
(46, '3', 1, 850, 850),
(46, '7', 2, 975, 1950),
(47, '4', 3, 200, 600),
(47, '9', 2, 650, 1300),
(48, '7', 3, 975, 2925),
(48, '9', 2, 650, 1300),
(49, '6', 1, 100, 100),
(49, '7', 2, 975, 1950),
(49, 'AGRAMINA', 6, 450, 2700),
(50, '3', 2, 850, 1700),
(51, '2', 3, 80, 240),
(51, '7', 2, 975, 1950),
(52, '2', 2, 80, 160),
(52, '3', 3, 850, 2550),
(53, '4', 2, 200, 400),
(53, '6', 2, 100, 200),
(53, 'AGRAMINA', 2, 450, 900),
(54, '4', 2, 200, 400),
(54, '6', 12, 100, 1200),
(55, '6', 2, 100, 200),
(55, '7', 3, 975, 2925),
(56, '2', 1, 80, 80),
(56, '7', 2, 975, 1950),
(56, 'AGRAMINA', 3, 450, 1350),
(57, '4', 2, 200, 400),
(57, '6', 2, 100, 200),
(57, 'AGRAMINA', 6, 450, 2700),
(58, '4', 3, 200, 600),
(58, '6', 2, 100, 200),
(59, '6', 2, 100, 200),
(59, '7', 3, 975, 2925),
(59, 'AGRAMINA', 8, 450, 3600),
(60, '6', 2, 100, 200),
(60, 'AGRAMINA', 6, 450, 2700),
(61, '2', 6, 80, 480),
(61, '6', 2, 100, 200),
(61, 'AGRAMINA', 5, 450, 2250),
(62, '2', 3, 80, 240),
(62, 'AGRAMINA', 5, 450, 2250),
(63, '6', 2, 100, 200),
(63, '7', 3, 975, 2925),
(64, '3', 2, 850, 1700),
(64, '6', 2, 100, 200),
(64, 'AGRAMINA', 1, 450, 450),
(65, '4', 3, 200, 600),
(65, '6', 2, 100, 200),
(65, 'AGRAMINA', 6, 450, 2700),
(69, '4', 3, 200, 600),
(69, '6', 2, 200, 400),
(71, '2', 2, 80, 160),
(71, '3', 2, 850, 1700),
(71, '4', 2, 200, 400),
(71, '5', 2, 55, 110),
(71, '6', 2, 200, 400),
(72, '2', 2, 80, 160),
(72, '3', 2, 850, 1700),
(72, '4', 2, 200, 400),
(72, '5', 2, 55, 110),
(72, '6', 2, 200, 400),
(72, '7', 2, 975, 1950),
(74, '2', 2, 80, 160),
(74, '3', 1, 850, 850),
(74, '5', 3, 55, 165),
(75, '2', 3, 80, 240),
(75, '5', 2, 55, 110),
(76, '2', 2, 80, 160),
(76, '6', 1, 200, 200),
(77, '2', 1, 80, 80),
(77, '3', 2, 850, 1700),
(78, '2', 2, 80, 160),
(78, '6', 2, 200, 400),
(79, '3', 1, 850, 850),
(79, '5', 2, 55, 110),
(80, '2', 2, 80, 160),
(81, '5', 2, 55, 110),
(82, '5', 2, 55, 110),
(82, '6', 2, 200, 400),
(84, '6', 2, 200, 400);

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
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `Nombre`, `Descrip`, `P_Compra`, `P_Venta`, `Marca`, `Ganancia`, `Presentacion`, `Cant`, `Total`) VALUES
('1', 'Alfadex', 'Mosquicida', 9090, 110110000, 'Sy', 110101000, 'KG', 0.1, 50),
('10', 'ALIETTE WD', 'FOSETIL-ALUMINIO', 950, 1150, 'BAYER', 200, 'KG', 2, 487),
('11', 'AMINOTAL', 'AMINOACIDOS', 160, 180, 'TALA', 20, 'LT', 1, 21),
('12', 'ESTERON 47 M', '2,4 D ESTER', 95, 115, 'DOW AGRO', 20, 'LT', 1, 6),
('1234', 'Saprol', 'ioojoi', 650, 700, 'lojo', 50, 'KG', 0.2, 554),
('12345678', 'Hierbamina', 'Herbicida', 120, 140, 'Syngenta', 20, 'Lt', 1, 170),
('13', 'HIERBAMINA', '2,4 D AMINA', 95, 120, 'SYNGENTA', 25, 'LT', 1, 31),
('14', 'MANZATE 200', 'MANCOZEB', 100, 120, 'UPL AGRO', 0, 'LT', 1, 12),
('1499122', 'Generate', 'ProductoGenerate1litro', 2000, 2200, 'Generate', 200, 'LT', 1, 200),
('15', 'MARVEL', 'DICAM/ATRAZINA ', 250, 280, 'SYNGENTA', 0, 'LT', 1, 24),
('1978271', 'Prueba', 'P', 45, 68, 'l', 23, 'LT', 1, 63),
('1996', 'pescuesitos', 'comida', 195, 295, 'pollofeliz', 100, 'Lt', 20, 480),
('2', 'ACTIVADOR 8-24-4', 'N-P-K ACIDO', 60, 80, 'MEZFER', 20, 'LT', 1, 72),
('2872329', 'Queda', 'queda', 300, 350, 's', 50, 'KG', 2, 10),
('3', 'ACTIVADOR 8-24-4', 'HORMONAS', 800, 850, 'MEZFER', 50, 'LT', 19, 647),
('4', 'AFIDOX 40 ', 'DIMETOATO', 100, 200, 'LUCAVA', 100, 'LT', 1, 166),
('5', 'Inex A', 'Sellador', 20, 55, 'Asd', 35, 'LT', 2, 507),
('5000', 'FertiWeb', 'Fertilizanteparaplantas', 50, 65, 'Farm', 15, 'KG', 2, 56),
('6', 'Bumper', 'adrefg', 150, 200, 'Bayer', 50, 'LT', 1, 205),
('6', 'AGITA', 'MOSQUICIDA', 80, 100, 'NOVARTIS', 20, 'KG', 0.2, 205),
('6383085', 'Pruebados', 'pr2', 900, 920, 'c', 20, 'KG', 1, 20),
('6492759', 'AgitaBote', 'BotedeAgita', 1200, 1400, 'L', 200, 'KG', 0.75, 10),
('6704548', 'Agremina', 'Amina', 200, 400, 'Tr', 200, 'LT', 4, 30),
('7', 'AGRIVER 1.8% PH', 'ABAMECTINA', 920, 975, 'LAPISA AGRI', 55, 'KG', 1, 423),
('7506129433222', 'Velfosato', 'Glifosato', 80, 100, 'jhjoiji', 20, 'LT', 1, 50),
('8', 'ALFADEX', 'CIPERMETRINA', 130, 150, 'NOVARTIS', 20, 'LT', 0.1, 220),
('8854668', 'J', 'j', 54, 99, 's', 45, 'KG', 1, 12),
('9', 'ALIETTE WDG', 'FOSETIL-ALUMINIO', 600, 650, 'BAYER', 50, 'KG', 1, 476),
('99', 'FERMIZIDA', 'CONTAMINANTE', 56, 66, 'EQUIS', 10, 'LT', 12, 88),
('AGRAMINA', 'AGRAMINA', 'HERBICIDA', 250, 450, 'TRIDENTE', 200, 'Lt', 5, 215),
('CIAFYX', 'CIAFYX', 'HERBICIDA', 450, 650, 'HANNA', 200, 'Lt', 0.45, 2),
('HERAL', 'DSJSJ', 'JOIJOI', 50, 100, 'UIHIU', 50, 'Lt', 0.025, 15),
('Jandi', 'Jandi', 'Jabon', 50, 100, 'Biocys', 50, 'Lt', 0, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product_code`
--

CREATE TABLE `product_code` (
  `id` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `imagencode` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `product_code`
--

INSERT INTO `product_code` (`id`, `nombre`, `imagencode`) VALUES
('1499122', 'Generate', 0x89504e470d0a1a0a0000000d49484452000001040000005a0802000000d199bf6e0000025d4944415478daedd821ab22511880618b490c16b3c560b21aec6611c17f61144c0683e09f1083c16212119bd96232d90d7693ec0e3b300ce3ecac2cbb3beee57983c877ce3d1786fb78672c7c93f4a3824b20c120c120c120c120c120c120c120c120c120c120c120c120c120c120c190c3b52814e2af6189796267b4e74fcd53577fe3cc8cf3537f9760804130c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000836080413008061804030c30c020c120c120c120c1f0cf7b3e9fffc59982e12f763a9d46a351a552795d3a1e8ff1ef79b6db6db1580c27b3d92c63987ae666b309b705fb77bb5dc65030e47a11d3bea36c369b97cb255a8afe5e838ffcd56a95314c3db3542aedf7fbe04db03ff8a98ca160f82c0c8bc562381cc697e27bc6e371c630035858bbdd7e73281872c6f0783c1a8dc6fd7e8f2f45ff040e8743bd5ecf18666308eebec2937f39140cf963984c26d10340b414dec90475bbdd5eaf9731ccc010dc14dd6eb7778682e12330d46ab542ac7ebf9fd83f180c5e0f490c5f312c97cbebf5face50307cd603746229ba8d994ea7d1b372ea30f5ccf57a7d3e9f134ba943c1901b83783f5b0ddeb75aad6ab5dae974e6f379b42175987a66b95c7e73281824182418241824182418241824182418241824182418241824182418241824182418241824182418a4afd477f76a540df5bf6f9b0000000049454e44ae426082),
('6492759', 'AgitaBote', 0x89504e470d0a1a0a0000000d49484452000001040000005a0802000000d199bf6e000003204944415478daedd8a14b24511cc0f1051111119bc12482c1242288c1289845049318c462d82e0683411083dd200611410c222216f13f3099ac6210c1242272f7e3deddbb6166dc6bbb707cbe4176dfeebc95ddf7d979b38d1f927ed5f01648304830483048304830483048304830483048304830483048304830483074e0bd6834aa7f53a5dbd5e79746be7b6671b6d2a32de6acfd1f5abf56edb12dfe07c10083608001061860800106186080010618608001061860800106186080010618608001061860800106186080010618608001061860800106186080010618608001061860800106186080010618608001061860800106186080010618608001061860800106186080010618608001061860800106186080010618608001061860800106c1008360100c30080618608041824182418241824182a1239d9d9da5df67c6c6c68ae3777777c5df792e2f2fbbbbbbd3c8cece4e1a3c3f3f4f23f1d0d5d5d5ef8fa4508cfffda8fed4dfdfdf624ec1d0992e2e2e565757dfdfdfab0f8d8f8f3f3c3c640c79b97f7d7d1d1f1fa7c1bebebeebebebb8110fe5759f0f797b7b1b1a1a2a6228bd44ed9c82a133adacacd48e1f1e1e369bcde20a2e2ee58d8d8dea21333333a59158df21ad05867fce2918dad7fafafaf2f2726f6fefc4c444ec79d2609c2862cbf4f2f2525caff95bfce6e6667474b4344feca9d2f38b2d2d2dc59927dfede9e9296da85acf2918dad7c7c747ec733637373f3f3fe3eec9c9491adfdadaca3bf88c216d84a2f9f9f9858585e23cb1537a7e7e2e4d1e3b9fb83688bfa5f1a7a7a7bca16a31a760686bb116a7a6a6f2dd83838374637878b87811bcb8b858fdcacfb78f8e8e1e1f1fab93c7c571f5c0eff64ba5390543bbbbbdbd1d1919797d7d4d6789da5d7b5eb87917b4bdbd9d2f764f4f4fefefef6b97f8dada5a38c977272727f7f7f7e3558a97dab5730a86ceb4b7b737303010d70cb3b3b361a32a21ffba3a3d3d3d3838383737b7bbbb9b9f101ba1e239a4786c5c032466a9387bc41576575757488893461aac9d53304830483048304830483048304830483048304830483048304830483048304830483048304830483048ff533f010f4641aa089be0070000000049454e44ae426082),
('6704548', 'Agremina', 0x89504e470d0a1a0a0000000d49484452000001040000005a0802000000d199bf6e000003364944415478daedd9b12b75611cc0f15bba499245922429830c923219fd07522649b218ec32182d06bb410649c920596fba83d56452061924258324797f79def7745ef7dc9be93df5f6f90e7aee3dcf3d74eff99ce79cabf229e9ab8ab7408241824182418241824182418241824182418241824182418241824182a184f7a25269fc996a1c7f7b55e11eb2f9d9d6667bf8f67ce16b5bbcea87bfbdc5df201860100c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c0201860100c820106c100030c304830483048304830483094d2f1f171fa7e667474f4f77b9aab5aada627ebf5fadcdcdce0e0603c737e7e9edfc3c5c545b3ef9dbababa5accacd56ab1b778d8dede1e9b7c163094d9e9e9e9f2f2f2ebebeb5fefe99f83f5f9f9b9bfbf3f8dc7c7c79f9e9e62707979d9d1d1919f1f9baeafaf9b7d5ddb62665f5fdfe3e3630c1e1e1e62ece380a1cc1617175b6c3d3838082a691c6b42e1b1beb7b7b7b6b6f6d9fc7f172d66767777dfddddc5e0fdfdbda7a7c7c7014399adaeae2e2c2cc4997e6262e2e4e4e4dbd6f9f9f9583ad238ae641a8ff55852e2e22a9dddf3006272bac4ca2ea80a671e1d1dc5ef9d9d9d5d5a5a8ab18f0386d27a7b7bebececdcd8d88813733c3c3c3ccc6ffdf8f8882bfef8d978b2cfc69b9b9b5b5b5bcd5683fbfbfbec96a370662c14b7b7b731787979498b866028a7386d4f4d4d650f777777f35bcfcecee28eb9f0ca271b0f0d0de5efb6f3f37f32b3b7b7379b991f0b867f5dad561b1e1e4eb7c5b14aacafafe7b7aeacacecefef670fe31c1fb7ce31b8baba2a3c70b3e37e7272726767277618d8b295a170e6d8d858ba774f17513e1118ca6c7b7b3bee62e39e616666266ce4378d8c8c2427d93252fd6a6060a05eaf371edfd977a6373737d3d3d36d6d6d313996971633d33ed3dd45e34cc120c120c120c120c120c120c120c120c120c120c120c120c120c120c120c120c120c120c120c120c120fd07fd0241712aa61e31bb1d0000000049454e44ae426082),
('8854668', 'J', 0x89504e470d0a1a0a0000000d49484452000001040000005a0802000000d199bf6e000002d24944415478daedd8bf4b32711cc0f1038990081711c7680b0791c0a9b1ff205a25a4ada13d1c1a5b1adc1b1c2310870857e99f680a1ca221c2a521c2c1e7cb7374dcf378774fcf33243cbcde835c1faf3b115ff72b5a48fa59e42b90609060906090609060906090609060906090609060906090609060906058c1771145e9d7b8bf7d37997f653b79ff9bccffed33647e92e56da6e7820106c100030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c30c000030c820106c1201860100c30c00083048304830483048304c3f737994cd6d6d6a2285a5f5fbfbfbf2f182e524f72363737d31b09ebfcf65c68381cc6939d9d9d8261de8e04c30aaad7ebafafaf61e1e5e5252c170c17f98f329bcde6c3c343f2eeedededf1f1f1fbfb7b7a9dcc61de8e04c30aaa542a4f4f4f61613e9f57abd582611e86c160707a7a9a7ef7e8e86879b5cc61de8e04c30abab9b969b55a070707dd6e372c170c43e16226fce2c385cd783c8e27e1481fae79e2a37b82e1e4e4a4d3e994cbe5b091d1685430ccdb91605841e1a03e9d4ec3c2dbdb5b7c80cf1b263d3f3f070ff1f2f9f9f9c5c545fabcf1f1f1b1b1b1d1ebf5c2c13efc797d7d9d37fce38e04c3b756abd596973387bf7ce99f2781adadad28d5e1e1613869b4dbed64cdabababf09a39fcca8e04c3f7d56834e29bdaf882a760b8bbbbdbeff7c3313efcb29333c3b290c964b2bdbd3d9bcde213c2d9d959de306f47826135c5bfecf84ee0eeeeae60f8f8f8b8b7b7572a95d2c3b484e4e9eae5e565b8330eb707fbfbfb8141bc42e6307347824182418241824182418241824182418241824182418241824182418241824182418241824182418241fa9ffa013b6222d2b19bed020000000049454e44ae426082);

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
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `Cajero`, `Fecha`) VALUES
(1, 'dcc1996', '2018-10-22 16:11:33'),
(2, 'dcc1996', '2018-10-22 16:44:25'),
(3, 'dcc1996', '2018-10-22 16:45:32'),
(4, 'dcc1996', '2018-10-22 16:48:02'),
(5, 'dcc1996', '2017-11-23 12:42:45'),
(8, 'dcc1996', '2017-11-24 12:27:56'),
(9, 'dcc1996', '2017-11-24 12:33:30'),
(10, 'dcc1996', '2017-11-25 16:04:48'),
(11, 'dcc1996', '2017-11-27 14:20:19'),
(13, 'dcc1996', '2017-12-02 14:48:09'),
(14, 'dcc1996', '2017-12-02 14:49:02'),
(15, 'dcc1996', '2017-12-02 14:53:32'),
(16, 'dcc1996', '2017-12-02 14:54:50'),
(17, 'dcc1996', '2017-12-02 15:21:48'),
(18, 'dcc1996', '2017-12-02 15:24:49'),
(19, 'dcc1996', '2017-12-02 15:26:37'),
(20, 'dcc1996', '2017-12-02 15:28:54'),
(21, 'dcc1996', '2017-12-02 15:36:27'),
(22, 'dcc1996', '2017-12-02 15:43:32'),
(23, 'dcc1996', '2017-12-02 15:50:14'),
(24, 'dcc1996', '2017-12-02 15:52:12'),
(25, 'dcc1996', '2017-12-02 16:07:57'),
(26, 'dcc1996', '2017-12-02 16:10:40'),
(27, 'dcc1996', '2017-12-02 16:13:50'),
(28, 'dcc1996', '2017-12-02 16:31:05'),
(29, 'dcc1996', '2017-12-02 18:13:40'),
(30, 'dcc1996', '2017-12-02 18:17:48'),
(31, 'dcc1996', '2017-12-02 18:20:04'),
(32, 'dcc1996', '2017-12-02 18:21:44'),
(33, 'dcc1996', '2017-12-02 18:23:13'),
(34, 'dcc1996', '2017-12-02 18:31:50'),
(35, 'dcc1996', '2017-12-02 18:36:38'),
(36, 'dcc1996', '2017-12-02 18:54:24'),
(37, 'dcc1996', '2017-12-02 18:57:30'),
(38, 'dcc1996', '2017-12-02 18:59:39'),
(39, 'dcc1996', '2017-12-02 19:10:17'),
(40, 'dcc1996', '2017-12-02 19:15:48'),
(41, 'dcc1996', '2017-12-02 19:18:28'),
(42, 'dcc1996', '2017-12-02 19:21:55'),
(43, 'dcc1996', '2017-12-02 19:25:07'),
(44, 'dcc1996', '2017-12-02 19:30:39'),
(45, 'dcc1996', '2017-12-02 19:53:13'),
(46, 'dcc1996', '2017-12-02 20:00:07'),
(47, 'dcc1996', '2017-12-02 20:03:19'),
(48, 'dcc1996', '2017-12-02 20:09:56'),
(49, 'dcc1996', '2017-12-02 20:19:26'),
(50, 'dcc1996', '2017-12-02 20:22:31'),
(51, 'dcc1996', '2017-12-02 20:33:17'),
(52, 'dcc1996', '2017-12-02 20:38:55'),
(53, 'dcc1996', '2017-12-02 20:44:11'),
(54, 'dcc1996', '2017-12-02 21:20:54'),
(55, 'dcc1996', '2017-12-02 21:28:08'),
(56, 'dcc1996', '2017-12-03 08:52:22'),
(57, 'dcc1996', '2017-12-03 09:03:26'),
(58, 'dcc1996', '2017-12-03 09:10:17'),
(59, 'dcc1996', '2017-12-03 09:12:39'),
(60, 'dcc1996', '2017-12-03 09:15:10'),
(61, 'dcc1996', '2017-12-03 09:17:11'),
(62, 'dcc1996', '2017-12-03 09:19:07'),
(63, 'dcc1996', '2017-12-03 11:28:56'),
(64, 'dcc1996', '2017-12-03 11:31:15'),
(65, 'dcc1996', '2017-12-03 11:38:51'),
(69, 'dcc1996', '2017-12-05 15:59:26'),
(71, 'dcc1996', '2017-12-05 16:07:13'),
(72, 'dcc1996', '2017-12-05 16:10:15'),
(74, 'dcc1996', '2017-12-05 16:16:49'),
(75, 'dcc1996', '2017-12-05 22:54:17'),
(76, 'dcc1996', '2017-12-05 22:57:02'),
(77, 'dcc1996', '2017-12-05 22:58:22'),
(78, 'dcc1996', '2017-12-06 09:50:11'),
(79, 'dcc1996', '2017-12-06 11:46:33'),
(80, 'dcc1996', '2017-12-06 13:27:04'),
(81, 'dcc1996', '2017-12-06 13:55:02'),
(82, 'dcc1996', '2017-12-06 15:52:17'),
(84, 'dcc1996', '2017-12-14 12:29:49');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  ADD PRIMARY KEY (`id_Venta`,`id_Producto`,`Precio_Unitario`),
  ADD KEY `id_Producto` (`id_Producto`),
  ADD KEY `Precio_Unitario` (`Precio_Unitario`);

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
  ADD KEY `Presentacion` (`Presentacion`),
  ADD KEY `P_Venta` (`P_Venta`);

--
-- Indices de la tabla `product_code`
--
ALTER TABLE `product_code`
  ADD PRIMARY KEY (`id`);

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
  ADD CONSTRAINT `detalles_ventas_ibfk_2` FOREIGN KEY (`id_Producto`) REFERENCES `productos` (`id`),
  ADD CONSTRAINT `detalles_ventas_ibfk_3` FOREIGN KEY (`Precio_Unitario`) REFERENCES `productos` (`P_Venta`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`Presentacion`) REFERENCES `presentacion` (`id`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`Cajero`) REFERENCES `usuarios` (`User`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
