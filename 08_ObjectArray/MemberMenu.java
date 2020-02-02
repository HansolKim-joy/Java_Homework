package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + mc.SIZE + "�� �Դϴ�.");
			System.out.println("���� ����� ȸ�� ���� " + mc.existMemberNum() + "�� �Դϴ�.");
			
			if(mc.existMemberNum() == mc.SIZE) {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
			}else {
				System.out.println("1. �� ȸ�� ���");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: 
				if(mc.existMemberNum() != mc.SIZE) {
					insertMember();
				}else {
					System.out.println("ȸ�� ���� ��� �� á�� ������ �߰��� �Ұ��մϴ�.");
				}
				break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAll(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
				
		String id;
		
		while(true) {
			System.out.print("���̵� : ");
			id = sc.nextLine();
			if(mc.checkId(id) != true) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}else {
				break;
			}
		}
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		
		char gender;
		
		while(true) {
			System.out.print("����(M/F) : ");
			gender = sc.nextLine().charAt(0);
			if(gender == 'M' || gender == 'm' || gender == 'f' || gender == 'F') {
				break;
			}else {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
		}
			
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		mc.insertMember(id, name, password, email, gender, age);
		
	}
	
	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		
		System.out.print("�޴� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); return;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		}
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵� : ");
		String id = sc.nextLine();
		mc.searchId(id);
		
		if(mc.searchId(id) == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			if(mc.searchId(id).equals(null)) {
				return;
			}else {
				System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				System.out.println(mc.searchId(id));
			}
		}
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		mc.searchName(name);
		
		if(mc.searchName(name) == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			for(int i = 0; i < mc.searchName(name).length; i++) {
				if(mc.searchName(name) == null) {
					break;
				}else {
					if(mc.searchName(name)[i] == null) {
						return;
					}else {
						System.out.println(mc.searchName(name)[i].inform());
					}
				}				
			}
		}
	}
	
	
	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.nextLine();
		mc.searchEmail(email);
		
		if(mc.searchEmail(email) == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			for(int i = 0; i < mc.searchEmail(email).length; i++) {
				if(mc.searchEmail(email)[i] == null) {
					return;
				}else {
					System.out.println(mc.searchEmail(email)[i].inform());
				}
			}
		}
	}
	
	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: 
			System.out.println("�������� ���ư��ϴ�.");
			break;
		default: 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}
	
	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ ��й�ȣ : ");
		String password = sc.nextLine();
		mc.updatePassword(id, password);
		
		if(mc.updatePassword(id, password) == true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			return;
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		}
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		mc.updateName(id, name);
		
		if(mc.updateName(id, name) == true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			return;
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸��� : ");
		String email = sc.nextLine();
		mc.updateEmail(id, email);
		
		if(mc.updateEmail(id, email) == true) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			return;
		}else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		}
	}
	
	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("���� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: 
			System.out.println("�������� ���ư��ϴ�.");
			return;
		default: 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
	}
	
	public void deleteOne() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) : ");
		char check = sc.nextLine().charAt(0);
		
		if(check == 'y' || check == 'Y') {
			mc.delete(id);
			if(mc.delete(id) == true) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
				return;
			}else {
				System.out.println("���������� �����Ͽ����ϴ�.");
				return;
			}
		}else if(check == 'n' || check == 'N') {
			System.out.println("�������� �����̽��ϴ�.");
			return;
		}
	}
	
	public void deleteAll() {
		System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) : ");
		char check = sc.nextLine().charAt(0);
		
		if(check == 'y' || check == 'Y') {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
			return;
		}else {
			System.out.println("�������� �����̽��ϴ�.");
			return;
		}
	}
	
	public void printAll() {
		mc.printAll();
		
		if(mc.printAll() == null) {
			 System.out.println("����� ȸ���� �����ϴ�.");
		}else {
			for(int i = 0; i < mc.printAll().length; i++) {
				if(mc.printAll()[i] == null) {
					
				}else {
					System.out.println(mc.printAll()[i].inform());
				}
			}
		}
	}
}
