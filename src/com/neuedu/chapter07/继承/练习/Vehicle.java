package com.neuedu.chapter07.继承.练习;
/**
 * 2、设计2个类，要求如下：（知识点：类的继承 方法的覆盖） [必做题]
		2.1  定义一个汽车类Vehicle，
		2.1.1 属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。
		2.1.2 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
		2.1.3 为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
		2.1.4 定义一个一般方法run()，用打印语句描述汽车奔跑的功能
		2.1.5 在main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
		
	    2.2 定义一个Vehicle类的子类轿车类Car，要求如下：
		2.2.1 轿车有自己的属性载人数loader（int 类型）。
		2.2.2 提供该类初始化属性的构造方法。
		2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。
		2.2.4 在main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
 */
//2.1  定义一个汽车类Vehicle
public class Vehicle {
	
	//2.1.1 属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。
	private String brand;
	
	private String color;
	
	private double speed;
	
	//2.1.2 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）
	public Vehicle()
	{
		
	}
	public Vehicle(String brand,String color)
	{
		this.brand = brand;
		this.color = color;
	}
	
	//2.1.3 为属性提供访问器方法(get与set)。注意：汽车品牌一旦初始化之后不能修改。
	public String getBrand()
	{
		return this.brand;
	}
	
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public double getSpeed()
	{
		return this.speed;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	//2.1.4 定义一个一般方法run()，用打印语句描述汽车奔跑的功能
	public void run()
	{
		System.out.println("一辆【" + this.color + "】颜色的 【" + this.brand + "】车，以【" + this.speed+ "】样的速度正在高速公路奔驰着......");
	}
	
	//2.1.5 在main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
	public static void main(String[] args) {
		Vehicle benz = new Vehicle("benz", "black");
		benz.run();
		benz.setSpeed(30);
		benz.run();
		benz.setSpeed(60);
		benz.run();
	}

}
