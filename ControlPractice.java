package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է� ");
		System.out.println("2. ���� ");
		System.out.println("3. ��ȸ ");
		System.out.println("4. ���� ");
		System.out.println("7. ���� ");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
			System.out.println("�Է� �޴� �Դϴ�.");
			break;
		case 2: 
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴� �Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default :
			System.out.println("�߸� �����̽��ϴ�.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("����� �Է����ּ���.");
		}else if(num % 2 != 0) {
			System.out.println("Ȧ����.");
		}else if(num % 2 == 0) {
			System.out.println("¦����.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (kor + math + eng) / 3;
		if(kor < 40 || math < 40 || eng < 40 || avg < 60.0) {
			System.out.println("���հ��Դϴ�.");
		}else {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6 : case 7: case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		default :
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id1 = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw1 = sc.nextLine();
		
		if(id1.equals("myId") && pw1.equals("myPassword12")) {
			System.out.println("�α��� ����");
		}else if(id1.equals("myId") && !pw1.equals("myPassword12")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(!id1.equals("myId") && pw1.equals("myPassword12")) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str = sc.nextLine();
		
		if(str.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		}else if (str.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		}else if(str.equals("��ȸ��")) {
			System.out.println("�Խñ� ��ȸ");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("��");
		}else if(bmi >= 30) {
			System.out.println("����");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String str = sc.nextLine();
		
		if(num1 > 0 && num2 > 0) {
			switch(str) {
			case "+" :
				System.out.printf("%d + %d = %f",num1,num2, (double) num1 + num2);
				// printf���� %f�� �Ҽ��� �Ʒ� 6�ڸ����� ǥ���� �� �ִ� ��� **
				
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ��� ���� : ");
		double fin = sc.nextDouble();
		System.out.print("���� ���� : ");
		double hw = sc.nextDouble();
		System.out.print("�⼮ ȸ�� : ");
		double num = sc.nextDouble();
		
		System.out.println("================= ��� =================");
		
		double sum = (mid * 0.2) + (fin * 0.3) + (hw * 0.3) + num;
		if(num <= 20 * 0.7) {
			System.out.printf("Fail [�⼮ ȸ�� ���� (%d/20)]",(int)num);
		}else if(sum < 70) {
			System.out.println("�߰� ��� ����(20) : " + mid * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + fin * 0.3);
			System.out.println("���� ����		(30) : " + hw * 0.3);
			System.out.println("�⼮ ����		(20) : " + num);
			System.out.println("���� : " + sum);
			System.out.println("Fail [���� �̴�]");
		}else if(sum >= 70) {
			System.out.println("�߰� ��� ����(20) : " + mid * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + fin * 0.3);
			System.out.println("���� ����		(30) : " + hw * 0.3);
			System.out.println("�⼮ ����		(20) : " + num);
			System.out.println("���� : " + sum);
			System.out.println("PASS");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		
		System.out.print("���� : ");
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
			System.out.println("�߸� �����̽��ϴ�.");
		
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ �Է�(1000~9999): ");
		String num = sc.nextLine();
		
		int count = 0;
		
		if(num.length() != 4) {
			System.out.println("�ڸ��� �ȸ���");
		}else {
			for(int i = 0; i < 4; i++) {
				for(int j = i+1; j < 4; j++) {
					if(num.charAt(i) == num.charAt(j)) {
						count = 1;
						
					}
				}
			}
			if(count == 1) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
		}
	}
}
