package com.neuedu.chapter07.final�ؼ���;
/**
	final�ؼ��֣�
		
		1.������:�಻���Ա��̳�
		
		2.���α���:������ֵ���ܱ��޸�
			�� ���븳���ʼֵ
			�� ������������ͬʱ��ֵ��Ҳ�����ڹ������и�ֵ
			�� ϵͳ�����final����Ĭ�ϵĸ���ʼֵ

		3.���η���:�������ܱ�����
 */
//1.������
public final class FinalKey {

		//2.���α���:������ֵ���ܱ��޸�
		final double PI = 3.1415926;//�� ������������ͬʱ��ֵ��Ҳ�����ڹ������и�ֵ
		final String USER_NAME;
		
		//�� ������������ͬʱ��ֵ��Ҳ�����ڹ������и�ֵ
		public FinalKey()
		{
			USER_NAME = "scott";
		}
		
		//3.���η���:�������ܱ�����
		public final double getPi()
		{
			return PI;
		}
}
//1.������:�಻���Ա��̳�
/*class SubFinalKey extends FinalKey
{
	//3.���η���:�������ܱ�����
	public double getPi()
	{
		return PI;
	}
}*/
