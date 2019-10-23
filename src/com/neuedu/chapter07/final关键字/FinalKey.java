package com.neuedu.chapter07.final关键字;
/**
	final关键字：
		
		1.修饰类:类不可以被继承
		
		2.修饰变量:常量，值不能被修改
			① 必须赋予初始值
			② 可以在声明的同时赋值，也可以在构造器中赋值
			③ 系统不会对final属性默认的赋初始值

		3.修饰方法:方法不能被覆盖
 */
//1.修饰类
public final class FinalKey {

		//2.修饰变量:常量，值不能被修改
		final double PI = 3.1415926;//② 可以在声明的同时赋值，也可以在构造器中赋值
		final String USER_NAME;
		
		//② 可以在声明的同时赋值，也可以在构造器中赋值
		public FinalKey()
		{
			USER_NAME = "scott";
		}
		
		//3.修饰方法:方法不能被覆盖
		public final double getPi()
		{
			return PI;
		}
}
//1.修饰类:类不可以被继承
/*class SubFinalKey extends FinalKey
{
	//3.修饰方法:方法不能被覆盖
	public double getPi()
	{
		return PI;
	}
}*/
