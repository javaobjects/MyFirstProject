package com.neuedu.chapter07.��װ.��ϰ;

/**
 * 1������һ����Ա�࣬���Ҹ������ֻ������ʮһ��������ʾ���� static �� ��װ������ɡ�  [������]
	   ��ͼ���£�
	  Ч�����£�
 */
public class Players {

	//������ͳ����Ա�����ĸ���
	private static int sum;
	
	//���캯��
	private Players()
	{
		
	}
	
	//������Ա�ķ���
	public static Players create()
	{
		if(sum < 11)
		{
			Players players = new Players();
			System.out.println("������һ������");
			sum++;
			
			return players;
		}
		else
		{
			System.out.println("�Բ����Ѿ�������11�����󣬲����ٴ���������!!");
			
			return null;
		}
	}
}
