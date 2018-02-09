-- phpMyAdmin SQL Dump
-- version 4.0.10.14
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Nov 29, 2016 at 04:00 PM
-- Server version: 5.6.34
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `fuelmdbd_base`
--

-- --------------------------------------------------------

--
-- Table structure for table `dispensers`
--

CREATE TABLE IF NOT EXISTS `dispensers` (
  `dispenser_id` varchar(2) NOT NULL,
  `name` varchar(35) NOT NULL,
  PRIMARY KEY (`dispenser_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` varchar(5) NOT NULL,
  `emp_fname` varchar(25) NOT NULL,
  `emp_lname` varchar(35) NOT NULL,
  `id_number` varchar(13) NOT NULL,
  `cellphone` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  `hire_date` date NOT NULL,
  `gender` varchar(8) NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `dob` date NOT NULL,
  `job_type` varchar(45) NOT NULL,
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `id_uk` (`id_number`),
  UNIQUE KEY `cell_uk` (`cellphone`),
  UNIQUE KEY `email_uk` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `emp_fname`, `emp_lname`, `id_number`, `cellphone`, `address`, `hire_date`, `gender`, `password`, `email`, `dob`, `job_type`) VALUES
('00001', 'Wilbur', '  Thelele', '9306125435083', '0813564839', '3142 Pompon Street /nAllndale EXT 7 ', '2016-09-01', 'Male', 'qwerty', 'pthelele@yahoo.co.za', '1993-06-12', 'Manager'),
('00002', 'Donald', 'Mahwibila', '9308125435083', '0743521425', 'Stan 55/nBellingsgate /nGa-Masheshane ', '2016-09-01', 'Male', 'wILBURO1993*', 'donodon@gmail.com', '1993-09-12', 'Petrol Attendant'),
('00003', 'Mpho', 'Mako', '9210120601088', '0713564839', '3142 Pompon Street /nAllndale EXT 7 ', '2016-09-01', 'Female', 'qwerty', 'mphomako@yahoo.co.za', '1992-10-12', 'Cleaner'),
('00005', 'Mohau', 'Mohanoe', '9406125435083', '0821472002', '1874 Green side village Johannesburg', '2016-11-17', 'Male', 'XTNMSS', 'mohanoe@gmail.com', '1994-06-12', 'Petrol Attendant'),
('00006', 'Lethabo', 'Ckokoe', '9606120535083', '0725471232', '4587 Mono Street\nMidrand\n1685', '2016-11-26', 'Female', 'XPCULQ', 'lt@webmail.com', '1996-06-12', 'Petrol Attendant');

-- --------------------------------------------------------

--
-- Table structure for table `fuelTanks`
--

CREATE TABLE IF NOT EXISTS `fuelTanks` (
  `tank_id` varchar(2) NOT NULL,
  `tank_volume` decimal(7,2) NOT NULL,
  `tank_name` varchar(15) NOT NULL,
  `fuel_level` decimal(7,2) DEFAULT NULL,
  `fuel_id` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`tank_id`),
  UNIQUE KEY `tank_ind` (`tank_name`),
  KEY `fuel_id_fk` (`fuel_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fuelTanks`
--

INSERT INTO `fuelTanks` (`tank_id`, `tank_volume`, `tank_name`, `fuel_level`, `fuel_id`) VALUES
('01', '10000.00', 'Sulphur Tank', '6795.29', '01'),
('02', '5000.00', 'Gas Tank', '4188.49', '04'),
('03', '10000.00', 'Sulpher Tank', '9807.70', '02'),
('05', '15000.00', 'Super Tank', '0.00', '03');

-- --------------------------------------------------------

--
-- Table structure for table `fuel_table`
--

CREATE TABLE IF NOT EXISTS `fuel_table` (
  `fuel_id` varchar(2) NOT NULL,
  `fuel_type` varchar(15) NOT NULL,
  `fuel_price` decimal(7,2) NOT NULL,
  PRIMARY KEY (`fuel_id`),
  UNIQUE KEY `fuel_type_uk` (`fuel_type`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fuel_table`
--

INSERT INTO `fuel_table` (`fuel_id`, `fuel_type`, `fuel_price`) VALUES
('01', 'Diesel', '12.55'),
('02', 'Diesel Extra', '13.00'),
('03', 'Unleaded 95', '13.34'),
('04', 'Unleaded 93', '13.08'),
('05', 'Gasoline', '11.50');

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE IF NOT EXISTS `notification` (
  `notification_id` int(11) NOT NULL AUTO_INCREMENT,
  `notification_date` date NOT NULL,
  `fuel_status` varchar(3) DEFAULT NULL,
  `fuel_id` varchar(2) DEFAULT NULL,
  `tank_id` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`notification_id`),
  KEY `fuel_notiFk` (`fuel_id`),
  KEY `tank_notiFk` (`tank_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE IF NOT EXISTS `services` (
  `service_id` int(15) NOT NULL AUTO_INCREMENT,
  `service_date` datetime NOT NULL,
  `fuel_dispensed` decimal(7,2) NOT NULL,
  `fuel_cost` decimal(7,2) NOT NULL,
  `fuel_id` varchar(2) DEFAULT NULL,
  `emp_id` varchar(5) DEFAULT NULL,
  `dispenser_id` varchar(2) DEFAULT NULL,
  `tank_id` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`service_id`),
  KEY `fuelIdfk` (`fuel_id`),
  KEY `empId_fk` (`emp_id`),
  KEY `disp_id_fk` (`dispenser_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`service_id`, `service_date`, `fuel_dispensed`, `fuel_cost`, `fuel_id`, `emp_id`, `dispenser_id`, `tank_id`) VALUES
(1, '2016-10-24 00:00:00', '65.39', '850.00', '02', '00001', '01', '03'),
(2, '2016-10-24 00:00:00', '71.71', '900.00', '02', '00001', '02', '03'),
(3, '2016-10-24 00:00:00', '51.79', '650.00', '02', '00001', '03', '03'),
(4, '2016-10-24 00:00:00', '60.00', '780.00', '02', '00001', '01', '03'),
(5, '2016-10-24 00:00:00', '7.97', '100.00', '01', '00001', '01', '01'),
(6, '2016-10-24 00:00:00', '40.00', '520.00', '02', '00001', '01', '03'),
(7, '2016-11-26 00:00:00', '75.70', '950.00', '01', '00001', '01', '01'),
(8, '2016-11-26 00:00:00', '26.92', '350.00', '02', '00001', '01', '03'),
(9, '2016-11-26 00:00:00', '67.89', '852.00', '02', '00001', '02', '03'),
(10, '2016-11-26 00:00:00', '36.02', '452.00', '01', '00004', '01', '01'),
(11, '2016-11-26 00:00:00', '67.73', '850.00', '01', '00004', '02', '01'),
(12, '2016-11-26 00:00:00', '71.71', '900.00', '01', '00004', '03', '01'),
(13, '2016-11-26 00:00:00', '95.62', '1200.00', '01', '00002', '01', '01'),
(14, '2016-11-28 00:00:00', '71.71', '900.00', '02', '00001', '03', '03'),
(15, '2016-11-28 00:00:00', '64.99', '850.00', '02', '00001', '02', '03'),
(16, '2016-11-28 00:00:00', '59.76', '750.00', '01', '00001', '01', '01'),
(17, '2016-11-29 00:00:00', '61.16', '800.00', '04', '00001', '01', '02'),
(18, '2016-11-29 00:00:00', '69.32', '870.00', '04', '00001', '03', '02'),
(19, '2016-11-29 00:00:00', '31.08', '390.00', '04', '00001', '02', '02'),
(20, '2016-11-29 00:00:00', '44.34', '580.00', '04', '00001', '01', '02');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
