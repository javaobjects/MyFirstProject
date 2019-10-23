package com.neuedu.chapter06.��ϰ;

/**
 * 1������һ������Point��
 *     ����2����Ա����x��y�ֱ��ʾx��y���꣬
       2��������Point()��Point(int x0,int y0),
                      �Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
           
                       ��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ[������]
 */
//����һ������Point
public class Point {

	//����2����Ա����x��y�ֱ��ʾx��y����
	int x;
	int y;
	
	//2��������Point()��Point(int x0,int y0)
	public Point()
	{
		
	}
	public Point(int x0,int y0)
	{
		x = x0;
		y = y0;
	}
	
	//�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ�
	public void movePoint(int dx,int dy)
	{
		x = x + dx;
		y = y + dy;
	}
	
	//  ��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2������
	public static void main(String[] args) {
		//��new�����ٸ�ֵ
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.movePoint(5, 5);
		System.out.println(p1.x + "  " + p1.y);
		
		//new�����ͬʱ��ֵ
		Point p2 = new Point(30, 40);
		p2.movePoint(-5, -5);
		System.out.println(p2.x + "  " + p2.y);
	}
	
}
