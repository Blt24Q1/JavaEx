package com.javaex.exception;

import java.io.IOException;

//	CheckedException: 반드시 예외 처리 필요
//	- try ~ catch 
//	- throw로 예외 던지기를 한 경우
public class ThrowsExceptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExcept except = new ThrowsExcept();
		
		try {
			except.executeExcept();// checkedException은 반드시 예외 처리!
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
