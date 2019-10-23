package com.neuedu.chapter07.�ڲ���;

/**
	�ڲ��ࣺ������һ�����е��࣬��Ƕ����
	
		ע�⣺
			1.�ڲ�����Է����ⲿ�����е������뷽��������Ҫ��������
			2.�ⲿ������ڲ�������Ի򷽷�ʱ�����봴������
				 �� �����з��ʣ�
				 	Inner inner = new Inner();
					inner.innerMethod();
			     �� ������������ڲ���
					Outer outer = new Outer();
					Inner inner = outer.new Inner();
					
			3.����ڲ������ⲿ������Ի򷽷��������ڲ�������ȼ� > �ⲿ������ȼ�
			4.���ܶ���static����
			
			
		�ⲿ�����η���public <default>
		�ڲ������η���public protected <default> private 
 */
//�ⲿ��
public class Outer {

	//�ⲿ������
	int outerNum = 10;
	int x = 666;
	
	//�ⲿ�෽��
	public void outerMethod()
	{
		System.out.println("Outer.outerMethod()...");
	}
	
	//�ڲ���
	class Inner
	{
		//�ڲ�������
		int innerNum = 20;
		int x = 888;
		//static int y = 99;//���徲̬����
		
		//�ڲ��෽��
		public void innerMethod()
		{
			System.out.println("outerNum:" + outerNum);
			outerMethod();
			System.out.println("Inner.x :" + x); //�ڲ������
			System.out.println("Outer.x :" + Outer.this.x); //�ⲿ�����
		}
	}
	
	//�����з����ڲ���������뷽��
	public void showInner()
	{
		Inner inner = new Inner();
		System.out.println("innerNum:" + inner.innerNum);
		inner.innerMethod();
	}
	
	public static void main(String[] args) {
		//�����з����ڲ���
		//Outer outer = new Outer();
		//outer.showInner();
		
		//������������ڲ���
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.innerMethod();
	}
	
}
