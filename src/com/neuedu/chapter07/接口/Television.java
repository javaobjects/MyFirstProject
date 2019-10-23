package com.neuedu.chapter07.接口;

//public class Television implements VADevice {
//public class Television implements AudioDevice, VedioDevice {
public class Television extends Test implements AudioDevice, VedioDevice {

	@Override
	public void turnOn() {
		System.out.println("开机...............");
	}

	@Override
	public void start() {
		System.out.println("开始播放...吴亦凡...大碗宽面");
	}

	@Override
	public void pause() {
		System.out.println("暂停播放...吴亦凡...大碗宽面");
	}

	@Override
	public void stop() {
		System.out.println("停止播放...吴亦凡...大碗宽面");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("关机..........");
	}
}
