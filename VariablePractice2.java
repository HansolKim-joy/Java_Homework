package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int first = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���ϱ� ��� : " + (first + second));
		System.out.println("���� ��� : " + (first - second));
		System.out.println("���ϱ� ��� : " + (first * second));
		System.out.println("������ ��� : " + (first / second));
		
	}

}
