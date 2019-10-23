package com.neuedu.chapter07.多态2;

//客车：15元/小时
public class Bus extends Vehicle {

	@Override
	public void payFee(int hour) {
		System.out.println("客车：15元/小时，您总共停车" + hour + "小时，总共消费：" + (15*hour));
	}
}
