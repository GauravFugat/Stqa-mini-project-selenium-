-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2021 at 12:28 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `updationDate` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `updationDate`) VALUES
(1, 'Shantanu', 'password', '28-12-2016 11:42:05 AM');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL,
  `doctorSpecialization` varchar(255) NOT NULL,
  `doctorId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `consultancyFees` int(11) NOT NULL,
  `appointmentDate` varchar(255) NOT NULL,
  `appointmentTime` varchar(255) NOT NULL,
  `postingDate` timestamp NOT NULL DEFAULT current_timestamp(),
  `userStatus` int(11) NOT NULL,
  `doctorStatus` int(11) NOT NULL,
  `updationDate` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `doctorSpecialization`, `doctorId`, `userId`, `consultancyFees`, `appointmentDate`, `appointmentTime`, `postingDate`, `userStatus`, `doctorStatus`, `updationDate`) VALUES
(1, 'Dentist', 1, 1, 500, '2016-12-31', '09:25', '2017-01-01 00:29:02', 1, 0, ''),
(2, 'Homeopath', 4, 5, 700, '2017-01-11', '14:10', '2017-01-07 08:02:58', 0, 1, ''),
(3, 'Ayurveda', 8, 6, 600, '2019-06-29', '9:15 AM', '2019-06-23 18:31:28', 1, 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `doctors`
--

CREATE TABLE `doctors` (
  `id` int(11) NOT NULL,
  `specilization` varchar(255) DEFAULT NULL,
  `doctorName` varchar(255) DEFAULT NULL,
  `address` longtext DEFAULT NULL,
  `docFees` varchar(255) DEFAULT NULL,
  `contactno` bigint(11) DEFAULT NULL,
  `docEmail` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `creationDate` timestamp NULL DEFAULT current_timestamp(),
  `updationDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctors`
--

INSERT INTO `doctors` (`id`, `specilization`, `doctorName`, `address`, `docFees`, `contactno`, `docEmail`, `password`, `creationDate`, `updationDate`) VALUES
(1, 'Dentist', 'Anuj Deshmukh', 'Pune', '500', 9485278521, 'anujd@test.com', 'c4235bc2f52a6982d3698d8ed4f520f2', '2016-12-29 06:25:37', '2021-11-11 03:55:22'),
(2, 'Gynecologist/Obstetrician', 'Sarita Joshi', 'Mumbai', '600', 9478135478, 'saritaj@test.com', 'c3db612be96e74a8c98023732d1d5f7e', '2016-12-29 06:51:51', '2021-11-11 04:36:46'),
(3, 'General Physician', 'Nitesh Bhave', 'Satara', '1200', 8452147821, 'niteshb@test.com', '9e1b36b1851d116f828880415a6968a6', '2017-01-07 07:43:35', '2021-11-11 04:07:12'),
(4, 'Dermatologist', 'Vijay Suryavanshi', 'Kolhapur', '700', 7521456782, 'vijays@test.com', '7c5e62fbfc8a62229675265f24ac0c10', '2017-01-07 07:45:09', '2021-11-11 04:35:00'),
(5, 'Ayurveda', 'Sanjeev Sharma', 'Aurangabad', '800', 7852198234, 'sanjeevs@test.com', '1bc98e9d85a008ccca4cddf669fa04d8', '2017-01-07 07:47:07', '2021-11-11 04:08:40'),
(6, 'General Physician', 'Amrita Shah', 'Amravati', '2500', 9844157239, 'amritas@test.com', '8227687af28ff91652da5411cdc132ba', '2017-01-07 07:52:50', '2021-11-11 04:09:17'),
(7, 'Orthopedic', 'Vedant Pawar', 'Nagpur', '2700', 8451267852, 'vedantp@test.com', 'ba1be5de2046ff521feb88ce8f33ec71', '2017-01-07 07:52:50', '2021-11-11 04:10:52'),
(8, 'Homeopath', 'Rishabh Jain', 'Sangli', '500', 7615782489, 'rishabhj@test.com', '07614fb932a7dbe564aa3fabdf4453fd', '2017-01-07 07:52:50', '2021-11-11 04:44:17');

-- --------------------------------------------------------

--
-- Table structure for table `doctorslog`
--

CREATE TABLE `doctorslog` (
  `id` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `userip` binary(16) DEFAULT NULL,
  `loginTime` timestamp NULL DEFAULT current_timestamp(),
  `logout` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctorslog`
--

INSERT INTO `doctorslog` (`id`, `uid`, `username`, `userip`, `loginTime`, `logout`, `status`) VALUES
(1, 2, 'sarita@gmail.com', 0x30000000000000000000000000000000, '2017-01-06 05:53:31', '', 1),
(2, 0, 'admin', 0x3a3a3100000000000000000000000000, '2017-01-06 06:36:07', '', 0),
(3, 2, 'sarita@gmail.com', 0x3a3a3100000000000000000000000000, '2017-01-06 06:36:37', '06/01/2017 07:36:45', 1),
(4, 2, 'sarita@gmail.com', 0x3a3a3100000000000000000000000000, '2017-01-06 06:41:33', '12:11:46', 1),
(5, 2, 'sarita@gmail.com', 0x3a3a3100000000000000000000000000, '2017-01-06 06:55:16', '06-01-2017 12:27:47 PM', 1),
(6, 0, 'admin', 0x3a3a3100000000000000000000000000, '2017-01-06 07:07:12', '', 0),
(7, 0, 'info@w3gang.com', 0x3a3a3100000000000000000000000000, '2017-01-07 08:04:42', '', 0),
(8, 0, 'info@w3gang.com', 0x3a3a3100000000000000000000000000, '2017-01-07 08:04:55', '', 0),
(9, 2, 'sarita@gmail.com', 0x3a3a3100000000000000000000000000, '2017-01-07 08:05:54', '07-01-2017 01:36:28 PM', 1),
(10, 7, 'test@demo.com', 0x3a3a3100000000000000000000000000, '2019-06-23 18:15:31', '23-06-2019 11:47:36 PM', 1),
(11, NULL, 'anuj.lpu1@gmail.com', 0x3a3a3100000000000000000000000000, '2021-11-10 17:04:42', NULL, 0),
(12, NULL, 'test@demo.com', 0x3a3a3100000000000000000000000000, '2021-11-10 17:05:11', NULL, 0),
(13, NULL, 'test@gmail.com', 0x3a3a3100000000000000000000000000, '2021-11-10 17:06:41', NULL, 0),
(14, NULL, 'anuj.lpu1@gmail.com', 0x3a3a3100000000000000000000000000, '2021-11-10 17:08:17', NULL, 0),
(15, 1, 'anuj.lpu1@gmail.com', 0x3a3a3100000000000000000000000000, '2021-11-10 17:12:30', '11-11-2021 09:04:31 AM', 1),
(16, 1, 'anujd@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 04:02:56', '11-11-2021 09:35:27 AM', 1),
(17, NULL, 'vedantp@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 04:10:19', NULL, 0),
(18, 7, 'vedantp@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 04:11:06', '11-11-2021 09:50:09 AM', 1),
(19, 1, 'anujd@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 06:30:46', '11-11-2021 12:01:29 PM', 1);

-- --------------------------------------------------------

--
-- Table structure for table `doctorspecilization`
--

CREATE TABLE `doctorspecilization` (
  `id` int(11) NOT NULL,
  `specilization` varchar(255) DEFAULT NULL,
  `creationDate` timestamp NULL DEFAULT current_timestamp(),
  `updationDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctorspecilization`
--

INSERT INTO `doctorspecilization` (`id`, `specilization`, `creationDate`, `updationDate`) VALUES
(1, 'Gynecologist/Obstetrician', '2016-12-28 06:37:25', '0000-00-00 00:00:00'),
(2, 'General Physician', '2016-12-28 06:38:12', '0000-00-00 00:00:00'),
(3, 'Dermatologist', '2016-12-28 06:38:48', '0000-00-00 00:00:00'),
(4, 'Homeopath', '2016-12-28 06:39:26', '0000-00-00 00:00:00'),
(5, 'Ayurveda', '2016-12-28 06:39:51', '0000-00-00 00:00:00'),
(6, 'Dentist', '2016-12-28 06:40:08', '0000-00-00 00:00:00'),
(7, 'Orthopedic', '2016-12-28 06:40:08', '2021-11-11 04:43:40');

-- --------------------------------------------------------

--
-- Table structure for table `tblcontactus`
--

CREATE TABLE `tblcontactus` (
  `id` int(11) NOT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `contactno` bigint(12) DEFAULT NULL,
  `message` mediumtext DEFAULT NULL,
  `PostingDate` timestamp NULL DEFAULT current_timestamp(),
  `AdminRemark` mediumtext DEFAULT NULL,
  `LastupdationDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp(),
  `IsRead` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblcontactus`
--

INSERT INTO `tblcontactus` (`id`, `fullname`, `email`, `contactno`, `message`, `PostingDate`, `AdminRemark`, `LastupdationDate`, `IsRead`) VALUES
(1, 'test user', 'test@gmail.com', 2523523522523523, ' This is sample text for the test.', '2019-06-29 19:03:08', 'Test Admin Remark', '2019-06-30 12:55:23', 1),
(2, 'Anuj kumar', 'phpgurukulofficial@gmail.com', 1111111111111111, ' This is sample text for testing.  This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing. This is sample text for testing.', '2019-06-30 13:06:50', NULL, NULL, NULL),
(3, 'Chinmay', '123123@test.com', 4578698541, ' This is a test message', '2021-11-11 06:40:21', NULL, NULL, NULL),
(4, 'Pratik', 'pratik@test.com', 9798236473, ' Just Explaining', '2021-11-22 11:10:52', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `userlog`
--

CREATE TABLE `userlog` (
  `id` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `userip` binary(16) DEFAULT NULL,
  `loginTime` timestamp NULL DEFAULT current_timestamp(),
  `logout` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlog`
--

INSERT INTO `userlog` (`id`, `uid`, `username`, `userip`, `loginTime`, `logout`, `status`) VALUES
(6, 1, '', 0x3a3a3100000000000000000000000000, '2017-01-06 07:02:28', '', 1),
(7, 1, 'info@w3gang.com', 0x3a3a3100000000000000000000000000, '2017-01-06 07:04:28', '', 1),
(8, 0, 'admin', 0x3a3a3100000000000000000000000000, '2017-01-06 07:07:41', '06-01-2017 12:38:09 PM', 0),
(9, 1, 'info@w3gang.com', 0x3a3a3100000000000000000000000000, '2017-01-06 07:08:01', '', 1),
(10, 1, 'info@w3gang.com', 0x3a3a3100000000000000000000000000, '2017-01-06 07:10:09', '06-01-2017 12:41:43 PM', 1),
(11, 2, 'test@gmail.com', 0x3a3a3100000000000000000000000000, '2017-01-07 07:57:18', '07-01-2017 01:27:34 PM', 1),
(12, 0, 'asdad', 0x3a3a3100000000000000000000000000, '2017-01-07 07:57:44', '', 0),
(13, 0, 'xyz@test.com', 0x3a3a3100000000000000000000000000, '2017-01-07 07:59:43', '', 0),
(14, 5, 'amit12@gmail.com', 0x3a3a3100000000000000000000000000, '2017-01-07 08:00:44', '07-01-2017 01:34:19 PM', 1),
(15, 6, 'tetuser@gmail.com', 0x3a3a3100000000000000000000000000, '2019-06-23 18:30:16', '24-06-2019 12:10:17 AM', 1),
(16, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 04:33:34', '11-11-2021 10:11:06 AM', 1),
(17, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 04:44:50', '11-11-2021 10:17:05 AM', 1),
(18, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-11 06:31:57', '11-11-2021 12:03:02 PM', 1),
(19, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-22 09:57:06', NULL, 1),
(20, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-22 09:59:06', NULL, 1),
(21, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-22 10:36:23', NULL, 1),
(22, 1, 'bhavikr@test.com', 0x3a3a3100000000000000000000000000, '2021-11-22 11:15:21', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `fullName` varchar(255) DEFAULT NULL,
  `address` longtext DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `regDate` timestamp NULL DEFAULT current_timestamp(),
  `updationDate` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fullName`, `address`, `city`, `gender`, `email`, `password`, `regDate`, `updationDate`) VALUES
(1, 'Bhavik Ransubhe', 'Camp', 'Pune', 'male', 'bhavikr@test.com', 'e11b9cd926a6b232589a1a2cd0ec289c', '2016-12-26 07:03:09', '2021-11-11 04:20:57'),
(2, 'Chinmay Nikam', 'PCMC', 'Pune', 'male', 'chinmayn@test.com', '84f8509a2ea4331b3b2a94db3a6a874c', '2016-12-30 05:34:39', '2021-11-11 04:29:02'),
(3, 'Advait Thakur', 'Hadapsar', 'Pune', 'male', 'advaitt@test.com', '786aadeec71d85dce6c35afbea75bc32', '2017-01-07 06:36:53', '2021-11-11 04:22:23'),
(4, 'Ritvik Poojary', 'Ravivar Peth', 'Pune', 'male', 'ritvikp@test.com', '9cf659da5f816ea1824b5c3cbd21ddec', '2017-01-07 07:41:14', '2021-11-11 04:23:46'),
(5, 'Adesh Oak', 'Kothrud', 'Pune', 'male', 'adesho@test.com', '23cd7caa0a3e4750afda5ddf0f0d5154', '2017-01-07 08:00:26', '2021-11-11 04:25:18'),
(6, 'Gaurav Zanpure', 'Pimpri', 'Pune', 'male', 'gauravz@test.com', '857f12c7851f6931f1c1ea871cce12e2', '2019-06-23 18:24:53', '2021-11-11 04:26:02');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctorslog`
--
ALTER TABLE `doctorslog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctorspecilization`
--
ALTER TABLE `doctorspecilization`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblcontactus`
--
ALTER TABLE `tblcontactus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userlog`
--
ALTER TABLE `userlog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `doctors`
--
ALTER TABLE `doctors`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `doctorslog`
--
ALTER TABLE `doctorslog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `doctorspecilization`
--
ALTER TABLE `doctorspecilization`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tblcontactus`
--
ALTER TABLE `tblcontactus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `userlog`
--
ALTER TABLE `userlog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
