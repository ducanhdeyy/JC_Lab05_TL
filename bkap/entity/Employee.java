package bkap.entity;

public class Employee {
	//Trường
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private Boolean employeeStatus;
	
	//2 contructor
	//contructor default
	public Employee() {
		
	}
	//contructor khởi tạo tất cả thông tin nhân viên
	public Employee(String employeeId,String employeeName,int age,float rate,float salary,Boolean employeeStatus) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
	}
	
	//Phương thức
	public void Hienthithongtin() {
		System.out.println("Mã nhân viên là:" + employeeId);
		System.out.println("Tên nhân viên là" + employeeName);
		System.out.println(age + "Tuổi");
		System.out.println("..." + rate);
		System.out.println("lương là:" + salary);
	}
	public void displayData() {
		System.out.println("Mã nhân viên là:"+this.employeeId);
		System.out.println("Tên nhân viên là:"+this.employeeName);
		System.out.println("Tuổi của nhân viên là:"+this.age);
		System.out.println("rate nhân viên là:"+this.rate);
		System.out.println("... nhân viên là:"+this.employeeStatus);
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String EmployeeId) {
		 this.employeeName = employeeName;
	}
	
}
	