use QLKS_DB

SELECT * from LoaiPhong
SELECT * from Phong
SELECT * from DichVu

insert into KhachHang VALUES('KH001',N'Nguyễn Thành Đạt',18,053203000732,N'Bạc',N'Tp Thủ Đức',N'0981263713',1,null);
insert into KhachHang VALUES('KH013',N'Nguyễn Thị Anh',27,053195000412,N'Vàng',N'Long Khánh',N'0981296323',0,null);
insert into KhachHang VALUES('KH041',N'Trần Kim Yến',30,053192073632,N'Vàng',N'Long An',N'0972113713',0,null);
insert into KhachHang VALUES('KH051',N'Vũ Thị Thanh Như',61,053161053222,N'Kim cương',N'Tiền Ging',N'0981263713',0,null);
insert into KhachHang VALUES('KH062',N'Trần Nhật Anh',22,053200003242,N'Vàng',N'Bến Tre',N'0983273413',1,null);
insert into KhachHang VALUES('KH002',N'Lê Vũ Trung Kiên',26,053196061232,N'Bạc',N'Hậu Giang',N'0981127912',1,null);
insert into KhachHang VALUES('KH005',N'Cảnh',24,053198064232,N'Bạc',N'Kiên Giang',N'0981263700',1,null);
insert into KhachHang VALUES('KH003',N'Diệu',24,053198064232,N'Vàng',N'Kiên Giang',N'0981223420',1,N'Đang chờ');

insert into LoaiPhong VALUEs('1',N'Double',400);
insert into Phong VALUEs('1',N'Double',400);