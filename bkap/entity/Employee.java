package bkap.entity;

import java.util.Scanner;

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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Boolean getEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(Boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	public void inputData(Scanner sc) {
		System.out.println("Nhập Id nhân viên");
		this.employeeId = sc.nextLine();
		System.out.println("Nhập tên nhân viên");
		this.employeeName = sc.nextLine();
		System.out.println("Nhập tuổi nhân viên");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập rate nhân viên");
		this.rate = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập trạng thái nhân viên");
		this.employeeStatus = Boolean.parseBoolean(sc.nextLine());
	}
	public float calSalary() {
		return this.salary = this.rate*1300000;
	}
	
}
	