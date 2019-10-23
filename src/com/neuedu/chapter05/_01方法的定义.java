package com.neuedu.chapter05;

/**
	语法：
		<访问权限控制符> <修饰符> 返回值类型   方法名称（参数类型  参数名称，参数类型   参数名称....）
		{
			方法体;
			return 返回值;
		}
		
		 访问权限控制符：public protected <default> private
		
		 修饰符：   static:表示方法可以被"类名.方法名()"直接调用
			   final :表示方法不可以被覆盖
			  
	             返回值类型：可以基本数据类型，也可以是引用类型，也可以没有返回值void
	             return后的返回值必须与返回值类型保持一致
	             
	              方法名称：camel驼峰法规则，首字母小写，其余单词的首字母大写，例如methodOne
	     
	              参数列表：可以没有参数，可以一个或多个参数参数，多个参数之间","逗号隔开
	                                  形式参数（形参）:定义在放后面的参数列表，用于指定参数类型与参数名称，告诉调用方法的人使用该方法时，应该传递什么类型的参数，例如add(int x,int y)中的x与y
	                                  实际参数（实参）:调用方法时，传递的实际的值，不需要指定类型，例如add(10, 20);中的10与20
	                                  
	    return语句：return后的返回值类型必须与返回值类型保持一致
	    		      如果返回值类型为void，return可以省略
	    		  return只能定义一次，且return之后的语句不在执行
	    	
		
	方法的分类：有无返回值，有无参数
		① 有返回值，有参数
		② 有返回值，无参数
		③ 无返回值，有参数
		④ 无返回值，无参数
 */
public class _01方法的定义 {

	/**
	 * ① 有返回值，有参数
	 * @param x 参数一
	 * @param y 参数二
	 * @return x+y
	 */
	public static int add(int x,int y)
	{
		int sum = x + y;
		
		return sum;
	}
	
	/**
	 * ② 有返回值，无参数
	 * @return 差
	 */
	public static int minus()
	{
		int x = 20;
		int y = 10;
		
		int result = x - y;
		
		return result;
	}
	
	/**
	 * ③ 无返回值，有参数
	 * @param x 参数一 
	 * @param y 参数二
	 */
	public static void multiply(double x,double y)
	{
		double result = x * y;
		
		System.out.println("求积：" + result);
		
		//return;//可省略
	}
	
	/**
	 * ④ 无返回值，无参数
	 */
	public static void divide()
	{
		int x = 20;
		int y = 10;
		
		int result = x / y;
		
		System.out.println("求商：" + result);
	}
	
	
	public static void main(String[] args) {
		//① 有返回值，有参数
		int result = add(10, 20);
		System.out.println("求和：" + result);
		
		//② 有返回值，无参数
		int result2 = minus();
		System.out.println("求差：" + result2);
		
		//③ 无返回值，有参数
		multiply(10.5, 10.0);
		
		//④ 无返回值，无参数
		divide();
	}
	
}
