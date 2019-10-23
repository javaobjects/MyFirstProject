package com.neuedu.chapter07.static�ؼ���;

/**
   	static�ؼ��֣����γ�Ա�����������ξֲ�����
   	
	   	1.�������ԣ���̬���������������   �������౻����ʱ�������������ڴ浱�У��������ʱ�������һֱ����
	   		���ַ�ʽ���ʣ�
				1.ֱ�ӷ��ʣ�����.���ԣ�------------���Ƽ���
					StaticKey.pi
					
				2.ʵ��������ʣ�������.����
					StaticKey s1 = new StaticKey();
					System.out.println(s1.pi);

	   	
	   	2.���η�������̬�������෽����
	   		���ַ�ʽ���ʣ�
				1.ֱ�ӷ��ʣ�����.������()------------���Ƽ���
					 StaticKey.getPi();
					 
				2.ʵ��������ʣ�������.������()
					StaticKey s1 = new StaticKey();
					s1.getPi();
					
				ע�⣺
					�� ��̬������ֻ��ֱ�ӷ��ʾ�̬��Ա��������ֱ�ӷ������еķǾ�̬��Ա
					�� ��̬�����в���ʹ��this��super�ؼ���
 					�� ��̬�������ܱ��Ǿ�̬��������
 					�� ��̬�����������ι�����

	   	3.���δ���飨��̬����飩����̬�龭���������������Եĳ�ʼ�����������ʱִ�У��ҽ�ִ��һ��
			
				����� -> ��̬�����ִ��һ��  -> new���� -> ���ɴ���� -> ���캯��
	   		
		
 */
public class StaticKey {

	/**
	 * 1.�������ԣ���̬�������������
	 */
	static double pi = 3.1415926;//��̬��Ա
	String username = "����";//�Ǿ�̬��Ա
	
	/**
	 * 3.���δ���飨��̬����飩
	 */
	static{
		System.out.println("��̬����飬��ĳ�ʼ������..........");
	}
	
	//���ɴ����
	{
		System.out.println("���ɴ���飬����ĳ�ʼ������..........");
	}
	
	//���캯��
	public StaticKey()
	{
		System.out.println("���캯��............");
	}
	
	
	/**
	 * 2.���η�������̬�������෽����
	 */
	public static double getPi()
	{
		//System.out.println(StaticKey.pi); //��̬��Ա���༶����һ�����أ����������ڴ���
		//System.out.println(new StaticKey().username);//�Ǿ�̬��Ա�����󼶱𣬶���new֮�󣬲ű������ڴ���
		
		//System.out.println(username);//�� ������ֱ�ӷ������еķǾ�̬��Ա
		
		return pi;//�� ��̬������ֻ��ֱ�ӷ��ʾ�̬��Ա
	}
	
	public static void main(String[] args) {
		/**
		 * 1.�������ԣ���̬�������������
		 */
		//1.ֱ�ӷ��ʣ�����.���ԣ�
		System.out.println(StaticKey.pi);
		
		StaticKey.pi = 3.14;
		
		//2.ʵ��������ʣ�������.����
		StaticKey s1 = new StaticKey();
		System.out.println(s1.pi);
		
		StaticKey s2 = new StaticKey();
		System.out.println(s2.pi);
		
		/**
		 * 2.���η�������̬�������෽����
		 */
		//1.ֱ�ӷ��ʣ�����.������()
		System.out.println(StaticKey.getPi());
		
		//2.ʵ��������ʣ�����.������()
		System.out.println(s1.getPi());
		
		/**
		 * 3.���δ���飨��̬����飩
		 */
		//����Ҫ���Դ���
	}
	
}
class SubStaticKey extends StaticKey
{
	//�� ��̬�������ܱ��Ǿ�̬��������
	/*public double getPi()
	{
		return pi;
	}*/
}
