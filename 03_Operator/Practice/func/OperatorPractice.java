package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다." : "음수다.";
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다." : (num == 0)? "0이다." : "음수다.";
		System.out.println(result);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0)? "짝수다." : "홀수다.";
		System.out.println(result);
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int ppl = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / ppl));
		System.out.println("남는 사탕 개수 : " + (candy % ppl));
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int g = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int c = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String gender1 = (gender == 'F')? "여학생" : "남학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double result = sc.nextDouble();
		
		System.out.println(g + "학년 " + c + "반 " + num + "번 " + name + " " + gender1 + "의 성적은 " + result + "이다.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13)? "어린이" : (age > 19)? "성인" : "청소년";
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		int avg = (kor + eng + math) / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >=60)? "합격" : "불합격";
		
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		String gender = (num == '2' || num == '4')? "여자" : "남자";
		System.out.println(gender);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
//		int max = 0;
//		int min = 0;
//		
//		if(num1 < num2) {
//			max = num2;
//			min = num1;
//		}else { // num1 >= num2
//			max = num1;
//			min = num2;
//		}
//		
//		// max , min을 입력하면서 항상  큰 값과 작은 값이 적용되도록 할 수 있다 
//		// 이때는 
//		// 아래의 문장을 num1, num2가 아닌 max, min값으로 입력한다.
		
		
		String result = (num1 < num && num <= num2)? "false" : "true";
		System.out.println(result);	
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 && num2 == num3)? "true" : "false";
		System.out.println(result);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double sumnum1 = num1 * 1.4;
		double sumnum2 = num2;
		double sumnum3 = num3 * 1.15;
		// num3 + num3 * 0.15 와 위의 값이 다름 - 이 방법이 더 많이 사용됨! 
		// => 컴퓨터의 계산 방법이 우리와 다르기 때문에 그러한 결과 
		
		System.out.println("A사원 연봉/연봉+a : " + num1 + "/" + sumnum1);
		String result1 = (sumnum1 >= 3000.0)? "3000 이상" : "3000 미만";
		System.out.println(result1);
		
		System.out.println("B사원 연봉/연봉+a : " + num2 + "/" + sumnum2);
		String result2 = (sumnum2 >= 3000.0)? "3000 이상" : "3000 미만";
		System.out.println(result2);
		
		System.out.println("C사원 연봉/연봉+a : " + num3 + "/" + sumnum3);
		String result3 = (sumnum3 >= 3000.0)? "3000 이상" : "3000 미만";
		System.out.println(result3);
		
	}
}
