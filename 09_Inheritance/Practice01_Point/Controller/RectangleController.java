package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return " / " + r.getHeight() * r.getWidth();
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setHeight(height);
		r.setY(y);
		r.setWidth(width);
		
		return " / " + 2 * (r.getWidth() + r.getHeight());
	}
}
