package com.neuedu.chapter07.½Ó¿Ú;

public class Test {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.start();
		tv.pause();
		tv.stop();
		tv.turnOff();

		System.out.println(tv.MAX_BTIGHT);
		System.out.println(tv.MIN_BTIGHT);
	}
}
