package com.javaex.oop.methods;

public class MethodPractice {

	public static void main(String[] args) {
		// 문제 1.
//		printHelloMethod();
		//	문제 2. 
		printNumbers();
		//	문제 3.
		int rnd = getRandomNumber();
		System.out.println(rnd);
	}

//	입력이 없고 출력도 없는 메서드
//
//	문제1. 콘솔에 “Hello Method!”를 출력하는 메서드를 작성하세요.
//	메서드명 : printHelloMethod
//	입력 : 없음
//	리턴 : 없음
	
	private static void printHelloMethod() {
		System.out.println("Hello Method");
	}
//
//	문제2. 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
//	메서드명 : printNumbers
//	입력 : 없음
//	리턴 : 없음
	private static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
//	문제3. 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
//	메서드명 : getRandomNumber
//	입력 : 없음
//	리턴 : 랜덤한 정수
	private static int getRandomNumber() {
		int rnd = (int)(Math.random() * 101);
		return rnd;
	}
//
//	문제4. 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요
//	메서드명 : getSum
//	입력 : 없음
//	리턴 : 계산된 정수
	
}
