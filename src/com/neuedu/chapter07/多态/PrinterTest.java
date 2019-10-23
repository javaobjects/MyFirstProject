package com.neuedu.chapter07.多态;
/**
 	 多态：不同的对象对同一行为作出的不同响应

		基于同一父类，不同实例，调用同一方法，实现不同的功能。


       	实现的三要素：
       		1.基于继承或实现
       		
       		2.必须重写父类的方法
       		
       		3.子类 转换父类的引用

 */
//测试打印机功能
public class PrinterTest {

	//按打印按钮
	public static void click(Printer printer)
	{
		printer.print();
	}
	
	public static void main(String[] args) {
		
		//我想打印彩色....
		click(new PrinterColor());
		
		//我想打印黑白
		click(new PrinterBlack());
	}

}
