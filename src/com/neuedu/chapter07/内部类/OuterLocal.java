package com.neuedu.chapter07.内部类;

/**
	局部内部类：定义在一个方法中的类
	
		注意：
			1.在方法定义的内部类中只能访问方法中的final类型的局部变量
 */
//外部类
public class OuterLocal {

	//外部类属性
	int outerNum = 10;
	int x = 666;
	
	//外部类方法
	public void outerMethod()
	{
		System.out.println("Outer.outerMethod()...");
		final String username = "scott";
		
		//局部内部类
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
				//outerMethod();
				System.out.println("Inner.x :" + x); //内部类变量
				System.out.println("Outer.x :" + OuterLocal.this.x); //外部类变量
				
				System.out.println("outerMethod.username : " + username);
			}
		}
		
		//实例化内部化
		Inner inner = new Inner();
		inner.innerMethod();
		
	}
	public static void main(String[] args) {
		//在类中访问内部类
		OuterLocal outer = new OuterLocal();
		outer.outerMethod();
	}
	
}
