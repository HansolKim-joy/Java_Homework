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
		System.out.print("양의 정수 : ");
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
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		System.out.print(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int size = str.length();
		char arr[] = new char[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		
		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);
		
	}
	
	public void practice6() {
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.print(week[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
	
		for(int i =0; i < size; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
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
				System.out.println("총 합 : " + sum);
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		do {
			System.out.print("정수 : " );
			num = sc.nextInt();
			if(num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요.");
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
		// 다시 보기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chi = sc.nextLine();
		
		String arr[] = {"후라이드", "양념", "스노윙치즈", "간장양념"};
		
		boolean chk = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(chi.equals(arr[i])) {
				chk = true;
				break;
			}
		}
		if(chk) {
			System.out.print(chi + "치킨 배달 가능");
		}else {
			System.out.println(chi + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
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
		// 다시 보기
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
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() {
		// 자바 로또번호 생성 구글링 참조 - 이해 다시 하
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
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		int count = 0;
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < ch.length; i++) {
			
			boolean chk = true;
			
			for(int j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					chk = false;
					break;
				}
			}
			// 중복되는 값 제거 
			
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
		System.out.print("문자 개수 : " + count);
	}
	
	public void practice16() {
		
	}
}
