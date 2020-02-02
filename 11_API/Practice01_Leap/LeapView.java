package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	LeapController lc = new LeapController();
	
	public LeapView() {
		Calendar c = Calendar.getInstance();
		
		String year = " ";
		if(lc.isLeapYear(2020) == true) {
			year = "윤년";
		}else {
			year = "평년";
		}
		System.out.println("2020년은 " + year + "입니다.");
		System.out.println("총 날짜 수 : " + lc.leapDate(c));
	}
	
}
