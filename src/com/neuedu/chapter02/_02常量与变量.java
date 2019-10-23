package com.neuedu.chapter02;
/**
	常量：① 值不可变   ② 全部大写，多个单词之间"_"下划线隔开
	
		语法：<修饰符> final 常量类型  常量名  = 常量值;
		
		分类：
			① 字面常量（字面量）：表示值本身，例如3.1415926
			② 有名常量（有名量）：例如PI，就是代表3.1415926的名称
		
		JDK1.7版本以上，常量支持下划线。
		
-----------------------------------------------------------
	修饰符： public protected <default> private
-----------------------------------------------------------

	变量：① 值可以变    ② camel规则（驼峰法），首字母小写，其余字母首字母大写
	
	            语法：<修饰符> 变量类型  变量名  [= 变量值];
	            
	            分类：
	        ① 全局变量 ：定义在类中,方法以外的变量
	        		
	        		★  既可以只声明，不赋值，也可以声明的同时赋值
	        
		        	int firstNum;      //只声明，不赋值
					int secondNum = 10;//声明的同时赋值
	        
	        ② 局部变量：定义在方法中的参数param，以及方法中的变量thirdNum
	        
	        		★  声明的同时必须赋值
	        		
					int thirdNum;     //not ok
					int forthNum = 20;//必须声明的同时赋值
 */
public class _02常量与变量 {

	//定义常量
	final double PI = 3.1415926;
	
	//JDK1.7版本以上，常量支持下划线
	final long L = 1_234_567_890_123_456L;
	
	//下划线不能在数字开头、数字的结尾、小数点的后面
	//final long L2 = _1_234_567_890_123_456L;
	//final long L3 = _1_234_567_890_123_456_L;
	//final double D = 1_234_567_890_123_456._123456;
	
	//声明二进制常量
	int B = 0b1101_1100_0101_0101;
	
	//全局变量
	int firstNum;      //只声明，不赋值，默认值0
	int secondNum = 10;//声明的同时赋值
	
	//方法
	public void method(int param)
	{
		//局部变量
		int thirdNum;
		int forthNum = 20;
		
		//访问全局变量
		System.out.println(firstNum);  //向控制台console输入括号中的内容
		System.out.println(secondNum); //向控制台console输入括号中的内容
		//访问局部变量
		System.out.println(param);     //向控制台console输入括号中的内容
		//System.out.println(thirdNum);//向控制台console输入括号中的内容
		System.out.println(forthNum);  //向控制台console输入括号中的内容
	}
	
	//测试
	public static void main(String[] args) {
		_02常量与变量 test = new _02常量与变量();
		test.method(666);
	}
}
