package com.neuedu.chapter08.��ϰ;

/**
 * 1����дӦ�ó��򣬴������д���������������Ϊ�����ͱ�������Ҫ������в���NumberFormatException �쳣��ArithmeticException �쳣��������������������£������Ǳ�ִ�С���仰�����ڿ���̨����� [������]
�����������벻ͬ�Ĳ���ʱ��������¸��ֽ����
		1.1 ������������ <�������>
		1.2 ������������   1  ��  2
		1.3 ������������  1  ��   3a
		1.4 ������������  1  ��   0 
 */
public class _01 {

	public static void main(String[] args) {
		try{
			//����һ:String
			String str1 = args[0];
			//������:String
			String str2 = args[1];
			
			//String -> int
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			//����
			int result = num1 / num2;
			
			//������
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			//System.out.println("������������ȷ��һ��Ҫ������������");
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			//System.out.println("��������Ϊ����");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println("�����쳣����������Ϊ0");
		}
		finally
		{
			System.out.println("���Ǳ�ִ��");
		}
	}
	
}
