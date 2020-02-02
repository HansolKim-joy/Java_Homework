package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	LeapController lc = new LeapController();
	
	public LeapView() {
		Calendar c = Calendar.getInstance();
		
		String year = " ";
		if(lc.isLeapYear(2020) == true) {
			year = "����";
		}else {
			year = "���";
		}
		System.out.println("2020���� " + year + "�Դϴ�.");
		System.out.println("�� ��¥ �� : " + lc.leapDate(c));
	}
	
}
