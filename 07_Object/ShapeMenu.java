package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		int num = 0;
		
		do {
			System.out.println("===== 도형 프로그램 ======");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("프로그램 종료");
				break;
			}else if(num == 1) {
				System.out.println("잘못된 번호입니다. 다시입력하세요.");
			}else if(num == 3) {
				triangleMenu();
			}else if(num == 4) {
				squareMenu();
			}
		
		}while(num != 3 || num != 4);
		
	}
	
	public void triangleMenu() {
		
		int num = 0;
		do {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("메인으로 돌아갑니다.");
//				inputMenu();
				// 되돌아가는 메소드를 하지말고 break로 반복문을 나가서 자신을 부른 곳으로 돌아가게 함
				break;
			}else if(num == 1) {
				inputSize(3,1);
			}else if(num == 2) {
				inputSize(3,2);
			}else if(num == 3) {
				printInformation(3);
			}
		}while(num != 1 || num != 2 || num != 3);
	}
	
	public void squareMenu() {

		int num = 0;
		do {
			System.out.println("===== 사각 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("메인으로 돌아갑니다.");
//				inputMenu();
				break;
			}else if(num == 1) {
				inputSize(4,1);
			}else if(num ==2) {
				inputSize(4,2);
			}else if(num == 3) {
				inputSize(4,3);
			}else if(num == 4) {
				printInformation(4);
			}
		}while(num != 1 || num != 2 || num != 3 || num != 4);
	}
	
	public void inputSize(int type, int menuNum) {
		if(type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double height = sc.nextInt();
			System.out.print("너비 : ");
			double width = sc.nextInt();
			sc.nextLine();
			
			System.out.print("삼각형 면적 : ");
			System.out.println(tc.calcArea(height, width));
		}else if(type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			sc.nextLine();
			String color = sc.nextLine();
			
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
			
		}else if(type == 4 && menuNum == 1 || menuNum == 2) {
			System.out.print("높이 : ");
			double height = sc.nextInt();
			System.out.print("너비 : ");
			double width = sc.nextInt();
			sc.nextLine();
			if(menuNum == 1) {
				System.out.print("사각형 둘레 : ");
				System.out.println(scr.calcPerimeter(height, width));
			}else if(menuNum == 2) {
				System.out.print("사각형 면적 : ");
				System.out.println(scr.calcArea(height, width));
			}
		}else if(type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			sc.nextLine();
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}
	}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else if(type == 4) {
			System.out.println(scr.print());
		}
	}

}
