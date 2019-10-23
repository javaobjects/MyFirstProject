package com.neuedu.chapter08.自定义异常;

/**
 * 自定义异常类：
 * 		1.自定类继承Exception
 * 		2.提供一个带参数的构造函数
 *
 */
public class MyException extends Exception {

	//用于保存异常发生的原因
	private String message;
	
	//构造函数
	public MyException(String message)
	{
		this.message = message;
	}
	
	//访问器方法，获取异常的信息
	public String getMessage()
	{
		return message;
	}
	
}
