package com.neuedu.chapter08.练习;
/**
 * 3、编写一个方法，比较两个字符串。假如其中一个字符串为空，会产生NullPointerException异常，在方法声明中通告该异常，
 *    并在适当时候触发异常，然后编写一个程序捕获该异常。 [必作题]
 */
public class _03 {

	//编写一个方法，比较两个字符串
	public static boolean compare(String str1,String str2) throws NullPointerException
	{
		//并在适当时候触发异常
		if(str1 == null || str2 == null)
		{
			throw new NullPointerException("比较的字符串对象不能为null");
		}
		
		if(str1.equals(str2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//然后编写一个程序捕获该异常
	public static void main(String[] args) {
		try
		{
			boolean result = compare(null, "abc");
			System.out.println(result);
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}
