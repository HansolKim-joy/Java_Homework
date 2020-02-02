package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		
		boolean bool = true;
		
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
			bool = true;
		}else {
			bool = false;
		}
		return bool;
	}
	
	public long leapDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		
		int day = 0;
		
		for(int i = 1; i < year; i++) {
			if((i % 4 == 0 && i % 100 != 0)|| i % 400 == 0) {
				day += 366;
			}else {
				day += 365;
			}
		}
		
		for(int i = 1; i < month; i++) {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				day += 31; break;
			case 4: case 6: case 9: case 11:
				day += 30; break;
			case 2:
				if(i % 4 == 0) {
					if(i % 100 != 0 || i % 400 == 0) {
						day += 29;
					}
				}else {
					day += 28;
				}
				break;
			}
		}
		
		day += date;
		
		return day;
	}
}
