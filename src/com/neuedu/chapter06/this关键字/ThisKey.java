package com.neuedu.chapter06.this�ؼ���;

/**
 * this�ؼ���:
		1.����������������
		2.ָ����ø÷����ĵ�ǰ����
		3.ͨ������ķ���������ʹ��

         ��this�ؼ��ֵ����
		1.�����еı������Ա��������
		2.��һ���������У������������صĹ��������ұ�����ڵ�һ��
		3.���ص�ǰ���������

 */

public class ThisKey {

	//��Ա����
	String name;
	String sex;
	
	//���캯��
	public ThisKey()
	{
		System.out.println("��ʼ��ϵͳ�Ĵ���..............");
	}
	public ThisKey(String name)
	{
		//2.��һ���������У������������صĹ��������ұ�����ڵ�һ��
		this();
		
		//1.�����еı������Ա��������
		this.name = name;
		//System.out.println("ThisKey(name):" + this);//33d063fd
	}
	public ThisKey(String name,String sex)
	{
		//2.��һ���������У������������صĹ��������ұ�����ڵ�һ��
		this(name);
		
		//this.name = name;
		this.sex = sex;
	}
	
	//��Ա����
	public void setName(String name)
	{
		//1.�����еı������Ա��������
		this.name = name;
		//System.out.println("setName:" + this);//33d063fd
	}
	
	//3.���ص�ǰ���������
	public ThisKey getInstance()
	{
		return this;
	}
	
	public static void main(String[] args) {
		//ThisKey caixukun = new ThisKey("������");
		//caixukun.setName("����������");
		//System.out.println("caixukun:" + caixukun);//33d063fd
		
		ThisKey fengTiMo = new ThisKey("����Ī", "Ů");
		System.out.println(fengTiMo.name);
		System.out.println(fengTiMo.sex);
		
		//3.���ص�ǰ���������
		ThisKey fengTiMoClone = fengTiMo.getInstance();
		System.out.println(fengTiMo);//33d063fd
		System.out.println(fengTiMoClone);//33d063fd
	}
}
