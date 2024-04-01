package com.javaex.api.objectclass.rectanble;

public class Rectangle {
	//	필드
	private int width;	//	너비
	private int height;	//	높이

	//	생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//	면적 구하는 메서드
	public int area() {
		return width * height;
	}
	
	//	비교 로직 : 면적이 같으면 동등한 사각형으로 판단
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return area() == other.area();
		}
		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
}
