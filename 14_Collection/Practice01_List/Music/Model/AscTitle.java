package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		String sTitle = o1.getTitle();
		String oTitle = o2.getTitle();
		
		String sSinger = o1.getSinger();
		String oSinger = o2.getSinger();
		
		if(sTitle.compareTo(oTitle) == 1) {
			return 1;
		}else if(sTitle.compareTo(oTitle) == 0) {
			return sSinger.compareTo(oSinger);
		}else {
			return -1;
		}
	}
}
