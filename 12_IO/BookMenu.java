package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: 
				System.out.println("���α׷� ����");
				return;
			default: 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void fileSave() {
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		
		System.out.print("���� ���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("���ǳ�¥(yyyy-mm-dd) : ");
		String date1 = sc.nextLine();
		String[] date2 = date1.split("-");
		int year = Integer.parseInt(date2[0]);
		int month = Integer.parseInt(date2[1]) - 1;
		int date = Integer.parseInt(date2[2]);
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		
		System.out.print("������ : ");
		double discount = sc.nextDouble();
		
		Book b = new Book(title, author, price, c, discount);
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		bc.fileRead();
		
		for(int i = 0; i < bc.fileRead().length; i++) {
			if(bc.fileRead()[i] == null) {
				
			}else {
				System.out.println(bc.fileRead()[i]);
			}
		}
	}
}
