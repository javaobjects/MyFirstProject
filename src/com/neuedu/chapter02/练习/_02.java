package com.neuedu.chapter02.练习;

public class _02 {

	/**
	 * 2、给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12 
	 *    注：分解数字既可以先除后模也可以先模后除（知识点：变量和运算符综合应用） [必做题]
	 */
	public static void main(String[] args) {
		//1.给定一个0～1000的整数
		int num = 345;
		
		//2.求得各位数
		int one = num % 10;//个位 5
		int two = num /10 % 10 ;//十位 
		int three = num /100;//百位
		
		//3.求各位数的和
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		System.out.println(one + two +three);
	}
	
}
