USE [master]
GO
/****** Object:  Database [MariaCafe]    Script Date: 21-Mar-18 8:26:54 AM ******/
CREATE DATABASE [MariaCafe] ON  PRIMARY 
( NAME = N'MariaCafe', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\MariaCafe.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'MariaCafe_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\MariaCafe_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [MariaCafe].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [MariaCafe] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [MariaCafe] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [MariaCafe] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [MariaCafe] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [MariaCafe] SET ARITHABORT OFF 
GO
ALTER DATABASE [MariaCafe] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [MariaCafe] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [MariaCafe] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [MariaCafe] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [MariaCafe] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [MariaCafe] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [MariaCafe] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [MariaCafe] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [MariaCafe] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [MariaCafe] SET  DISABLE_BROKER 
GO
ALTER DATABASE [MariaCafe] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [MariaCafe] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [MariaCafe] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [MariaCafe] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [MariaCafe] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [MariaCafe] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [MariaCafe] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [MariaCafe] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [MariaCafe] SET  MULTI_USER 
GO
ALTER DATABASE [MariaCafe] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [MariaCafe] SET DB_CHAINING OFF 
GO
USE [MariaCafe]
GO
/****** Object:  Table [dbo].[AddressAndContact]    Script Date: 21-Mar-18 8:26:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AddressAndContact](
	[Phone] [nchar](10) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[Address] [nvarchar](50) NOT NULL,
	[Description] [nvarchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cakes]    Script Date: 21-Mar-18 8:26:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cakes](
	[CakeID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[ImagePath] [nvarchar](50) NOT NULL,
	[Description] [nvarchar](max) NOT NULL,
	[Price] [float] NOT NULL,
	[DateCreated] [date] NOT NULL,
 CONSTRAINT [PK_Cakes] PRIMARY KEY CLUSTERED 
(
	[CakeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OpeningHours]    Script Date: 21-Mar-18 8:26:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OpeningHours](
	[Closed] [nvarchar](50) NOT NULL,
	[Weekend] [nvarchar](50) NOT NULL,
	[Weekdays] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SelfDescriptions]    Script Date: 21-Mar-18 8:26:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SelfDescriptions](
	[Title] [nvarchar](50) NOT NULL,
	[ImagePath] [nvarchar](50) NOT NULL,
	[Description] [nvarchar](max) NOT NULL,
	[Sign] [nvarchar](50) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SharePages]    Script Date: 21-Mar-18 8:26:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SharePages](
	[HostID] [int] IDENTITY(1,1) NOT NULL,
	[Host] [nvarchar](50) NOT NULL,
	[Link] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_SharePages] PRIMARY KEY CLUSTERED 
(
	[HostID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[AddressAndContact] ([Phone], [Email], [Address], [Description]) VALUES (N'12345678  ', N'your-email@your-email.com ', N'Copenhagen, Denmark', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.')
SET IDENTITY_INSERT [dbo].[Cakes] ON 

INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (1, N'In the Afternoon', N'cafe.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.99, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (2, N'Traditional Cakes', N'cake.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.49, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (3, N'In the Afternoon', N'cafe.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.99, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (4, N'Traditional Cakes', N'cake.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.49, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (5, N'In the Afternoon', N'cafe.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.99, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (6, N'Traditional Cakes', N'cake.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.49, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (7, N'In the Afternoon', N'cafe.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.99, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (8, N'Traditional Cakes', N'cake.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.49, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (9, N'In the Afternoon', N'cafe.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.99, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (10, N'Traditional Cakes', N'cake.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.49, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (11, N'In the Afternoon', N'cafe.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.99, CAST(N'2018-01-30' AS Date))
INSERT [dbo].[Cakes] ([CakeID], [Name], [ImagePath], [Description], [Price], [DateCreated]) VALUES (12, N'Traditional Cakes', N'cake.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', 2.49, CAST(N'2018-01-30' AS Date))
SET IDENTITY_INSERT [dbo].[Cakes] OFF
INSERT [dbo].[OpeningHours] ([Closed], [Weekend], [Weekdays]) VALUES (N'Monday: Closed', N'Saturday and Sunday: 11.00 - 21:00', N'Tuesday - Friday: 10:00 - 20:00')
INSERT [dbo].[SelfDescriptions] ([Title], [ImagePath], [Description], [Sign]) VALUES (N'Maria''s Cosy Cafe', N'Maria.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica', N'Maria Bagnarelli')
SET IDENTITY_INSERT [dbo].[SharePages] ON 

INSERT [dbo].[SharePages] ([HostID], [Host], [Link]) VALUES (1, N'Facebook', N'fb.com')
INSERT [dbo].[SharePages] ([HostID], [Host], [Link]) VALUES (2, N'Youtube', N'youtube.com')
INSERT [dbo].[SharePages] ([HostID], [Host], [Link]) VALUES (3, N'Google', N'google.com')
SET IDENTITY_INSERT [dbo].[SharePages] OFF
ALTER TABLE [dbo].[Cakes] ADD  CONSTRAINT [DF_Cakes_DateCreated]  DEFAULT (getdate()) FOR [DateCreated]
GO
/****** Object:  StoredProcedure [dbo].[GetProducts]    Script Date: 21-Mar-18 8:26:55 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create proc [dbo].[GetProducts]
@u int,
@v int
as
begin
 SELECT a.* FROM ( 
  SELECT *, ROW_NUMBER() OVER (ORDER BY cakeID) as row 
  FROM Cakes a
 ) a WHERE a.row >= @u and a.row <= @v
end
GO
USE [master]
GO
ALTER DATABASE [MariaCafe] SET  READ_WRITE 
GO
