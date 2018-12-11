-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2018 a las 22:41:21
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `adm_de_actividades`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad`
--

CREATE TABLE `actividad` (
  `idactividad` smallint(6) NOT NULL,
  `nombe` varchar(45) DEFAULT NULL,
  `objetivo_general` mediumtext,
  `competencia` text,
  `temario` text,
  `autorizada` char(1) DEFAULT NULL,
  `no_creditos` int(11) DEFAULT NULL,
  `usuario_idusuario` int(11) NOT NULL,
  `periodo_idperiodo` int(11) NOT NULL,
  `organigrama_idorganigrama` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `numero_control` bigint(20) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellidop` varchar(30) DEFAULT NULL,
  `apellidom` varchar(30) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefono` bigint(20) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `calle` varchar(50) DEFAULT NULL,
  `numero_ext` varchar(10) DEFAULT NULL,
  `numero_int` varchar(10) DEFAULT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `estatus` char(1) DEFAULT NULL,
  `semestre` int(11) NOT NULL,
  `localidades_idlocalidades` int(11) NOT NULL,
  `rol_idrol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE `area` (
  `idarea` int(11) NOT NULL,
  `nombre_area` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`idarea`, `nombre_area`) VALUES
(0, 'gvgv'),
(4, 'alan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `idcarrera` int(11) NOT NULL,
  `carrera` varchar(70) DEFAULT NULL,
  `reticula` char(2) DEFAULT NULL,
  `nivel_escolar` varchar(45) DEFAULT NULL,
  `clave_oficial` varchar(15) DEFAULT NULL,
  `nombre_carrera` varchar(45) DEFAULT NULL,
  `nombre_reducido` varchar(45) DEFAULT NULL,
  `carga_maxima` smallint(6) DEFAULT NULL,
  `creditos_totales` smallint(6) DEFAULT NULL,
  `nivel` varchar(25) DEFAULT NULL,
  `modalidad` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cordinador`
--

CREATE TABLE `cordinador` (
  `rol_idrol` int(11) NOT NULL,
  `carrera_idcarrera` int(11) NOT NULL,
  `usuario_idusuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `idestado` int(11) NOT NULL,
  `nombre_estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `idgrupo` int(11) NOT NULL,
  `nombre_grupo` varchar(45) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `hora_inicial` time(4) NOT NULL,
  `hora_final` time(4) NOT NULL,
  `instructor_idinstructor` smallint(6) NOT NULL,
  `area_idarea` int(11) NOT NULL,
  `actividad_idactividad` smallint(6) NOT NULL,
  `periodo_idperiodo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `calificacion` bigint(4) NOT NULL,
  `carrera_idcarrera` int(11) NOT NULL,
  `instructor_idinstructor` smallint(6) NOT NULL,
  `alumos_numero_control` bigint(20) NOT NULL,
  `grupo_idgrupo` int(11) NOT NULL,
  `actividad_idactividad` smallint(6) NOT NULL,
  `area_idarea` int(11) NOT NULL,
  `periodo_idperiodo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instructor`
--

CREATE TABLE `instructor` (
  `idinstructor` smallint(6) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellidop` varchar(30) DEFAULT NULL,
  `apellidom` varchar(30) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `rfc` varchar(12) NOT NULL,
  `formacion` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidades`
--

CREATE TABLE `localidades` (
  `idlocalidades` int(11) NOT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `municipio_idmunicipio` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipio`
--

CREATE TABLE `municipio` (
  `idmunicipio` smallint(6) NOT NULL,
  `nombre_municipio` varchar(45) NOT NULL,
  `estado_idestado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `organigrama`
--

CREATE TABLE `organigrama` (
  `idorganigrama` int(11) NOT NULL,
  `area` text NOT NULL,
  `descripcion` int(11) NOT NULL,
  `area_depende` int(11) NOT NULL,
  `nivel` int(11) NOT NULL,
  `tipo_area` int(11) NOT NULL,
  `titular` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodo`
--

CREATE TABLE `periodo` (
  `idperiodo` int(11) NOT NULL,
  `nombre_corto` varchar(15) NOT NULL,
  `nombre_largo` varchar(45) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `estatus` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

CREATE TABLE `puesto` (
  `idpuesto` int(11) NOT NULL,
  `descripcion` text NOT NULL,
  `nivel` int(11) NOT NULL,
  `tipo` char(1) NOT NULL,
  `funciones` tinytext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `puesto`
--

INSERT INTO `puesto` (`idpuesto`, `descripcion`, `nivel`, `tipo`, `funciones`) VALUES
(1, 'solos', 2, '1', 'fadas'),
(2, 'so', 3, '4', 'fas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idrol` int(11) NOT NULL,
  `nombre_rol` varchar(50) NOT NULL,
  `descripcion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`idrol`, `nombre_rol`, `descripcion`) VALUES
(1, 'boli', 'kbkbj'),
(2, 'futb', 'jugan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidop` varchar(30) NOT NULL,
  `apellidom` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `estatus` varchar(45) DEFAULT NULL,
  `rol_idrol` int(11) NOT NULL,
  `organigrama_idorganigrama` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad`
--
ALTER TABLE `actividad`
  ADD PRIMARY KEY (`idactividad`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`numero_control`);

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`idarea`);

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`idcarrera`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`idestado`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`idgrupo`);

--
-- Indices de la tabla `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`idinstructor`);

--
-- Indices de la tabla `localidades`
--
ALTER TABLE `localidades`
  ADD PRIMARY KEY (`idlocalidades`);

--
-- Indices de la tabla `municipio`
--
ALTER TABLE `municipio`
  ADD PRIMARY KEY (`idmunicipio`);

--
-- Indices de la tabla `organigrama`
--
ALTER TABLE `organigrama`
  ADD PRIMARY KEY (`idorganigrama`);

--
-- Indices de la tabla `periodo`
--
ALTER TABLE `periodo`
  ADD PRIMARY KEY (`idperiodo`);

--
-- Indices de la tabla `puesto`
--
ALTER TABLE `puesto`
  ADD PRIMARY KEY (`idpuesto`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idrol`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
