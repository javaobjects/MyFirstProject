package com.neuedu.chapter03;

import java.util.Scanner;

public class _01if语句 {

	/**
		单一条件判断：
			if(A表达式)
			{
				B语句块;
			}
			
			执行步骤：
				1.判断A表达式
					返回true,执行B语句块，结束判断
					返回false,结束判断
					
	 --------------------------------------------------------------
	 	两个条件：
	 		if(A表达式)
			{
				B语句块;
			}
			else
			{
				C语句块;
			}
			
			执行步骤：
				1.判断A表达式
					返回true,执行B语句块，结束判断
					返回false,执行C语句块,结束判断
	--------------------------------------------------------------
	 	多个条件：
	 		if(A表达式)
			{
				B语句块;
			}
			else if(C表达式)
			{
				D语句块;
			}
			.....
			else
			{
				N语句块;
			}
			
			执行步骤：
				1.判断A表达式
					返回true,执行B语句块，结束判断
					返回false,判断C表达式
				2.判断C表达式
					返回true,执行D语句块，结束判断
					返回false,判断N表达式
				......
				3.如果以上表达式均返回false,默认执行N语句块，结束判断
				
		注意：如果，大括号中，只有一条语句，则可以省略大括号（不建议省略）
	 
	 */
	public static void main(String[] args) {
		//扫描仪
		Scanner scanner = new Scanner(System.in);
		
		//扫描控制台一行数据（以回车作为结束判断）
		System.out.println("请输入您的年龄：");
		int num = scanner.nextInt();
		
		/**
		 * if ： 如果年龄大于0，输出"您的年龄为：N"，否则，不作响应
		 */
		if(num > 0)
		{
			//System.out.println("您的年龄为：" + num);
		}
		
		/**
		 * if....else... :  如果年龄大于0，输出"您的年龄为：N" ; 否则，输出"年龄不能小于等于0"
		 */
		if(num > 0)
		{
			System.out.println("您的年龄为：" + num);
		}
		else
		{
			System.out.println("年龄不能小于等于0");
		}
		
		/**
		 * if...else if....else if ....else:
		 * 
		 * 		输入一个学生的成绩，
		 * 			如果成绩大于等于90，输出"优秀"
		 * 			如果成绩大于等于80，小于90，输出"良好"
		 * 			如果成绩大于等于60，小于80，输出"及格"
		 * 			否则，输出"不及格，请继续深造"
		 */
		//扫描一行数据
		System.out.println("请录入学员的成绩：");
		double score = scanner.nextDouble();
		
		//如果成绩大于等于90，输出"优秀"
		if(score >= 90)
		{
			System.out.println("优秀");
		}
		//如果成绩大于等于80，小于90，输出"良好"
		else if(score >= 80 && score < 90)
		{
			System.out.println("良好");
		}
		//如果成绩大于等于60，小于80，输出"及格"
		else if(score >= 60 && score < 80)
		{
			System.out.println("及格");
		}
		//否则，输出"不及格，请继续深造"
		else
		{
			System.out.println("不及格，请继续深造");
		}
	}

}
