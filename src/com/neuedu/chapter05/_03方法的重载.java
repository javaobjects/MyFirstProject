package com.neuedu.chapter05;

/**
	���������أ�reload��: ������һ�����ж���һ������ͬ���ķ���
		
		���ã�����ͬһ���У�ͬһ�����������벻ͬ�Ĳ�����ʵ��ͬһ����
		
		�������صĹ���
			1.������һ��
			2.�������Ͳ�һ�£��������Ͳ�һ�¡�����������һ�¡�����˳��һ�£�
			3.����ֵ���Ϳ���һ�£����Բ�һ��

 */
public class _03���������� {

	//�ӷ�
	public static int add(int x,int y)
	{
		int sum = x + y;
		
		return sum;
	}
	
	//�ӷ����������Ͳ�һ��
	public static double add(double x,double y)
	{
		double sum = x + y;
		
		return sum;
	}
	
	//�ӷ�������������һ��
	public static int add(int x,int y,int z)
	{
		int sum = x + y + z;
		
		return sum;
	}
	
	//�ӷ�������˳��һ��
	public static double add(int x,double y)
	{
		double sum = x + y;
		
		return sum;
	}
	
	//�ӷ�������˳��һ��
	public static double add(double x,int y)
	{
		double sum = x + y;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10, 20));
		
		System.out.println(add(10.15, 20.15));
		
		System.out.println(add(10, 20, 30));
		
		System.out.println(add(10, 22.22));
	}
	
}
