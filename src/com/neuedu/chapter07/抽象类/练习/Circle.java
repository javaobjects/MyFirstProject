package com.neuedu.chapter07.������.��ϰ;

//    3.2.2  Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶����дgetPer��getArea��showAll���������������������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
public class Circle extends Shape {

	//����1�����ԣ�radius��ʾ�뾶
	int radius;
	
	//�����������������췽����Ϊ�뾶����ɫ��ֵ�ģ�
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
	
	//��дgetPer��getArea��showAll��������
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
		System.out.println("�뾶��" + this.radius + "����ɫ��" + this.color + "�������" + this.getArea() + "���ܳ���" + this.getPer());
	}

}
