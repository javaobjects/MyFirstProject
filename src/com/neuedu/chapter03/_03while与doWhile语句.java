package com.neuedu.chapter03;

import java.util.Scanner;

public class _03while��doWhile��� {

	/**
		while(A���ʽ)
		{
		   B����;
		}
		
		ִ�в��裺
			1.�ж�A���ʽ
				����true��ִ��B���飬�ظ�ִ�в���1
				����false������ѭ����
	
		-------------------------------------------------
		
		do{
		
		   B����;
		   
		}while(A���ʽ);//�ֺű�����
		
		ִ�в��裺
			1.B����
			2.�ж�A���ʽ
				����true��ִ��B���飬�ظ�ִ�в���1
				����false������ѭ����
				
				
	    while:     ���жϣ���ִ��
	    do...while:��ִ��һ�Σ����ж�ִ��
	 */
	public static void main(String[] args) {
		//ʹ��whileѭ����ӡ1~10֮�������
		int num = 1;
		while(num <= 10)
		{
			System.out.println(num);
			num++;
		}
		
		//ʹ��do....whileѭ����ӡ1~10֮�������
		int num2 = 1;
		do{
			System.out.println(num2);
			num2++;
			
		}while(num2 <= 10);//�ֺű�����
		
		//��ѭ��
		/*while(true)
		{
			System.out.println("������ѭ��....");
		}*/
		
		int num3 = 1;
		while(num3 <= 10)
		{
			System.out.println(num3);
			//num++;//���������������
		}
		
		//��ѭ��
		while(true)
		{
			//ɨ����
			Scanner scanner = new Scanner(System.in);
			
			//ɨ�����̨һ�����ݣ��Իس���Ϊ�����жϣ�
			String message = scanner.nextLine();
			
			//���û�����"exit"���˳�ѭ��
			if("exit".equals(message))
			{
				System.out.println("������................");
				break;
			}
			else
			{
				System.out.println(">>>>:" + message);
			}
		}
		
		//�����1��100������������ӣ���ʾ����do...while��䣩
		/*int x = 1;
		int sum = 0;
		do{
			sum = sum + x;
			x += 2;
			
		}while(x <= 100);
		
		System.out.println("sum:" + sum);*/
		
		int x = 1;
		int sum = 0;
		do{
			if(x%2 == 1)
			{
				sum = sum + x;
			}
			x++;
			
		}while(x <= 100);
		
		System.out.println("sum:" + sum);
		
	}
	
}
