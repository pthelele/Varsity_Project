
DROP  DATABASE fuelmdb_base;
CREATE DATABASE fuelmdb_base;
USE fuelmdb_base;





CREATE TABLE employee
			(emp_id VARCHAR(5) NOT NULL,
			 emp_fname VARCHAR(25) NOT NULL,
			 emp_lname VARCHAR(35) NOT NULL,
			 id_number VARCHAR(13) NOT NULL,
			 cellphone VARCHAR(10) NOT NULL,
			 address VARCHAR(50) NOT NULL,
			 hire_date DATE NOT NULL,
			 gender VARCHAR(8) NOT NULL,
			 password VARCHAR(16) NOT NULL,
			 email VARCHAR(45),
			 dob DATE NOT NULL,
			 job_type VARCHAR(45) NOT NULL,
			 CONSTRAINT id_number_lentg CHECK(LENGTH(id_number) = 13 ),
			 CONSTRAINT cell_check CHECK(LENGTH(cellphone) = 10));
			 
			 
			 
ALTER TABLE employee
	ADD PRIMARY KEY(emp_id);

CREATE UNIQUE INDEX id_uk
	ON employee(id_number);
	
CREATE UNIQUE INDEX cell_uk
	ON employee(cellphone);
	
CREATE UNIQUE INDEX email_uk
	ON employee(email);

CREATE TABLE fuel_table
			(fuel_id VARCHAR(2)NOT NULL,
			 fuel_type VARCHAR(15) NOT NULL,
			 fuel_price DECIMAL(7,2) NOT NULL,
			 CONSTRAINT fuel_id_pk PRIMARY KEY(fuel_id));
			 
			 
CREATE UNIQUE INDEX fuel_type_uk
	ON fuel_table(fuel_type);
			 

CREATE TABLE fuelTanks
			 (tank_id VARCHAR(2) NOT NULL,
			  tank_volume DECIMAL(7,2) NOT NULL,
			  tank_name VARCHAR(15) NOT NULL,
			  fuel_level DECIMAL(7,2) NULL,
			  fuel_id VARCHAR(2) NULL, 
			  CONSTRAINT fuel_id_fk FOREIGN KEY(fuel_id) REFERENCES fuel_table (fuel_id));
			  

			  
CREATE UNIQUE INDEX tank_ind
	ON fuelTanks(tank_name);
			  

	
ALTER TABLE fuelTanks
	ADD PRIMARY KEY(tank_id);

CREATE TABLE dispensers
			(dispenser_id VARCHAR(2) PRIMARY KEY,
			 name VARCHAR(35) NOT NULL);
			 
			 
CREATE TABLE services
			 (service_id INT(15) PRIMARY KEY AUTO_INCREMENT,
			  service_date DATETIME NOT NULL,
			  fuel_dispensed DECIMAL(7,2) NOT NULL,
			  fuel_cost DECIMAL(7,2) NOT NULL,
			  fuel_id VARCHAR(2) NULL,
			  emp_id VARCHAR(5) NULL,
			  dispenser_id VARCHAR(2) NULL,
			  tank_id VARCHAR(2) NULL,
			  CONSTRAINT fuelIdfk FOREIGN KEY(fuel_id) REFERENCES fuel_table(fuel_id),
			  CONSTRAINT empId_fk FOREIGN KEY(emp_id) REFERENCES employee(emp_id),
			  CONSTRAINT disp_id_fk FOREIGN KEY(dispenser_id) REFERENCES dispensers(dispenser_id));
			  
 ALTER TABLE services AUTO_INCREMENT = 00;

CREATE TABLE notification
			 (notification_id PRIMARY KEY AUTO_INCREMENT,
			  notification_date DATE NOT NULL,
			  fuel_status VARCHAR(3),
			  fuel_id VARCHAR(2),
			  tank_id VARCHAR(2),
			  CONSTRAINT fuel_notiFk FOREIGN KEY(fuel_id) REFERENCES fuel_table(fuel_id),
			  CONSTRAINT tank_notiFk FOREIGN KEY(tank_id) REFERENCES fuelTanks(tank_id));
			  
 ALTER TABLE notification AUTO_INCREMENT = 00;
COMMIT;

insert into fuel_table values('01', 'diesel', 12.55);
insert into fueltanks values('01', 10000, 'Diesel Tank', 0.00, '01');
INSERT INTO dispensers VALUES('01', '01');
INSERT INTO employee VALUES('00001', 'Pale', 'Thelele', '9306125435083', '0813564839', '3142 Pompon Street /nAllndale EXT 7 ', '2016-09-01', 'Male', 'qwerty', 'pthelele@yahoo.co.za', '1993-06-12', 'Manager'),
					 ('00002', 'Donald', 'Mahwibila', '9308125435083', '0743521425', 'Stan 55/nBellingsgate /nGa-Masheshane ', '2016-09-01', 'Male', 'dwerty', 'donodon@gmail.com', '1993-09-12', 'Petrol Attendant'),
					 ('00003', 'Mpho', 'Mako', '9210120601088', '0713564839', '3142 Pompon Street /nAllndale EXT 7 ', '2016-09-01', 'Female', 'qwerty', 'mphomako@yahoo.co.za', '1992-10-12', 'Cleaner');

INSERT INTO services( service_date, fuel_dispensed, fuel_cost, fuel_id, emp_id, dispenser_id, tank_id) 
			VALUES('2016-11-08', 50, 500, '01', '00001', '01', '01');