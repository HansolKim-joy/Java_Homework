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
			System.out.println("===== ���� ���α׷� ======");
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("���α׷� ����");
				break;
			}else if(num == 1) {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ��Է��ϼ���.");
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
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("�������� ���ư��ϴ�.");
//				inputMenu();
				// �ǵ��ư��� �޼ҵ带 �������� break�� �ݺ����� ������ �ڽ��� �θ� ������ ���ư��� ��
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
			System.out.println("===== �簢 =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.println("9. ��������");
			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("�������� ���ư��ϴ�.");
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
			System.out.print("���� : ");
			double height = sc.nextInt();
			System.out.print("�ʺ� : ");
			double width = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�ﰢ�� ���� : ");
			System.out.println(tc.calcArea(height, width));
		}else if(type == 3 && menuNum == 2) {
			System.out.print("������ �Է��ϼ��� : ");
			sc.nextLine();
			String color = sc.nextLine();
			
			tc.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
			
		}else if(type == 4 && menuNum == 1 || menuNum == 2) {
			System.out.print("���� : ");
			double height = sc.nextInt();
			System.out.print("�ʺ� : ");
			double width = sc.nextInt();
			sc.nextLine();
			if(menuNum == 1) {
				System.out.print("�簢�� �ѷ� : ");
				System.out.println(scr.calcPerimeter(height, width));
			}else if(menuNum == 2) {
				System.out.print("�簢�� ���� : ");
				System.out.println(scr.calcArea(height, width));
			}
		}else if(type == 4 && menuNum == 3) {
			System.out.print("������ �Է��ϼ��� : ");
			sc.nextLine();
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
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
