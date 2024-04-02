package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		//	String은 immutable,
		//	StringBuffer는 내부에 버퍼를 두고, 버퍼에서 작업
		//	최종 소비되는 시점에서 문자열로 반환
		//	메모리 관리 측면에서 String보다 유리
		
		//	버퍼 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
	}

}
