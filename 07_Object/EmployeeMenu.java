package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		
		int num = 0;
		do {
			System.out.println("1. ��� �߰� ");
			System.out.println("2. ��� ���� ");
			System.out.println("3. ��� ���� ");
			System.out.println("4. ��� ��� ");
			System.out.println("9. ���α׷� ���� ");
			System.out.print("�޴� ��ȣ�� �������� : ");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: insertEmp(); break;
			case 2: updateEmp(); break;
			case 3: deleteEmp(); break;
			case 4: printEmp(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}	
		}while(num != 1 || num != 2 || num != 3|| num != 4);
	}
	
	public void insertEmp() {
		System.out.print("��� ��ȣ : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		System.out.print("��� ���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		
		System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char check = sc.nextLine().charAt(0);
		
		if(check == 'y' || check == 'Y') {
			System.out.print("����μ� : ");
			String dept = sc.nextLine();
			System.out.print("��� ���� : ");
			int salary = sc.nextInt();
			System.out.print("���ʽ� �� : ");
			double bonus = sc.nextDouble();
			sc.nextLine();
			
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		}else if(check == 'n' || check == 'N'){
			ec.add(empNo, name, gender, phone);
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
		System.out.println("� ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		
		System.out.print("�޴� ��ȣ�� �������� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1: 
			System.out.print("������ ��ȭ��ȣ : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case 2:
			System.out.print("������ ��� ���� : ");
			int salary = Integer.parseInt(sc.nextLine());
			ec.modify(salary);
			break;
		case 3:
			System.out.print("������ ���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
			break;
		case 9:
			System.out.println("���θ޴��� ���ư��ϴ�.");
			return;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
	}
	
	public void deleteEmp() {
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		char check = sc.nextLine().charAt(0);
		if(check == 'y' || check == 'Y') {
			ec.remove();
			if(ec.remove() == null) {
				System.out.println("������ ������ �����Ͽ����ϴ�.");
			}else {
				System.out.println("������ ������ �����Ͽ����ϴ�.");
			}
		}
	}
	
	public void printEmp() {
		if(ec.inform() == null) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		}else {
			System.out.println(ec.inform());
		}
	}
}
