create database Paymentapp;
use Paymentapp;
CREATE TABLE User_Info (
    User_Id INT auto_increment not NULL,
    First_Name VARCHAR(25),
    Last_Name VARCHAR(25),
    Phone_No varchar(15),
    Date_Of_Birth VARCHAR(25),
    Address VARCHAR(100),
    PassWord VARCHAR(25),
    Curr_Wallet_Balance double,
    PRIMARY KEY (User_Id)
);
Select * from User_Info;
Update User_Info set Curr_Wallet_Balance = Curr_Wallet_Balance + 800 where User_Id = 2;
Select * from Bank_Account_Details;
Update Bank_Account_Details Set Curr_Bank_Balance = Curr_Bank_Balance + 300 where Bank_AcctNo = 1234;
CREATE TABLE Bank_Account_Details (
    Bank_AcctNo INT NOT NULL,
    Bank_AcctBankName VARCHAR(25),
    Acct_TypeId Varchar(15) Not NUll,
    Bank_IFSC_Code VARCHAR(20),
    Bank_AcctPin INT,
    Bank_User_Id INT,
    Curr_Bank_Balance double,
    FOREIGN KEY (Bank_User_Id) REFERENCES User_Info (User_Id),
    PRIMARY KEY (Bank_AcctNo)
);
drop table Bank_Account_Details;
CREATE TABLE Transaction (
    Txn_Id varchar(45),
    Txn_Date date,
    Txn_Amount DOUBLE,
    Txn_Type varchar(25),
    Txn_AcctType_Source Varchar(25),
    Txn_AcctType_Dest Varchar(25),
    Txn_User_Id int,
    FOREIGN KEY (Txn_User_Id) REFERENCES User_Info (User_Id),
    PRIMARY KEY (Txn_Id)
);
select * from Transaction;
drop table Transaction;