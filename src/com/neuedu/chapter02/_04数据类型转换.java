package com.neuedu.chapter02;

public class _04��������ת�� {

	public static void main(String[] args) {
		/**
		 * �Զ�����ת������ʽת������ С -> ��,���ͼ���
		 * 
		 * 	 ���⣺long -> float
		 *  ע�⣺byte��short��char֮�䲻���໥ת�������������ڼ���ʱ���Ȼ�ת��Ϊint���� 
		 */
		//int -> double
		int num = 10;
		double dnum = num;
		
		System.out.println("num:" + num);//10
		System.out.println("dnum:" + dnum);//10.0
		
		//long -> float
		long l = 1234567890123456789L;
		float f = l;
		
		System.out.println("l:" + l);//1234567890123456789
		System.out.println("f:" + f);//1.23456794E18
		
		//byte��short��char֮�䲻���໥ת�������������ڼ���ʱ���Ȼ�ת��Ϊint���� 
		byte b1 = 125;
		byte b2 = 120;
		int sum = b1 + b2;
		
		/**
		 * ǿ������ת������ʾת������ �� -> С���������Ͳ�����
		 * 
		 * 		���գ��� �����½�  �� �������
		 */
		byte b3 = 125;
		byte b4 = 120;
		byte sum2 = (byte) (b1 + b2);
		
		System.out.println(sum2);//-11
	}
	
}
