package com.neuedu.chapter07.�ӿ�;

//public class Television implements VADevice {
//public class Television implements AudioDevice, VedioDevice {
public class Television extends Test implements AudioDevice, VedioDevice {

	@Override
	public void turnOn() {
		System.out.println("����...............");
	}

	@Override
	public void start() {
		System.out.println("��ʼ����...���ෲ...�������");
	}

	@Override
	public void pause() {
		System.out.println("��ͣ����...���ෲ...�������");
	}

	@Override
	public void stop() {
		System.out.println("ֹͣ����...���ෲ...�������");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("�ػ�..........");
	}
}
