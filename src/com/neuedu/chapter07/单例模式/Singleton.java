package com.neuedu.chapter07.单例模式;
/**
	单例模式：类在内存中仅存在一个实例
	
		好处：
			1.节省内存
			2.共享对象
			
	           单例模式要点：
			1.某个类只能有一个实例
			2.它必须自行创建这个示例
			3.必须自行向整个系统提供这个实例
			
		实现步骤：
			1.构造函数私有化，用private修饰
			2.自行创建实例，使用private static修饰
			3.对外提供一个公有的方法，返回这个实例

 */
//饿汉式
public class Singleton {

	//2.自行创建实例，使用private static修饰
	private static Singleton instance = new Singleton();
	
	//1.构造函数私有化，用private修饰
	private Singleton()
	{
		
	}
	
	//3.对外提供一个公有的方法，返回这个实例
	public static Singleton getInstance()
	{
		return instance;
	}
	
}
