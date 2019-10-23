package com.neuedu.chapter06.三种变量;

/**
 * Java中主要有3种类型的变量：
		1.静态变量[静态区]：在类中声明为static 的属性。	     -- 老大，无私共享
		2.实例变量[堆内存]：即类的属性，也是全局变量。                          -- 老二，相对自私，所有东西自己专有
		3.局部变量[栈内存]：定义在方法体中的变量；或是方法的形参。  -- 老三，一直跟着方法跑，方法被调用，老三在，方法调用完成，老三不见了
		
		栈stack：栈的存取速度比堆快，效率高。在栈内保存基本数据类型的局部变量和对象的引用值。
		
		堆heap：堆可以保存那些对空间要求较大的变量。如对象的属性和数组的元素。

 */
public class Variables{
	
	//1.静态变量：在类中声明为static 的属性
	//         属于类级别的变量，在类被加载的时候即保存在内存，只要类存在，静态变量就存在，属于共享变量
	static double pi = 3.1415926;
	
	//2.实例变量：即类的属性，也是全局变量.
	//         属于对象级别的变量，在new对象的时候存在内存当中，只要对象存在，实例变量就存在，属于对象专有的变量
	String username;
	
	//3.局部变量：定义在方法体中的变量str；或是方法的形参prefix。
	//        当方法被调用时，局部变量即保存在内存中，当方法执行结束，局部变量生命周期结束
	public void setUsername(String prefix)
	{
		String str = "球王";
		
		this.username = prefix + this.username;
	}
	
	/**
	 * 测试成员变量的默认值
	 * 			byte的默认值：0
				short的默认值：0
				int的默认值：0
				long的默认值：0
				
				float的默认值：0.0
				double的默认值：0.0
				
				char的默认值：---- ---

				boolean的默认值：false
				
				int[]的默认值：null
				Variables的默认值：null
	 */
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	
	int[] array;
	Variables var;
	
	public void getDefaultValue()
	{
		System.out.println("byte的默认值：" + b + "\n"
				+ "short的默认值：" + s + "\n"
				+ "int的默认值：" + i + "\n"
				+ "long的默认值：" + l + "\n\n"
				
				+ "float的默认值：" + f + "\n"
				+ "double的默认值：" + d + "\n\n"
				
				+ "char的默认值：----" + c + "---\n\n"
				
				+ "boolean的默认值：" + bool + "\n\n"
				
				+ "int[]的默认值：" + array + "\n"
				+ "Variables的默认值：" + var + "\n"
		);
	}
	
	public static void main(String[] args) {
		//有名对象一
		Variables caixunkun = new Variables();
		caixunkun.username = "蔡徐坤";
		
		System.out.println("[蔡徐坤]:" + caixunkun.pi); //3.1415926
		System.out.println("[蔡徐坤]:" + caixunkun.username);//蔡徐坤
		
		//有名对象二
		Variables fengtimo = new Variables();
		fengtimo.pi = 3.14;
		fengtimo.username = "冯提莫";
		
		System.out.println("[冯提莫]:" + fengtimo.pi); //3.14
		System.out.println("[冯提莫]:" + fengtimo.username);//冯提莫
		
		System.out.println("[蔡徐坤]:" + caixunkun.pi); //3.14
		System.out.println("[蔡徐坤]:" + caixunkun.username);//蔡徐坤
		
		//局部变量
		fengtimo.setUsername("网红---");
		System.out.println(fengtimo.username);
		
		//匿名对象：不定义对象的句柄，直接调用对象的方法，适用于对象只需要使用一次的场景
		new Variables().setUsername("球王");
		
		//测试默认值
		caixunkun.getDefaultValue();
		
	}
}
