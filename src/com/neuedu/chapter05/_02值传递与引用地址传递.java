package com.neuedu.chapter05;

import java.util.Arrays;

public class _02ֵ���������õ�ַ���� {

	/**
	 * ֵ���� ---------��������������String�ַ������;�Ϊֵ���ݣ������жԲ������޸ģ�����Ӱ�촫��֮ǰ�ı���ֵ
	 */
	public static void getX(int x)
	{
		x = 6666;
		System.out.println("getX ��" + x);//6666
	}
	
	/**
	 * ���õ�ַ����-------���ö��󴫵ݲ���ʱ�����ݵ�Ϊ���õ�ַ�������жԲ����������޸ģ���Ӱ��ԭ��������Ϣ
	 */
	public static void getArray(int[] array)
	{
		array[4] = 888;
		
		System.out.println("getArray:" + array);//[I@2d95bbec
		System.out.println("getArray:" + Arrays.toString(array));//[1, 2, 3, 4, 888]
	}
	
	public static void main(String[] args) {
		//ֵ���� ---------��������������String�ַ������;�Ϊֵ���ݣ������жԲ������޸ģ�����Ӱ�촫��֮ǰ�ı���ֵ
		int x = 10;
		getX(x);
		
		System.out.println("main ��" + x);//10
		
		//���õ�ַ����-------���ö��󴫵ݲ���ʱ�����ݵ�Ϊ���õ�ַ�������жԲ����������޸ģ���Ӱ��ԭ��������Ϣ
		int[] array = new int[]{1,2,3,4,5};
		getArray(array);
		
		System.out.println("main:" + array);//[I@2d95bbec
		System.out.println("main:" + Arrays.toString(array));//[1, 2, 3, 4, 888]
	}
	
}
