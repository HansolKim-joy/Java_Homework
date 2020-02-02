package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(kor + eng + math));
		System.out.println("평균 ㄴ: " + (int)((kor + eng + math)/3));
		
		
	}

}
