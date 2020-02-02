package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		String standardSinger = o1.getSinger();
		String otherSinger = o2.getSinger();
		
		
		return -standardSinger.compareTo(otherSinger);
	}

}
