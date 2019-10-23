package com.neuedu.chapter02;

public class _03数据类型 {

	public static void main(String[] args) {
		/**
		 * 4类8种基本数据类型：
		 * 		整数类型：byte short int（默认） long
		 *      浮点类型：float  double（默认）
		 *      字符类型：char
		 *      布尔类型：boolean
		 * 
		 * 1. 整数类型 — byte字节类型  、    short短整型 、       int整型（默认）、      long长整型
		 *              1字节                            2字节                       4字节                                 8字节
		 *              
		 *           1字节 = 8位     1byte = 8bit
		 *           
		 */
		//byte，取值范围-128~127之间
		byte b = 126;
		//byte b2 = 128;//数字溢出
		
		//short
		short s = 12812;
		
		//int(默认)
		int i = 1234567890;
		
		//long  需要在末尾添加大写'L'或小写'l'
		long l = 1234567890123456789L;  //0-9  十进制，第一位不能为0
		long l2 = 0X1AB459F;			//0-9 A-F 十六进制，以0x或0X开头
		long l3 = 01234567L;		    //0-7  八进制，以0开头
		
		System.out.println(Long.MIN_VALUE + "   " + + Long.MAX_VALUE);//-9223372036854775808   9223372036854775807
		
		//十进制转二进制（了解）
		int num = 10;//1010
		
		//二进制转十进制
		//1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 + 0 + 2 + 0 = 10
		
		/**
		 * 2. 浮点数类型 — float 单精度  、   double 双精度（默认）

		 *              4字节                                     8字节
		 */
		//float  需要在末尾添加大写'F'或小写'f'
		float f = 123456.789F;
		
		//double
		double d = 1234567890.123456;
		
		/**
		 * 3. 字符类型 -   char
		 * 				2字节
		 * 
		 * 	   char字符类型使用''单引号括起来 ，String字符串类型使用""双引号括起来
		 */
		char c = 'a';  //a
		char c2 = '1'; //1
		char c3 = '中'; //中
		char c4 = 97;      //a   ascii码表   48~57表示数字 0-9   65~90表示大写字母A-Z   97~122表示小写字母a-z
		char c5 = '\n';    //转义字符
		char c6 = '\u9FA5';//龥       unicode编码表   4E00-9FA5表示基本的汉字范围
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println("\"happy \t new \n year!!\"");
		
		/**
		 * 4. 布尔类型  boolean:true   false
		 */
		boolean b3 = true;
		boolean b4 = false;
	}
	
}
