package com.neuedu.chapter07.多态2;

//货车：12元/小时
public class Truck extends Vehicle {

	@Override
	public void payFee(int hour) {
		System.out.println("货车：12元/小时，您总共停车" + hour + "小时，总共消费：" + (12*hour));
	}
}
