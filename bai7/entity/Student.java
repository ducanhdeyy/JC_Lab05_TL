package bai7.entity;

import java.util.Scanner;

import bai7.itf.IStudent;

public class Student implements IStudent {
	private static final float MARK_PASS = 0;
	private String StudentId;
	private String StudentName;
	private int Age;
	private float DiemToan;
	private float DiemLy;
	private float DiemHoa;
	private float DiemTB;
	private boolean Status;
	
	public Student() {
		
	}

	public Student(String studentId, String studentName, int age, float diemToan, float diemLy, float diemHoa,
			float diemTB, boolean status) {
		StudentId = studentId;
		StudentName = studentName;
		Age = age;
		DiemToan = diemToan;
		DiemLy = diemLy;
		DiemHoa = diemHoa;
		DiemTB = diemTB;
		Status = status;
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public float getDiemToan() {
		return DiemToan;
	}

	public void setDiemToan(float diemToan) {
		DiemToan = diemToan;
	}

	public float getDiemLy() {
		return DiemLy;
	}

	public void setDiemLy(float diemLy) {
		DiemLy = diemLy;
	}

	public float getDiemHoa() {
		return DiemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		DiemHoa = diemHoa;
	}

	public float getDiemTB() {
		return DiemTB;
	}

	public void setDiemTB(float diemTB) {
		DiemTB = diemTB;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
	public void inputData(Scanner sc) {
		System.out.println("Nhap ma sinh vien:");
		this.StudentId = sc.nextLine();
		System.out.println("Nhap ten sinh vien:");
		this.StudentName = sc.nextLine();
		System.out.println("Nhap tuoi cua sinh vien:");
		this.Age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap diem toan cua sinh vien:");
		this.DiemToan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap diem ly cua sinh vien:");
		this.DiemLy = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap diem hoa cua sinh vien:");
		this.DiemHoa = Float.parseFloat(sc.nextLine());
		System.out.println("nhap vao trang thai cua sinh vien:");
		this.Status = Boolean.parseBoolean(sc.nextLine());
	}
	
	public void displayData() {
		System.out.println("ma cua sinh vien la:" + this.StudentId);
		System.out.println("Ten sinh vien la:" + this.StudentName);
		System.out.println("tuoi cua sinh vien la:" + this.Age);
		System.out.println("Diem toan cua sinh vien la:" + this.DiemToan);
		System.out.println("Diem ly cua sinh vien la:" + this.DiemLy);
		System.out.println("Diem hoa cua sinh vien la:" + this.DiemHoa);
		System.out.println("Trang thai:" +(this.Status ? "di hoc" : "Nghi"));
	}
	
	public float diemTB() {
		return (this.DiemToan + this.DiemLy + this.DiemHoa)/3;
	}
	public void setDiem() {
		if(this.DiemTB < MARK_PASS) {
			System.out.println("Truot");
		}else {
			System.out.println("Qua");
		}
	}
}
