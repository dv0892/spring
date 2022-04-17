package com.playground;



public class Triangle {
	
	Point point;
	
	Triangle(){
	}

	String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setType(Point p) {
		this.point = p;
	}
	
	public String toString() {
		return "Triangle Type is : " + type+" point " + this.point;
	}
}
