package com.neuedu.chapter07.�ӿ�;

//��Ƶ�豸
public interface AudioDevice {

	//����
	public static final int MAX_VOLUMN = 100;
	int MIN_VOLUMN = 0;
	
	//���󷽷�
	public abstract void start();//��ʼ����
	abstract void pause();//��ͣ����
	void stop();//ֹͣ����
}

//ҽ�����㣺ѧ��ҽ������ְҽ��������ҽ��������ҽ����....
//1.������Ϣȷ��    2.�ϴ�����    3.�õ��Էѡ�����������

//�������ԣ����롢��˶�����ա�mac......
//1.cpu 2.��� 3.����
