package bkap.entity;

public class test {
	public static void main(String[] args) {
		//Khởi tạo đối tượng từ lớp Employee\
//		Employee e1 = new Employee();
//		//Truy cập thuộc tính
//		e1.employeeId = "B9217";
//		e1.employeeName = "Nguyễn Đức Anh";
//		e1.age = 20;
//		e1.rate = 1.5f;
//		e1.salary = 25000000.678f;
		
		Employee e2 = new Employee("B9217","Nguyễn Đức Anh",20,1.5f,25000000.678f,true);
//		e1.Hienthithongtin();
		e2.Hienthithongtin();
		Employee e3 = new Employee("B9217","Nguyễn Đức Anh",20,1.5f,25000000.678f,true);
		e3.displayData();
		e3.setEmployeeName("Nguyen Duc Anh 1");
		System.out.println("Tên của đối tượng e3 là:"+e3.getEmployeeName());
	}
}
