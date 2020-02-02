package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		int num = 0;
		
		do {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			
			System.out.print("�޴� ��ȣ : ");
			num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				tokenMenu();
			}else if(num == 2) {
				inputMenu();
			}else if(num == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}while(num != 1 || num != 2);
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		System.out.println("��ū ó�� �� ���� : " + tc.afterToken(str));
		System.out.println("��ū ó�� �� ���� : " + tc.afterToken(str).length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + tc.afterToken(str).toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		
		tc.firstCap(input);
		System.out.println("ù ���� �빮�� : " + tc.firstCap(input));
		
		System.out.print("ã�� ���ڸ� �ϳ� �Է��ϼ��� : ");
		char one = sc.nextLine().charAt(0);
		tc.findChar(input, one);
		System.out.println(one + "���ڰ� �� ���� : " + tc.findChar(input, one));
	}
}
