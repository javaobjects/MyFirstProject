package com.neuedu.chapter07.��̬2;

//ͣ����
public class Parker {

	//�շ�
	public static void chargeFee(Vehicle v,int hour)
	{
		v.payFee(hour);
	}
	
	public static void main(String[] args) {
		Parker.chargeFee(new Car(), 2);
		Parker.chargeFee(new Truck(), 5);
		Parker.chargeFee(new Bus(), 6);
	}
	
}
