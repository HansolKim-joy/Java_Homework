package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String[][] arr;
		
		arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")"; 
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		int sum = 0;
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j < arr[i].length -1; j++) {
				arr[i][j] = (int)(Math.random() * 10) + 1;
			}
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length -1; j++) {
				sum += arr[i][j];
			}
			arr[i][arr.length -1] = sum;
			sum = 0;
		}
		for(int i = 0; i < arr.length; i++) {
			// 여기를 주의!
			for(int j = 0; j < arr.length - 1; j++) {
				sum += arr[j][i];
			}
			arr[arr.length-1][i] = sum;
			sum = 0;
		}
		arr[3][3]= arr[3][3] + arr[3][0] + arr[3][1] + arr[3][2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		int row = 0;
		int col = 0;
		
		do {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			char[][] ch = new char[row][col];
			
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					ch[i][j] = (char)((Math.random() * 26) + 65);
				}
			}
			
			for(int i = 0; i < row; i++) {
				if(row > 10 || col > 10) {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
					break;
				}
				
				for(int j = 0; j < col; j++) {
					System.out.printf("%2c",ch[i][j]);
				}
				System.out.println();
			}
			
		}while(row > 10 || col > 10);
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(" " + strArr[j][i]);
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		int num1 = 97;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int num = sc.nextInt();
			arr[i] = new char[num];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = (char)num1;
				num1++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[num];
				num++;
			}
		}
		
		System.out.println("== 1분단 == ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		int num1 = 6;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[num];
				num++;
			}
		}
		
		System.out.println("== 2분단 == ");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num = 0;
		
		System.out.println("== 1분단 == ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[num];
				System.out.print(arr1[i][j] + " ");
				num++;
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[(num)];
				System.out.print(arr2[i][j] + " ");
				num++;
			}
			System.out.println();
		}
		
		// 그림대로 나오기 끝
		
		System.out.println("===============");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j].equals(str)) {
					String row = " ";
					String col = " ";
					switch(i) {
					case 0: row = "첫"; break;
					case 1: row = "두"; break;
					case 2: row = "셋"; break;
					}
					switch(j) {
					case 0: col = "왼쪽"; break;
					case 1: col = "오른쪽"; break;
					}
					System.out.print("검색하신 " + str + " 학생은 1분단 " + row + "번째 줄 " + col + "에 있습니다.");	
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				if(arr2[i][j].equals(str)) {
					String row = " ";
					String col = " ";
					switch(i) {
					case 0: row = "첫"; break;
					case 1: row = "두"; break;
					case 2: row = "셋"; break;
					}
					switch(j) {
					case 0: col = "왼쪽"; break;
					case 1: col = "오른쪽"; break;
					}
					System.out.print("검색하신 " + str + " 학생은 2분단 " + row + "번째 줄 " + col + "에 있습니다.");	
				}
			}
		}
	}
}
