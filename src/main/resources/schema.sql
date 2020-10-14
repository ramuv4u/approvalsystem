DROP TABLE IF EXISTS EMP;
CREATE TABLE EMP
(
  id VARCHAR   AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR   (250) NOT NULL
);

DROP TABLE IF EXISTS MANAGER;
CREATE TABLE MANAGER
(
  id VARCHAR   AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR   (250) NOT NULL
);


DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE
(
  id VARCHAR
  AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR  (250) NOT NULL,
  status VARCHAR  (250) NOT NULL,
  requestId VARCHAR  (25) NOT NULL,
  escalate VARCHAR  (5) NOT NULL,
  manager VARCHAR  (25) NOT NULL,

);


--DROP TABLE IF EXISTS SUMMARY;
--CREATE TABLE SUMMARY
--(
--  id VARCHAR AUTO_INCREMENT PRIMARY KEY,
--  name VARCHAR  (250) NOT NULL,
--  status VARCHAR  (250) NOT NULL,
--  requestId VARCHAR  (25) NOT NULL,
--  requestDate VARCHAR  (25) NOT NULL,
--  escalate VARCHAR  (5) NOT NULL,
--  manager VARCHAR  (25) NOT NULL,

--);