package com.neuedu.chapter08.练习;

import java.util.Scanner;

/**
 * 2、编写一个检查给定的数字的数据类型是否为byte的程序，如果此数字超出byte数据类型表示的数的范围，则引发用户自定义的异常ByteSizeException,并显示相应的错误信息（知识点：自定义异常） [选作题]
		步骤1：创建用户自定义异常类ByteSizeException
		步骤2：在main方法中编写逻辑代码
		步骤3：运行并测试
		效果如图：
 */
public class _02 {

	public static void throwException() throws ByteSizeException {
		
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		
		//判断byte是否在-128~127之间
		if(b < -128 || b > 127)
		{
			//System.out.println("输入的数字不是byte类型");
			throw new ByteSizeException("输入的数字不是byte类型");
		}
		else
		{
			System.out.println("输入的数字是一个byte类型");
		}
	}
	
	//步骤2：在main方法中编写逻辑代码
	public static void main(String[] args){
		
		try {
			throwException();
		} catch (ByteSizeException e) {
			e.printStackTrace();
		}
	}
}
//步骤1：创建用户自定义异常类ByteSizeException
class ByteSizeException extends Exception
{
	//用于保存异常信息的属性
	private String message;
	
	//构造函数
	public ByteSizeException(String message)
	{
		this.message = message;
	}
	
	//对外公共的方法获取异常信息
	public String getMessage()
	{
		return message;
	}
}
