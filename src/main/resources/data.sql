
INSERT INTO EMP  (name) VALUES  ('David');
INSERT INTO EMP  (name) VALUES  ('Jacob');
INSERT INTO EMP  (name) VALUES  ('Ian');
INSERT INTO EMP  (name) VALUES  ('Scott');
INSERT INTO EMP  (name) VALUES  ('William');
INSERT INTO EMP  (name) VALUES  ('Smith');

INSERT INTO MANAGER  (name) VALUES  ('Tom');
INSERT INTO MANAGER  (name) VALUES  ('Julie');
INSERT INTO MANAGER  (name) VALUES  ('William');
INSERT INTO MANAGER  (name) VALUES  ('Linda');

INSERT INTO EMPLOYEE (name,status, requestid , escalate, manager)  VALUES
                     ('Robert' , 'Approved' , '1233' ,'No' , 'Smith');

INSERT INTO EMPLOYEE (name,status, requestid , escalate, manager)  VALUES
                     ('Tim' , 'Declined' , '262' ,'Yes' , 'Scott');
INSERT INTO EMPLOYEE (name,status, requestid , escalate, manager)  VALUES
                     ('Stephen' , 'Declined' , '262' ,'Yes' , 'Smith');
INSERT INTO EMPLOYEE (name,status, requestid , escalate, manager)  VALUES
                     ('Ryan' , 'Declined' , '262' ,'Yes' , 'Dave');

INSERT INTO EMPLOYEE (name,status, requestid , escalate, manager)  VALUES
                     ('Peter' , 'Declined' , '262' ,'Yes' , 'Dave');

