-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2019 at 03:28 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `idealfood`
--

-- --------------------------------------------------------

--
-- Table structure for table `ingredientamount`
--

CREATE TABLE `ingredientamount` (
  `id` int(11) NOT NULL,
  `RecipeID` int(11) DEFAULT NULL,
  `IngredientID` int(11) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `unit` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ingredientamount`
--

INSERT INTO `ingredientamount` (`id`, `RecipeID`, `IngredientID`, `amount`, `unit`) VALUES
(1, 1, 1, 1, 'pcs'),
(2, 1, 2, 300, 'g'),
(3, 1, 3, 40, 'g'),
(4, 1, 7, 10, 'g'),
(5, 1, 8, 10, 'g'),
(6, 1, 13, 20, 'g'),
(7, 1, 20, 10, 'g'),
(8, 2, 1, 1, 'pcs'),
(9, 2, 2, 300, 'g'),
(10, 2, 10, 2, 'pcs'),
(11, 2, 17, 50, 'g'),
(12, 2, 4, 50, 'g'),
(13, 2, 7, 40, 'g'),
(14, 2, 8, 25, 'g'),
(15, 3, 1, 1, 'pcs'),
(16, 3, 2, 100, 'g'),
(17, 3, 10, 1, 'pcs'),
(18, 3, 15, 40, 'g'),
(19, 3, 11, 15, 'g'),
(20, 3, 13, 10, 'g'),
(21, 3, 17, 15, 'g'),
(22, 3, 7, 15, 'g'),
(23, 4, 1, 1, 'pcs'),
(24, 4, 9, 2, 'pcs'),
(25, 4, 21, 0.5, 'tbsp'),
(26, 4, 22, 1, 'pcs'),
(27, 4, 23, 0.5, 'pck'),
(28, 4, 24, 25, 'g'),
(29, 4, 25, 0.5, 'tbsp'),
(30, 4, 26, 1, 'tsp'),
(31, 4, 15, 1.5, 'pcs'),
(32, 4, 27, 0.5, 'tbsp'),
(33, 4, 28, 0.5, 'tbsp'),
(34, 4, 29, 1.5, 'pcs'),
(35, 4, 17, 25, 'g'),
(36, 4, 7, 10, 'g'),
(37, 4, 3, 12.5, 'g'),
(38, 5, 1, 1, 'pcs'),
(39, 5, 7, 10, 'g'),
(40, 5, 5, 10, 'g'),
(41, 5, 6, 10, 'g'),
(42, 5, 2, 125, 'g'),
(43, 5, 18, 150, 'g'),
(44, 5, 13, 5, 'g'),
(45, 5, 30, 15, 'g'),
(46, 5, 15, 10, 'g'),
(47, 6, 1, 1, 'pcs'),
(48, 6, 2, 100, 'g'),
(49, 6, 7, 20, 'g'),
(50, 6, 15, 10, 'g'),
(51, 6, 12, 20, 'g'),
(52, 6, 19, 10, 'g'),
(53, 6, 22, 20, 'g'),
(54, 6, 3, 20, 'g');

-- --------------------------------------------------------

--
-- Table structure for table `ingredients`
--

CREATE TABLE `ingredients` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `calories` double DEFAULT NULL,
  `protein` double DEFAULT NULL,
  `fat` double DEFAULT NULL,
  `carbohydrates` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ingredients`
--

INSERT INTO `ingredients` (`id`, `name`, `calories`, `protein`, `fat`, `carbohydrates`) VALUES
(1, 'burger bun', 202, 6, 12, 70),
(2, 'ground beef', 160, 20, 10, 0),
(3, 'cheddar cheese', 300, 20, 35, 5),
(4, 'mozzarella cheese', 300, 22, 30, 5),
(5, 'tomato', 18, 2, 0, 25),
(6, 'cucumber', 15, 0, 0, 17),
(7, 'lettuce', 10, 0, 0, 12),
(8, 'onion', 40, 5, 0, 40),
(9, 'mushroom', 22, 9, 0, 15),
(10, 'egg', 100, 10, 10, 0),
(11, 'asparges', 25, 6, 0, 24),
(12, 'guacamole', 300, 11, 40, 40),
(13, 'ketchup', 203, 4, 17, 68),
(14, 'hummus', 273, 8, 34, 29),
(15, 'red onion', 40, 5, 0, 40),
(16, 'paprika', 37, 4, 0, 31),
(17, 'mayonaise', 553, 5, 60, 40),
(18, 'sweet potatoe', 100, 7, 2, 50),
(19, 'broccoli', 35, 8, 0, 30),
(20, 'mustard', 251, 5, 30, 34),
(21, 'olive oil', 900, 0, 95, 0),
(22, 'red pepper', 37, 2, 0, 31),
(23, 'thyme', 0, 0, 0, 0),
(24, 'breadcrumb', 221, 5, 5, 67),
(25, 'sun dried tomato paste', 350, 5, 50, 25),
(26, 'smoked paprika', 0, 0, 0, 0),
(27, 'golden caster sugar', 400, 0, 0, 80),
(28, 'sherry vinegar', 70, 0, 0, 40),
(29, 'garlic cloves', 35, 4, 2, 25),
(30, 'carrot', 40, 2, 0, 40);

-- --------------------------------------------------------

--
-- Table structure for table `recipes`
--

CREATE TABLE `recipes` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `howto` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recipes`
--

INSERT INTO `recipes` (`id`, `name`, `howto`) VALUES
(1, 'Beefaholic', ''),
(2, 'Eggylicious', NULL),
(3, 'Hella Home Style', NULL),
(4, 'Light & Licious', NULL),
(5, 'Mother Earth', NULL),
(6, 'Cheesy', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ingredientamount`
--
ALTER TABLE `ingredientamount`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ingredients`
--
ALTER TABLE `ingredients`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `recipes`
--
ALTER TABLE `recipes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ingredientamount`
--
ALTER TABLE `ingredientamount`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `ingredients`
--
ALTER TABLE `ingredients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `recipes`
--
ALTER TABLE `recipes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
