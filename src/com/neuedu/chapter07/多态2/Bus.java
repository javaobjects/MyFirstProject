package com.neuedu.chapter07.��̬2;

//�ͳ���15Ԫ/Сʱ
public class Bus extends Vehicle {

	@Override
	public void payFee(int hour) {
		System.out.println("�ͳ���15Ԫ/Сʱ�����ܹ�ͣ��" + hour + "Сʱ���ܹ����ѣ�" + (15*hour));
	}
}
