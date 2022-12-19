package bkap.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		int luaChon;
		do {
			System.out.println("*****************************MENU*************************");
			System.out.println("1. Nhập thông tin cho n nhân viên");
			System.out.println("2. Tính lương tất cả nhân viên");
			System.out.println("3. Hiển thị thông tin tất cả nhân viên");
			System.out.println("4. Sắp xếp nhân viên theo lương tăng dần");
			System.out.println("5. Tìm kiếm nhân viên theo tên nhân viên");
			System.out.println("6. Cập nhật trạng thái nhân viên theo mã nhân viên");
			System.out.println("7.Thoat");
			System.out.println("Chon");
			luaChon = Integer.parseInt(sc.nextLine());
			switch (luaChon) {
			case 1: 
				System.out.println("Nhap thong tin cho n nhan vien");
				int n = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < n; i++) {
					Employee emp = new Employee();
					emp.inputData(sc);
					list.add(emp);
				}
				break;
			case 2:
				for (Employee employee : list) {
					employee.calSalary();
					System.out.println("Ho va ten" + employee.getEmployeeName()+"Luong = "+employee.getSalary());;
				}
				break;
			case 3:
				System.out.println("Danh sach nhan vien");
				for (Employee employee : list) {
					employee.displayData();
				}
				break;
			case 4:
				System.out.println("Danh sach nhan vien luong tang dan:");
				for (int i = 0; i < list.size() - 1; i++) {
					int k = i;
					for (int j = i+1; j < list.size(); j++) {
						if(list.get(k).getSalary() > list.get(j).getSalary()) {
							k = j;
						}
					}
					if(k!=i) {
						Employee emp = new Employee();
						emp = list.get(i);
						list.set(i,list.get(k));
						list.set(k, emp);
					}
				}
				break;
			case 5:
				System.out.println("Nhap ten");
				String name = sc.nextLine();
				for (Employee employee : list) {
					if(employee.getEmployeeName().equals(name)) {
						employee.displayData();
					}
				}
				break;
			case 6:
				System.out.println("Nhap ma nv");
				String mnv = sc.nextLine();
				for (Employee employee : list) {
					if(employee.getEmployeeId().equals(mnv)) {
						System.out.println("Nhap trang thai moi");
						employee.setEmployeeStatus(Boolean.parseBoolean(sc.nextLine()));
					}
				}
				break;
			case 7:
				System.exit(0);
				break;
	}
		}while(luaChon < 8);
	}
}
