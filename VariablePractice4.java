package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.nextLine();
		char first = word.charAt(0);
		char second = word.charAt(1);
		char third = word.charAt(2);
		
		System.out.println("ù ��° ���� : " + first);
		System.out.println("�� ��° ���� : " + second);
		System.out.println("�� ��° ���� : " + third);
		
		
		
	}
}
