package com.neuedu.chapter08;

/**
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.neuedu.chapter08._04方法调用堆栈.methodThree(_04方法调用堆栈.java:20)
		at com.neuedu.chapter08._04方法调用堆栈.methodTwo(_04方法调用堆栈.java:14)
		at com.neuedu.chapter08._04方法调用堆栈.methodOne(_04方法调用堆栈.java:8)
		at com.neuedu.chapter08._04方法调用堆栈.main(_04方法调用堆栈.java:24)
 */
public class _04方法调用堆栈 {

	public static void methodOne()
	{
		System.out.println("methodOne...........1");
		methodTwo();
	}
	
	public static void methodTwo()
	{
		System.out.println("methodTwo...........2");
		methodThree();
	}
	
	public static void methodThree()
	{
		System.out.println("methodThree...........3");
		int i = 1/0;
	}
	
	public static void main(String[] args) {
		methodOne();
	}
	
}
