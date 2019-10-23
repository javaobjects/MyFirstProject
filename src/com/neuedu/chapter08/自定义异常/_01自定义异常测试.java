package com.neuedu.chapter08.自定义异常;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
	异常处理方式：
		抛出异常   -> 捕获异常  -> 处理异常   -> 释放、关闭资源
		
		自行处理（积极处理）：
		    try
		    {
		    	可能发生异常的语句;
		    }
		    catch(异常类型  异常引用名)
		    {
		    	处理异常的语句；
		    }
		    finally
		    {
		    	最终都要执行的语句，常用于释放资源、关闭资源
		    }
		    
		                注意：
		    	1.try语句块与catch语句块不可分割，是一个完整的语法结构
		    	2.可以同时定义多个catch语句块捕获不同的异常类型
		    	3.当多个catch语句同时定义时，必须根据捕获的异常类型从小到大排序
		    	4.finally语句：无论代码执行return或break语句，还是发生了具体的异常Exception，始终都会执行
		    	                                         除非执行System.exit(0);退出了系统，finally才不会执行
		    	
		
		回避处理（消极处理）：
			throws:修饰方法，告诉调用方法的人，该方法可能存在某类异常
			throw: 抛出具体的异常
 */
public class _01自定义异常测试 {

	public static void catchException() throws MyException
	{
		try 
		{
			//模拟停电了..........
			//System.out.println("准备停电....");
			//System.exit(0);//退出系统
			
			//1.文件找不到
			FileInputStream input = new FileInputStream(new File("说明.txt"));
			
			//2.空指针异常
			String str = null;
			//System.out.println(str.length());
			
			//3.数组下标越界
			int[] array = new int[]{1,2,3};
			for (int i = 0; i <= array.length; i++) {
				//System.out.println(array[i]);
				
				if(i >=  array.length)
				{
					throw new MyException("");
				}
			}
			
			//4.算数异常
			int i = 1/0;
			
			System.out.println("代码终于完整的运行了........");
			//return;
		}
		//负责捕获"文件找不到"异常
		catch (FileNotFoundException e) 
		{
			//e.printStackTrace();//打印异常堆栈信息
			//System.out.println("亲爱的，你的<说明.txt>找不到了哦，请查验文件是否异常！");//一般记录日志，或者发送邮件、短信
			throw new MyException("亲爱的，你的<说明.txt>找不到了哦，请查验文件是否异常！");
		}
		//负责捕获"空指针"异常
		catch(NullPointerException e)
		{
			//e.printStackTrace();//打印异常堆栈信息
			//System.out.println("调用length()方法的对象str为null，不能使用");
			throw new MyException("调用length()方法的对象str为null，不能使用");
		}
		//负责捕获"数组下标越界"异常
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();//打印异常堆栈信息
			//System.out.println("当前数组array长度为3，下标为0-2之间，请确认下标是否合法");
			throw new MyException("当前数组array长度为3，下标为0-2之间，请确认下标是否合法");
		}
		//负责捕获"算数异常"
		catch(ArithmeticException e)
		{
			//e.printStackTrace();//打印异常堆栈信息
			//System.out.println("除数不能为0");
			throw new MyException("除数不能为0");
		}
		//负责捕获所有的"运行时异常"
		catch(RuntimeException e)
		{
			//e.printStackTrace();//打印异常堆栈信息
			//System.out.println("发生了运行时异常，代码有bug了，请查验！！");
			throw new MyException("发生了运行时异常，代码有bug了，请查验！！");
		}
		//负责捕获所有的"异常（运行时异常，非运行时异常）"
		catch(Exception e)
		{
			//e.printStackTrace();//打印异常堆栈信息
			//System.out.println("发生了异常（运行时异常，非运行时异常），代码有bug了，请查验！！");
			throw new MyException("发生了异常（运行时异常，非运行时异常），代码有bug了，请查验！！");
		}
		finally
		{
			System.out.println("始终都要执行的代码>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args){
		try {
			catchException();
		} 
		//负责捕获"自定义"异常
		catch (MyException e) 
		{
			//e.printStackTrace();//打印异常堆栈信息
			System.out.println(e.getMessage());//一般记录日志，或者发送邮件、短信
		}
	}
	
}