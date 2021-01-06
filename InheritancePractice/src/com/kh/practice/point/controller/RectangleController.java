package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.*;

public class RectangleController {
	Rectangle r;
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, width, height);
		
		int area = width * height;
		
		return r.toString() + " / " + Integer.toString(area);
	}
	
	public String calcCircum(int x, int y, int height, int width) {
		r = new Rectangle(x, y, width, height);
		
		int circum = 2 * (height + width);
		
		return r.toString() + " / " + Integer.toString(circum);
	}
}
