package com.neuedu.chapter07.��̬;
/**
 	 ��̬����ͬ�Ķ����ͬһ��Ϊ�����Ĳ�ͬ��Ӧ

		����ͬһ���࣬��ͬʵ��������ͬһ������ʵ�ֲ�ͬ�Ĺ��ܡ�


       	ʵ�ֵ���Ҫ�أ�
       		1.���ڼ̳л�ʵ��
       		
       		2.������д����ķ���
       		
       		3.���� ת�����������

 */
//���Դ�ӡ������
public class PrinterTest {

	//����ӡ��ť
	public static void click(Printer printer)
	{
		printer.print();
	}
	
	public static void main(String[] args) {
		
		//�����ӡ��ɫ....
		click(new PrinterColor());
		
		//�����ӡ�ڰ�
		click(new PrinterBlack());
	}

}
