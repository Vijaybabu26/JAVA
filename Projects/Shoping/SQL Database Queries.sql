create database shopingapp;
CREATE TABLE Admin_Info (
    Admin_Id INT AUTO_INCREMENT NOT NULL,
    Admin_Fname VARCHAR(25),
    Admin_Lname VARCHAR(25),
    Admin_PNO LONG,
    Admin_Address VARCHAR(40),
    Admin_PassWord VARCHAR(20),
    Curr_Wallet_Bal DOUBLE,
    PRIMARY KEY (Admin_Id)
);
select * from Admin_info;
desc Admin_Info;
CREATE TABLE Customer_Info (
    Cus_Id INT AUTO_INCREMENT NOT NULL,
    Cus_Fname VARCHAR(25),
    Cus_Lname VARCHAR(25),
    Cus_PNo LONG,
    Cus_Address VARCHAR(40),
    Cus_PassWord VARCHAR(20),
    Curr_Wallet_Bal DOUBLE,
    PRIMARY KEY (Cus_Id)
);
select * from Customer_Info;
desc Customer_Info;
CREATE TABLE Products_Info (
    Product_Id INT AUTO_INCREMENT NOT NULL,
    Product_Name VARCHAR(30),
    Product_Price DOUBLE,
    Admin_Id INT,
    PRIMARY KEY (Product_Id),
    FOREIGN KEY (Admin_Id)
        REFERENCES Admin_Info (Admin_Id)
);
desc Products_info;
CREATE TABLE Admin_Transaction (
    Ad_Txn_Id VARCHAR(45) NOT NULL,
    Ad_Txn_Date DATE,
    Ad_Txn_Amount DOUBLE,
    Ad_Txn_Type VARCHAR(20),
    Ad_Id INT,
    Ad_Product_ID int,
    Cus_Id int,
    PRIMARY KEY (Ad_Txn_Id),
    FOREIGN KEY (Ad_Id)
        REFERENCES Admin_Info (Admin_Id),
	FOREIGN KEY (Ad_Product_ID)
        REFERENCES Products_info (Product_Id),
	FOREIGN KEY (Cus_Id)
        REFERENCES customer_info (Cus_Id)
);
drop table Admin_Transaction;
Create table Cus_Transaction(
	Cus_TxnId varchar(45) Not Null,
    Cus_Txn_Date date,
    Cus_Txn_Amount double,
    Cus_Txn_Type Varchar(20),
    Cus_Id int,
    Product_Id int,
    Cus_Order_Status Varchar(20),
    PRIMARY KEY (Cus_TxnId),
    FOREIGN KEY (Cus_Id)
        REFERENCES Customer_Info (Cus_Id),
	FOREIGN KEY (Product_Id)
        REFERENCES Products_info (Product_Id)
);


