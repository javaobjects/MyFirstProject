package com.neuedu.chapter04;

/**
 	һά���飺һ���������͵�����
 	
 		�ص㣺1.ָ����������    2.ָ������
 		
 		������
 			��������      ������[];
 			��������[] ������;
 			
 		������
 			������ = new ��������[N];
 		
 		������ͬʱ������
 			��������    ������[] = new ��������[N];
 		
 		������ͬʱ��ɳ�ʼ����
 		            ��������    ������[] = new ��������[]{Ԫ��1��Ԫ��2��Ԫ��3.....};
 		            ��������    ������[] = {Ԫ��1��Ԫ��2��Ԫ��3.....};
 		            
 		��ֵ��
 			������[����] = ֵ;
 		
 		ȡֵ��
 			������[����];
 			
 		���ԣ�
 			��ȡ�����Ԫ�ظ��������ȣ���length
 		
 		������
 			for ���� forEach
 		
 		----------------------------------------------------------------------------------
 		
 		�����±�Խ���쳣  java.lang.ArrayIndexOutOfBoundsException
 		
 		----------------------------------------------------------------------------------
 		
 		stack(ջ)����ϵͳ���䣬��С���ƣ��Ƚ����
 		                             һ�����ڱ�������������͵ľֲ����� �� �������͵ĵ�ֵַ
 		                             
 		heap(��)���ɳ���Ա���ƣ���ʹ��new�ؼ���ʱ������heap(��)�ڴ�ռ䣬���ڱ������ö����Ԫ�ص�ֵ���Ƚ��ȳ�
 		                            һ�����ڱ������ö��������ֵ �� �����Ԫ��ֵ
 			     
 */
public class _01һά���� {

	public static void main(String[] args) {
		//1.����
		int[] intArray = null;                     //����stack(ջ)�ڴ�ռ䣬���ڱ������ö���ĵ�ֵַ
		String strArray[];
		
		//System.out.println(intArray.toString());//null ����ʹ�ö����е��κη�������ʱ��ַΪnull����ָ���쳣  java.lang.NullPointerException
		//2.����
		intArray = new int[5];				    //ʹ��new�ؼ���ʱ������heap(��)�ڴ�ռ䣬���ڱ������ö����Ԫ�ص�ֵ
		System.out.println(intArray.toString());//[I@689d6d87 
		
		//3.������ͬʱ����
		int[] intArray2 = new int[4];           //��̬��ʼ����ʹ��new�������������Ԫ����ʵ�Ѿ�����ʼ����Ԫ�ض���Ĭ��ֵ
		
		//4.������ͬʱ��ɳ�ʼ��
		int[] intArray3 = new int[]{1,2,3,4,5};
		String[] strArray2 = {"a","b","c","d"}; //��̬��ʼ������ʹ��new�����������������ͬʱ����ɴ����ͳ�ʼ������
		
		//5.��ֵ
		int[] intArray4 = new int[4]; 
		intArray4[0] = 11;
		intArray4[1] = 22;
		intArray4[2] = 33;
		intArray4[3] = 44;
		
		//6.ȡֵ
		System.out.println(intArray4[0]);
		System.out.println(intArray4[1]);
		System.out.println(intArray4[2]);
		System.out.println(intArray4[3]);
		//System.out.println(intArray4[4]);//�����±�Խ���쳣  java.lang.ArrayIndexOutOfBoundsException: 4����Ϊ����ĳ���Ϊ4���±�Ϊ0-3֮��
		
		//7.����
		System.out.println(intArray4.length);//4
		
		//8.����
		//ʹ��forѭ������
		for (int i = 0; i < intArray4.length; i++) {
			
			int element = intArray4[i];
			
			System.out.println("����Ԫ�أ�" + element);
		}
		
		//ʹ��forEach����
		for (int element : intArray4) {
			System.out.println("foreach������Ԫ�أ�" + element);
		}
	}
}
