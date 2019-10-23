package com.neuedu.chapter06.���ֱ���;

/**
 * Java����Ҫ��3�����͵ı�����
		1.��̬����[��̬��]������������Ϊstatic �����ԡ�	     -- �ϴ���˽����
		2.ʵ������[���ڴ�]����������ԣ�Ҳ��ȫ�ֱ�����                          -- �϶��������˽�����ж����Լ�ר��
		3.�ֲ�����[ջ�ڴ�]�������ڷ������еı��������Ƿ������βΡ�  -- ������һֱ���ŷ����ܣ����������ã������ڣ�����������ɣ�����������
		
		ջstack��ջ�Ĵ�ȡ�ٶȱȶѿ죬Ч�ʸߡ���ջ�ڱ�������������͵ľֲ������Ͷ��������ֵ��
		
		��heap���ѿ��Ա�����Щ�Կռ�Ҫ��ϴ�ı��������������Ժ������Ԫ�ء�

 */
public class Variables{
	
	//1.��̬����������������Ϊstatic ������
	//         �����༶��ı��������౻���ص�ʱ�򼴱������ڴ棬ֻҪ����ڣ���̬�����ʹ��ڣ����ڹ������
	static double pi = 3.1415926;
	
	//2.ʵ����������������ԣ�Ҳ��ȫ�ֱ���.
	//         ���ڶ��󼶱�ı�������new�����ʱ������ڴ浱�У�ֻҪ������ڣ�ʵ�������ʹ��ڣ����ڶ���ר�еı���
	String username;
	
	//3.�ֲ������������ڷ������еı���str�����Ƿ������β�prefix��
	//        ������������ʱ���ֲ��������������ڴ��У�������ִ�н������ֲ������������ڽ���
	public void setUsername(String prefix)
	{
		String str = "����";
		
		this.username = prefix + this.username;
	}
	
	/**
	 * ���Գ�Ա������Ĭ��ֵ
	 * 			byte��Ĭ��ֵ��0
				short��Ĭ��ֵ��0
				int��Ĭ��ֵ��0
				long��Ĭ��ֵ��0
				
				float��Ĭ��ֵ��0.0
				double��Ĭ��ֵ��0.0
				
				char��Ĭ��ֵ��---- ---

				boolean��Ĭ��ֵ��false
				
				int[]��Ĭ��ֵ��null
				Variables��Ĭ��ֵ��null
	 */
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	
	int[] array;
	Variables var;
	
	public void getDefaultValue()
	{
		System.out.println("byte��Ĭ��ֵ��" + b + "\n"
				+ "short��Ĭ��ֵ��" + s + "\n"
				+ "int��Ĭ��ֵ��" + i + "\n"
				+ "long��Ĭ��ֵ��" + l + "\n\n"
				
				+ "float��Ĭ��ֵ��" + f + "\n"
				+ "double��Ĭ��ֵ��" + d + "\n\n"
				
				+ "char��Ĭ��ֵ��----" + c + "---\n\n"
				
				+ "boolean��Ĭ��ֵ��" + bool + "\n\n"
				
				+ "int[]��Ĭ��ֵ��" + array + "\n"
				+ "Variables��Ĭ��ֵ��" + var + "\n"
		);
	}
	
	public static void main(String[] args) {
		//��������һ
		Variables caixunkun = new Variables();
		caixunkun.username = "������";
		
		System.out.println("[������]:" + caixunkun.pi); //3.1415926
		System.out.println("[������]:" + caixunkun.username);//������
		
		//���������
		Variables fengtimo = new Variables();
		fengtimo.pi = 3.14;
		fengtimo.username = "����Ī";
		
		System.out.println("[����Ī]:" + fengtimo.pi); //3.14
		System.out.println("[����Ī]:" + fengtimo.username);//����Ī
		
		System.out.println("[������]:" + caixunkun.pi); //3.14
		System.out.println("[������]:" + caixunkun.username);//������
		
		//�ֲ�����
		fengtimo.setUsername("����---");
		System.out.println(fengtimo.username);
		
		//�������󣺲��������ľ����ֱ�ӵ��ö���ķ����������ڶ���ֻ��Ҫʹ��һ�εĳ���
		new Variables().setUsername("����");
		
		//����Ĭ��ֵ
		caixunkun.getDefaultValue();
		
	}
}
