package com.neuedu.chapter05;

/**
	方法的重载（reload）: 允许在一个类中定义一个以上同名的方法
		
		作用：调用同一类中，同一方法名，传入不同的参数，实现同一功能
		
		方法重载的规则：
			1.方法名一致
			2.参数类型不一致（参数类型不一致、参数个数不一致、参数顺序不一致）
			3.返回值类型可以一致，可以不一致

 */
public class _03方法的重载 {

	//加法
	public static int add(int x,int y)
	{
		int sum = x + y;
		
		return sum;
	}
	
	//加法：参数类型不一致
	public static double add(double x,double y)
	{
		double sum = x + y;
		
		return sum;
	}
	
	//加法：参数个数不一致
	public static int add(int x,int y,int z)
	{
		int sum = x + y + z;
		
		return sum;
	}
	
	//加法：参数顺序不一致
	public static double add(int x,double y)
	{
		double sum = x + y;
		
		return sum;
	}
	
	//加法：参数顺序不一致
	public static double add(double x,int y)
	{
		double sum = x + y;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10, 20));
		
		System.out.println(add(10.15, 20.15));
		
		System.out.println(add(10, 20, 30));
		
		System.out.println(add(10, 22.22));
	}
	
}
