package com.kh.practice.file.view;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String s = sc.nextLine();
			
			if(!(s.equals("ex��it"))) {
				sb.append(s + "\n");
			}else {
				while(true) {
					System.out.print("������ ���� ���� �Է����ּ���.(ex. myFile.txt) : ");
					String file = sc.nextLine();
					fc.checkName(file);
					if(fc.checkName(file) == false) {
						System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�(y/n) : ");
						char check = sc.nextLine().charAt(0);
						
						if(check == 'y' || check == 'Y') {
							fc.fileSave(file, sb);
							return;
						}else if(check == 'n' || check == 'N') {
						
						}
					}else {
						fc.fileSave(file, sb);
						return;
					}
				}
			}
		}
	}
	
	public void fileOpen() {
		System.out.print("�� ���� �� : ");
		String file = sc.nextLine();
		if(fc.checkName(file) == false) {
			fc.fileOpen(file);
			System.out.println(fc.fileOpen(file));
		}else {
			System.out.println("���� �����Դϴ�.");
			return;
		}
	}
	
	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String file = sc.nextLine();
		fc.checkName(file);
		
		StringBuilder sb = new StringBuilder();
		
		if(fc.checkName(file) == false) {
			while(true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String s = sc.nextLine();
				
				if(!s.equals("ex��it")) {
					sb.append(s + "\n");
				}else {
					break;
				}
			}
			fc.fileEdit(file, sb);
		}else {
			System.out.println("���� �����Դϴ�.");
			return;
		}
	}
}
