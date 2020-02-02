package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		char first = word.charAt(0);
		char second = word.charAt(1);
		char third = word.charAt(2);
		
		System.out.println("첫 번째 문자 : " + first);
		System.out.println("두 번째 문자 : " + second);
		System.out.println("세 번째 문자 : " + third);
		
		
		
	}
}
