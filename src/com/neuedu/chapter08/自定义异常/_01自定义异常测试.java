package com.neuedu.chapter08.�Զ����쳣;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
	�쳣����ʽ��
		�׳��쳣   -> �����쳣  -> �����쳣   -> �ͷš��ر���Դ
		
		���д�������������
		    try
		    {
		    	���ܷ����쳣�����;
		    }
		    catch(�쳣����  �쳣������)
		    {
		    	�����쳣����䣻
		    }
		    finally
		    {
		    	���ն�Ҫִ�е���䣬�������ͷ���Դ���ر���Դ
		    }
		    
		                ע�⣺
		    	1.try������catch���鲻�ɷָ��һ���������﷨�ṹ
		    	2.����ͬʱ������catch���鲶��ͬ���쳣����
		    	3.�����catch���ͬʱ����ʱ��������ݲ�����쳣���ʹ�С��������
		    	4.finally��䣺���۴���ִ��return��break��䣬���Ƿ����˾�����쳣Exception��ʼ�ն���ִ��
		    	                                         ����ִ��System.exit(0);�˳���ϵͳ��finally�Ų���ִ��
		    	
		
		�رܴ�������������
			throws:���η��������ߵ��÷������ˣ��÷������ܴ���ĳ���쳣
			throw: �׳�������쳣
 */
public class _01�Զ����쳣���� {

	public static void catchException() throws MyException
	{
		try 
		{
			//ģ��ͣ����..........
			//System.out.println("׼��ͣ��....");
			//System.exit(0);//�˳�ϵͳ
			
			//1.�ļ��Ҳ���
			FileInputStream input = new FileInputStream(new File("˵��.txt"));
			
			//2.��ָ���쳣
			String str = null;
			//System.out.println(str.length());
			
			//3.�����±�Խ��
			int[] array = new int[]{1,2,3};
			for (int i = 0; i <= array.length; i++) {
				//System.out.println(array[i]);
				
				if(i >=  array.length)
				{
					throw new MyException("");
				}
			}
			
			//4.�����쳣
			int i = 1/0;
			
			System.out.println("��������������������........");
			//return;
		}
		//���𲶻�"�ļ��Ҳ���"�쳣
		catch (FileNotFoundException e) 
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			//System.out.println("�װ��ģ����<˵��.txt>�Ҳ�����Ŷ��������ļ��Ƿ��쳣��");//һ���¼��־�����߷����ʼ�������
			throw new MyException("�װ��ģ����<˵��.txt>�Ҳ�����Ŷ��������ļ��Ƿ��쳣��");
		}
		//���𲶻�"��ָ��"�쳣
		catch(NullPointerException e)
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			//System.out.println("����length()�����Ķ���strΪnull������ʹ��");
			throw new MyException("����length()�����Ķ���strΪnull������ʹ��");
		}
		//���𲶻�"�����±�Խ��"�쳣
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			//System.out.println("��ǰ����array����Ϊ3���±�Ϊ0-2֮�䣬��ȷ���±��Ƿ�Ϸ�");
			throw new MyException("��ǰ����array����Ϊ3���±�Ϊ0-2֮�䣬��ȷ���±��Ƿ�Ϸ�");
		}
		//���𲶻�"�����쳣"
		catch(ArithmeticException e)
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			//System.out.println("��������Ϊ0");
			throw new MyException("��������Ϊ0");
		}
		//���𲶻����е�"����ʱ�쳣"
		catch(RuntimeException e)
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			//System.out.println("����������ʱ�쳣��������bug�ˣ�����飡��");
			throw new MyException("����������ʱ�쳣��������bug�ˣ�����飡��");
		}
		//���𲶻����е�"�쳣������ʱ�쳣��������ʱ�쳣��"
		catch(Exception e)
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			//System.out.println("�������쳣������ʱ�쳣��������ʱ�쳣����������bug�ˣ�����飡��");
			throw new MyException("�������쳣������ʱ�쳣��������ʱ�쳣����������bug�ˣ�����飡��");
		}
		finally
		{
			System.out.println("ʼ�ն�Ҫִ�еĴ���>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args){
		try {
			catchException();
		} 
		//���𲶻�"�Զ���"�쳣
		catch (MyException e) 
		{
			//e.printStackTrace();//��ӡ�쳣��ջ��Ϣ
			System.out.println(e.getMessage());//һ���¼��־�����߷����ʼ�������
		}
	}
	
}