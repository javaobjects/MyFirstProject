package com.neuedu.chapter08;

/**
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.neuedu.chapter08._04�������ö�ջ.methodThree(_04�������ö�ջ.java:20)
		at com.neuedu.chapter08._04�������ö�ջ.methodTwo(_04�������ö�ջ.java:14)
		at com.neuedu.chapter08._04�������ö�ջ.methodOne(_04�������ö�ջ.java:8)
		at com.neuedu.chapter08._04�������ö�ջ.main(_04�������ö�ջ.java:24)
 */
public class _04�������ö�ջ {

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
