package com.neuedu.chapter07.抽象类.练习;

//	3.2.1  Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
public class Rectangle extends Shape{

	//增加两个属性，Width表示长度、height表示宽度
	int width;
	
	int height;
	
	//另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
	public Rectangle()
	{
		super();
	}
	public Rectangle(int width,int height,String color)
	{
		super(color);
		//this.color = color;
		this.width = width;
		this.height = height;
	}
	
	//重写getPer、getArea和showAll三个方法
	@Override
	public double getArea() {
		this.area = width * height;
		return this.area;
	}

	@Override
	public double getPer() {
		this.per = (width + height) * 2;
		return this.per;
	}

	@Override
	public void showAll() {
		System.out.println("宽：" + this.width + "，高：" + this.height + "，颜色：" + this.color + "，面积：" + this.getArea() + "，周长：" + this.getPer());
	}
	
}
