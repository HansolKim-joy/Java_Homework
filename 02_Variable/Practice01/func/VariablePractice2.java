package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int first = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수 : ");
		int second = sc.nextInt();
		sc.nextLine();
		
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나누기 결과 : " + (first / second));
		
	}

}
