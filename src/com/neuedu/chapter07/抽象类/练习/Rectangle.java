package com.neuedu.chapter07.������.��ϰ;

//	3.2.1  Rectangle��ʾ�����࣬�����������ԣ�Width��ʾ���ȡ�height��ʾ��ȣ���дgetPer��getArea��showAll��������������������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ���
public class Rectangle extends Shape{

	//�����������ԣ�Width��ʾ���ȡ�height��ʾ���
	int width;
	
	int height;
	
	//����������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ�
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
	
	//��дgetPer��getArea��showAll��������
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
		System.out.println("��" + this.width + "���ߣ�" + this.height + "����ɫ��" + this.color + "�������" + this.getArea() + "���ܳ���" + this.getPer());
	}
	
}
