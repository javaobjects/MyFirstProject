package com.neuedu.chapter03;

import java.util.Scanner;

public class _05终止循环 {

	/**
	 	break:终止整个循环
	 	continue:终止当次循环，程序继续执行下一次循环
	 	
	 	break label:终止指定名称的循环
	 */
	public static void main(String[] args) {
		//break:终止整个循环
		for (int i = 1; i <= 10; i++) {
			
			if(i%4 == 0)
			{
				break;//终止整个循环
			}
			
			System.out.println(i);
		}//1 2 3
		
		
		//continue:终止当次循环，程序继续执行下一次循环
		for (int i = 1; i <= 10; i++) {
			
			if(i%4 == 0)
			{
				continue;//终止当次循环，程序继续执行下一次循环
			}
			
			System.out.println(i);
		}//1 2 3 5 6 7 9 10
		
		
		//break label:终止指定名称的循环
		outer:for (int i = 1; i <= 10; i++) {
			System.out.println("outer:" + i);
			
			inner:while(true)
			{
				Scanner scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				
				System.out.println("inner:" + message);
				
				if("exit inner".equals(message))
				{
					break inner;//退出内部循环
				}
				else if("exit outer".equals(message))
				{
					break outer;//退出外部循环
				}
			}
		}
	}
}