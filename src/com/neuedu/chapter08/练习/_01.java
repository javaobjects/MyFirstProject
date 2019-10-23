package com.neuedu.chapter08.练习;

/**
 * 1、编写应用程序，从命令行传入两个整型数作为除数和被除数。要求程序中捕获NumberFormatException 异常和ArithmeticException 异常，而且无论在哪种情况下，“总是被执行”这句话都会在控制台输出。 [必作题]
在命令行输入不同的参数时能输出如下各种结果：
		1.1 在命令行输入 <零个参数>
		1.2 在命令行输入   1  和  2
		1.3 在命令行输入  1  和   3a
		1.4 在命令行输入  1  和   0 
 */
public class _01 {

	public static void main(String[] args) {
		try{
			//参数一:String
			String str1 = args[0];
			//参数二:String
			String str2 = args[1];
			
			//String -> int
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			//求商
			int result = num1 / num2;
			
			//输出结果
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			//System.out.println("参数个数不正确，一定要传入两个参数");
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			//System.out.println("参数必须为整数");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println("算数异常，除数不能为0");
		}
		finally
		{
			System.out.println("总是被执行");
		}
	}
	
}
