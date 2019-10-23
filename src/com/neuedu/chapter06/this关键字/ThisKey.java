package com.neuedu.chapter06.this关键字;

/**
 * this关键字:
		1.代表对象自身的引用
		2.指向调用该方法的当前对象
		3.通常在类的方法定义中使用

         用this关键字的情况
		1.方法中的变量与成员变量重名
		2.在一个构造器中，调用其它重载的构造器，且必须放在第一行
		3.返回当前对象的引用

 */

public class ThisKey {

	//成员变量
	String name;
	String sex;
	
	//构造函数
	public ThisKey()
	{
		System.out.println("初始化系统的代码..............");
	}
	public ThisKey(String name)
	{
		//2.在一个构造器中，调用其它重载的构造器，且必须放在第一行
		this();
		
		//1.方法中的变量与成员变量重名
		this.name = name;
		//System.out.println("ThisKey(name):" + this);//33d063fd
	}
	public ThisKey(String name,String sex)
	{
		//2.在一个构造器中，调用其它重载的构造器，且必须放在第一行
		this(name);
		
		//this.name = name;
		this.sex = sex;
	}
	
	//成员方法
	public void setName(String name)
	{
		//1.方法中的变量与成员变量重名
		this.name = name;
		//System.out.println("setName:" + this);//33d063fd
	}
	
	//3.返回当前对象的引用
	public ThisKey getInstance()
	{
		return this;
	}
	
	public static void main(String[] args) {
		//ThisKey caixukun = new ThisKey("蔡徐坤");
		//caixukun.setName("球王蔡徐坤");
		//System.out.println("caixukun:" + caixukun);//33d063fd
		
		ThisKey fengTiMo = new ThisKey("冯提莫", "女");
		System.out.println(fengTiMo.name);
		System.out.println(fengTiMo.sex);
		
		//3.返回当前对象的引用
		ThisKey fengTiMoClone = fengTiMo.getInstance();
		System.out.println(fengTiMo);//33d063fd
		System.out.println(fengTiMoClone);//33d063fd
	}
}
