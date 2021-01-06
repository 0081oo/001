package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.*;

public class CircleController {
	Circle c;
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double area = (double)(radius * radius) * 3.14;
		
		return c.toStirng() + " / " + Double.toString(area);
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		double circum = (double)(radius) * 2 * 3.14;
		
		return c.toStirng() + " / " + Double.toString(circum);
	}
}
