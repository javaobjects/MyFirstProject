package com.neuedu.chapter03;

public class _02switch��� {
	/**
		  switch(A���ʽ)
		  {
		  	   case ȡֵ1��
			  	   		B����;
			  	   		break;
			   case ȡֵ2��
			  	   		C����;
			  	   		break;
			   .....
			   default:
			   	   N����;
		  
		  }
		  
		  ע�⣺
		  	1. switch(A���ʽ)�е�A���ʽֻ�ܽ���byte��short��char��int��long����,JDK1.7�汾���Ͽ��Խ���String����
		  	2. case��ȡֵ�����ظ�
		  	3. �����ʹ��break,һ��ĳ��case�ı��ʽ�����������������е�case�����䶼���ж�ִ�У��������ؿ����Ƿ���Ҫʹ��break��䣻
	 */
	public static void main(String[] args) {
		/**
		 	�����һ~���壬���"д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����"
		 	�������~���գ����"�ż�ʹ���ѹ�������д���룡����"
		 */
		int weekday = 2;
		//��ʽһ
		switch(weekday)
		{
			//�����һ~���壬���"д�������Ҹ��ˣ�д����ʹ���˷ܣ�����"
			case 1:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---1");
				break;
			case 2:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---2");
				break;
			case 3:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---3");
				break;
			case 4:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---4");
				break;
			case 5:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---5");
				break;
			case 6:
				System.out.println("�ż�ʹ���ѹ�������д���룡����---6");
				break;
			case 7:
				System.out.println("�ż�ʹ���ѹ�������д���룡����---7");
				break;
		}
		//��ʽ��
		switch(weekday)
		{
			//�����һ~���壬���"д�������Ҹ��ˣ�д����ʹ���˷ܣ�����"
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---1��2��3��4��5");
				break;
			case 6:
			case 7:
				System.out.println("�ż�ʹ���ѹ�������д���룡����---6��7");
				break;
		}
		//��ʽ��
		switch(weekday)
		{
			//�����һ~���壬���"д�������Ҹ��ˣ�д����ʹ���˷ܣ�����"
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---1��2��3��4��5");
				break;
			default:
				System.out.println("�ż�ʹ���ѹ�������д���룡����---6��7");
				break;
		}
		//��ʽ��
		switch(weekday)
		{
			case 6:
			case 7:
				System.out.println("�ż�ʹ���ѹ�������д���룡����---6��7");
				break;	
			default:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---1��2��3��4��5");
				break;
		}
		
		//JDK1.7�汾���Ͽ��Խ���String����
		String week = "������";
		switch(week)
		{
			case "������":
			case "������":
				System.out.println("�ż�ʹ���ѹ�������д���룡����---6��7");
				break;	
			default:
				System.out.println("д����ʹ�Ҹ��ˣ�д����ʹ���˷ܣ�����---1��2��3��4��5");
				break;
		}
	}
	
}

