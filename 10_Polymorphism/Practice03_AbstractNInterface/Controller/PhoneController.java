package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	public String[] method() {
		
		SmartPhone[] pArr = new SmartPhone[2];
		pArr[0] = new GalaxyNote9();
		pArr[1] = new V40();
		
		String[] sArr = new String[2];
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof GalaxyNote9) {
				sArr[0] = ((GalaxyNote9)pArr[i]).printInformation();
			}else if(pArr[i] instanceof V40) {
				sArr[1] = ((V40)pArr[i]).printInformation();
			}
		}
		
		return sArr;
	}
}
