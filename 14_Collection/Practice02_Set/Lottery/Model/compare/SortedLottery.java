package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.movdel.vo.Lottery;

public class SortedLottery implements Comparator<Lottery>{

	@Override
	public int compare(Lottery o1, Lottery o2) {
		String standardName = o1.getName();
		String otherName = o2.getName();
		
		String standardPhone = o1.getPhone();
		String otherPhone = o2.getPhone();
		
		if(standardName == otherName) {
			return standardPhone.compareTo(otherPhone);
		}else {
			return standardName.compareTo(otherName);
		}
	}	
}
