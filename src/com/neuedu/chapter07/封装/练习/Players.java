package com.neuedu.chapter07.封装.练习;

/**
 * 1、创建一个球员类，并且该类最多只允许创建十一个对象。提示利用 static 和 封装性来完成。  [必做题]
	   类图如下：
	  效果如下：
 */
public class Players {

	//变量：统计球员创建的个数
	private static int sum;
	
	//构造函数
	private Players()
	{
		
	}
	
	//创建球员的方法
	public static Players create()
	{
		if(sum < 11)
		{
			Players players = new Players();
			System.out.println("创建了一个对象");
			sum++;
			
			return players;
		}
		else
		{
			System.out.println("对不起，已经创建了11个对象，不能再创建对象了!!");
			
			return null;
		}
	}
}
