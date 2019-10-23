package com.neuedu.chapter07.�̳�.��ϰ;
/**
 * 2�����2���࣬Ҫ�����£���֪ʶ�㣺��ļ̳� �����ĸ��ǣ� [������]
		2.1  ����һ��������Vehicle��
		2.1.1 ���԰���������Ʒ��brand��String���ͣ�����ɫcolor��String���ͣ����ٶ�speed��double���ͣ���
		2.1.2 �����ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ�����ٶȵĳ�ʼֵ����Ϊ0����
		2.1.3 Ϊ�����ṩ������������ע�⣺����Ʒ��һ����ʼ��֮�����޸ġ�
		2.1.4 ����һ��һ�㷽��run()���ô�ӡ��������������ܵĹ���
		2.1.5 ��main�����д���һ��Ʒ��Ϊ��benz������ɫΪ��black����������
		
	    2.2 ����һ��Vehicle�������γ���Car��Ҫ�����£�
		2.2.1 �γ����Լ�������������loader��int ���ͣ���
		2.2.2 �ṩ�����ʼ�����ԵĹ��췽����
		2.2.3 ���¶���run()���ô�ӡ��������γ����ܵĹ��ܡ�
		2.2.4 ��main�����д���һ��Ʒ��Ϊ��Honda������ɫΪ��red����������Ϊ2�˵Ľγ���
 */
//2.1  ����һ��������Vehicle
public class Vehicle {
	
	//2.1.1 ���԰���������Ʒ��brand��String���ͣ�����ɫcolor��String���ͣ����ٶ�speed��double���ͣ���
	private String brand;
	
	private String color;
	
	private double speed;
	
	//2.1.2 �����ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ�����ٶȵĳ�ʼֵ����Ϊ0��
	public Vehicle()
	{
		
	}
	public Vehicle(String brand,String color)
	{
		this.brand = brand;
		this.color = color;
	}
	
	//2.1.3 Ϊ�����ṩ����������(get��set)��ע�⣺����Ʒ��һ����ʼ��֮�����޸ġ�
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
	
	//2.1.4 ����һ��һ�㷽��run()���ô�ӡ��������������ܵĹ���
	public void run()
	{
		System.out.println("һ����" + this.color + "����ɫ�� ��" + this.brand + "�������ԡ�" + this.speed+ "�������ٶ����ڸ��ٹ�·������......");
	}
	
	//2.1.5 ��main�����д���һ��Ʒ��Ϊ��benz������ɫΪ��black����������
	public static void main(String[] args) {
		Vehicle benz = new Vehicle("benz", "black");
		benz.run();
		benz.setSpeed(30);
		benz.run();
		benz.setSpeed(60);
		benz.run();
	}

}
