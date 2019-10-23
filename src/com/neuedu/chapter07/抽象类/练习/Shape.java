package com.neuedu.chapter07.抽象类.练习;
/**
 * 3、设计三个类，分别如下：（知识点：抽象类及抽象方法） [必做题]
	3.1 设计Shape表示图形类，有面积属性area、周长属性per，颜色属性color，有两个构造方法（一个是默认的、一个是为颜色赋值的），还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息，还有一个求颜色的方法getColor。
	3.2 设计 2个子类：
	3.2.1  Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
    3.2.2  Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，另外又增加两个构造方法（为半径、颜色赋值的）。
	3.3  在main方法中，声明创建每个子类的对象，并调用2个子类的showAll方法。
*/
//	3.1 设计Shape表示图形类，有面积属性area、周长属性per，颜色属性color，有两个构造方法（一个是默认的、一个是为颜色赋值的），还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息，还有一个求颜色的方法getColor。
public abstract class Shape {

	//有面积属性area、周长属性per，颜色属性color
	double area;
	
	double per;
	
	String color;
	
	//有两个构造方法（一个是默认的、一个是为颜色赋值的）
	public Shape()
	{
		
	}
	public Shape(String color)
	{
		this.color = color;
	}
	
	//还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息
	public abstract double getArea();
	public abstract double getPer();
	public abstract void showAll();
	
	//还有一个求颜色的方法getColor
	public String getColor()
	{
		return color;
	}
}
