package com.neuedu.chapter07.static关键字;

/**
   	static关键字：修饰成员，不可以修饰局部变量
   	
	   	1.修饰属性（静态变量、类变量）：   对象共享，类被加载时，即被保存在内存当中，当类存在时，类变量一直存在
	   		两种方式访问：
				1.直接访问：类名.属性；------------【推荐】
					StaticKey.pi
					
				2.实例化后访问：对象名.属性
					StaticKey s1 = new StaticKey();
					System.out.println(s1.pi);

	   	
	   	2.修饰方法（静态方法、类方法）
	   		两种方式访问：
				1.直接访问：类名.方法名()------------【推荐】
					 StaticKey.getPi();
					 
				2.实例化后访问：对象名.方法名()
					StaticKey s1 = new StaticKey();
					s1.getPi();
					
				注意：
					① 静态方法里只能直接访问静态成员，而不能直接访问类中的非静态成员
					② 静态方法中不能使用this、super关键字
 					③ 静态方法不能被非静态方法覆盖
 					④ 静态方法不能修饰构造器

	   	3.修饰代码块（静态代码块）：静态块经常用来进行类属性的初始化，在类加载时执行，且仅执行一次
			
				类加载 -> 静态代码块执行一次  -> new对象 -> 自由代码块 -> 构造函数
	   		
		
 */
public class StaticKey {

	/**
	 * 1.修饰属性（静态变量、类变量）
	 */
	static double pi = 3.1415926;//静态成员
	String username = "张三";//非静态成员
	
	/**
	 * 3.修饰代码块（静态代码块）
	 */
	static{
		System.out.println("静态代码块，类的初始化操作..........");
	}
	
	//自由代码块
	{
		System.out.println("自由代码块，对象的初始化操作..........");
	}
	
	//构造函数
	public StaticKey()
	{
		System.out.println("构造函数............");
	}
	
	
	/**
	 * 2.修饰方法（静态方法、类方法）
	 */
	public static double getPi()
	{
		//System.out.println(StaticKey.pi); //静态成员，类级别，类一被加载，即保存在内存中
		//System.out.println(new StaticKey().username);//非静态成员，对象级别，对象被new之后，才保存在内存中
		
		//System.out.println(username);//① 而不能直接访问类中的非静态成员
		
		return pi;//① 静态方法里只能直接访问静态成员
	}
	
	public static void main(String[] args) {
		/**
		 * 1.修饰属性（静态变量、类变量）
		 */
		//1.直接访问：类名.属性；
		System.out.println(StaticKey.pi);
		
		StaticKey.pi = 3.14;
		
		//2.实例化后访问：对象名.属性
		StaticKey s1 = new StaticKey();
		System.out.println(s1.pi);
		
		StaticKey s2 = new StaticKey();
		System.out.println(s2.pi);
		
		/**
		 * 2.修饰方法（静态方法、类方法）
		 */
		//1.直接访问：类名.方法名()
		System.out.println(StaticKey.getPi());
		
		//2.实例化后访问：对象.方法名()
		System.out.println(s1.getPi());
		
		/**
		 * 3.修饰代码块（静态代码块）
		 */
		//不需要测试代码
	}
	
}
class SubStaticKey extends StaticKey
{
	//③ 静态方法不能被非静态方法覆盖
	/*public double getPi()
	{
		return pi;
	}*/
}
