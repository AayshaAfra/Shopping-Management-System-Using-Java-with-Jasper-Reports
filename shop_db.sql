-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 25, 2022 at 04:02 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
CREATE TABLE IF NOT EXISTS `bill` (
  `ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `CntactNo` varchar(50) DEFAULT NULL,
  `Email` varchar(39) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `Total` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`ID`, `Name`, `CntactNo`, `Email`, `Date`, `Total`, `CreatedBy`) VALUES
(0, 'Amal', '0764532896', 'Amal@gmail.com', '17-09-2022', '134651', 'null'),
(1, 'Amal', '0764532896', 'Amal@gmail.com', '17-09-2022', '5200', 'null'),
(2, 'Amal', '0764532896', 'Amal@gmail.com', '17-09-2022', '123300', 'null'),
(3, 'Amal', '0764532896', 'Amal@gmail.com', '18-09-2022', '1700', 'null'),
(4, 'Nimal', '0789954331', ' Nimal@gmail.com', '18-09-2022', '12500', 'null'),
(5, 'Amal', '0764532896', 'Amal@gmail.com', '18-09-2022', '80000', 'null'),
(6, 'Aaysha', '0712245890', 'Aaysha@gmail.com', '18-09-2022', '18600', 'null'),
(7, 'Aaysha', '0712245890', 'Aaysha@gmail.com', '18-09-2022', '7500', 'null'),
(8, 'Aaysha', '0712245890', 'Aaysha@gmail.com', '18-09-2022', '3100', 'null'),
(9, 'Aaysha', '0712245890', 'Aaysha@gmail.com', '19-09-2022', '8200', 'null'),
(10, 'Amal', '0764532896', 'Amal@gmail.com', '19-09-2022', '57200', 'null'),
(11, 'Amal', '0714533892', 'Amal@gmail.com', '20-09-2022', '30850', 'null'),
(12, 'Afra', '0713606942', 'Afra@gmail.com', '20-09-2022', '52600', 'null'),
(13, 'Amal', '0764532896', 'Amal@gmail.com', '28-09-2022', '67000', 'null'),
(14, 'Amal', '0764532896', 'Amal@gmail.com', '29-09-2022', '6150', 'null'),
(15, 'Kiara', '0412278340', 'Kiara@gmail.com', '29-09-2022', '38100', 'null'),
(16, 'Aaysha', '0712245890', 'Aaysha@gmail.com', '29-09-2022', '14750', 'null'),
(17, 'Alex', '0713606942', 'Alex@gmail.com', '29-09-2022', '5550', 'null'),
(18, 'Finch', '0713606942', 'Finch@gmail.com', '30-09-2022', '67300', 'null'),
(19, 'Finch', '0713606942', 'Finch@gmail.com', '30-09-2022', '25300', 'null'),
(20, 'Amal', '0712267492', 'Amal@gmail.com', '05-10-2022', '106800', 'null');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `Name`) VALUES
(5, 'Shoes'),
(6, 'Furniture'),
(7, 'Clothes'),
(8, 'Electrical Appliances'),
(16, 'Kitchen Decor'),
(12, 'Stationary'),
(15, 'Toys');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Category` varchar(50) DEFAULT NULL,
  `Price` varchar(39) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ID`, `Name`, `Category`, `Price`) VALUES
(42, 'Leather Brown Shoes', 'Shoes', '1800'),
(2, 'Casual Boots', 'Shoes', '2000'),
(3, 'Fashion Sneakers', 'Shoes', '2300'),
(4, 'Women Heels', 'Shoes', '2000'),
(5, 'Women Wedge Sandals', 'Shoes', '1800'),
(6, 'Women Flats', 'Shoes', '900'),
(45, 'Rubber Slipperrs', 'Shoes', '750'),
(43, 'Nike Air Force 1 White', 'Shoes', '2000'),
(9, 'Women Wedding Shoes', 'Shoes', '1500'),
(10, '3 Seater Sofas', 'Furniture', '50000'),
(11, 'Sofa Beds', 'Furniture', '65000'),
(12, 'Recliners', 'Furniture', '45000'),
(13, 'Seta Armchair', 'Furniture', '35000'),
(14, 'Calvin Leather Armchair', 'Furniture', '50000'),
(15, 'Olsen Dining Table', 'Furniture', '30000'),
(16, 'Marlon Dining Table', 'Furniture', '40000'),
(17, 'Olivier Dining Chairs', 'Furniture', '35000'),
(18, 'Linen Longline Shirt', 'Clothes', '750'),
(19, 'Violet Halter Dress', 'Clothes', '800'),
(20, 'Australian Cotton Stripe Blouse', 'Clothes', '900'),
(44, 'Hello Kitty pencil set', 'Stationary', '100'),
(22, 'Urben Linen Shirt', 'Clothes', '850'),
(23, 'Urban Linen Green Shirt', 'Clothes', '750'),
(24, 'Winter Jacket', 'Clothes', '950'),
(25, 'Cotton SweatShirt', 'Clothes', '1100'),
(26, 'Food Processor', 'Electrical Appliances', '16000'),
(27, 'Air Fryer', 'Electrical Appliances', '28000'),
(28, 'Induction Cooker', 'Electrical Appliances', '22000'),
(29, 'Hand Mixer', 'Electrical Appliances', '11000'),
(30, 'Gas Cooker', 'Electrical Appliances', '5000'),
(31, 'Electric Grill Maker', 'Electrical Appliances', '8500'),
(32, 'Sandwich Maker', 'Electrical Appliances', '3500'),
(33, 'Geepas Blender', 'Electrical Appliances', '3500'),
(34, 'Crewel Silk Pillow Covers', 'Home Decor', '3500'),
(35, 'Soft Corded Pillow Cover', 'Home Decor', '4000'),
(36, 'Pure White Ceramic Vases', 'Home Decor', '1700'),
(37, 'Rustic Ceramic Vases', 'Home Decor', '1650'),
(38, 'Fooundation Glass Vases', 'Home Decor', '1900'),
(39, 'Totem Ceramic Vases', 'Home Decor', '2400'),
(40, 'Olivero Floor Sculptures', 'Home Decor', '15000');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `Name` varchar(40) DEFAULT NULL,
  `Email` varchar(45) NOT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `ContactNo` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Email`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Name`, `Email`, `Password`, `Address`, `ContactNo`) VALUES
('Admin', 'Admin@gmail.com', '123', 'Colombo', '0768844321'),
('Aaysha', 'Aaysha@gmail.com', '0914', 'Matara', '0712245890'),
('Amal', 'Amal@gmail.com', 'uio', 'Nugegoda', '0764532896'),
('Nimal', 'Nimal@gmail.com', 'cvb', 'Matale', '0789954331'),
('Wimala', 'Wimala@gmail.com', 'iop', 'Kandy', '0717878523'),
('Kiara', 'Kiara@gmail.com', 'asd', 'Kurunegala', '0412278340'),
('Bella', 'Bella@gmail.com', 'cft', 'Hambanthota', '0762295401'),
('Afra', 'Afra@gmail.com', '345', 'Matara', '0713606942'),
('Alex', 'Alex@gmail.com', 'aaa', 'Matara', '0713606942'),
('Finch', 'Finch@gmail.com', 'abc', 'Galle', '0713606942'),
('Edward', 'Ed@gmail.com', '567', 'Kandy', '0745688086');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
