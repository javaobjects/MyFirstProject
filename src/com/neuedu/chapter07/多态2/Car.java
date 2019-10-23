package com.neuedu.chapter07.多态2;

//轿车：8元/小时
public class Car extends Vehicle {

	@Override
	public void payFee(int hour) {
		System.out.println("轿车：8元/小时，您总共停车" + hour + "小时，总共消费：" + (8*hour));
	}
}
