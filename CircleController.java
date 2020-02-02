package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		
		return " / " + Math.PI * c.getRadius() * c.getRadius();
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return " / " + Math.PI * c.getRadius() * 2;
	}
}
