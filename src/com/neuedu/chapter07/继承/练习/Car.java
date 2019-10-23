package com.neuedu.chapter07.继承.练习;
/**
 *      2.2 定义一个Vehicle类的子类轿车类Car，要求如下：
 *      
		2.2.1 轿车有自己的属性载人数loader（int 类型）。
		2.2.2 提供该类初始化属性的构造方法。
		2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。
		2.2.4 在main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
 */
//2.2 定义一个Vehicle类的子类轿车类Car，要求如下：
public class Car extends Vehicle{

	//2.2.1 轿车有自己的属性载人数loader（int 类型）。
	int loader;
	
	//2.2.2 提供该类初始化属性的构造方法。
	public Car()
	{
		
	}
	public Car(String brand,String color,int loader)
	{
		super(brand, color);
		this.loader = loader;
	}
	
	//2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。
	@Override
	public void run() {
		//super.run();
		System.out.println("一辆【" + this.getColor() + "】颜色的 【" + this.getBrand() + "】车，载着【" + this.loader + "】人，以【" + this.getSpeed()+ "】样的速度正在高速公路奔驰着......");
	}
	
	//2.2.4 在main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
	public static void main(String[] args) {
		Car honda = new Car("Honda", "red", 2);
		honda.run();
		honda.setSpeed(60);
		honda.run();
	}

}
