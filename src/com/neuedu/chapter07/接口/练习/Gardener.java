package com.neuedu.chapter07.接口.练习;

import java.util.Scanner;

//园丁
public class Gardener {

	//种水果
	public static Fruit create(String type)
	{
		Fruit fruit = null;
		
		if("苹果".equals(type))
		{
			fruit = new Apple();
		}
		else if("香蕉".equals(type))
		{
			fruit = new Banana();
		}
		else if("葡萄".equals(type))
		{
			fruit = new Grape();
		}
		
		return fruit;
	}
	
	public static void main(String[] args) {
		//输入需要的水果类型
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		
		//根据水果类型种水果
		Fruit fruit =create(type);
	}
	
}
