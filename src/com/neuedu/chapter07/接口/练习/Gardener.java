package com.neuedu.chapter07.�ӿ�.��ϰ;

import java.util.Scanner;

//԰��
public class Gardener {

	//��ˮ��
	public static Fruit create(String type)
	{
		Fruit fruit = null;
		
		if("ƻ��".equals(type))
		{
			fruit = new Apple();
		}
		else if("�㽶".equals(type))
		{
			fruit = new Banana();
		}
		else if("����".equals(type))
		{
			fruit = new Grape();
		}
		
		return fruit;
	}
	
	public static void main(String[] args) {
		//������Ҫ��ˮ������
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		
		//����ˮ��������ˮ��
		Fruit fruit =create(type);
	}
	
}
