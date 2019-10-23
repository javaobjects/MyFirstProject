package com.neuedu.chapter07.������.��ϰ;
/**
 * 3����������࣬�ֱ����£���֪ʶ�㣺�����༰���󷽷��� [������]
	3.1 ���Shape��ʾͼ���࣬���������area���ܳ�����per����ɫ����color�����������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ�������3�����󷽷����ֱ��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ������һ������ɫ�ķ���getColor��
	3.2 ��� 2�����ࣺ
	3.2.1  Rectangle��ʾ�����࣬�����������ԣ�Width��ʾ���ȡ�height��ʾ��ȣ���дgetPer��getArea��showAll��������������������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ���
    3.2.2  Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶����дgetPer��getArea��showAll���������������������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
	3.3  ��main�����У���������ÿ������Ķ��󣬲�����2�������showAll������
*/
//	3.1 ���Shape��ʾͼ���࣬���������area���ܳ�����per����ɫ����color�����������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ�������3�����󷽷����ֱ��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ������һ������ɫ�ķ���getColor��
public abstract class Shape {

	//���������area���ܳ�����per����ɫ����color
	double area;
	
	double per;
	
	String color;
	
	//���������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ�
	public Shape()
	{
		
	}
	public Shape(String color)
	{
		this.color = color;
	}
	
	//����3�����󷽷����ֱ��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ
	public abstract double getArea();
	public abstract double getPer();
	public abstract void showAll();
	
	//����һ������ɫ�ķ���getColor
	public String getColor()
	{
		return color;
	}
}
