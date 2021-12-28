package com.day6Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

	int r;
	double area, length;
	
	public void input() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Radius?");
		r = Integer.parseInt(br.readLine());
	}
	
	public double circleArea() {
		double area;
		area = r*r*3.14;
		
		return area;
	}
	
	public double circleLength() {
		double length;
		length = r*3*3.14;
		return length;
	}
	
	public void print(double a, double l) {
		System.out.println("Radius:" + r);
		System.out.println("Area" + a);
		System.out.println("Length" + l);
	}

	public double area() {
		return 0;
	}
	
}
