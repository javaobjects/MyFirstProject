package com.neuedu.chapter07.����ģʽ;
/**
	����ģʽ�������ڴ��н�����һ��ʵ��
	
		�ô���
			1.��ʡ�ڴ�
			2.�������
			
	           ����ģʽҪ�㣺
			1.ĳ����ֻ����һ��ʵ��
			2.���������д������ʾ��
			3.��������������ϵͳ�ṩ���ʵ��
			
		ʵ�ֲ��裺
			1.���캯��˽�л�����private����
			2.���д���ʵ����ʹ��private static����
			3.�����ṩһ�����еķ������������ʵ��

 */
//����ʽ
public class Singleton2 {

	//2.���д���ʵ����ʹ��private static����
	private static Singleton2 instance = null;
	
	//1.���캯��˽�л�����private����
	private Singleton2()
	{
		
	}
	
	//3.�����ṩһ�����еķ������������ʵ��
	public static Singleton2 getInstance()
	{
		if(instance == null)
		{ 
			instance = new Singleton2();
		}
		
		return instance;
	}
	
}
