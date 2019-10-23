package com.neuedu.chapter07.��������ת��;
/**
 * A instanceof B :�ж�A�Ƿ�ΪB������
 */
public class InstanceOf����� {

	public static void main(String[] args) {
		SuperMan ironMan = new SuperMan();
		
		System.out.println(ironMan instanceof SuperMan);//true
		System.out.println(ironMan instanceof Man);     //true
		
		//System.out.println(ironMan instanceof NormalMan);//false
		
		getType("abc");
		getType(123);
		getType(true);
	}
	
	public static void getType(Object obj)
	{
		if(obj instanceof String)
		{
			System.out.println(obj + "��һ��String����");
		}
		else if(obj instanceof Integer)
		{
			System.out.println(obj + "��һ��Integer����");
		}
		else if(obj instanceof Boolean)
		{
			System.out.println(obj + "��һ��Boolean����");
		}
	}
	
}
