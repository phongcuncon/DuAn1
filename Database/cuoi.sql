USE [master]
GO
/****** Object:  Database [QLKS_DB]    Script Date: 08/12/2022 4:30:56 CH ******/
Create DATABASE [QLKS_DB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLKS_DB', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\QLKS_DB.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLKS_DB_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\QLKS_DB_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [QLKS_DB] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLKS_DB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLKS_DB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLKS_DB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLKS_DB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLKS_DB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLKS_DB] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLKS_DB] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QLKS_DB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLKS_DB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLKS_DB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLKS_DB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLKS_DB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLKS_DB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLKS_DB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLKS_DB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLKS_DB] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLKS_DB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLKS_DB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLKS_DB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLKS_DB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLKS_DB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLKS_DB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLKS_DB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLKS_DB] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLKS_DB] SET  MULTI_USER 
GO
ALTER DATABASE [QLKS_DB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLKS_DB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLKS_DB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLKS_DB] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLKS_DB] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLKS_DB] SET QUERY_STORE = OFF
GO
USE [QLKS_DB]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 08/12/2022 4:30:56 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaCTHD] [varchar](20) NOT NULL,
	[DonGia] [decimal](18, 0) NULL,
	[ThanhTien] [decimal](18, 0) NULL,
	[MaHD] [varchar](20) NULL,
	[MaNV] [nvarchar](20) NULL,
	[MaPhong] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DatPhong]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DatPhong](
	[MaDP] [varchar](20) NULL,
	[NgayDatPhong] [date] NULL,
	[NgayTraPhong] [date] NULL,
	[DatCoc] [decimal](18, 0) NULL,
	[GhiChu] [nvarchar](max) NULL,
	[MaKH] [varchar](20) NULL,
	[MaLoaiPhong] [varchar](20) NULL,
	[MaPhong] [varchar](20) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDV] [varchar](20) NOT NULL,
	[TenDV] [nvarchar](50) NULL,
	[Gia] [decimal](18, 0) NULL,
	[GhiChu] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [varchar](20) NOT NULL,
	[DiaChi] [nvarchar](50) NULL,
	[Gia] [decimal](18, 0) NULL,
	[MaKH] [varchar](20) NULL,
	[MaDV] [varchar](20) NULL,
	[NgayXuat] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [varchar](20) NOT NULL,
	[TenKH] [nvarchar](50) NULL,
	[Tuoi] [int] NULL,
	[CCCD] [varchar](50) NULL,
	[DoThanThiet] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[Sdt] [varchar](15) NULL,
	[GioiTinh] [bit] NULL,
	[GhiChu] [nvarchar](max) NULL,
 CONSTRAINT [PK__KhachHan__2725CF1E58D9270D] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Kho]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Kho](
	[MaLoaiHang] [nvarchar](40) NOT NULL,
	[TenHang] [nvarchar](max) NULL,
	[ThoiGianNhap] [date] NULL,
	[SoLuong] [int] NULL,
	[GhiChu] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoaiHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LichLam]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LichLam](
	[Ma] [varchar](20) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[ChucDanh] [nvarchar](50) NULL,
	[NgayLam] [date] NULL,
	[Ca] [int] NULL,
	[MaNV] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK__LichLam__3214CC9F47882054] PRIMARY KEY CLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoaiPhong] [varchar](20) NOT NULL,
	[TenLoaiPhong] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](20) NOT NULL,
	[TenNV] [nvarchar](50) NULL,
	[TenDN] [varchar](20) NULL,
	[Anh] [varchar](20) NULL,
	[MatKhau] [varchar](20) NULL,
	[ChucDanh] [nvarchar](30) NULL,
	[Sdt] [varchar](50) NULL,
	[DiaChi] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [bit] NULL,
	[Email] [nvarchar](50) NULL,
	[CCCD] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [varchar](20) NOT NULL,
	[Tang] [int] NULL,
	[GiaTheoGio] [decimal](18, 0) NULL,
	[GiatheoNgay] [decimal](18, 0) NULL,
	[TrangThai] [nvarchar](50) NULL,
	[MaLoaiPhong] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'01', CAST(20000 AS Decimal(18, 0)), CAST(20000 AS Decimal(18, 0)), N'HD001', N'NV001', N'P101')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'02', CAST(12000 AS Decimal(18, 0)), CAST(12000 AS Decimal(18, 0)), N'HD003', N'NV002', N'P103')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'03', CAST(12900 AS Decimal(18, 0)), CAST(12900 AS Decimal(18, 0)), N'HD002', N'NV004', N'P104')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'04', CAST(20000 AS Decimal(18, 0)), CAST(20000 AS Decimal(18, 0)), N'HD004', N'NV003', N'P102')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'05', CAST(67000 AS Decimal(18, 0)), CAST(67000 AS Decimal(18, 0)), N'HD009', N'NV001', N'P110')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'06', CAST(12300 AS Decimal(18, 0)), CAST(12300 AS Decimal(18, 0)), N'HD007', N'NV009', N'P105')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'07', CAST(67000 AS Decimal(18, 0)), CAST(67000 AS Decimal(18, 0)), N'HD005', N'NV002', N'P110')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'08', CAST(67890 AS Decimal(18, 0)), CAST(67890 AS Decimal(18, 0)), N'HD008', N'NV010', N'P111')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'09', CAST(12345 AS Decimal(18, 0)), CAST(12345 AS Decimal(18, 0)), N'HD006', N'NV003', N'P109')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'10', CAST(56789 AS Decimal(18, 0)), CAST(56789 AS Decimal(18, 0)), N'HD010', N'NV008', N'P108')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'11', CAST(12345 AS Decimal(18, 0)), CAST(12345 AS Decimal(18, 0)), N'HD012', N'NV007', N'P107')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [DonGia], [ThanhTien], [MaHD], [MaNV], [MaPhong]) VALUES (N'12', CAST(88888 AS Decimal(18, 0)), CAST(99999 AS Decimal(18, 0)), N'HD013', N'NV005', N'P106')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'1', CAST(N'2020-10-20' AS Date), CAST(N'2020-10-22' AS Date), CAST(100000 AS Decimal(18, 0)), NULL, N'KH001', N'2', N'P101')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'10', CAST(N'2020-10-20' AS Date), CAST(N'2020-10-20' AS Date), CAST(1000 AS Decimal(18, 0)), NULL, N'KH009', N'1', N'P102')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'11', CAST(N'2022-12-07' AS Date), CAST(N'2022-12-08' AS Date), CAST(350 AS Decimal(18, 0)), N'', N'KH015', N'1', N'P212')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'12', CAST(N'2022-12-06' AS Date), CAST(N'2022-12-07' AS Date), CAST(40000 AS Decimal(18, 0)), N'', N'KH006', N'2', N'P104')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'13', CAST(N'2023-08-23' AS Date), CAST(N'2022-12-15' AS Date), CAST(1000 AS Decimal(18, 0)), N'', N'KH005', N'2', N'P108')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'15', CAST(N'2022-12-15' AS Date), CAST(N'2022-12-23' AS Date), CAST(300 AS Decimal(18, 0)), N'', N'KH014', N'2', N'P112')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'21', CAST(N'2022-12-09' AS Date), CAST(N'2022-12-09' AS Date), CAST(200 AS Decimal(18, 0)), N'	', N'KH012', N'1', N'P209')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'3', CAST(N'2020-10-20' AS Date), CAST(N'2020-10-22' AS Date), CAST(100000 AS Decimal(18, 0)), NULL, N'KH002', N'1', N'P105')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'31', CAST(N'2022-12-08' AS Date), CAST(N'2022-12-09' AS Date), CAST(400 AS Decimal(18, 0)), N'', N'KH013', N'2', N'P201')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'32', CAST(N'2022-12-08' AS Date), CAST(N'2022-12-16' AS Date), CAST(8000 AS Decimal(18, 0)), N'', N'KH013', N'1', N'P203')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (N'4', CAST(N'2020-10-20' AS Date), CAST(N'2020-10-22' AS Date), CAST(100000 AS Decimal(18, 0)), NULL, N'KH002', N'1', N'P106')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (NULL, CAST(N'2022-12-09' AS Date), CAST(N'2022-12-10' AS Date), CAST(100 AS Decimal(18, 0)), N'', N'KH014', N'2', N'P207')
INSERT [dbo].[DatPhong] ([MaDP], [NgayDatPhong], [NgayTraPhong], [DatCoc], [GhiChu], [MaKH], [MaLoaiPhong], [MaPhong]) VALUES (NULL, CAST(N'2022-12-09' AS Date), CAST(N'2022-12-10' AS Date), CAST(100 AS Decimal(18, 0)), N'', N'KH018', N'1', N'P205')
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV001', N'Giặt ủi quần áo', CAST(100000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV002', N'Xe đưa đón sân bay', CAST(200000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV003', N'Quầy bar', CAST(220000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV004', N'Dịch vụ Spa', CAST(150000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV005', N'Nhà hàng', CAST(300000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV006', N'Dịch vụ hội họp, văn phòng', CAST(200000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [Gia], [GhiChu]) VALUES (N'DV007', N'Fitness center', CAST(400000 AS Decimal(18, 0)), NULL)
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD001', N'TP HCM', CAST(100000 AS Decimal(18, 0)), N'KH001', N'DV001', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD002', N'TP HCM', CAST(100000 AS Decimal(18, 0)), N'KH002', N'DV001', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD003', N'TP HCM', CAST(100000 AS Decimal(18, 0)), N'KH003', N'DV003', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD004', N'TP HCM', CAST(100000 AS Decimal(18, 0)), N'KH004', N'DV003', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD005', N'TP HCM', CAST(200000 AS Decimal(18, 0)), N'KH005', N'DV002', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD006', N'TP HCM', CAST(150000 AS Decimal(18, 0)), N'KH008', N'DV005', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD007', N'TP HCM', CAST(140000 AS Decimal(18, 0)), N'KH006', N'DV004', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD008', N'TP HCM', CAST(170000 AS Decimal(18, 0)), N'KH007', N'DV002', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD009', N'TP HCM', CAST(180000 AS Decimal(18, 0)), N'KH006', N'DV003', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD010', N'TP HCM', CAST(190000 AS Decimal(18, 0)), N'KH009', N'DV001', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD011', N'TP HCM', CAST(190000 AS Decimal(18, 0)), N'KH010', N'DV001', CAST(N'2020-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD012', N'TP HCM', CAST(200000 AS Decimal(18, 0)), N'KH011', N'DV002', CAST(N'2021-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [DiaChi], [Gia], [MaKH], [MaDV], [NgayXuat]) VALUES (N'HD013', N'TP HCM', CAST(200000 AS Decimal(18, 0)), N'KH012', N'DV002', CAST(N'2021-10-20' AS Date))
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH001', N'Điêu Phương Dung', 27, N'079215000001', N'VIP', N'Phường 13, Quận 8, Hồ Chí Minh (tphcm)', N'076 621 7953', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH002', N'Tòng Thiên Khánh', 28, N'079215000001', N'VIP', N'Phường Tân Phú, Quận 7, Hồ Chí Minh (tphcm)', N'058 817 5290', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH003', N'Anh Anh Mai', 28, N'079215000001', N'Thường', N'Phường Tam Bình, Quận Thủ Đức, Hồ Chí Minh (tphcm)', N'090 320 1569', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH004', N'Nghiêm Hải Nguyên', 30, N'079215000001', N'Thường', N'Xã Phước Kiển, Huyện Nhà Bè, Hồ Chí Minh (tphcm)', N'098 732 4165', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH005', N'Phạm Thế Quyền', 31, N'079215000001', N'Thường', N'Xã Xuân Thới Sơn, Huyện Hóc Môn, Hồ Chí Minh (tphcm)', N'084 310 7842', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH006', N'La Dạ Nguyệt', 26, N'079215000001', N'VIP', N'Phường 05, Quận Gò Vấp, Hồ Chí Minh (tphcm)', N'098 130 4598', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH007', N'Doãn Tố Loan', 26, N'079215000001', N'Thường', N'Phường Bình Hưng Hoà B, Quận Bình Tân, Hồ Chí Minh (tphcm)', N'036 431 8096', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH008', N'Ngụy Vương Gia', 28, N'079215000001', N'VIP', N'Xã Phước Lộc, Huyện Nhà Bè, Hồ Chí Minh (tphcm)', N'076 418 5390', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH009', N'Cung Hoàng Thư', 29, N'079215000001', N'Thường', N'Phường 09, Quận 10, Hồ Chí Minh (tphcm)', N'070 625 8173', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH010', N'Lăng Quốc Mỹ', 33, N'079215000001', N'VIP', N'Xã Lê Minh Xuân, Huyện Bình Chánh, Hồ Chí Minh (tphcm)', N'078 385 7406', 0, N'')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH011', N'Quang Lệ Nga', 25, N'079215000001', N'Thường', N'Phường 07, Quận 3, Hồ Chí Minh (tphcm)', N'079 561 8734', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH012', N'Tiếp Quỳnh Chi', 22, N'079215000001', N'Thường', N'Phường 01, Quận 3, Hồ Chí Minh (tphcm)', N'090 397 1086', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH013', N'Đương Lục Bình', 27, N'079215000001', N'Thường', N'Phường 11, Quận Bình Thạnh, Hồ Chí Minh (tphcm)', N'098 241 6973', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH014', N'Kông Vân Nhi', 21, N'079215000001', N'Thường', N'Phường 15, Quận Gò Vấp, Hồ Chí Minh (tphcm)', N'099 041 3562', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH015', N'Linh Hiền Thục', 27, N'079215000001', N'Thường', N'Xã Bình Chánh, Huyện Bình Chánh, Hồ Chí Minh (tphcm)', N'035 750 9462', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH016', N'Hướng Hoàng Minh', 33, N'079215000001', N'VIP', N'Phường Linh Tây, Quận Thủ Đức, Hồ Chí Minh (tphcm)', N'082 082 6139', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH017', N'Phong Bảo Bình', 21, N'079215000001', N'Thường', N'Phường 11, Quận Tân Bình, Hồ Chí Minh (tphcm)', N'097 047 3912', 0, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH018', N'Giả Xuân Hiếu', 27, N'079215000001', N'Thường', N'Phường 10, Quận Phú Nhuận, Hồ Chí Minh (tphcm)', N'085 015 8349', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH019', N'Lộ Trung Ðức', 29, N'079215000001', N'VIP', N'Phường Tân Chánh Hiệp, Quận 12, Hồ Chí Minh (tphcm)', N'089 075 8921', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH020', N'Ngạc Minh Dân', 30, N'079215000001', N'Thường', N'Phường 03, Quận 10, Hồ Chí Minh (tphcm)', N'083 263 5109', 1, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [Tuoi], [CCCD], [DoThanThiet], [DiaChi], [Sdt], [GioiTinh], [GhiChu]) VALUES (N'KH021', N'Hứa Tâm Hằng', 29, N'079215000001', N'Thường', N'Phường Linh Đông, Quận Thủ Đức, Hồ Chí Minh (tphcm)', N'033 629 8347', 0, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A001', N'Nệm cao su Cát Tường', CAST(N'2020-10-20' AS Date), 12, N'')
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A002', N'Khăn tắm Charis,ma', CAST(N'2020-10-20' AS Date), 25, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A003', N'Ruột gối Doona Prôm', CAST(N'2020-10-20' AS Date), 18, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A004', N'Giường ngủ', CAST(N'2020-10-20' AS Date), 20, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A005', N'Tủ kệ Savoye', CAST(N'2022-10-20' AS Date), 15, N'')
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A006', N'Bồn tắm', CAST(N'2020-08-19' AS Date), 19, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A007', N'Tủ kệ Savoye', CAST(N'2022-10-20' AS Date), 15, N'')
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'A011', N'Đèn ngủ', CAST(N'2020-10-19' AS Date), 21, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'B001', N'Rượu vang trắng', CAST(N'2020-10-20' AS Date), 15, N'San pham tot')
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'B002', N'Rượu vang đỏ', CAST(N'2020-10-20' AS Date), 17, NULL)
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'B003', N'Rượu vang trắng', CAST(N'2020-10-20' AS Date), 18, N'')
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'C001', N'Máy sấy tóc', CAST(N'2020-10-20' AS Date), 20, N'Can them hang')
INSERT [dbo].[Kho] ([MaLoaiHang], [TenHang], [ThoiGianNhap], [SoLuong], [GhiChu]) VALUES (N'C002', N'Máy nước nóng Ariston', CAST(N'2020-09-17' AS Date), 7, NULL)
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'001', N'Ngô Hoàng Quốc Việt', N'Quan Li', CAST(N'2020-10-20' AS Date), 2, N'NV001')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'002', N'Tạ Quốc Phong', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 3, N'NV002')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'003', N'Đặng Hoàng Cảnh', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 4, N'NV003')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'004', N'Cáp Hữu Diệu', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 1, N'NV004')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'005', N'Nguyễn Thành Đạt', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 2, N'NV005')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'006', N'Nuyễn Thi Hong', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 2, N'NV014')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'007', N'Nguyễn Võ Hải Đăng', N'Quan Li', CAST(N'2020-10-20' AS Date), 2, N'NV010')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'008', N'Nguyễn Minh Quân', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 4, N'NV008')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'009', N'Nguyễn Hoàng Long', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 2, N'NV021')
INSERT [dbo].[LichLam] ([Ma], [HoTen], [ChucDanh], [NgayLam], [Ca], [MaNV]) VALUES (N'010', N'Nguyễn Minh Quân', N'Nhân Viên', CAST(N'2020-10-20' AS Date), 3, N'NV022')
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong]) VALUES (N'1', N'Thuong')
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong]) VALUES (N'2', N'VIP')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV001', N'Ngô Hoàng Quốc Việt', N'TyS', N'null', N'091203', N'Nhân Viên', N'091203', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222111')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV002', N'Tạ Quốc Phong', N'Wind', NULL, N'123', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV003', N'Đặng Hoàng Cảnh', N'Bi', NULL, N'020703', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV004', N'Cáp Hữu Diệu', N'Dieu', N'', N'123', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV005', N'Nguyễn Thành Đạt', N'Dat', N'', N'123', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV006', N'Nuyễn Thi Việt', N'Viet', NULL, N'123', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV007', N'Hồ Thị Ngọc Nga', N'Nga', N'null', N'123', N'Nhân Viên', N'123', N'TP HCM', CAST(N'2020-10-01' AS Date), 1, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV008', N'Nguyễn Minh Quân', N'Quan', NULL, N'123', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV009', N'Nguyễn Hoàng Long', N'Long', N'', N'123', N'Nhân Viên', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV010', N'Nguyễn Võ Hải Đăng', N'Dang', NULL, N'123', N'Quản lí', N'012345678', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV011', N'Minh Hùng', NULL, NULL, NULL, N'Quản lí', N'01923912378', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung@gmail.com', N'1231313132')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV012', N'Hưng', NULL, NULL, NULL, N'Quản lí', N'123123131', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV013', N'Nuyễn Thi Hoa', N'Hoa', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'hoa@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV014', N'Nuyễn Thi Hong', N'Hong', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'hong@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV015', N'Hưng', N'Hung', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV016', N'Hưng', N'Hung', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV017', N'Hưng', N'Hung', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV018', N'Hưng', N'Hung', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV019', N'Hưng', N'Hung', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV020', N'Hưng', N'Hung', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2022-11-13' AS Date), 1, N'hung123@gmail.com', N'123131313')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV021', N'Nguyễn Hoàng Long', N'Long', NULL, N'123', N'Quản lí', N'123', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [TenDN], [Anh], [MatKhau], [ChucDanh], [Sdt], [DiaChi], [NgaySinh], [GioiTinh], [Email], [CCCD]) VALUES (N'NV022', N'Nguyễn Minh Quân', N'Quan', NULL, N'123', N'Nhân Viên', N'123', N'TP HCM', CAST(N'2020-10-01' AS Date), 0, N'Ty@gmail.com', N'22222222')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P101', 1, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Đã có người', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P102', 1, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Đã có người', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P103', 3, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P104', 2, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P105', 2, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Đã có người', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P106', 3, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Đã có người', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P107', 4, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P108', 5, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P109', 5, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P110', 5, CAST(100 AS Decimal(18, 0)), CAST(500 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P111', 2, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P112', 4, CAST(100 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P201', 3, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P202', 2, CAST(100 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P203', 1, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P204', 2, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P205', 3, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P206', 4, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P207', 3, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P208', 2, CAST(200 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P209', 3, CAST(100 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'2')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P210', 4, CAST(100 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P211', 5, CAST(100 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Trống', N'1')
INSERT [dbo].[Phong] ([MaPhong], [Tang], [GiaTheoGio], [GiatheoNgay], [TrangThai], [MaLoaiPhong]) VALUES (N'P212', 34, CAST(100 AS Decimal(18, 0)), CAST(1000 AS Decimal(18, 0)), N'Đã có người', N'1')
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK__DatPhong__MaKH__5629CD9C] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK__DatPhong__MaKH__5629CD9C]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK__DatPhong__MaPhon__5812160E] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK__DatPhong__MaPhon__5812160E]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaDV])
REFERENCES [dbo].[DichVu] ([MaDV])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK__HoaDon__MaKH__5AEE82B9] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK__HoaDon__MaKH__5AEE82B9]
GO
ALTER TABLE [dbo].[LichLam]  WITH CHECK ADD  CONSTRAINT [FK__LichLam__MaNV__02FC7413] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[LichLam] CHECK CONSTRAINT [FK__LichLam__MaNV__02FC7413]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
GO
/****** Object:  StoredProcedure [dbo].[sp_CTDV]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_CTDV](@MaPhong nvarchar(20))
as begin
	SELECT
		dv.MaDV as MaDV,
		dv.TenDV as TenDV,
		dv.Gia as DonGia,
		COUNT(DV.MaDV) as SoLuong,
		dv.Gia*COUNT(DV.MaDV) as ThanhTien
	FROM DichVu dv 
		inner join HoaDon hd ON dv.MaDV = hd.MaDV
		inner join ChiTietHoaDon cthd ON hd.MaHD = cthd.MaHD
		inner join Phong p ON cthd.MaPhong = p.MaPhong
	WHERE @MaPhong = P.MaPhong
	GROUP BY P.MaPhong,	dv.MaDV,dv.TenDV,dv.Gia
end
GO
/****** Object:  StoredProcedure [dbo].[sp_CTPhong]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[sp_CTPhong](@MaPhong nvarchar(20))
as begin
	SELECT
		p.MaPhong as MaPhong,
		kh.TenKH as TenKH,
		dp.NgayTraPhong as NgayTraPhong,
		p.GiatheoNgay as GiaTheoNgay,
		p.GiaTheoGio as GiaTheoGio

	FROM Phong p
		inner JOIN ChiTietHoaDon cthd ON p.MaPhong=cthd.MaPhong
		inner JOIN HoaDon hd ON cthd.MaHD=hd.MaHD  
		inner join KhachHang kh ON hd.MaKH = kh.MaKH
		inner join DatPhong dp ON kh.MaKH = dp.MaKH
		inner JOIN  DichVu dv ON dv.MaDV = hd.MaDV
		
	WHERE @MaPhong = p.MaPhong
	GROUP BY p.MaPhong,p.GiatheoNgay,p.GiaTheoGio,kh.TenKH,dp.NgayTraPhong
end
GO
/****** Object:  StoredProcedure [dbo].[sp_DichVu]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[sp_DichVu]
AS BEGIN
	SELECT
		dv.TenDV TenDV,
		dv.MaDV MaDV,
		COUNT(hd.MaDV) SoLuong,
		SUM(dv.gia) TongTien
	FROM DichVu dv JOIN HoaDon hd ON dv.MaDV = hd.MaDV
	
	gROUP BY DV.MaDV,DV.TenDV
END
GO
/****** Object:  StoredProcedure [dbo].[sp_loadPhong]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[sp_loadPhong]
AS BEGIN
	IF  EXISTS(select MaPhong from DatPhong )
	BEGIN
		update Phong set TrangThai = N'Đã có người'
		from DatPhong dp inner join Phong p ON dp.MaPhong = p.MaPhong
		return
		
	END
	
	Begin
	Update Phong set TrangThai = N'Trống'
	
	end
END
GO
/****** Object:  StoredProcedure [dbo].[sp_loadPhong1]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[sp_loadPhong1]
AS BEGIN
	
	
	Begin
	Update Phong set TrangThai = N'Trống'
	
	end
END
GO
/****** Object:  StoredProcedure [dbo].[sp_ThongKeDoanhThu]    Script Date: 08/12/2022 4:30:57 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[sp_ThongKeDoanhThu](@day varchar(20))
AS BEGIN
	SELECT
		hd.NgayXuat,
		ph.MaPhong Phong,
		kh.TenKH,
		hd.MaHD,
		SUM(hd.Gia) DoanhThu,
		nv.MaNV
	FROM KhachHang kh
		JOIN HoaDon hd ON kh.MaKH=hd.MaKH
		JOIN ChiTietHoaDon cthd ON cthd.MaHD=hd.MaHD 
		JOIN  NhanVien nv ON nv.MaNV = cthd.MaNV
		JOIN Phong ph ON ph.MaPhong = cthd.MaPhong
	WHERE  YEAR(hd.NgayXuat) = @day 
	GROUP BY ph.MaPhong,kh.TenKH,hd.MaHD,nv.MaNV,hd.NgayXuat
END
GO
USE [master]
GO
ALTER DATABASE [QLKS_DB] SET  READ_WRITE 
GO
