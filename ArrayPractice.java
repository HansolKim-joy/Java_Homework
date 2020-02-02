package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (10 - i);
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String arr[] = new String[5];
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";
		
		System.out.print(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		int size = str.length();
		char arr[] = new char[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		
		System.out.print("application�� i�� �����ϴ� ��ġ(�ε���) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("i ���� : " + count);
		
	}
	
	public void practice6() {
		String[] week = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.print(week[num]);
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
	
		for(int i =0; i < size; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			sum += arr[i];
			if(i == (arr.length - 1)) {
				System.out.println("�� �� : " + sum);
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		do {
			System.out.print("���� : " );
			num = sc.nextInt();
			if(num % 2 == 0 || num < 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
			} 
			int arr[] = new int[num];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			for(int i = 0; i <= arr.length / 2; i++) {
				System.out.print(arr[i] + ", ");
			}
			for(int i = arr.length / 2 + 1; i < arr.length - 1; i++) {
				System.out.print((arr.length + 1 - arr[i]) + ", ");
			}
			System.out.print(arr[0]);
			
		}while(num % 2 == 0 || num < 3);
	}
	
	public void practice9() {
		// �ٽ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chi = sc.nextLine();
		
		String arr[] = {"�Ķ��̵�", "���", "������ġ��", "������"};
		
		boolean chk = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(chi.equals(arr[i])) {
				chk = true;
				break;
			}
		}
		if(chk) {
			System.out.print(chi + "ġŲ ��� ����");
		}else {
			System.out.println(chi + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		
		char arr[] = new char[14];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		char copyArr[] = new char[14];
		
		System.arraycopy(arr, 0, copyArr, 0, arr.length);
		
		for(int i = 0; i < 8 ; i++) {
			System.out.print(copyArr[i]);
		}
		for(int i = 8; i < arr.length; i++) {
			System.out.print("*");
		}
	}
	
	public void practice11() {
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			arr[i] = num;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		// �ٽ� ����
		int arr[] = new int[10];
		
		int max = 1;
		int min = 10;
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			arr[i] = num;
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	
	public void practice13() {
		// �ڹ� �ζǹ�ȣ ���� ���۸� ���� - ���� �ٽ� ��
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		int arr[] = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i] + " ");
		}
	}
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		int count = 0;
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < ch.length; i++) {
			
			boolean chk = true;
			
			for(int j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					chk = false;
					break;
				}
			}
			// �ߺ��Ǵ� �� ���� 
			
			if(chk) {
				if(i == 0) {
					System.out.print(ch[i]);
				}else {
					System.out.print(", " + ch[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.print("���� ���� : " + count);
	}
	
	public void practice16() {
		
	}
}