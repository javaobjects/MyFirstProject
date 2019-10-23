package com.neuedu.chapter06.练习;

/**
 * 1、定义一个点类Point，
 *     包含2个成员变量x、y分别表示x和y坐标，
       2个构造器Point()和Point(int x0,int y0),
                      以及一个movePoint（int dx,int dy）方法实现点的位置移动，
           
                       创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。[必作题]
 */
//定义一个点类Point
public class Point {

	//包含2个成员变量x、y分别表示x和y坐标
	int x;
	int y;
	
	//2个构造器Point()和Point(int x0,int y0)
	public Point()
	{
		
	}
	public Point(int x0,int y0)
	{
		x = x0;
		y = y0;
	}
	
	//以及一个movePoint（int dx,int dy）方法实现点的位置移动
	public void movePoint(int dx,int dy)
	{
		x = x + dx;
		y = y + dy;
	}
	
	//  创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标
	public static void main(String[] args) {
		//先new对象，再赋值
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.movePoint(5, 5);
		System.out.println(p1.x + "  " + p1.y);
		
		//new对象的同时赋值
		Point p2 = new Point(30, 40);
		p2.movePoint(-5, -5);
		System.out.println(p2.x + "  " + p2.y);
	}
	
}
