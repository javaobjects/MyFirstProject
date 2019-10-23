package com.neuedu.chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
	Throwable:异常最大的父类
	
		Error:严重级别错误，一般不使用代码解决，例如堆栈溢出、内存溢出、虚拟机错误。
		
		Exception:
			  运行时异常（非检查性异常）：一般由于程序员经验不足导致，属于bug，可以通过优化代码处理，一般不需要使用异常处理机制来解决
			  				   例如算数异常、数组下标越界、空指针异常等
			  				   
			  非运行时异常（检查性异常）：通常由于外界原因导致，编译器会进行检查，且提示，必须进行处理
			 		                            例如：文件找不到、数据库连接中断等
 */
public class _01异常分类 {
	
	//非运行时异常（检查性异常）
	public static void check()
	{
		try {
			FileInputStream input = new FileInputStream(new File("说明.txt"));
			
		} catch (FileNotFoundException e) {
			
			System.out.println("亲爱的，你的<说明.txt>找不到了哦，请查验文件是否异常！");
		}
	}
	
	//运行时异常（非检查性异常）
	public static void uncheck()
	{
		int[] array = new int[]{1,2,3,4,5};
		
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]); // java.lang.ArrayIndexOutOfBoundsException: 5
		}
	}

	public static void main(String[] args) {
		//非运行时异常（检查性异常）
		check();
		
		//运行时异常（非检查性异常）
		uncheck();
	}

}
