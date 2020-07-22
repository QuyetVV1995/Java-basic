*cu phap khai bao hang
final <kieu du lieu><ten bien> = <gia tri hang>;
*ep kieu theo cu phap
(<kieu du lieu>) <ten bien>;

* cu phap re nhanh
if(<bieu thuc dieu kien>) 
<cau lech thuc hien dieu kien dung>
else
<cau lenh thuc hien dieu kien sai>

* cu phap While
while(<bieu thuc dieu kien>){
	<khoi lenh lap lai>
}

* cu phap for
for (<khoi tao bien chay>; <bieu thuc dieu kien>; <thay doi bien chay>){
	<khoi lenh lap lai>
}

* cu phap khai bao mang
<kieu du lieu>[] <ten mang> = new <kieu du lieu> [kich co mang];

* cu phap foreach
for(<kieu du lieu> <ten bien chay>:<ten mang>){
	<khoi lenh lap lai>
}

* Object:  thuoc tinh và phương thức

* cú pháp khai báo Class
<pham vi truy cap> class <ten lop>{
	<pham vi truy cap> <cac thanh phan cua lop>;
}
- <tên lớp>: là tên class do người dùng tạo ra
- <phạm vi truy cập>: gồm có những từ khóa public, protected, private...
- <các thành phần của lớp>: Là biến hoặc phương thức trong lớp

*cú pháp khai báo Phương thức
<phạm vi truy cập> <từ khóa> <kiểu dữ liệu trả về> <tên phương thức>([tham số]){
	<chương trình>
}
-<phạm vi truy cập>: phạm vi truy cập phương thức
-<từ khóa>: gồm các từ khóa final, static...
-<kiểu dữ liệu trả về>: int, long, double.... Để trả dữ liệu, dùng return
-<tên phương thức>: Tên của phương thức
-[tham số]: là những tham số ta muốn truyền vào phương thức để thực hiện
<chương trình>: những dòng code thực hiện khi gọi tên phương thức

*4 loại phạm vi truy cập: Private, (Default), Protected, Public

* Khối static: Được sử dụng cho mục đích khởi tạo giá trị các biến static. Khối sẽ được thực hiện khi lớp chứa nó được load vào trong bộ nhớ. Trong một lớp có thể có nhiều khối, các khối này chạy cùng nhau và chạy trước cả chương trình main của lớp đó.

* cú pháp khai báo và sử dụng kế thừa
class <ten lop con> extends <ten lop cha>{
	
}