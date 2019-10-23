package com.neuedu.chapter03;

public class _02switch语句 {
	/**
		  switch(A表达式)
		  {
		  	   case 取值1：
			  	   		B语句块;
			  	   		break;
			   case 取值2：
			  	   		C语句块;
			  	   		break;
			   .....
			   default:
			   	   N语句块;
		  
		  }
		  
		  注意：
		  	1. switch(A表达式)中的A表达式只能接收byte、short、char、int、long类型,JDK1.7版本以上可以接收String类型
		  	2. case的取值不能重复
		  	3. 如果不使用break,一旦某个case的表达式符合条件，后续所有的case后的语句都会判断执行，所以慎重考虑是否需要使用break语句；
	 */
	public static void main(String[] args) {
		/**
		 	如果周一~周五，输出"写代码使我高兴，写代码使我兴奋！！！"
		 	如果周六~周日，输出"放假使我难过，不能写代码！！！"
		 */
		int weekday = 2;
		//方式一
		switch(weekday)
		{
			//如果周一~周五，输出"写代码是我高兴，写代码使我兴奋！！！"
			case 1:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---1");
				break;
			case 2:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---2");
				break;
			case 3:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---3");
				break;
			case 4:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---4");
				break;
			case 5:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---5");
				break;
			case 6:
				System.out.println("放假使我难过，不能写代码！！！---6");
				break;
			case 7:
				System.out.println("放假使我难过，不能写代码！！！---7");
				break;
		}
		//方式二
		switch(weekday)
		{
			//如果周一~周五，输出"写代码是我高兴，写代码使我兴奋！！！"
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---1、2、3、4、5");
				break;
			case 6:
			case 7:
				System.out.println("放假使我难过，不能写代码！！！---6、7");
				break;
		}
		//方式三
		switch(weekday)
		{
			//如果周一~周五，输出"写代码是我高兴，写代码使我兴奋！！！"
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---1、2、3、4、5");
				break;
			default:
				System.out.println("放假使我难过，不能写代码！！！---6、7");
				break;
		}
		//方式四
		switch(weekday)
		{
			case 6:
			case 7:
				System.out.println("放假使我难过，不能写代码！！！---6、7");
				break;	
			default:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---1、2、3、4、5");
				break;
		}
		
		//JDK1.7版本以上可以接收String类型
		String week = "星期六";
		switch(week)
		{
			case "星期六":
			case "星期天":
				System.out.println("放假使我难过，不能写代码！！！---6、7");
				break;	
			default:
				System.out.println("写代码使我高兴，写代码使我兴奋！！！---1、2、3、4、5");
				break;
		}
	}
	
}

