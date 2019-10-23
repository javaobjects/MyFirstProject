package com.neuedu.chapter07.抽象类.练习;

//3.3  在main方法中，声明创建每个子类的对象，并调用2个子类的showAll方法。
public class ShapeTest {

	public static void main(String[] args) {
		//矩形
		Rectangle rectangle = new Rectangle(10, 20, "pink");
		rectangle.showAll();
		
		//圆形
		Circle circle = new Circle(5, "black");
		circle.showAll();
	}

}
