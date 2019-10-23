package com.neuedu.chapter07.接口;

//视频设备
public interface VedioDevice {

	//常量
	public static final int MAX_BTIGHT = 100;
	int MIN_BTIGHT = 20;
	
	//抽象方法
	public abstract void turnOn();//开机
	void turnOff();//关机
}

//医保结算：学生医保、在职医保、深圳医保、居民医保、....
//1.个人信息确认    2.上传数据    3.得到自费、报销的数据

//生产电脑：联想、华硕、惠普、mac......
//1.cpu 2.鼠标 3.键盘
