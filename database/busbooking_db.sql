-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 27, 2018 at 11:17 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `busbooking_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` varchar(50) NOT NULL,
  `admin_name` varchar(50) NOT NULL,
  `admin_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_password`) VALUES
('admin1', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `ref_no` varchar(50) NOT NULL,
  `bus_id` varchar(50) NOT NULL,
  `emp_id` varchar(50) NOT NULL,
  `num_of_seat` varchar(50) NOT NULL,
  `seat_no` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `amount` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`ref_no`, `bus_id`, `emp_id`, `num_of_seat`, `seat_no`, `date`, `amount`) VALUES
('b32018-08-28s4', 'b3', 'SE/2015/036', ' 3', ' s4 ,s5 ,s13 ,', '2018-08-28', '2400'),
('b32018-08-28s33', 'b3', 'SE/2015/036', ' 4', ' s33 ,s34 ,s35 ,s36 ,', '2018-08-28', '3200');

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `bus_id` varchar(50) NOT NULL,
  `route_no` varchar(50) NOT NULL,
  `bus_no` varchar(50) NOT NULL,
  `bus_time` varchar(50) NOT NULL,
  `bus_from` varchar(50) NOT NULL,
  `bus_to` varchar(50) NOT NULL,
  `amount` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`bus_id`, `route_no`, `bus_no`, `bus_time`, `bus_from`, `bus_to`, `amount`) VALUES
('b1', '02', 'BD 8029', '08.00 AM', 'Colombo', 'Galle', '150'),
('b2', '02', 'NR 6358', '02.00 PM', 'Galle', 'Colombo', '150'),
('b3', '15', 'NL 6587', '10.00 AM', 'Colombo', 'Jaffna', '800'),
('b4', '15', 'AS 6325', '08.00 PM', 'Jaffna', 'Colombo', '800'),
('b5', '48', 'NM 5465', '08.00 PM', 'Colombo', 'Batticaloa', '900'),
('b6', '48', 'PN 5258', '09.00 PM', 'Batticaloa', 'Colombo', '900'),
('b7', '29', 'MN 2356', '07.00 PM', 'Ampara', 'Colombo', '900'),
('b8', '29', 'DQ 8635', '08.00 PM', 'Colombo', 'Ampara', '900');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ref_no` varchar(50) DEFAULT NULL,
  `cus_name` varchar(50) NOT NULL,
  `cus_nic` varchar(50) NOT NULL,
  `cus_phone` varchar(50) NOT NULL,
  `cus_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ref_no`, `cus_name`, `cus_nic`, `cus_phone`, `cus_address`) VALUES
('b32018-08-28s4', 'Ram', '0774968325', '965863245v', 'kelaniya'),
('b32018-08-28s33', 'Kakayan', '0776598756', '946598743v', 'jaffna');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_id` varchar(50) NOT NULL,
  `emp_name` varchar(50) NOT NULL,
  `emp_nic` varchar(50) NOT NULL,
  `emp_phone` varchar(50) NOT NULL,
  `emp_address` varchar(50) NOT NULL,
  `emp_mail` varchar(50) NOT NULL,
  `emp_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `emp_name`, `emp_nic`, `emp_phone`, `emp_address`, `emp_mail`, `emp_password`) VALUES
('SE/2015/036', 'Thasneem', '962032346v', '0774065294', 'Sammanthurai', 'amythasneem@gmail.com', 'se/2015/036'),
('SE/2015/031', 'Sangeevan', '952271563v', '0715551995', 'Jaffna', 'sangeevan1995@outlook.com', 'se/2015/031'),
('SE/2015/035', 'Suthesana', '958562368v', '0773753149', 'Jaffna', 'sutheesana95@mail.com', 'se/2015/035');

-- --------------------------------------------------------

--
-- Table structure for table `seat`
--

CREATE TABLE `seat` (
  `bus_id` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `ref_no` varchar(50) NOT NULL,
  `seat_no` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seat`
--

INSERT INTO `seat` (`bus_id`, `date`, `ref_no`, `seat_no`) VALUES
('b3', '2018-08-28', 'b32018-08-28s4', 's4'),
('b3', '2018-08-28', 'b32018-08-28s4', 's5'),
('b3', '2018-08-28', 'b32018-08-28s4', 's13'),
('b3', '2018-08-28', 'b32018-08-28s33', 's33'),
('b3', '2018-08-28', 'b32018-08-28s33', 's34'),
('b3', '2018-08-28', 'b32018-08-28s33', 's35'),
('b3', '2018-08-28', 'b32018-08-28s33', 's36');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
