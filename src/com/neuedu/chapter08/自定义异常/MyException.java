package com.neuedu.chapter08.�Զ����쳣;

/**
 * �Զ����쳣�ࣺ
 * 		1.�Զ���̳�Exception
 * 		2.�ṩһ���������Ĺ��캯��
 *
 */
public class MyException extends Exception {

	//���ڱ����쳣������ԭ��
	private String message;
	
	//���캯��
	public MyException(String message)
	{
		this.message = message;
	}
	
	//��������������ȡ�쳣����Ϣ
	public String getMessage()
	{
		return message;
	}
	
}
