package com.javaex.exception.sample;

import java.io.IOException;

//CheckedException : 반드시 예외처리 필요
// -try ~ catch
// -throw로 에외던지기를 한 경우 
public class ThrowsExceptEx {

	public static void main(String[] args) {
		ThrowsExcept except =new ThrowsExcept();
		//checkedException은 반드시 예외 처리!
		try {
			except.divide(100,0);
			except.executeRuntimeException();
			except.executeExcept();
		}catch(IOException e) {
//		e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (CustomerArithException e) {
			System.err.println(e.getMessage());
			System.err.println("나누어지는 수:"+e.getNum1());
			System.err.println("나누는 수:"+e.getNum2());
		}catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}
}
