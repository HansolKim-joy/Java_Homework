package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println();
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� " + pc.personCount()[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� " + pc.personCount()[1] + "���Դϴ�.");
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: studentMenu(); break;
			case 2: employeeMenu(); break;
			case 9: 
				System.out.println("�����մϴ�.");
				return;
			default: 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void studentMenu() {
		while(true) {
			System.out.println();
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			
			if(pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
	
			System.out.print("�޴� ��ȣ : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			
			
			switch(menu) {
			case 1: 
				if(pc.personCount()[0] == 3) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}else {
					insertStudent();
				}
				break;
			case 2: printStudent(); break;	
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default: 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println();
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			
			if(pc.personCount()[1] == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			
			System.out.print("�޴� ��ȣ : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			
			
			switch(menu) {
			case 1: 
				if(pc.personCount()[1] == 10) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}else {
					insertEmployee();
				}
				break;
			case 2: printEmployee(); break;	
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default: 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void insertStudent() {
		while(true) {
			System.out.println();
			System.out.print("�л� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�л� ���� : ");
			int age = sc.nextInt();
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				break;
			}
			
			System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ�Ű�� �������� : ");
			char check = sc.nextLine().charAt(0);
			
			if(check == 'N' || check == 'n') {
				System.out.println("�޴��� ���ư��ϴ�.");
				break;
			}
		}	
	}
	
	public void printStudent() {
		System.out.println();
		for(int i = 0; i < pc.printStudent().length; i++) {
			System.out.println(pc.printStudent()[i]);
		}
	}
	
	public void insertEmployee() {
		while(true) {
			System.out.println();
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			int age = sc.nextInt();
			System.out.print("��� Ű : ");
			double height = sc.nextDouble();
			System.out.print("��� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("��� �޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1] == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				break;
			}
			
			System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ�Ű�� �������� : ");
			char check = sc.nextLine().charAt(0);
			
			if(check == 'N' || check == 'n') {
				System.out.println("�޴��� ���ư��ϴ�.");
				break;
			}
		}
	}
	
	public void printEmployee() {
		System.out.println();
		for(int i = 0; i < pc.printEmployee().length; i++) {
			System.out.println(pc.printEmployee()[i]);
		}
	}
}
