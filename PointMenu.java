package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu{
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int mNum = 0;
		
		do{
			System.out.println("=== 硫붾돱 ===");
			System.out.println("1. �썝");
			System.out.println("2. �궗媛곹삎");
			System.out.println("9. �걹�궡湲�");
			
			System.out.print("硫붾돱 踰덊샇 : ");
			mNum = sc.nextInt();
			
			if(mNum == 9) {
				System.out.println("醫낅즺�빀�땲�떎.");
				return;
			}else if(mNum == 1) {
				circleMenu();
			}else if(mNum == 2) {
				rectangleMenu();
			}
		}while(mNum != 1 || mNum != 2);
	}
	
	public void circleMenu() {
		int mNum = 0;
		
		do {
			System.out.println("=== �썝 硫붾돱 ===");
			System.out.println("1. �썝 �몮�젅");
			System.out.println("2. �썝 �꼻�씠");
			System.out.println("9. 硫붿씤�쑝濡�");
			
			System.out.print("硫붿씤硫붾돱 : ");
			mNum = sc.nextInt();
			
			if(mNum == 9) {
				return;
			}else if(mNum == 1) {
				calcCircum();
				break;
			}else if(mNum == 2) {
				calcCircleArea();
				break;
			}else {
				break;
			}
		}while(mNum != 1 || mNum != 2);
		
	}
	
	public void rectangleMenu() {
		int mNum = 0;
		
		do{
			System.out.println("=== �궗媛곹삎 硫붾돱 ===");
			System.out.println("1. �궗媛곹삎 �몮�젅");
			System.out.println("2. �궗媛곹삎 �꼻�씠");
			System.out.println("9. 硫붿씤�쑝濡�");
			
			System.out.print("硫붾돱 踰덊샇 : ");
			mNum = sc.nextInt();
			
			if(mNum == 9) {
				return;
			}else if(mNum == 1) {
				calcPerimeter();
				break;
			}else if(mNum == 2) {
				calcRectArea();
				break;
			}
		}while(mNum != 1 || mNum != 2);
	}
	
	public void calcCircum() {
		System.out.print("x 醫뚰몴 : ");
		int x = sc.nextInt();
		System.out.print("y 醫뚰몴 : ");
		int y = sc.nextInt();
		System.out.print("諛섏�由� : ");
		int radius = sc.nextInt();
		
		cc.calcCircum(x, y, radius);
		
		System.out.println("�몮�젅 : " + x + ", " + y + ", " + radius + cc.calcCircum(x, y, radius));
		
	}
	
	public void calcCircleArea() {
		System.out.print("x 醫뚰몴 : ");
		int x = sc.nextInt();
		System.out.print("y 醫뚰몴 : ");
		int y = sc.nextInt();
		System.out.print("諛섏�由� : ");
		int radius = sc.nextInt();
		
		cc.calcArea(x, y, radius);
		
		System.out.println("硫댁쟻 : " + x + ", " + y + ", " + radius + cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x 醫뚰몴 : ");
		int x = sc.nextInt();
		System.out.print("y 醫뚰몴 : ");
		int y = sc.nextInt();
		System.out.print("�넂�씠 : ");
		int height = sc.nextInt();
		System.out.print("�꼫鍮� : ");
		int width = sc.nextInt();
		
		rc.calcPerimeter(x, y, height, width);
		
		System.out.println("�몮�젅 : " + x + ", " + y + ", " + height + ", " + width + rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x 醫뚰몴 : ");
		int x = sc.nextInt();
		System.out.print("y 醫뚰몴 : ");
		int y = sc.nextInt();
		System.out.print("�넂�씠 : ");
		int height = sc.nextInt();
		System.out.print("�꼫鍮� : ");
		int width = sc.nextInt();
		
		rc.calcArea(x, y, height, width);
		
		System.out.println("硫댁쟻 : " + x + ", " + y + ", " + height + ", " + width + rc.calcArea(x, y, height, width));
	}
}
