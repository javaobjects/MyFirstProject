package com.neuedu.chapter07.��������ת��;

public class Test {

	public static void main(String[] args) {
		/**
		 * �������ͣ����� -> ���࣬�Զ�ת��
		 * 
		 * 		ǰ�᣺���ڼ̳й�ϵ
		 * 
		 *      ע�⣺ת�������У���ʧȥ����ԭ�е������뷽��������ʹ�ø���������뷽��
		 */
		//���� -- ������
		SuperMan ironMan = new SuperMan();
		ironMan.fly();
		
		//����  -> ����   ---- ��ͨ��
		Man man = ironMan;
		//man.fly();
		man.say();
		
		/**
		 * �������ͣ����� -> ���࣬ǿ��ת��
		 * 
		 * 		ǰ�᣺���ڼ̳й�ϵ
		 * 
		 *      ע�⣺��������ת�����Ķ��󣬲���������ת�����������������������Ͷ�ֱ���������͡�
		 */
		//���� -> ����
		SuperMan ironMan2 = (SuperMan)man;
		ironMan2.fly();
		
		/*
		 * �������������������Ͷ�ֱ����������:
		 * 
		 * 	java.lang.ClassCastException: Man cannot be cast to SuperMan
		 */
		//����
		Man laowang = new Man();
		laowang.walk();
		//���� -> ����
		SuperMan spiderMan = (SuperMan)laowang;
		spiderMan.fly();
		
		/*
		 * ����������֮�䲻�����໥ת��
		 */
		//����
		NormalMan normalMan  = new NormalMan();
		//����
		//SuperMan antMan = (SuperMan)normalMan;
	}

}
