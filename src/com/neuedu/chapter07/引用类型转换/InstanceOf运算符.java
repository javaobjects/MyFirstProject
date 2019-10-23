package com.neuedu.chapter07.引用类型转换;
/**
 * A instanceof B :判断A是否为B的类型
 */
public class InstanceOf运算符 {

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
			System.out.println(obj + "是一个String类型");
		}
		else if(obj instanceof Integer)
		{
			System.out.println(obj + "是一个Integer类型");
		}
		else if(obj instanceof Boolean)
		{
			System.out.println(obj + "是一个Boolean类型");
		}
	}
	
}
