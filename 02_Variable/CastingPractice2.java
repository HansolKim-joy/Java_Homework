package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		System.out.println("���� : " + (int)(kor + eng + math));
		System.out.println("��� ��: " + (int)((kor + eng + math)/3));
		
		
	}

}
