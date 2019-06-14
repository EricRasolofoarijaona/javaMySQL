-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le : Ven 07 Septembre 2018 à 09:40
-- Version du serveur: 5.5.16
-- Version de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `etude`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudient`
--

CREATE TABLE IF NOT EXISTS `etudient` (
  `id` int(11) NOT NULL,
  `Nom` varchar(50) DEFAULT NULL,
  `Prenom` varchar(50) DEFAULT NULL,
  `branche` varchar(50) DEFAULT NULL,
  `note` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudient`
--

INSERT INTO `etudient` (`id`, `Nom`, `Prenom`, `branche`, `note`) VALUES
(1, 'Miandra', 'Lucas', 'INFO', 14),
(4, 'Koto', 'Rabe', 'INFO', 19),
(5, 'Solofo', 'Kevin', 'INFO', 11),
(7, 'Koto', 'Rabe', 'INFO', 19),
(8, 'Rakoarimanana', 'Sarh', 'SM', 19),
(9, 'Rakotobesolo', 'clicos', 'LGE', 19),
(10, 'Kotoarisoa', 'Ramenaka', 'INFO', 12),
(11, 'Randriah', 'Abigael', 'INFO', 9);

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

CREATE TABLE IF NOT EXISTS `note` (
  `coef` int(11) NOT NULL,
  `matier` varchar(50) DEFAULT NULL,
  `note` int(20) DEFAULT NULL,
  PRIMARY KEY (`coef`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
