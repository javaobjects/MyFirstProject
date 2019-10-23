package com.neuedu.chapter07.抽象类.练习;

//    3.2.2  Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，另外又增加两个构造方法（为半径、颜色赋值的）。
public class Circle extends Shape {

	//增加1个属性，radius表示半径
	int radius;
	
	//另外又增加两个构造方法（为半径、颜色赋值的）
	public Circle()
	{
		super();
	}
	public Circle(int radius,String color)
	{
		super(color);
		//this.color = color;
		this.radius = radius;
	}
	
	//重写getPer、getArea和showAll三个方法
	@Override
	public double getArea() {
		this.area = 3.1415926 * radius * radius;
		return this.area;
	}

	@Override
	public double getPer() {
		this.per = 2 * 3.1415926 * radius;
		return this.per;
	}

	@Override
	public void showAll() {
		System.out.println("半径：" + this.radius + "，颜色：" + this.color + "，面积：" + this.getArea() + "，周长：" + this.getPer());
	}

}
