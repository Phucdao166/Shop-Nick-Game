CREATE DATABASE Nro

GO
USE Nro
GO
CREATE TABLE [Accounts](
	[uID] int NOT NULL IDENTITY (1,1) ,
	[User] [varchar](255) NULL,
	[Pass] [varchar](255) NULL,
	[isAdmin] [int] NULL
	PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
)
GO
CREATE TABLE [Category](
	[Cid] [int] NOT NULL,
	[Cname] [nvarchar](50) NOT NULL
	CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[Cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
)
GO
CREATE TABLE [Products](
	[NickID] [int] IDENTITY(1,1) NOT NULL,
	[Sever] [int],
	[Plannet] [nvarchar](50) NULL,			
	[Image] [nvarchar](max) NULL,
	[Price] [int] NULL,
	[CateID] [int] NULL,
	[SellID] [int] NULL,
	[Powers] [nvarchar](50) NULL,
	[Intrinsic] [nvarchar](150) NULL,
	[Disciple] [nvarchar](150) NULL,
	[LevelSkill] [int] NULL,
	[DetailImage] [nvarchar](max) NULL,
	[Description] [nvarchar](max) NULL
)
GO
SET IDENTITY_INSERT [Accounts] ON 
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (1, N'Admin', N'123', 1)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (2, N'Goku', N'111111', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (3, N'Vegeta', N'846326', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (4, N'Bulma', N'975479', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (5, N'Krillin', N'356793', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (6, N'Yamcha', N'363756', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (7, N'Puar', N'168480', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (8, N'Oolong', N'064464', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (9, N'ChiChi', N'356836', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (10, N'Chiaotzu', N'987467', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (11, N'Karin ', N'345645', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (12, N'Yajirobe', N'32425', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (13, N'Launch', N'241234', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (14, N'Piccolo', N'325643', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (15, N'Gohan', N'235154', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (16, N'Dende', N'657345', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (17, N'Goten', N'325153', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (18, N'Videl', N'75245', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (19, N'Trunks', N'765865', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (20, N'Satan', N'465478', 0)
INSERT [Accounts] ([uID], [User], [Pass], [isAdmin]) VALUES (21, N'Buu', N'986867', 0)
SET IDENTITY_INSERT [Accounts] OFF

INSERT [Category] ([cid], [cname]) VALUES (1, N'Xayda')
INSERT [Category] ([cid], [cname]) VALUES (2, N'Trái Đất')
INSERT [Category] ([cid], [cname]) VALUES (3, N'Namec')

SET IDENTITY_INSERT [Products] ON 
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --xd1
VALUES (1, 2,N'Xayda',N'https://i.imgur.com/Yof9UFX.jpg', 300000 , 1, 1, N'33 tỷ', N'Tự phát nổ 20%', N'Namec', 77777356, N'https://i.imgur.com/HHsY9M7.jpg', N'Pem rương 11 ổn' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --td1
VALUES (2, 3,N'Trái Đất',N'https://i.imgur.com/7WG0coG.jpg', 150000, 2, 1, N'2 tỷ', N'Chưa mở nội tại', N'Xayda', 77721034, N'https://i.imgur.com/9GYSOgH.jpg', N'Dành cho ai đam mê trái đất' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --xd2
VALUES (3, 6,N'Xayda',N'https://i.imgur.com/84EKpHS.jpg', 450000, 1, 1, N'32 tỷ', N'Tự phát nổ 39%', N'Namec', 77777767, N'https://i.imgur.com/qC10RZl.jpg', N'Săn bos ok' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --nm1
VALUES (4, 7,N'Namec',N'https://i.imgur.com/cfAgfTI.jpg', 3800000, 3, 1, N'54 tỷ', N'Liên hoàn 17%', N'Trái Đất', 77767766, N'https://i.imgur.com/R9x3O5A.jpg', N'Săn boss cực mạnh, kèm đồ sđ' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --xd3
VALUES (5, 4,N'Xayda', N'https://i.imgur.com/IxHVDMq.jpg', 250000 , 1, 1, N'45 tỷ', N'Đấm galick 14%', N'Namec', 77777767, N'https://i.imgur.com/qRYznFI.jpg', N'Pem rương 11 ổn, săn bos ok' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --td2
VALUES (6, 9,N'Trái Đất', N'https://i.imgur.com/dbBxsyw.jpg', 450000, 2, 1, N'30 tỷ', N'Quả cầu kênh khi 33%', N'Xayda', 77773655, N'https://i.imgur.com/My7lgXc.jpg', N'Pk ổn' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --nm2
VALUES (7, 8,N'Namec', N'https://i.imgur.com/p0Yx07o.jpg', 550000, 3, 1, N'41 tỷ', N'Đẻ trứng 21%', N'Xayda', 77777756, N'https://i.imgur.com/aEnh48F.jpg', N'Săn boss tạm, pem rương 11 ngon' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --xd4
VALUES (8, 1,N'Xayda', N'https://i.imgur.com/xjVMVoS.jpg', 370000, 1, 1, N'32 tỷ', N'Đấm galick 11%', N'Trái Đất', 77777555, N'https://i.imgur.com/u7bfSiA.jpg', N'Đi bđkb ok ' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --td3
VALUES (9, 5,N'Trái Đất', N'https://i.imgur.com/50rNRRH.jpg', 280000, 2, 1, N'40 tỷ', N'Dịch chuyển tức thời 72%', N'Xayda', 77777765, N'https://i.imgur.com/J0gfsX5.jpg', N'Pk ngon' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --td4
VALUES (10, 9,N'Trái Đất', N'https://i.imgur.com/uU14pBh.jpg', 650000, 2, 1, N'40 tỷ', N'Quả cầu kênh khi 33%', N'Trái Đất', 77777566, N'https://i.imgur.com/gIGV1oC.jpg', N'Pk ổn' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --xd5
VALUES (11, 5,N'Xayda', N'https://i.imgur.com/JiSreUT.jpg', 950000, 1, 1, N'52 tỷ', N'Đấm galick 8%', N'Trái Đất', 77777776, N'https://i.imgur.com/LIdsnm0.jpg', N'Săn boss ngon, ôm nrsđ' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --nm3
VALUES (12, 2,N'Namec', N'https://i.imgur.com/0MirdBn.jpg', 100000, 3, 1, N'9 tỷ', N'Chưa mở nội tại', N'Trái Đất', 77747606, N'https://i.imgur.com/CIBdJVz.jpg', N'Auto treo buff' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --td5
VALUES (13, 7,N'Trái Đất', N'https://i.imgur.com/NYEUMvJ.jpg',  250000, 2, 1, N'40 tỷ', N'Dịch chuyển tức thời 82%', N'Xayda', 77771555, N'https://i.imgur.com/10AiTI2.jpg', N'Pk ổn' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --nm4
VALUES (14, 3,N'Namec', N'https://i.imgur.com/H61k0OD.jpg',  400000, 3, 1, N'40 tỷ', N'Khiên năng lượng 25%', N'Namec', 77777666, N'https://i.imgur.com/N3jE9Xq.jpg', N'Pem rương 11 ngon' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --td6
VALUES (15, 4,N'Trái Đất', N'https://i.imgur.com/a9hoGji.jpg',  220000, 2, 1, N'25 tỷ', N'Chí mạng liên tục khi hp dưới 26%', N'Xayda', 77773556, N'https://i.imgur.com/d8L4xgz.jpg', N'Pk ổn' )
INSERT [Products] ([NickID],[Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description]) --nm5
VALUES (16, 6,N'Namec', N'https://i.imgur.com/5FzoirX.jpg', 750000, 3, 1, N'51 tỷ', N'Liên hoàn 15%', N'Xayda', 77777767, N'https://i.imgur.com/0r19FbT.jpg', N'Săn boss ổn' )
SET IDENTITY_INSERT [Products] Off
