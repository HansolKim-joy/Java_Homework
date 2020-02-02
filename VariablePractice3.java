package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double g = sc.nextDouble();
		
		System.out.print("세로 : ");
		double s = sc.nextDouble();
		
		System.out.println("면적 : " + (g * s));
		System.out.println("둘레 : " + ((g + s) * 2));
		
		
	}

}
