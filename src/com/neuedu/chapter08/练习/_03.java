package com.neuedu.chapter08.��ϰ;
/**
 * 3����дһ���������Ƚ������ַ�������������һ���ַ���Ϊ�գ������NullPointerException�쳣���ڷ���������ͨ����쳣��
 *    �����ʵ�ʱ�򴥷��쳣��Ȼ���дһ�����򲶻���쳣�� [������]
 */
public class _03 {

	//��дһ���������Ƚ������ַ���
	public static boolean compare(String str1,String str2) throws NullPointerException
	{
		//�����ʵ�ʱ�򴥷��쳣
		if(str1 == null || str2 == null)
		{
			throw new NullPointerException("�Ƚϵ��ַ���������Ϊnull");
		}
		
		if(str1.equals(str2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Ȼ���дһ�����򲶻���쳣
	public static void main(String[] args) {
		try
		{
			boolean result = compare(null, "abc");
			System.out.println(result);
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}
