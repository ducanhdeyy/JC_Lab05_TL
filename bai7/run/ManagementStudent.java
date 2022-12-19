package bai7.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bai7.entity.Student;

public class ManagementStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> st = new ArrayList<>();
		int chon;
		do {
			System.out.println("==============MENU=================");
            System.out.println("1. Nhập thông tin n sinh viên");
            System.out.println("2. Tính điểm trung bình sinh viên");
            System.out.println("3. Xét điểm qua cho sinh viên");
            System.out.println("4. Hiển thị thông tin sinh viên");
            System.out.println("5. Thoát");
            System.out.println("Chọn");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
			case 1:
				System.out.println("moi bạn nập vào số sinh viên");
                int n = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < n; i++) {
                    Student newStudent = new Student();
                    newStudent.inputData(sc);
                    st.add(newStudent);
                }
                break;
			case 2:
				for (Student student : st) {
					student.diemTB();
					System.out.println("\n");
				}
				break;
			case 3:
				for (Student student : st) {
					student.setDiem();
					System.out.println("\n");
				}
				break;
			case 4:
				for (Student student : st) {
					student.displayData();
					System.out.println(\n);
				}
				break;
		} 
	}while (chon < 6);
	}
	}
