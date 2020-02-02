package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력 ");
		System.out.println("2. 수정 ");
		System.out.println("3. 조회 ");
		System.out.println("4. 삭제 ");
		System.out.println("7. 종료 ");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2: 
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못 누르셨습니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수만 입력해주세요.");
		}else if(num % 2 != 0) {
			System.out.println("홀수다.");
		}else if(num % 2 == 0) {
			System.out.println("짝수다.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (kor + math + eng) / 3;
		if(kor < 40 || math < 40 || eng < 40 || avg < 60.0) {
			System.out.println("불합격입니다.");
		}else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6 : case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id1 = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw1 = sc.nextLine();
		
		if(id1.equals("myId") && pw1.equals("myPassword12")) {
			System.out.println("로그인 성공");
		}else if(id1.equals("myId") && !pw1.equals("myPassword12")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(!id1.equals("myId") && pw1.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();
		
		if(str.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}else if (str.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(str.equals("비회원")) {
			System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		}else if(bmi >= 30) {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String str = sc.nextLine();
		
		if(num1 > 0 && num2 > 0) {
			switch(str) {
			case "+" :
				System.out.printf("%d + %d = %f",num1,num2, (double) num1 + num2);
				// printf에서 %f는 소수점 아래 6자리까지 표현할 수 있는 방법 **
				
				break;
			case "-" : 
				System.out.printf("%d - %d = %f",num1,num2, (double)num1 - num2);
				break;
			case "*" :
				System.out.printf("%d * %d = %f",num1,num2, (double)num1 * num2);
				break;
			case "/" :
				System.out.printf("%d / %d = %f",num1,num2, (double)num1 / num2);
				break;
			case "%" : 
				System.out.printf("%d % %d = %f",num1,num2, (double)num1 % num2);
				break;
			default : 
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double hw = sc.nextDouble();
		System.out.print("출석 회수 : ");
		double num = sc.nextDouble();
		
		System.out.println("================= 결과 =================");
		
		double sum = (mid * 0.2) + (fin * 0.3) + (hw * 0.3) + num;
		if(num <= 20 * 0.7) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]",(int)num);
		}else if(sum < 70) {
			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수		(30) : " + hw * 0.3);
			System.out.println("출석 점수		(20) : " + num);
			System.out.println("총점 : " + sum);
			System.out.println("Fail [점수 미달]");
		}else if(sum >= 70) {
			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수		(30) : " + hw * 0.3);
			System.out.println("출석 점수		(20) : " + num);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default :
			System.out.println("잘못 누르셨습니다.");
		
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999): ");
		String num = sc.nextLine();
		
		int count = 0;
		
		if(num.length() != 4) {
			System.out.println("자리수 안맞음");
		}else {
			for(int i = 0; i < 4; i++) {
				for(int j = i+1; j < 4; j++) {
					if(num.charAt(i) == num.charAt(j)) {
						count = 1;
						
					}
				}
			}
			if(count == 1) {
				System.out.println("실패");
			}else {
				System.out.println("성공");
			}
		}
	}
}
