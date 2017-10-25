-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-10-2017 a las 03:06:47
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.0.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `papeleriafarfarela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `ART_ID` int(11) NOT NULL,
  `PRO_ID` int(11) NOT NULL,
  `FAM_ID` int(11) DEFAULT NULL,
  `ART_NOMBRE` varchar(100) NOT NULL,
  `ART_DESCRIPCION` varchar(200) NOT NULL,
  `ART_PRECIO` float NOT NULL,
  `ART_STOCK` int(11) NOT NULL COMMENT 'numero de stock disponible'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Articulos a la venta que contiene la papeleria.';

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`ART_ID`, `PRO_ID`, `FAM_ID`, `ART_NOMBRE`, `ART_DESCRIPCION`, `ART_PRECIO`, `ART_STOCK`) VALUES
(1, 1, 3, 'Cuaderno', 'cuadros, 100 hojas, grande', 1.5, 100),
(3, 1, 3, 'Lapiz HB', '', 0.35, 100),
(4, 2, 4, 'reglas', 'terinta centimetros', 0.35, 50),
(5, 1, 4, 'cuaderno norma', 'espiral', 2, 15),
(6, 2, 4, 'cuadernos estilo', 'universitario', 1.35, 25),
(7, 2, 4, 'cuadernos escribe', 'cocidos', 1.35, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `CLI_IDENTIFICADOR` varchar(20) NOT NULL COMMENT 'CI, RUC, PASAPORTE, ETC',
  `CLI_NOMBRES` varchar(20) NOT NULL,
  `CLI_APELIDOS` varchar(20) NOT NULL,
  `CLI_DIRECCION` varchar(100) DEFAULT NULL,
  `CLI_TELEFONO` varchar(20) DEFAULT NULL,
  `CLI_FECHANACIMIENTO` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Clientes que compran en la papeleria';

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`CLI_IDENTIFICADOR`, `CLI_NOMBRES`, `CLI_APELIDOS`, `CLI_DIRECCION`, `CLI_TELEFONO`, `CLI_FECHANACIMIENTO`) VALUES
('136576', 'JHGJHJ', 'GJHGJK', NULL, NULL, NULL),
('1710695865', 'merc edes ana', 'gonzales', 'mena dos', '0979212531', '2017-08-09'),
('1719196774', 'daniel alexander ', 'ortega sarabia', 'quito norte', '0979192918', '1989-07-10'),
('1754346759', 'Carlos', 'Zambrano', NULL, NULL, NULL),
('43423', 'FDSF', 'FDSFDS', NULL, NULL, NULL),
('534543', 'FFSDFS', 'FDSFSD', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `CUE_CUENTA` varchar(100) NOT NULL,
  `EMP_ID` int(11) NOT NULL,
  `CUE_PASS` varchar(100) NOT NULL,
  `CUE_NIVEL` int(11) NOT NULL COMMENT 'Nivel o ROL que cumple esta cuenta para limitar accesos al sistema.',
  `CUE_HABILITADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Cuentas de usuarios que tienen la empresa para proporcionar ';

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`CUE_CUENTA`, `EMP_ID`, `CUE_PASS`, `CUE_NIVEL`, `CUE_HABILITADO`) VALUES
('1', 1, '1', 1, 1),
('2', 2, '2', 2, 1),
('3', 3, '3', 3, 1),
('armart', 1, '123', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `FAC_ID` int(11) NOT NULL,
  `ART_ID` int(11) NOT NULL,
  `DET_CANTIDAD` int(11) NOT NULL,
  `DET_VALOR` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`FAC_ID`, `ART_ID`, `DET_CANTIDAD`, `DET_VALOR`) VALUES
(51, 1, 2, 3),
(52, 1, 1, 1.5),
(31, 3, 4, 1.4),
(53, 3, 1, 0.35),
(54, 4, 2, 0.7),
(55, 5, 2, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `EMP_ID` int(11) NOT NULL,
  `EMP_IDENTIFICADOR` varchar(20) NOT NULL COMMENT 'CI, RUC, PASAPORTE, ETC',
  `EMP_NOMBRES` varchar(40) NOT NULL,
  `EMP_APELLIDOS` varchar(40) NOT NULL,
  `EMP_DIRECCION` varchar(200) NOT NULL,
  `EMP_TELEFONO` varchar(20) NOT NULL,
  `EMP_CARGO` varchar(50) NOT NULL,
  `EMP_OBSERVACION` varchar(500) DEFAULT NULL,
  `EMP_FECHANACIMIENTO` date NOT NULL,
  `EMP_FECHAINGRESO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Empleados que pertenecen a la empresa';

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`EMP_ID`, `EMP_IDENTIFICADOR`, `EMP_NOMBRES`, `EMP_APELLIDOS`, `EMP_DIRECCION`, `EMP_TELEFONO`, `EMP_CARGO`, `EMP_OBSERVACION`, `EMP_FECHANACIMIENTO`, `EMP_FECHAINGRESO`) VALUES
(1, '1234325467', 'Armando', 'Martinez', 'San Rafael', '0987646313', 'Vendedor', '', '1975-01-22', '2010-01-29'),
(2, '1187892764', 'Pablo', 'Carrion', 'Sangolqui', '0908892882', 'V', NULL, '1980-03-07', '2015-05-30'),
(3, '0998722918', 'Ernesto', 'Salgado', 'Fajardo', '0990111728', 'V', NULL, '1990-04-12', '2015-09-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `FAC_ID` int(11) NOT NULL,
  `CLI_IDENTIFICADOR` varchar(20) NOT NULL COMMENT 'CI, RUC, PASAPORTE, ETC',
  `CUE_CUENTA` varchar(100) NOT NULL,
  `FAC_FECHA` date NOT NULL,
  `FAC_DESCUENTO` float NOT NULL,
  `FAC_ESTADO` tinyint(1) NOT NULL COMMENT 'Estado de la factura: TRUE(ANULADA), FALSE (VIGENTE)',
  `FAC_TOTAL` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Notas de venta que otorga la papeleria al vender.';

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`FAC_ID`, `CLI_IDENTIFICADOR`, `CUE_CUENTA`, `FAC_FECHA`, `FAC_DESCUENTO`, `FAC_ESTADO`, `FAC_TOTAL`) VALUES
(31, '1754346759', '2', '2017-03-02', 40, 0, 5.06),
(32, '1754346759', '1', '2017-03-02', 0.11, 0, 1.07),
(33, '1754346759', '1', '2017-03-02', 0.01, 0, 1.58),
(34, '1754346759', '1', '2017-03-02', 0, 0, 0.4),
(35, '1754346759', '1', '2017-03-02', 0, 0, 0.8),
(36, '136576', '1', '2017-03-02', 0.32, 0, 6.87),
(37, '43423', '1', '2017-03-02', 0, 0, 1.71),
(38, '136576', '1', '2017-03-02', 0, 0, 0.4),
(39, '534543', '1', '2017-03-02', 0, 0, 0.4),
(40, '534543', '1', '2017-03-02', 0, 0, 0.4),
(41, '136576', '1', '2017-03-02', 0, 0, 1.72),
(42, '1754346759', '1', '2017-03-02', 0, 0, 0.8),
(43, '1754346759', 'armart', '2017-03-02', 0.42, 0, 3.57),
(44, '534543', 'armart', '2017-03-02', 2, 0, 0.39),
(45, '1754346759', 'armart', '2017-03-02', 0, 0, 2),
(46, '1754346759', 'ARMART', '2017-03-03', 0, 0, 7.24),
(47, '1754346759', '1', '2017-03-03', 0, 0, 3.42),
(48, '1754346759', '1', '2017-03-03', 0, 0, 0.4),
(49, '1754346759', '1', '2017-03-03', 0, 0, 0.8),
(50, '1754346759', '1', '2017-03-03', 0, 0, 6.84),
(51, '136576', '1', '2017-03-03', 0, 0, 3.42),
(52, '136576', '1', '2017-03-03', 0, 0, 1.71),
(53, '1754346759', '1', '2017-03-03', 0, 0, 0.4),
(54, '1719196774', '1', '2017-08-09', 0, 0, 2),
(55, '1710695865', '1', '2017-08-09', 0, 0, 4.56);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `familiasarticulos`
--

CREATE TABLE `familiasarticulos` (
  `FAM_ID` int(11) NOT NULL,
  `IVA_ID` int(11) NOT NULL,
  `FAM_NOMBRE` varchar(100) NOT NULL,
  `FAM_DETALLE` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `familiasarticulos`
--

INSERT INTO `familiasarticulos` (`FAM_ID`, `IVA_ID`, `FAM_NOMBRE`, `FAM_DETALLE`) VALUES
(1, 1, 'Exento', 'No paga IVA'),
(3, 3, 'IVA 14', 'Productos que pagan 14% de IVA'),
(4, 4, 'general', 'productos generales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `iva`
--

CREATE TABLE `iva` (
  `IVA_ID` int(11) NOT NULL,
  `IVA_VALOR` int(11) NOT NULL COMMENT 'Valor del iva, ejm: 12 que pertenece al 12% o 14 que pertenece al 14%',
  `IVA_FECHAINICIO` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `iva`
--

INSERT INTO `iva` (`IVA_ID`, `IVA_VALOR`, `IVA_FECHAINICIO`) VALUES
(1, 0, '2017-01-16'),
(2, 12, '2017-01-01'),
(3, 14, '2017-02-01'),
(4, 14, '2017-08-02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `PRO_ID` int(11) NOT NULL,
  `PRO_IDENTIFICADOR` varchar(20) NOT NULL COMMENT 'CI, RUC, PASAPORTE, ETC',
  `PRO_RAZONSOCIAL` varchar(100) NOT NULL COMMENT 'Nombre del proveedor',
  `PRO_TELEFONO` varchar(20) NOT NULL,
  `PRO_CONTACTO` varchar(100) DEFAULT NULL COMMENT 'Nombre de la persona que estara representando al proveedor',
  `PRO_TELEFONOCONTACTO` varchar(20) DEFAULT NULL COMMENT 'telefono del contacto',
  `PRO_DIRECCION` varchar(200) NOT NULL COMMENT 'Direccion del proveedor.'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Proveedores de Articulos para la papeleria';

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`PRO_ID`, `PRO_IDENTIFICADOR`, `PRO_RAZONSOCIAL`, `PRO_TELEFONO`, `PRO_CONTACTO`, `PRO_TELEFONOCONTACTO`, `PRO_DIRECCION`) VALUES
(1, '1254365786001', 'Onerom', '0954567767', NULL, NULL, 'Carcelen'),
(2, '1710099712', 'zurigrap', '0992022761', '', '0992022761', 'guamani');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`ART_ID`),
  ADD KEY `FK_PERTENECE` (`FAM_ID`),
  ADD KEY `FK_PROPORCIONA` (`PRO_ID`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`CLI_IDENTIFICADOR`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`CUE_CUENTA`),
  ADD KEY `FK_TIENE` (`EMP_ID`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`ART_ID`,`FAC_ID`),
  ADD KEY `FK_DETALLE` (`FAC_ID`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`EMP_ID`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`FAC_ID`),
  ADD KEY `FK_FACTURA` (`CUE_CUENTA`),
  ADD KEY `FK_OBTIENE` (`CLI_IDENTIFICADOR`);

--
-- Indices de la tabla `familiasarticulos`
--
ALTER TABLE `familiasarticulos`
  ADD PRIMARY KEY (`FAM_ID`),
  ADD KEY `FK_CONTIENE` (`IVA_ID`);

--
-- Indices de la tabla `iva`
--
ALTER TABLE `iva`
  ADD PRIMARY KEY (`IVA_ID`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`PRO_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `ART_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `detalle`
--
ALTER TABLE `detalle`
  MODIFY `ART_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `EMP_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `FAC_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;
--
-- AUTO_INCREMENT de la tabla `familiasarticulos`
--
ALTER TABLE `familiasarticulos`
  MODIFY `FAM_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `iva`
--
ALTER TABLE `iva`
  MODIFY `IVA_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `PRO_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD CONSTRAINT `FK_PERTENECE` FOREIGN KEY (`FAM_ID`) REFERENCES `familiasarticulos` (`FAM_ID`),
  ADD CONSTRAINT `FK_PROPORCIONA` FOREIGN KEY (`PRO_ID`) REFERENCES `proveedor` (`PRO_ID`);

--
-- Filtros para la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD CONSTRAINT `FK_TIENE` FOREIGN KEY (`EMP_ID`) REFERENCES `empleado` (`EMP_ID`);

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `FK_DETALLE` FOREIGN KEY (`FAC_ID`) REFERENCES `facturas` (`FAC_ID`),
  ADD CONSTRAINT `FK_DETALLE2` FOREIGN KEY (`ART_ID`) REFERENCES `articulos` (`ART_ID`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `FK_FACTURA` FOREIGN KEY (`CUE_CUENTA`) REFERENCES `cuenta` (`CUE_CUENTA`),
  ADD CONSTRAINT `FK_OBTIENE` FOREIGN KEY (`CLI_IDENTIFICADOR`) REFERENCES `cliente` (`CLI_IDENTIFICADOR`);

--
-- Filtros para la tabla `familiasarticulos`
--
ALTER TABLE `familiasarticulos`
  ADD CONSTRAINT `FK_CONTIENE` FOREIGN KEY (`IVA_ID`) REFERENCES `iva` (`IVA_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
