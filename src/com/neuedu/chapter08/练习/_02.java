package com.neuedu.chapter08.��ϰ;

import java.util.Scanner;

/**
 * 2����дһ�������������ֵ����������Ƿ�Ϊbyte�ĳ�����������ֳ���byte�������ͱ�ʾ�����ķ�Χ���������û��Զ�����쳣ByteSizeException,����ʾ��Ӧ�Ĵ�����Ϣ��֪ʶ�㣺�Զ����쳣�� [ѡ����]
		����1�������û��Զ����쳣��ByteSizeException
		����2����main�����б�д�߼�����
		����3�����в�����
		Ч����ͼ��
 */
public class _02 {

	public static void throwException() throws ByteSizeException {
		
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		
		//�ж�byte�Ƿ���-128~127֮��
		if(b < -128 || b > 127)
		{
			//System.out.println("��������ֲ���byte����");
			throw new ByteSizeException("��������ֲ���byte����");
		}
		else
		{
			System.out.println("�����������һ��byte����");
		}
	}
	
	//����2����main�����б�д�߼�����
	public static void main(String[] args){
		
		try {
			throwException();
		} catch (ByteSizeException e) {
			e.printStackTrace();
		}
	}
}
//����1�������û��Զ����쳣��ByteSizeException
class ByteSizeException extends Exception
{
	//���ڱ����쳣��Ϣ������
	private String message;
	
	//���캯��
	public ByteSizeException(String message)
	{
		this.message = message;
	}
	
	//���⹫���ķ�����ȡ�쳣��Ϣ
	public String getMessage()
	{
		return message;
	}
}
