-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 31-05-2023 a las 07:45:45
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `concesionario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `usuario` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `estatus` tinyint NOT NULL,
  `fechaRegistro` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `email`, `usuario`, `password`, `estatus`, `fechaRegistro`) VALUES
(1, 'David', 'Corral', 'davidcorralallo@gmail.com', 'David123', '{noop}123', 1, '2023-05-19'),
(5, 'qwe', 'qwe', 'qwe@gmail.com', 'qwe', '$2a$10$TWUMA4fQFtzMM60YIS/ifeud7byeL9Gl8.nyDlUfZWDJlRUKrL90S', 1, '2023-05-26'),
(7, 'Esther', 'Gomez Mantiñan', 'esther@gmail.com', 'esther123', '$2a$10$.7qyzLUMPaQ1CvmaIz8FW.NYd7p5cSPPFLiZ1kg834FTI.6KZOS5q', 1, '2023-05-27');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coches`
--

DROP TABLE IF EXISTS `coches`;
CREATE TABLE IF NOT EXISTS `coches` (
  `id` int NOT NULL AUTO_INCREMENT,
  `marca` enum('Audi','Bmw','Cupra','Dacia','Ferrari','Fiat','Ford','Honda','Hyundai','Jaguar','Jeep','Kia','Lamborghini','LandRover','Lexus','Maserati','Mazda','Mercedes','Mini','Nissan','Peugeot','Porche','Renault','Seat','Tesla','Toyota','Volskwagen') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `modelo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `potencia` int NOT NULL,
  `motor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `propulsion` enum('Atmosférico','Turbo','Doble Turbo') COLLATE utf8mb4_unicode_ci NOT NULL,
  `cambio` enum('Manual','Automático') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `traccion` enum('Delantera','Trasera','Integral') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `combustible` enum('Gasolina','Diésel','Eléctrico') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `consumoCiudad` decimal(3,1) NOT NULL,
  `consumoAutopista` decimal(3,1) NOT NULL,
  `plazas` int NOT NULL,
  `precio` int NOT NULL,
  `img` varchar(155) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `coches`
--

INSERT INTO `coches` (`id`, `marca`, `modelo`, `potencia`, `motor`, `propulsion`, `cambio`, `traccion`, `combustible`, `consumoCiudad`, `consumoAutopista`, `plazas`, `precio`, `img`) VALUES
(1, 'Audi', 'TT RS', 400, '5 en línea', 'Atmosférico', 'Automático', 'Integral', 'Gasolina', '0.0', '0.0', 4, 92010, 'https://soymotor.com/sites/default/files/usuarios/redaccion/portal/jmorillo/audi_tt_rs_coupe_iconic_edition_4.jpg'),
(2, 'Audi', 'RS 7', 630, '', 'Atmosférico', 'Automático', 'Integral', 'Gasolina', '0.0', '0.0', 5, 175570, 'https://www.tuningblog.eu/wp-content/uploads/2022/10/2022-BTM-Audi-RS7-Sportback-C8-Tuning-1000-PS-2.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cohesconcesionario`
--

DROP TABLE IF EXISTS `cohesconcesionario`;
CREATE TABLE IF NOT EXISTS `cohesconcesionario` (
  `IdCoche` int NOT NULL,
  `idConcesioario` int NOT NULL,
  PRIMARY KEY (`IdCoche`,`idConcesioario`),
  KEY `IdCoche` (`IdCoche`,`idConcesioario`),
  KEY `relacion_a_concesionarios` (`idConcesioario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cohesconcesionario`
--

INSERT INTO `cohesconcesionario` (`IdCoche`, `idConcesioario`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `concesionario`
--

DROP TABLE IF EXISTS `concesionario`;
CREATE TABLE IF NOT EXISTS `concesionario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `localizacion` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `concesionario`
--

INSERT INTO `concesionario` (`id`, `nombre`, `localizacion`) VALUES
(1, 'Coruña Automoción', 'La Coruña, Galicia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `puesto` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `salario` decimal(10,2) NOT NULL,
  `fecha_contrato` date NOT NULL,
  `idConcesionario` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idConcesionario` (`idConcesionario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `nombre`, `apellido`, `puesto`, `salario`, `fecha_contrato`, `idConcesionario`) VALUES
(1, 'Ignacio', 'Varela', 'Gerente', '0.00', '2022-05-19', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfiles`
--

DROP TABLE IF EXISTS `perfiles`;
CREATE TABLE IF NOT EXISTS `perfiles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `perfil` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `perfiles`
--

INSERT INTO `perfiles` (`id`, `perfil`) VALUES
(1, 'USUARIO'),
(2, 'ADMIN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarioperfil`
--

DROP TABLE IF EXISTS `usuarioperfil`;
CREATE TABLE IF NOT EXISTS `usuarioperfil` (
  `idUsuario` int NOT NULL,
  `idPerfil` int NOT NULL,
  PRIMARY KEY (`idUsuario`,`idPerfil`),
  KEY `idUsuario` (`idUsuario`,`idPerfil`),
  KEY `relacion_a_perfiles` (`idPerfil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `usuarioperfil`
--

INSERT INTO `usuarioperfil` (`idUsuario`, `idPerfil`) VALUES
(1, 2),
(5, 2),
(7, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `id_coche` int NOT NULL,
  `fecha_venta` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_coche` (`id_coche`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cohesconcesionario`
--
ALTER TABLE `cohesconcesionario`
  ADD CONSTRAINT `relacion_a_coches` FOREIGN KEY (`IdCoche`) REFERENCES `coches` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `relacion_a_concesionarios` FOREIGN KEY (`idConcesioario`) REFERENCES `concesionario` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `relacion_a_concesionario2` FOREIGN KEY (`idConcesionario`) REFERENCES `concesionario` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `usuarioperfil`
--
ALTER TABLE `usuarioperfil`
  ADD CONSTRAINT `relacion_a_perfiles` FOREIGN KEY (`idPerfil`) REFERENCES `perfiles` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `relacion_a_usuarios` FOREIGN KEY (`idUsuario`) REFERENCES `clientes` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`),
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`id_coche`) REFERENCES `coches` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
