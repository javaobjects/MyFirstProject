package com.neuedu.chapter02;

public class _03�������� {

	public static void main(String[] args) {
		/**
		 * 4��8�ֻ����������ͣ�
		 * 		�������ͣ�byte short int��Ĭ�ϣ� long
		 *      �������ͣ�float  double��Ĭ�ϣ�
		 *      �ַ����ͣ�char
		 *      �������ͣ�boolean
		 * 
		 * 1. �������� �� byte�ֽ�����  ��    short������ ��       int���ͣ�Ĭ�ϣ���      long������
		 *              1�ֽ�                            2�ֽ�                       4�ֽ�                                 8�ֽ�
		 *              
		 *           1�ֽ� = 8λ     1byte = 8bit
		 *           
		 */
		//byte��ȡֵ��Χ-128~127֮��
		byte b = 126;
		//byte b2 = 128;//�������
		
		//short
		short s = 12812;
		
		//int(Ĭ��)
		int i = 1234567890;
		
		//long  ��Ҫ��ĩβ��Ӵ�д'L'��Сд'l'
		long l = 1234567890123456789L;  //0-9  ʮ���ƣ���һλ����Ϊ0
		long l2 = 0X1AB459F;			//0-9 A-F ʮ�����ƣ���0x��0X��ͷ
		long l3 = 01234567L;		    //0-7  �˽��ƣ���0��ͷ
		
		System.out.println(Long.MIN_VALUE + "   " + + Long.MAX_VALUE);//-9223372036854775808   9223372036854775807
		
		//ʮ����ת�����ƣ��˽⣩
		int num = 10;//1010
		
		//������תʮ����
		//1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 0 + 2 + 0 = 10
		
		/**
		 * 2. ���������� �� float ������  ��   double ˫���ȣ�Ĭ�ϣ�

		 *              4�ֽ�                                     8�ֽ�
		 */
		//float  ��Ҫ��ĩβ��Ӵ�д'F'��Сд'f'
		float f = 123456.789F;
		
		//double
		double d = 1234567890.123456;
		
		/**
		 * 3. �ַ����� -   char
		 * 				2�ֽ�
		 * 
		 * 	   char�ַ�����ʹ��''������������ ��String�ַ�������ʹ��""˫����������
		 */
		char c = 'a';  //a
		char c2 = '1'; //1
		char c3 = '��'; //��
		char c4 = 97;      //a   ascii���   48~57��ʾ���� 0-9   65~90��ʾ��д��ĸA-Z   97~122��ʾСд��ĸa-z
		char c5 = '\n';    //ת���ַ�
		char c6 = '\u9FA5';//��       unicode�����   4E00-9FA5��ʾ�����ĺ��ַ�Χ
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println("\"happy \t new \n year!!\"");
		
		/**
		 * 4. ��������  boolean:true   false
		 */
		boolean b3 = true;
		boolean b4 = false;
	}
	
}
