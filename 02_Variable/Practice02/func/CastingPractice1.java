package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¹®ÀÚ : ");
		char ch1 = sc.nextLine().charAt(0);
		System.out.println(ch1 + " unicode : " + (int)ch1);
		
		System.out.print("¹®ÀÚ : ");
		char ch2 = sc.nextLine().charAt(0);
		System.out.println(ch2 + " unicode : " + (int)ch2);
		

	}
}

