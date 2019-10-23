package com.neuedu.chapter02;

public class _04数据类型转换 {

	public static void main(String[] args) {
		/**
		 * 自动类型转换（隐式转换）： 小 -> 大,类型兼容
		 * 
		 * 	 特殊：long -> float
		 *  注意：byte、short、char之间不会相互转换，他们三者在计算时首先会转换为int类型 
		 */
		//int -> double
		int num = 10;
		double dnum = num;
		
		System.out.println("num:" + num);//10
		System.out.println("dnum:" + dnum);//10.0
		
		//long -> float
		long l = 1234567890123456789L;
		float f = l;
		
		System.out.println("l:" + l);//1234567890123456789
		System.out.println("f:" + f);//1.23456794E18
		
		//byte、short、char之间不会相互转换，他们三者在计算时首先会转换为int类型 
		byte b1 = 125;
		byte b2 = 120;
		int sum = b1 + b2;
		
		/**
		 * 强制类型转换（显示转换）： 大 -> 小，可能类型不兼容
		 * 
		 * 		风险：① 精度下降  ② 数字溢出
		 */
		byte b3 = 125;
		byte b4 = 120;
		byte sum2 = (byte) (b1 + b2);
		
		System.out.println(sum2);//-11
	}
	
}
