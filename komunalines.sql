-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2020 m. Vas 05 d. 13:59
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saskaitos`
--

-- --------------------------------------------------------

--
-- Sukurta duomenø struktûra lentelei `komunalines`
--

CREATE TABLE `komunalines` (
  `nr` int(11) NOT NULL,
  `gyventojuSk` int(10) NOT NULL,
  `objektoTipas` varchar(255) NOT NULL,
  `objektoPlotas` double NOT NULL,
  `rinkliava` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Sukurta duomenø kopija lentelei `komunalines`
--

INSERT INTO `komunalines` (`nr`, `gyventojuSk`, `objektoTipas`, `objektoPlotas`, `rinkliava`) VALUES
(1, 5, 'Namas', 300.25, 12.9),
(2, 3, 'Butas', 60.5, 12.9),
(3, 4, 'Butas', 35.9, 12.9),
(4, 1, 'Namas', 200.41, 12.9),
(5, 2, 'Namas', 250.5, 12.9),
(7, 3, 'Kotedzas', 100, 12.9),
(8, 3, 'Kotedzas', 100, 12.9),
(9, 3, 'Kotedzas', 100, 12.9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komunalines`
--
ALTER TABLE `komunalines`
  ADD PRIMARY KEY (`nr`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `komunalines`
--
ALTER TABLE `komunalines`
  MODIFY `nr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
