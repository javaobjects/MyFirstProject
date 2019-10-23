package com.neuedu.chapter07.µ¥ÀýÄ£Ê½;

public class SingletonTest {

	public static void main(String[] args) {
		/*Singleton s1 = new Singleton();
		System.out.println(s1);//41649a55
		
		Singleton s2 = new Singleton();
		System.out.println(s2);//33d063fd*/

		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		System.out.println(s3);//6a2437ef
		System.out.println(s4);//6a2437ef
	}

}
