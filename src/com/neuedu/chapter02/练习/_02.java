package com.neuedu.chapter02.��ϰ;

public class _02 {

	/**
	 * 2������һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12 
	 *    ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����֪ʶ�㣺������������ۺ�Ӧ�ã� [������]
	 */
	public static void main(String[] args) {
		//1.����һ��0��1000������
		int num = 345;
		
		//2.��ø�λ��
		int one = num % 10;//��λ 5
		int two = num /10 % 10 ;//ʮλ 
		int three = num /100;//��λ
		
		//3.���λ���ĺ�
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		System.out.println(one + two +three);
	}
	
}
