package com.neuedu.chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
	Throwable:�쳣���ĸ���
	
		Error:���ؼ������һ�㲻ʹ�ô������������ջ������ڴ���������������
		
		Exception:
			  ����ʱ�쳣���Ǽ�����쳣����һ�����ڳ���Ա���鲻�㵼�£�����bug������ͨ���Ż����봦��һ�㲻��Ҫʹ���쳣������������
			  				   ���������쳣�������±�Խ�硢��ָ���쳣��
			  				   
			  ������ʱ�쳣��������쳣����ͨ���������ԭ���£�����������м�飬����ʾ��������д���
			 		                            ���磺�ļ��Ҳ��������ݿ������жϵ�
 */
public class _01�쳣���� {
	
	//������ʱ�쳣��������쳣��
	public static void check()
	{
		try {
			FileInputStream input = new FileInputStream(new File("˵��.txt"));
			
		} catch (FileNotFoundException e) {
			
			System.out.println("�װ��ģ����<˵��.txt>�Ҳ�����Ŷ��������ļ��Ƿ��쳣��");
		}
	}
	
	//����ʱ�쳣���Ǽ�����쳣��
	public static void uncheck()
	{
		int[] array = new int[]{1,2,3,4,5};
		
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]); // java.lang.ArrayIndexOutOfBoundsException: 5
		}
	}

	public static void main(String[] args) {
		//������ʱ�쳣��������쳣��
		check();
		
		//����ʱ�쳣���Ǽ�����쳣��
		uncheck();
	}

}
