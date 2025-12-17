USE master;
GO
IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'LibraryDB')
    CREATE DATABASE LibraryDB;
GO
USE LibraryDB;
GO
IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='Book' and xtype='U')
CREATE TABLE Book (
    id INT IDENTITY(1,1) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isbn VARCHAR(50)
);
GO