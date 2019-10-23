package com.neuedu.chapter07.内部类;

/**
	内部类：定义在一个类中的类，即嵌套类
	
		注意：
			1.内部类可以访问外部类所有的属性与方法，不需要创建对象
			2.外部类访问内部类的属性或方法时，必须创建对象
				 ① 在类中访问：
				 	Inner inner = new Inner();
					inner.innerMethod();
			     ② 在类以外访问内部类
					Outer outer = new Outer();
					Inner inner = outer.new Inner();
					
			3.如果内部类与外部类的属性或方法重名，内部类的优先级 > 外部类的优先级
			4.不能定义static变量
			
			
		外部类修饰符：public <default>
		内部类修饰符：public protected <default> private 
 */
//外部类
public class Outer {

	//外部类属性
	int outerNum = 10;
	int x = 666;
	
	//外部类方法
	public void outerMethod()
	{
		System.out.println("Outer.outerMethod()...");
	}
	
	//内部类
	class Inner
	{
		//内部类属性
		int innerNum = 20;
		int x = 888;
		//static int y = 99;//定义静态变量
		
		//内部类方法
		public void innerMethod()
		{
			System.out.println("outerNum:" + outerNum);
			outerMethod();
			System.out.println("Inner.x :" + x); //内部类变量
			System.out.println("Outer.x :" + Outer.this.x); //外部类变量
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
		//Outer outer = new Outer();
		//outer.showInner();
		
		//在类以外访问内部类
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.innerMethod();
	}
	
}
