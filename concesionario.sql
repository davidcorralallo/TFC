-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 08-06-2023 a las 20:46:47
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `email`, `usuario`, `password`, `estatus`, `fechaRegistro`) VALUES
(1, 'David', 'Corral', 'davidcorralallo@gmail.com', 'David123', '{noop}123', 1, '2023-05-19'),
(5, 'qwe', 'qwe', 'qwe@gmail.com', 'qwe', '$2a$10$TWUMA4fQFtzMM60YIS/ifeud7byeL9Gl8.nyDlUfZWDJlRUKrL90S', 1, '2023-05-26'),
(7, 'Esther', 'Gomez Mantiñan', 'esther@gmail.com', 'esther123', '$2a$10$.7qyzLUMPaQ1CvmaIz8FW.NYd7p5cSPPFLiZ1kg834FTI.6KZOS5q', 1, '2023-05-27'),
(8, 'prueba', 'prueba', 'prueba@gmail.com', 'prueba', '$2a$10$f/qJV9VzPsTmgmqBGzvI3.ECXARZVFP3WliVltLK8lNhcReve.cM6', 1, '2023-06-01'),
(9, 'John', 'Doe', 'john.doe1@gmail.com', 'johndoe1', '12345', 1, '2023-06-05'),
(10, 'Jane', 'Smith', 'jane.smith2@gmail.com', 'janesmith2', 'password', 1, '2023-06-05'),
(11, 'David', 'Johnson', 'david.johnson3@gmail.com', 'davidjohnson3', 'secure1', 1, '2023-06-05'),
(12, 'Emily', 'Wilson', 'emily.wilson4@gmail.com', 'emilywilson4', 'qwerty', 1, '2023-06-05'),
(13, 'Michael', 'Brown', 'michael.brown5@gmail.com', 'michaelbrown5', 'pass123', 1, '2023-06-05'),
(14, 'Sophia', 'Miller', 'sophia.miller6@gmail.com', 'sophiamiller6', 'hello123', 1, '2023-06-05'),
(15, 'William', 'Davis', 'william.davis7@gmail.com', 'williamdavis7', 'abc123', 1, '2023-06-05'),
(16, 'Olivia', 'Anderson', 'olivia.anderson8@gmail.com', 'oliviaanderson8', 'test456', 1, '2023-06-05'),
(17, 'James', 'Taylor', 'james.taylor9@gmail.com', 'jamestaylor9', 'password1', 1, '2023-06-05'),
(18, 'Isabella', 'Thomas', 'isabella.thomas10@gmail.com', 'isabellathomas10', 'securepass', 1, '2023-06-05'),
(19, 'Liam', 'Robinson', 'liam.robinson11@gmail.com', 'liamrobinson11', '123456', 1, '2023-06-05'),
(20, 'Ava', 'Clark', 'ava.clark12@gmail.com', 'avaclark12', 'mypassword', 1, '2023-06-05'),
(21, 'Benjamin', 'Lewis', 'benjamin.lewis13@gmail.com', 'benjaminlewis13', 'hello123', 1, '2023-06-05'),
(22, 'Maria', 'Gonzalez', 'maria.gonzalez@gmail.com', 'mariagonzalez', 'pass123', 1, '2017-11-09'),
(23, 'Carlos', 'Martinez', 'carlos.martinez@gmail.com', 'carlosmartinez', 'password123', 1, '2020-07-12'),
(24, 'Laura', 'Lopez', 'laura.lopez@gmail.com', 'lauralopez', 'qwerty456', 1, '2017-03-21'),
(25, 'Pedro', 'Ramirez', 'pedro.ramirez@gmail.com', 'pedroramirez', 'abc123xyz', 1, '2017-12-10'),
(26, 'Ana', 'Sanchez', 'ana.sanchez@gmail.com', 'anasanchez', 'pass456', 1, '2023-01-16'),
(27, 'Juan', 'Perez', 'juan.perez@gmail.com', 'juanperez', 'hello123', 1, '2021-02-14'),
(28, 'Sofia', 'Garcia', 'sofia.garcia@gmail.com', 'sofiagarcia', 'test1234', 1, '2021-06-25'),
(29, 'Luis', 'Lopez', 'luis.lopez@gmail.com', 'luislopez', 'abc123', 1, '2020-11-23'),
(30, 'Camila', 'Gomez', 'camila.gomez@gmail.com', 'camilagomez', 'p4ssw0rd', 1, '2022-12-01'),
(31, 'Gabriel', 'Rodriguez', 'gabriel.rodriguez@gmail.com', 'gabrielrodriguez', 'qwerty123', 1, '2020-01-17'),
(32, 'Valentina', 'Mendoza', 'valentina.mendoza@gmail.com', 'valentinamendoza', 'testpass', 1, '2016-06-20'),
(33, 'Sebastian', 'Silva', 'sebastian.silva@gmail.com', 'sebastiansilva', 'pass987', 1, '2015-08-22'),
(34, 'Pablo', 'Pablito', 'Pablito@gmail.com', 'Pablito123', '$2a$10$PTdpum.iAXsZmKNzURlnmOH6uBpymIHn5j1YjRKqZ9nrh/5Zxv62O', 1, '2023-06-08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coches`
--

DROP TABLE IF EXISTS `coches`;
CREATE TABLE IF NOT EXISTS `coches` (
  `id` int NOT NULL AUTO_INCREMENT,
  `marca` enum('Audi','AstonMartin','Bmw','Cupra','Dacia','Ferrari','Fiat','Ford','Honda','Hyundai','Jaguar','Jeep','Kia','Lamborghini','LandRover','Lexus','Maserati','Mazda','Mercedes','Mini','Nissan','Peugeot','Porsche','Renault','Seat','Tesla','Toyota','Volskwagen') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `modelo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `potencia` int NOT NULL,
  `motor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `propulsion` enum('Atmosférico','Turbo','DobleTurbo') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `cambio` enum('Manual','Automático') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `traccion` enum('Delantera','Trasera','Integral') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `combustible` enum('Gasolina','Diésel','Eléctrico') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `consumoCiudad` decimal(3,1) NOT NULL,
  `consumoAutopista` decimal(3,1) NOT NULL,
  `plazas` int NOT NULL,
  `precio` int NOT NULL,
  `img` varchar(155) COLLATE utf8mb4_unicode_ci NOT NULL,
  `destacado` tinyint DEFAULT NULL,
  `imgDestacado` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `coches`
--

INSERT INTO `coches` (`id`, `marca`, `modelo`, `potencia`, `motor`, `propulsion`, `cambio`, `traccion`, `combustible`, `consumoCiudad`, `consumoAutopista`, `plazas`, `precio`, `img`, `destacado`, `imgDestacado`) VALUES
(1, 'Audi', 'TT RS', 400, '5 en línea', 'Turbo', 'Automático', 'Integral', 'Gasolina', '13.5', '8.0', 4, 92010, 'https://soymotor.com/sites/default/files/usuarios/redaccion/portal/jmorillo/audi_tt_rs_coupe_iconic_edition_4.jpg', 0, ''),
(4, 'Ferrari', '488 GTB', 660, '3.9L V8', 'Turbo', 'Automático', 'Trasera', 'Gasolina', '15.3', '8.3', 2, 250000, 'https://soymotor.com/sites/default/files/imagenes/noticia/ferrari_488_gtb_9.jpeg', 0, ''),
(5, 'Lamborghini', 'Aventador SVJ', 770, '6.5L V12', 'Atmosférico', 'Automático', 'Integral', 'Gasolina', '17.2', '9.8', 2, 450000, 'https://d1gl66oyi6i593.cloudfront.net/wp-content/uploads/2020/12/Lamborghini-Aventador-SVJ-Benjamin-Mendy.jpg', 0, ''),
(6, 'Porsche', '911 Turbo S', 650, '3.8L Flat-6', 'Turbo', 'Automático', 'Integral', 'Gasolina', '14.9', '8.9', 4, 180000, 'https://img.remediosdigitales.com/b563d2/porsche-911-turbo-s-2021_3/1366_2000.jpg', 1, 'https://files.porsche.com/filestore/image/multimedia/none/911-tus-modelimage-sideshot/model/930894f1-6214-11ea-80c8-005056bbdc38/porsche-model.png'),
(7, 'Mercedes', 'AMG GT', 585, '4.0L V8', 'Turbo', 'Automático', 'Trasera', 'Gasolina', '13.1', '9.2', 2, 150000, 'https://d1gl66oyi6i593.cloudfront.net/wp-content/uploads/2020/07/Mercedes-AMG-GT-Black-Series-1.jpg', 0, ' '),
(8, 'AstonMartin', 'DB11 AMR', 630, '5.2L V12', 'Turbo', 'Automático', 'Trasera', 'Gasolina', '15.2', '9.8', 4, 220000, 'https://media.evo.co.uk/image/private/s--CCUZKl8S--/v1590763814/evo/2020/05/2020%20Aston%20Martin%20DB11%20AMR%20review-9.jpg', 0, ''),
(9, 'Ford', 'Focus', 125, '1.6L', 'Atmosférico', 'Manual', 'Delantera', 'Gasolina', '8.5', '5.9', 5, 20000, 'https://cdn.topgear.es/sites/navi.axelspringer.es/public/media/image/2020/06/ford-focus-mild-hybrid-1972549.jpg', 0, ''),
(10, 'Volskwagen', 'Golf', 150, '2.0L', 'Turbo', 'Automático', 'Delantera', 'Gasolina', '9.2', '6.5', 5, 25000, 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/volkswagen-golf-gti-clubsport-s-3-door-4-1608297130.jpeg', 0, ''),
(11, 'Bmw', 'X5', 300, '3.0L', 'DobleTurbo', 'Automático', 'Integral', 'Diésel', '11.5', '8.2', 7, 50000, 'https://e00-marca.uecdn.es/assets/multimedia/imagenes/2023/02/08/16758541680297.jpg', 0, ''),
(12, 'Tesla', 'Model S', 700, 'Eléctrico', 'Turbo', 'Automático', 'Trasera', 'Eléctrico', '0.0', '0.0', 5, 80000, 'https://allelectrik.es/wp-content/uploads/2022/11/IMG_9324.jpg', 0, ''),
(13, 'Audi', 'A4', 190, '2.0L', 'Turbo', 'Automático', 'Delantera', 'Diésel', '7.8', '5.4', 5, 35000, 'https://cdn.topgear.es/sites/navi.axelspringer.es/public/media/image/2019/05/audi-a4-2019.jpeg', 0, ''),
(14, 'Toyota', 'Corolla', 130, '1.8L', 'Atmosférico', 'Manual', 'Delantera', 'Gasolina', '7.2', '5.5', 5, 22000, 'https://i.blogs.es/d7ac2a/toyota-corolla_hatchback_eu-version-2019-1600-06/1366_2000.jpg', 0, ''),
(16, 'Renault', 'Clio', 100, '1.5L', 'Turbo', 'Manual', 'Delantera', 'Diésel', '5.0', '3.8', 5, 15000, 'https://img.remediosdigitales.com/a19f78/renault-clio-e-tech-2020-prueba-/1366_2000.jpg', 0, ''),
(17, 'Hyundai', 'Tucson', 185, '2.4L', 'Atmosférico', 'Automático', 'Integral', 'Gasolina', '10.5', '7.9', 5, 30000, 'https://static.motor.es/fotos-jato/hyundai/uploads/hyundai-tucson-610292db05960.jpg', 0, ''),
(18, 'Kia', 'Sportage', 177, '1.6L', 'Turbo', 'Automático', 'Delantera', 'Gasolina', '8.7', '6.2', 5, 28000, 'https://www.caetanomovilsur.es/wp-content/uploads/2020/11/h-25-73-304-9805-1554138088-1.jpg', 0, ''),
(19, 'Audi', 'A6', 250, '3.0L', 'Turbo', 'Automático', 'Integral', 'Gasolina', '10.2', '7.5', 5, 89000, 'https://upload.wikimedia.org/wikipedia/commons/d/df/Audi_A6_2018_%2844686504882%29_%28cropped%29.jpg', 0, ''),
(20, 'Bmw', '3 Series', 190, '2.0L', 'Turbo', 'Automático', 'Trasera', 'Gasolina', '9.6', '6.8', 5, 85000, 'https://www.bmw.es/content/dam/bmw/common/all-models/3-series/sedan/2022/highlights/bmw-3-series-sedan-sp-desktop.jpg', 0, ''),
(21, 'Mercedes', 'E-Class', 270, '2.0L', 'Turbo', 'Automático', 'Trasera', 'Diésel', '11.8', '8.5', 5, 110000, 'https://upload.wikimedia.org/wikipedia/commons/9/9b/Mercedes-Benz_W213_E_350_4_matic_AMG_Line_white_%28cropped%29.jpg', 0, ''),
(22, 'Porsche', '911', 450, '3.0L', 'Turbo', 'Automático', 'Trasera', 'Gasolina', '13.2', '9.6', 2, 130000, 'https://www.autofacil.es/wp-content/uploads/2023/03/Porsche-911-Turbo-S-facelift-3.jpg', 0, ''),
(23, 'Jaguar', 'F-Type', 380, '3.0L', 'Turbo', 'Automático', 'Trasera', 'Gasolina', '12.5', '9.2', 2, 98000, 'https://cdn.drivek.com/configurator-imgs/cars/es/original/JAGUAR/F-TYPE/39053_COUPE-3-PUERTAS/jaguar-f-type-coupe-2019-front-side-1.jpg', 0, ''),
(25, 'Porsche', '911 GT3', 510, '4,0 L 6-Bóxer', 'Atmosférico', 'Automático', 'Trasera', 'Gasolina', '13.0', '12.0', 4, 182712, 'https://img.remediosdigitales.com/c1fc0c/porsche-911_gt3-2018-2/1366_2000.jpg', 1, 'https://files.porsche.com/filestore/image/multimedia/none/992-gt3-rs-modelimage-sideshot/model/cfbb8ed3-1a15-11ed-80f5-005056bbdc38/porsche-model.png'),
(28, 'Ferrari', 'La Ferrari', 960, '6.3 V12', 'Atmosférico', 'Automático', 'Integral', 'Gasolina', '13.0', '12.9', 2, 225000, 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/laferrari-aperta-subasta-record-bring-a-trailer-1652178118.jpg', 1, 'https://www.pngmart.com/files/15/Side-View-Red-Ferrari-PNG-Clipart.png\r\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cochesconcesionario`
--

DROP TABLE IF EXISTS `cochesconcesionario`;
CREATE TABLE IF NOT EXISTS `cochesconcesionario` (
  `IdCoche` int NOT NULL,
  `idConcesionario` int NOT NULL,
  PRIMARY KEY (`IdCoche`,`idConcesionario`),
  KEY `IdCoche` (`IdCoche`,`idConcesionario`),
  KEY `relacion_a_concesionarios` (`idConcesionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `cochesconcesionario`
--

INSERT INTO `cochesconcesionario` (`IdCoche`, `idConcesionario`) VALUES
(1, 1),
(4, 1),
(6, 1),
(8, 1),
(10, 1),
(12, 1),
(14, 1),
(16, 1),
(18, 1),
(20, 1),
(22, 1),
(5, 2),
(7, 2),
(9, 2),
(11, 2),
(13, 2),
(17, 2),
(19, 2),
(21, 2),
(23, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
CREATE TABLE IF NOT EXISTS `comentarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `autor` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `comentario` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idCoche` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idCoche` (`idCoche`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`id`, `autor`, `comentario`, `idCoche`) VALUES
(1, 'Prueba', 'Muy bueno!', 6),
(2, 'Prueba 2', 'Un gran vehículo.', 1),
(3, 'Prueba 3', 'Buena compra.', 1),
(5, 'Juan Pérez', 'Me encanta la potencia y el diseño de este vehículo. Es realmente impresionante.', 1),
(6, 'María Gómez', 'El automóvil tiene un aspecto elegante y deportivo. Su rendimiento en carretera es excepcional.', 1),
(7, 'Pedro Rodríguez', 'El coche es muy cómodo y espacioso. Ideal para viajes largos con la familia.', 1),
(8, 'Laura Torres', 'Me gusta mucho la tecnología incorporada en este vehículo. Tiene características innovadoras.', 1),
(9, 'Carlos Fernández', 'La calidad de construcción de este coche es excepcional. Se nota la atención al detalle.', 1),
(10, 'Ana López', 'Me parece increíble el rendimiento y la versatilidad de este coche. Es perfecto para cualquier tipo de aventura.', 4),
(11, 'Javier Martínez', 'La comodidad y el espacio interior de este vehículo son impresionantes. Realmente me sorprendió.', 4),
(12, 'María Rodríguez', 'El diseño aerodinámico de este coche le da un aspecto elegante y moderno. Es un verdadero placer conducirlo.', 4),
(13, 'Luisa García', 'La seguridad es una de las principales características de este coche. Me siento protegida en todo momento.', 4),
(14, 'Pedro Sánchez', 'La tecnología incorporada en este vehículo es impresionante. Me encanta cómo se integra con mi estilo de vida.', 4),
(15, 'Miguel Torres', 'Este coche de la marca XYZ es una verdadera joya. Su potencia y diseño son impresionantes.', 5),
(16, 'Elena Sánchez', 'Me encanta la comodidad y elegancia de este vehículo. Es perfecto para viajes largos.', 5),
(17, 'Andrés Gómez', 'El coche cuenta con un sistema de sonido envolvente de alta calidad. ¡Me encanta escuchar música en él!', 5),
(18, 'Carolina Martínez', 'La tecnología avanzada de este coche facilita mucho la conducción. Es realmente innovador.', 5),
(19, 'Luis García', 'Este coche tiene un gran espacio de carga. Es ideal para transportar todo lo necesario.', 5),
(20, 'Laura Rodríguez', 'El diseño deportivo de este coche es espectacular. Causa sensación donde quiera que vaya.', 6),
(21, 'Pedro Sánchez', 'La potencia de este vehículo es alucinante. Se siente como si estuvieras en un circuito de carreras.', 6),
(22, 'Ana López', 'La comodidad de los asientos y el acabado interior de este coche son de primera clase.', 6),
(23, 'Javier Martínez', 'La tecnología de asistencia al conductor de este vehículo hace que cada viaje sea más seguro y relajante.', 6),
(24, 'María Gómez', 'Este coche tiene un rendimiento excepcional en todo tipo de terrenos. Es perfecto para aventuras todoterreno.', 6),
(25, 'Gabriel Fernández', 'Este coche tiene un diseño moderno y elegante. Me encanta la atención al detalle en cada aspecto.', 7),
(26, 'Valeria López', 'La potencia del motor de este vehículo es impresionante. Se siente como un verdadero corredor.', 7),
(27, 'Sergio Ramírez', 'Los acabados interiores de este coche son de primera calidad. Se nota el lujo en cada detalle.', 7),
(28, 'Mónica Torres', 'El sistema de entretenimiento y navegación de este vehículo es intuitivo y fácil de usar.', 7),
(29, 'Fernando González', 'Este coche tiene un excelente rendimiento en carretera. Me encanta la sensación de control que ofrece.', 7),
(30, 'Isabel Morales', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 8),
(31, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 8),
(32, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 8),
(33, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 8),
(34, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 8),
(35, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 9),
(36, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 9),
(37, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 9),
(38, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 9),
(39, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 9),
(40, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 10),
(41, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 10),
(42, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 10),
(43, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 10),
(44, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 10),
(45, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 10),
(46, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 10),
(47, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 11),
(48, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 11),
(49, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 11),
(50, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 11),
(51, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 11),
(52, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 12),
(53, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 12),
(54, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 12),
(55, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 12),
(56, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 12),
(57, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 12),
(58, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 12),
(59, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 13),
(60, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 13),
(61, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 13),
(62, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 13),
(63, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 13),
(64, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 14),
(65, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 14),
(66, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 14),
(67, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 14),
(68, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 14),
(69, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 14),
(70, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 14),
(76, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 16),
(77, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 16),
(78, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 16),
(79, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 16),
(80, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 16),
(81, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 16),
(82, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 16),
(83, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 17),
(84, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 17),
(85, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 17),
(86, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 17),
(87, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 17),
(88, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 18),
(89, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 18),
(90, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 18),
(91, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 18),
(92, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 18),
(93, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 18),
(94, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 18),
(95, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 19),
(96, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 19),
(97, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 19),
(98, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 19),
(99, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 19),
(100, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 20),
(101, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 20),
(102, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 20),
(103, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 20),
(104, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 20),
(105, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 20),
(106, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 20),
(107, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 21),
(108, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 21),
(109, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 21),
(110, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 21),
(111, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 21),
(112, 'María López', 'El diseño aerodinámico de este coche no solo es atractivo, sino que también mejora su rendimiento.', 22),
(113, 'Sergio Torres', 'Este vehículo cuenta con una gran capacidad de carga. Es perfecto para transportar todo lo que necesito.', 22),
(114, 'Gabriel Fernández', 'Este coche es una verdadera joya de la ingeniería. Cada detalle ha sido cuidadosamente diseñado.', 25),
(115, 'Luis García', 'El rendimiento en carretera de este vehículo es excepcional. Nunca había experimentado algo igual.', 25),
(116, 'Laura Rodríguez', 'La calidad de construcción de este coche es impresionante. Se nota la atención al detalle en cada aspecto.', 25),
(117, 'Juan Pérez', 'La tecnología incorporada en este vehículo es sorprendente. Me facilita la vida en cada viaje.', 25),
(118, 'María Gómez', 'El diseño exterior de este coche es elegante y llamativo. Es imposible pasar desapercibido.', 25),
(119, 'Javier Martínez', 'Este coche tiene una suspensión suave que proporciona una conducción cómoda en todo momento.', 28),
(120, 'Carolina Torres', 'El espacio interior de este vehículo es amplio y cómodo. Es ideal para viajes largos en familia.', 28),
(121, 'Pedro Sánchez', 'La seguridad es una prioridad en este coche. Me siento protegido en todo momento.', 28),
(122, 'Laura Ramírez', 'La conectividad del sistema de entretenimiento de este vehículo es impresionante. Nunca me aburro en mis viajes.', 28),
(123, 'Andrés Gómez', 'Este coche ofrece un equilibrio perfecto entre rendimiento y eficiencia. Es un placer conducirlo.', 28),
(135, 'Esther Gomez', 'Un gran coche', 1),
(136, '', 'Increíble auto deportivo', 4);

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `concesionario`
--

INSERT INTO `concesionario` (`id`, `nombre`, `localizacion`) VALUES
(1, 'Coruña Automoción', 'La Coruña, Galicia'),
(2, 'GT Autos', 'Madrid');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `puesto` enum('Gerente','Vendedor','Mecánico','Recepcionista','Contador','Administrativo') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `salario` decimal(10,2) NOT NULL,
  `fecha_contrato` date NOT NULL,
  `idConcesionario` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idConcesionario` (`idConcesionario`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `nombre`, `apellido`, `puesto`, `salario`, `fecha_contrato`, `idConcesionario`) VALUES
(1, 'Ignacio', 'Varela', 'Gerente', '0.00', '2022-05-19', 1),
(2, 'Pepe', 'Dominguez', 'Vendedor', '1000.00', '2023-06-04', 2),
(3, 'Juan', 'Perez', 'Gerente', '5000.00', '2021-12-04', 2),
(4, 'Ana', 'Lopez', 'Vendedor', '2500.00', '2021-04-28', 1),
(5, 'Pedro', 'Gomez', 'Mecánico', '3000.00', '2017-05-30', 1),
(6, 'Laura', 'Torres', 'Recepcionista', '2000.00', '2015-08-23', 2),
(7, 'Carlos', 'Sanchez', 'Contador', '3500.00', '2018-07-17', 2),
(8, 'María', 'Rodriguez', 'Administrativo', '2200.00', '2022-05-09', 1),
(9, 'Luis', 'Martinez', 'Vendedor', '2400.00', '2016-09-19', 1),
(10, 'Sofia', 'Hernandez', 'Mecánico', '2800.00', '2017-02-04', 2),
(11, 'Julia', 'González', 'Gerente', '5000.00', '2019-02-02', 2),
(12, 'Mario', 'Ramírez', 'Vendedor', '2500.00', '2017-04-07', 2),
(13, 'Gabriela', 'Ortega', 'Mecánico', '3000.00', '2021-08-15', 1);

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
(7, 1),
(9, 1),
(10, 1),
(11, 1),
(12, 1),
(13, 1),
(14, 1),
(15, 1),
(16, 1),
(17, 1),
(18, 1),
(19, 1),
(20, 1),
(21, 1),
(22, 1),
(23, 1),
(24, 1),
(25, 1),
(26, 1),
(27, 1),
(28, 1),
(29, 1),
(1, 2),
(5, 2),
(8, 2),
(34, 2);

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
-- Filtros para la tabla `cochesconcesionario`
--
ALTER TABLE `cochesconcesionario`
  ADD CONSTRAINT `relacion_a_coches` FOREIGN KEY (`IdCoche`) REFERENCES `coches` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `relacion_a_concesionarios` FOREIGN KEY (`idConcesionario`) REFERENCES `concesionario` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Filtros para la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD CONSTRAINT `Comentarios_a_coches` FOREIGN KEY (`idCoche`) REFERENCES `coches` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
