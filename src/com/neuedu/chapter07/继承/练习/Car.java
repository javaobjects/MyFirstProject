package com.neuedu.chapter07.�̳�.��ϰ;
/**
 *      2.2 ����һ��Vehicle�������γ���Car��Ҫ�����£�
 *      
		2.2.1 �γ����Լ�������������loader��int ���ͣ���
		2.2.2 �ṩ�����ʼ�����ԵĹ��췽����
		2.2.3 ���¶���run()���ô�ӡ��������γ����ܵĹ��ܡ�
		2.2.4 ��main�����д���һ��Ʒ��Ϊ��Honda������ɫΪ��red����������Ϊ2�˵Ľγ���
 */
//2.2 ����һ��Vehicle�������γ���Car��Ҫ�����£�
public class Car extends Vehicle{

	//2.2.1 �γ����Լ�������������loader��int ���ͣ���
	int loader;
	
	//2.2.2 �ṩ�����ʼ�����ԵĹ��췽����
	public Car()
	{
		
	}
	public Car(String brand,String color,int loader)
	{
		super(brand, color);
		this.loader = loader;
	}
	
	//2.2.3 ���¶���run()���ô�ӡ��������γ����ܵĹ��ܡ�
	@Override
	public void run() {
		//super.run();
		System.out.println("һ����" + this.getColor() + "����ɫ�� ��" + this.getBrand() + "���������š�" + this.loader + "���ˣ��ԡ�" + this.getSpeed()+ "�������ٶ����ڸ��ٹ�·������......");
	}
	
	//2.2.4 ��main�����д���һ��Ʒ��Ϊ��Honda������ɫΪ��red����������Ϊ2�˵Ľγ���
	public static void main(String[] args) {
		Car honda = new Car("Honda", "red", 2);
		honda.run();
		honda.setSpeed(60);
		honda.run();
	}

}
