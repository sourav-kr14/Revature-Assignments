use joinsdb;

Select * from Employees;
Select * from Departments;
Select * from Projects;
Select * from EmployeeProjects;


CREATE TABLE AuditLog
(
AuditId int Primary Key auto_increment,
TableName varchar(100),
ActionType varchar(30),
ActionDescription varchar(255),
ActionTime DateTime
)

DELIMITER //
CREATE TRIGGER trg_Departments_AfterInsert
AFTER insert ON DEPARTMENTS
FOR each row
BEGIN
INSERT INTO AUDITLOG(TABLENAME,ACTIONTYPE,ACTIONDESCRIPTION,ACTIONTIME) 
VALUES('DEPARTMENT','INSERT',
CONCAT
('NEW DEPARTMENT ADDED',NEW.DEPARTMENTNAME,'AT',NEW.LOCATION),
NOW()
);
END //

Select * from AuditLog;
SELECT * from Departments;
INSERT INTO Departments values (6,'Admin','Delhi')


-- BEFORE TRIGGER
DELIMITER //
CREATE TRIGGER trg_EmployeeProjects_BeforeInsert
BEFORE INSERT ON EMPLOYEEPROJECTS
for each row
BEGIN
IF NEW.ROLENAME IS NULL OR NEW.ROLENAME ='' THEN
SIGNAL SQLSTATE '45000'
SET MESSAGE_TEXT='Role name cannot be null or Empty';
END IF;
END //
DELIMITER ; 


INSERT INTO EmployeeProjects VALUES (108,'202','')

DROP TRIGGER trg_EmployeeProjects_AfterDelete
-- TRIGGER AFTER DELETE
DELIMITER //
CREATE TRIGGER trg_EmployeeProjects_AfterDelete
AFTER DELETE ON EMPLOYEEPROJECTS 
FOR EACH ROW
BEGIN 
INSERT INTO AUDITLOG(TABLENAME,ACTIONTYPE,ACTIONDESCRIPTION,ACTIONTIME) VALUES
(
'EMPLOYEEPROJECTS''DELETE',CONCAT('EMPLOYEE','OLD.EMPLID','REMOVED FROM PTOJECT',OLD.PROJECTID,'ROLEWAS',OLD.ROLENAME)
, NOW()
);
END //
DELIMITER ;

DELETE FROM EmployeeProjects
WHERE EmpId = 105 AND ProjectId = 204;

CREATE TABLE EmployeeAudit
(
    AuditId INT PRIMARY KEY AUTO_INCREMENT,
    EmpId INT,
    OldSalary DECIMAL(10,2),
    NewSalary DECIMAL(10,2),
    UpdatedOn DATETIME
);

-- AFTER UPDATE
DELIMITER //

CREATE TRIGGER trg_Employees_AfterUpdate
AFTER UPDATE ON Employees
FOR EACH ROW
BEGIN
    INSERT INTO EmployeeAudit(EmpId, OldSalary, NewSalary, UpdatedOn)
    VALUES
    (
        OLD.EmpId,
        OLD.Salary,
        NEW.Salary,
        NOW()
    );
END //

DELIMITER ;

SELECT * FROM EMPLOYEES 
UPDATE EMPLOYEES SET SALARY=6000 WHERE EMPID=1;


SELECT * FROM EMPLOYEEAUDIT



















