package com.neuedu.chapter07.内部类;

/**
	静态内部类：定义在一个类中的类，即嵌套类，且使用static修饰
	
		注意：
			1. 不能访问外部类非静态成员
			2. 非静态内部类只能定义非静态成员，而静态内部类可以定义静态成员和非静态成员
			3. 实例化
				 ① 在类中访问：
				 	Inner inner = new Inner();
					inner.innerMethod();
			     ② 在类以外访问内部类
					OuterStatic.Inner inner = new OuterStatic.Inner();
					inner.innerMethod();
 */
//外部类
public class OuterStatic {

	//外部类属性
	static int outerNum = 10;
	static int x = 666;
	
	//外部类方法
	public static void outerMethod()
	{
		System.out.println("Outer.outerMethod()...");
	}
	
	//内部类
	static class Inner
	{
		//内部类属性
		int innerNum = 20;
		int x = 888;
		static int y = 99;//定义静态变量
		
		//内部类方法
		public void innerMethod()
		{
			System.out.println("outerNum:" + outerNum);
			outerMethod();
			System.out.println("Inner.x :" + x); //内部类变量
			System.out.println("Outer.x :" + OuterStatic.x); //外部类变量
		}
	}
	
	//在类中访问内部类的属性与方法
	public void showInner()
	{
		Inner inner = new Inner();
		System.out.println("innerNum:" + inner.innerNum);
		inner.innerMethod();
	}
	
	public static void main(String[] args) {
		//在类中访问内部类
		/*OuterStatic outer = new OuterStatic();
		outer.showInner();*/
		
		//在类以外访问内部类
		OuterStatic.Inner inner = new OuterStatic.Inner();
		inner.innerMethod();
	}
	
}
