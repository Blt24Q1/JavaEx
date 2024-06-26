package com.javaex.api.objectclass.rectanble;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		Rectangle d = c;
		
		System.out.println(a.equals(b));	//	true
		System.out.println(b.equals(c));	//	false
		System.out.println(c.equals(d));	//	true
		System.out.println(d.equals(c));	//	true
	}

}
