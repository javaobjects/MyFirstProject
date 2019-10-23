package com.neuedu.chapter02.练习;

/**
 * 3、华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
 *                      将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。[选做题]
 */
public class _03 {

	public static void main(String[] args) {
		//华氏温度
		int degree= 93;
		
		//华氏温度 -> 摄氏温度
		double degree2 = (degree - 32) * 5 /9.0;
		
		System.out.println("华氏温度：" + degree);
		System.out.println("摄氏温度：" + degree2);
		
		//--------------------------------------------------------------
		//摄氏温度
		int degree3 = 34;
		
		//摄氏温度 -> 华氏温度
		double degree4 = degree3 * 9 / 5.0 + 32;
		
		System.out.println("摄氏温度：" + degree3);
		System.out.println("华氏温度：" + degree4);
	}
	
}
