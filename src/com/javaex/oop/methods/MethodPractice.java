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
		//	문제 4.
		int result = getSum();
		System.out.println(result);
		//	문제 5.
		printOddOrEven(2024);
		//	문제 6.
		printStringLength("Java Programming");
		//	문제 7.
		int largeNumber = getLargeNumber(10, 20);
		System.out.println(largeNumber);
		//	문제 8.
		System.out.println(concatenateStrings(
				"Java ", 
				"Programming"));
		//	문제 9.
		System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9));
		//	문제 10.
		System.out.println(concatenateStrings("Java ",
				"Programming ",
				"is ",
				"fun!"));
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
	private static int getSum() {
		int result = 0;
		for (int i = 0; i <= 10; i++) {
			result += i;
		}
		return result;
	}
	
//	문제5. 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
//	메서드명 : printOddOrEven
//	입력 : 정수
//	리턴 : 없음
	public static void printOddOrEven(int value) {
		//	3항 연산 : 조건식 ? 참일 때의 값 : 거짓일 때의 값
		System.out.println(
				value % 2 == 0 ? "짝수": "홀수"
				);
	}
	
//
//	문제6. 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요
//	메서드명 : printStringLengh
//	입력 : 문자열
//	리턴 : 없음
	private static void printStringLength(String str) {
		System.out.println(str.length());
	}
	
//	문제7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요
//	메서드명 : getLargeNumber
//	입력 : 두 개의 정수
//	리턴 : 계산된 정수
	private static int getLargeNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
//
//	문제8. 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
//	메서드명 : concatenateStrings
//	입력 : 두 개의 문자열
//	리턴 : 합쳐진 입력 문자열
	private static String concatenateStrings(String str1,
			String str2) {
		return str1 + str2;
	}
	
//	문제9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요
//	메서드명 : sumAll
//	입력 : 정해지지 않은 개수의 정수
//	리턴 : 합산된 결과 정수
	private static int sumAll(int ...values) {
		int total = 0;
		for (int val: values) {
			total += val;
		}
		return total;
	}
//
//	문제10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요
//	메서드명 : concatenateStrings
//	입력 : 정해지지 않은 개수의 문자열
//	리턴 : 합쳐진 문자열
	private static String concatenateStrings(String ...values) {
		String result = "";
		
		for (String val: values) {
			result += val;
		}
		
		return result;
	}
}
