package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����." : "������.";
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����." : (num == 0)? "0�̴�." : "������.";
		System.out.println(result);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0)? "¦����." : "Ȧ����.";
		System.out.println(result);
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int ppl = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + (candy / ppl));
		System.out.println("���� ���� ���� : " + (candy % ppl));
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int g = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��(���ڸ�) : ");
		int c = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String gender1 = (gender == 'F')? "���л�" : "���л�";
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double result = sc.nextDouble();
		
		System.out.println(g + "�г� " + c + "�� " + num + "�� " + name + " " + gender1 + "�� ������ " + result + "�̴�.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = (age <= 13)? "���" : (age > 19)? "����" : "û�ҳ�";
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		int avg = (kor + eng + math) / 3;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >=60)? "�հ�" : "���հ�";
		
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char num = sc.nextLine().charAt(7);
		
		String gender = (num == '2' || num == '4')? "����" : "����";
		System.out.println(gender);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
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
//		// max , min�� �Է��ϸ鼭 �׻�  ū ���� ���� ���� ����ǵ��� �� �� �ִ� 
//		// �̶��� 
//		// �Ʒ��� ������ num1, num2�� �ƴ� max, min������ �Է��Ѵ�.
		
		
		String result = (num1 < num && num <= num2)? "false" : "true";
		System.out.println(result);	
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 && num2 == num3)? "true" : "false";
		System.out.println(result);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("B����� ���� : ");
		int num2 = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		int num3 = sc.nextInt();
		
		double sumnum1 = num1 * 1.4;
		double sumnum2 = num2;
		double sumnum3 = num3 * 1.15;
		// num3 + num3 * 0.15 �� ���� ���� �ٸ� - �� ����� �� ���� ����! 
		// => ��ǻ���� ��� ����� �츮�� �ٸ��� ������ �׷��� ��� 
		
		System.out.println("A��� ����/����+a : " + num1 + "/" + sumnum1);
		String result1 = (sumnum1 >= 3000.0)? "3000 �̻�" : "3000 �̸�";
		System.out.println(result1);
		
		System.out.println("B��� ����/����+a : " + num2 + "/" + sumnum2);
		String result2 = (sumnum2 >= 3000.0)? "3000 �̻�" : "3000 �̸�";
		System.out.println(result2);
		
		System.out.println("C��� ����/����+a : " + num3 + "/" + sumnum3);
		String result3 = (sumnum3 >= 3000.0)? "3000 �̻�" : "3000 �̸�";
		System.out.println(result3);
		
	}
}
