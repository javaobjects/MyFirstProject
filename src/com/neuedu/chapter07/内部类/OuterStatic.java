package com.neuedu.chapter07.�ڲ���;

/**
	��̬�ڲ��ࣺ������һ�����е��࣬��Ƕ���࣬��ʹ��static����
	
		ע�⣺
			1. ���ܷ����ⲿ��Ǿ�̬��Ա
			2. �Ǿ�̬�ڲ���ֻ�ܶ���Ǿ�̬��Ա������̬�ڲ�����Զ��徲̬��Ա�ͷǾ�̬��Ա
			3. ʵ����
				 �� �����з��ʣ�
				 	Inner inner = new Inner();
					inner.innerMethod();
			     �� ������������ڲ���
					OuterStatic.Inner inner = new OuterStatic.Inner();
					inner.innerMethod();
 */
//�ⲿ��
public class OuterStatic {

	//�ⲿ������
	static int outerNum = 10;
	static int x = 666;
	
	//�ⲿ�෽��
	public static void outerMethod()
	{
		System.out.println("Outer.outerMethod()...");
	}
	
	//�ڲ���
	static class Inner
	{
		//�ڲ�������
		int innerNum = 20;
		int x = 888;
		static int y = 99;//���徲̬����
		
		//�ڲ��෽��
		public void innerMethod()
		{
			System.out.println("outerNum:" + outerNum);
			outerMethod();
			System.out.println("Inner.x :" + x); //�ڲ������
			System.out.println("Outer.x :" + OuterStatic.x); //�ⲿ�����
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
		/*OuterStatic outer = new OuterStatic();
		outer.showInner();*/
		
		//������������ڲ���
		OuterStatic.Inner inner = new OuterStatic.Inner();
		inner.innerMethod();
	}
	
}
