package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double kor = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("¿µ¾î : ");
		double eng = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("¼öÇÐ : ");
		double math = sc.nextDouble();
		
		System.out.println("ÃÑÁ¡ : " + (int)(kor + eng + math));
		System.out.println("Æò±Õ ¤¤: " + (int)((kor + eng + math)/3));
		
		
	}

}
