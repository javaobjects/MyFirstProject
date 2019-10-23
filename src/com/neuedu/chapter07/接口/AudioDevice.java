package com.neuedu.chapter07.接口;

//音频设备
public interface AudioDevice {

	//常量
	public static final int MAX_VOLUMN = 100;
	int MIN_VOLUMN = 0;
	
	//抽象方法
	public abstract void start();//开始播放
	abstract void pause();//暂停播放
	void stop();//停止播放
}

//医保结算：学生医保、在职医保、深圳医保、居民医保、....
//1.个人信息确认    2.上传数据    3.得到自费、报销的数据

//生产电脑：联想、华硕、惠普、mac......
//1.cpu 2.鼠标 3.键盘
