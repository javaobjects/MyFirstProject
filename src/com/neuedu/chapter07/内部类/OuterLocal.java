package com.neuedu.chapter07.�ڲ���;

/**
	�ֲ��ڲ��ࣺ������һ�������е���
	
		ע�⣺
			1.�ڷ���������ڲ�����ֻ�ܷ��ʷ����е�final���͵ľֲ�����
 */
//�ⲿ��
public class OuterLocal {

	//�ⲿ������
	int outerNum = 10;
	int x = 666;
	
	//�ⲿ�෽��
	public void outerMethod()
	{
		System.out.println("Outer.outerMethod()...");
		final String username = "scott";
		
		//�ֲ��ڲ���
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
				//outerMethod();
				System.out.println("Inner.x :" + x); //�ڲ������
				System.out.println("Outer.x :" + OuterLocal.this.x); //�ⲿ�����
				
				System.out.println("outerMethod.username : " + username);
			}
		}
		
		//ʵ�����ڲ���
		Inner inner = new Inner();
		inner.innerMethod();
		
	}
	public static void main(String[] args) {
		//�����з����ڲ���
		OuterLocal outer = new OuterLocal();
		outer.outerMethod();
	}
	
}
