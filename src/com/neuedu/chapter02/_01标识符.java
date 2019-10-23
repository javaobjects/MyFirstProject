package com.neuedu.chapter02;

/**
	标识符: Java中的包、类、方法、参数、变量、常量的名称
	
		标识符的命名规则：
			1.必须以字母、下划线（_）或美元符号（$）开头
			2.余下的字符可以是下划线、美元符号或任何的字母或数字，长度不限
			3.标识符中不能有空格
			4.不能使用Java中的关键字或者保留字做为标识符
			5.见名知义
			
			
		包名：全部小写，例如：com.neuedu.chapter01
		
		类名：pascal规则（帕斯卡规则），首字母大写，其余字母首字母大写，例如：HelloWorld
		
		变量、方法、参数：camel规则（驼峰法），首字母小写，其余字母首字母大写，例如变量名 : firstNumber，方法名:methodOne，参数名:secondNumber
		                                    下划线法，多个单词之间"_"下划线隔开，first_number，method_one
		                                    
		常量：全部大写，多个单词之间"_"下划线隔开，例如PI，USER_NAME

 */
//类名：_01标识符
public class _01标识符 {
	
	//变量名 : firstNumber
	int firstNumber = 10;
	
	//常量名：PI
	final double PI = 3.1415926;
	final String USER_NAME = "scott";

	//方法名:methodOne    参数名:secondNumber
	public void methodOne(int secondNumber)
	{
		
	}
	
	public static void main(String[] args) {

	}

}
