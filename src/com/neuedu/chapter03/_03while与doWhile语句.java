package com.neuedu.chapter03;

import java.util.Scanner;

public class _03while与doWhile语句 {

	/**
		while(A表达式)
		{
		   B语句块;
		}
		
		执行步骤：
			1.判断A表达式
				返回true，执行B语句块，重复执行步骤1
				返回false，结束循环。
	
		-------------------------------------------------
		
		do{
		
		   B语句块;
		   
		}while(A表达式);//分号必须有
		
		执行步骤：
			1.B语句块
			2.判断A表达式
				返回true，执行B语句块，重复执行步骤1
				返回false，结束循环。
				
				
	    while:     先判断，再执行
	    do...while:先执行一次，再判断执行
	 */
	public static void main(String[] args) {
		//使用while循环打印1~10之间的整数
		int num = 1;
		while(num <= 10)
		{
			System.out.println(num);
			num++;
		}
		
		//使用do....while循环打印1~10之间的整数
		int num2 = 1;
		do{
			System.out.println(num2);
			num2++;
			
		}while(num2 <= 10);//分号必须有
		
		//死循环
		/*while(true)
		{
			System.out.println("陷入死循环....");
		}*/
		
		int num3 = 1;
		while(num3 <= 10)
		{
			System.out.println(num3);
			//num++;//忘记添加自增条件
		}
		
		//死循环
		while(true)
		{
			//扫描仪
			Scanner scanner = new Scanner(System.in);
			
			//扫描控制台一行数据（以回车作为结束判断）
			String message = scanner.nextLine();
			
			//当用户输入"exit"，退出循环
			if("exit".equals(message))
			{
				System.out.println("我走了................");
				break;
			}
			else
			{
				System.out.println(">>>>:" + message);
			}
		}
		
		//计算从1到100的所有奇数相加（提示利用do...while语句）
		/*int x = 1;
		int sum = 0;
		do{
			sum = sum + x;
			x += 2;
			
		}while(x <= 100);
		
		System.out.println("sum:" + sum);*/
		
		int x = 1;
		int sum = 0;
		do{
			if(x%2 == 1)
			{
				sum = sum + x;
			}
			x++;
			
		}while(x <= 100);
		
		System.out.println("sum:" + sum);
		
	}
	
}
