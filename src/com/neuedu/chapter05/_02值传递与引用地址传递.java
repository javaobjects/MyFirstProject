package com.neuedu.chapter05;

import java.util.Arrays;

public class _02值传递与引用地址传递 {

	/**
	 * 值传递 ---------基本数据类型与String字符串类型均为值传递，方法中对参数的修改，不会影响传递之前的变量值
	 */
	public static void getX(int x)
	{
		x = 6666;
		System.out.println("getX ：" + x);//6666
	}
	
	/**
	 * 引用地址传递-------引用对象传递参数时，传递的为引用地址，方法中对参数的任意修改，将影响原参数的信息
	 */
	public static void getArray(int[] array)
	{
		array[4] = 888;
		
		System.out.println("getArray:" + array);//[I@2d95bbec
		System.out.println("getArray:" + Arrays.toString(array));//[1, 2, 3, 4, 888]
	}
	
	public static void main(String[] args) {
		//值传递 ---------基本数据类型与String字符串类型均为值传递，方法中对参数的修改，不会影响传递之前的变量值
		int x = 10;
		getX(x);
		
		System.out.println("main ：" + x);//10
		
		//引用地址传递-------引用对象传递参数时，传递的为引用地址，方法中对参数的任意修改，将影响原参数的信息
		int[] array = new int[]{1,2,3,4,5};
		getArray(array);
		
		System.out.println("main:" + array);//[I@2d95bbec
		System.out.println("main:" + Arrays.toString(array));//[1, 2, 3, 4, 888]
	}
	
}
