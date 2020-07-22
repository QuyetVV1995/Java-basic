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

*cú pháp Setter và Getter
Setter
public void set<ten thuoc tinh>(<tham so gia tri moi>){
	this.<ten thuoc tinh> = <tham so gia tri moi>;
}

Getter
<kieu du lieu thuoc tinh> get<ten thuoc tinh>(){
	return this.<ten thuoc tinh>;
}

* su dung final de chong overriding
- overiding la: thằng con ghi đè lại hàm của thằng cha
- overloading: là 1 hàm được viết thành nhiều hàm khác nhau nhưng
khác về parameter

-Tính trừu tượng trong lập trình hướng đối tượng là chỉ nêu ra 
vấn đề mà không hiển thị cụ thể, chỉ hiển thị tính năng thiết yếu đối
với đối tượng người dùng mà không nói quy trình hoạt động

Tính trừu tượng trong Java
Lớp trừu tượng là lớp được khai báo mà không thể tạo ra đối
tượng từ lớp đó. Ta sẽ tạo những lớp con kế thừa lớp
trừu tượng.
Mục đích lớp trừu tượng là tạo ra lớp chung cho những lớp có liên quan với
nhau kế thừa.
Sử dụng từ khóa abstract trước từ khóa class

Phương thức trừu tượng là chỉ định nghĩa mà không có chương trình bên trong,
lớp con kế thừa phải bắt buộc override nó để sử dụng lại.

*Interface là một kiểu dữ liệu tham chiếu trong Java. Nó là tập hợp các phương
thức abstract. Khi một lớp kế thừa Interface, thì nó sẽ kế thừa những phương 
thức abstrach của interface đó.

*ý nghĩa từng cú pháp của phương thức Main
- public: quyền truy cập dạng public để JRE ở bên ngoài có thể truy cập
 được phương thức để thực thi
 - static: khi JRE bắt đầu, chưa có đối tượng nào được khởi tạo. vì vậy nên để
 phương thức dạng static để JVM có thể load class vào bộ nhớ và có thể gọi phương thức

 - void: phương thức main bắt buộc là void
 - String[], args: là tham số mà người dùng truyền vào sau tên lớp

 *TryCatch
 cú pháp
 try{
 	// những khối lệnh có thể phát sinh lỗi
 }catch{Exception e}{// tham số e là tên lỗi muốn xử lý
 	// chương trình thực hiện khi gặp lỗi trên
 }

 4 tính chất trong hướng đối tượng:
 - tính đóng gói	Encapsulation : Tính đóng gói nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay đổi giá trị các thuộc tính. đảm bảo tính bảo mât, toàn vẹn của đối tượng trong Java.
 - tính trừu tượng	Abstraction: tính trừu tượng là một tiến trình chỉ nói ra tính năng của người dùng, các khái niệm được định nghĩa trong quá trình phát triển, bỏ qua những chi tiết triển khai bên trong. Tính trừu tượng cho phép người lập trình tập trung cốt lõi cần thiết của đối tượng thay vì quan tâm sự phức tạp bên trong hoặc cách nó hoạt động
 - tính thừa kế		Inheritance: Tính kế thừa cho phép cải tiến chương trình bằng cách kế thừa lại lớp cũ và phát triển những tính năng mới. Lớp con sẽ kế thừa tất cả những thành phần của lớp cha, nhờ sự chia sẻ này mới có thể mở rộng những đặc tính có sẵn mà không cần phải định nghĩa lại
 - tính đa hình		Polymorphism: Tính đa hình có thể nói luôn tồn tại song song với tính kế thừa. Khi có nhiều lớp con kế thừa lớp cha nhưng có những tính chất khác nhau cũng gọi là đa hình, hoặc những tác vụ trong cùng một đối tượng được thể hiện nhiều cách khác nhau cũng gọi là đa hình. Tính đa hình là kết quả tất yếu khi ta phát triển khả năng kế thừa và nâng cấp chương trình.