package com.neuedu.chapter05;

/**
	�﷨��
		<����Ȩ�޿��Ʒ�> <���η�> ����ֵ����   �������ƣ���������  �������ƣ���������   ��������....��
		{
			������;
			return ����ֵ;
		}
		
		 ����Ȩ�޿��Ʒ���public protected <default> private
		
		 ���η���   static:��ʾ�������Ա�"����.������()"ֱ�ӵ���
			   final :��ʾ���������Ա�����
			  
	             ����ֵ���ͣ����Ի����������ͣ�Ҳ�������������ͣ�Ҳ����û�з���ֵvoid
	             return��ķ���ֵ�����뷵��ֵ���ͱ���һ��
	             
	              �������ƣ�camel�շ巨��������ĸСд�����൥�ʵ�����ĸ��д������methodOne
	     
	              �����б�����û�в���������һ�����������������������֮��","���Ÿ���
	                                  ��ʽ�������βΣ�:�����ڷź���Ĳ����б�����ָ������������������ƣ����ߵ��÷�������ʹ�ø÷���ʱ��Ӧ�ô���ʲô���͵Ĳ���������add(int x,int y)�е�x��y
	                                  ʵ�ʲ�����ʵ�Σ�:���÷���ʱ�����ݵ�ʵ�ʵ�ֵ������Ҫָ�����ͣ�����add(10, 20);�е�10��20
	                                  
	    return��䣺return��ķ���ֵ���ͱ����뷵��ֵ���ͱ���һ��
	    		      �������ֵ����Ϊvoid��return����ʡ��
	    		  returnֻ�ܶ���һ�Σ���return֮�����䲻��ִ��
	    	
		
	�����ķ��ࣺ���޷���ֵ�����޲���
		�� �з���ֵ���в���
		�� �з���ֵ���޲���
		�� �޷���ֵ���в���
		�� �޷���ֵ���޲���
 */
public class _01�����Ķ��� {

	/**
	 * �� �з���ֵ���в���
	 * @param x ����һ
	 * @param y ������
	 * @return x+y
	 */
	public static int add(int x,int y)
	{
		int sum = x + y;
		
		return sum;
	}
	
	/**
	 * �� �з���ֵ���޲���
	 * @return ��
	 */
	public static int minus()
	{
		int x = 20;
		int y = 10;
		
		int result = x - y;
		
		return result;
	}
	
	/**
	 * �� �޷���ֵ���в���
	 * @param x ����һ 
	 * @param y ������
	 */
	public static void multiply(double x,double y)
	{
		double result = x * y;
		
		System.out.println("�����" + result);
		
		//return;//��ʡ��
	}
	
	/**
	 * �� �޷���ֵ���޲���
	 */
	public static void divide()
	{
		int x = 20;
		int y = 10;
		
		int result = x / y;
		
		System.out.println("���̣�" + result);
	}
	
	
	public static void main(String[] args) {
		//�� �з���ֵ���в���
		int result = add(10, 20);
		System.out.println("��ͣ�" + result);
		
		//�� �з���ֵ���޲���
		int result2 = minus();
		System.out.println("��" + result2);
		
		//�� �޷���ֵ���в���
		multiply(10.5, 10.0);
		
		//�� �޷���ֵ���޲���
		divide();
	}
	
}
