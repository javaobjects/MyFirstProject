package com.neuedu.chapter03;

import java.util.Scanner;

public class _05��ֹѭ�� {

	/**
	 	break:��ֹ����ѭ��
	 	continue:��ֹ����ѭ�����������ִ����һ��ѭ��
	 	
	 	break label:��ָֹ�����Ƶ�ѭ��
	 */
	public static void main(String[] args) {
		//break:��ֹ����ѭ��
		for (int i = 1; i <= 10; i++) {
			
			if(i%4 == 0)
			{
				break;//��ֹ����ѭ��
			}
			
			System.out.println(i);
		}//1 2 3
		
		
		//continue:��ֹ����ѭ�����������ִ����һ��ѭ��
		for (int i = 1; i <= 10; i++) {
			
			if(i%4 == 0)
			{
				continue;//��ֹ����ѭ�����������ִ����һ��ѭ��
			}
			
			System.out.println(i);
		}//1 2 3 5 6 7 9 10
		
		
		//break label:��ָֹ�����Ƶ�ѭ��
		outer:for (int i = 1; i <= 10; i++) {
			System.out.println("outer:" + i);
			
			inner:while(true)
			{
				Scanner scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				
				System.out.println("inner:" + message);
				
				if("exit inner".equals(message))
				{
					break inner;//�˳��ڲ�ѭ��
				}
				else if("exit outer".equals(message))
				{
					break outer;//�˳��ⲿѭ��
				}
			}
		}
	}
}