package com.neuedu.chapter06;

/**
 * ���μ���Ϸ����е���Ϸ����:
		����գ�����յ������ǽ𹿰���ս��������ǣ����������
		��  ɮ����ɮû��������ս����Ϊ�㣬���������
		��˽䣺��˽�������ǰ��ӣ�ս�����Ŀ��ǣ�����������
		ɳ  ɮ��ɳɮ�������������� ��ս���������ǣ������Ŀ���

	            ���ԣ���ɫ���ơ�������ս����������
	            ��Ϊ��ս������ȡ��ɫ��Ϣ
	    
	------------------------------------------------------------------------- 
	    ���Ǵ��������ģ�壬���������ʵ��
	    
	    ��������
	 	   ����   ������  = new ������();
	------------------------------------------------------------------------- 
	 	   
	 �����������췽��/������/���캯����Constructor��
			1.����������ͬ������
			2.��������ֵ����
			3.�����ڷ�������return��䷵��һ��ֵ
			4. һ�����Ȩ��Ϊpublic
		  
		         ��һ�����У��������������ķ������ǹ�������
    
	�����������ã�
			1.��ɶ���Ĵ���������ɶ����ʵ������XiyoujiRole sunwukong = new XiyoujiRole();
			2.һ��ʹ�ù���������ɶԳ�Ա�����ĳ�ʼ����XiyoujiRole tangSeng = new XiyoujiRole("��ɮ", "��", "������", "������");
 
             ע�⣺
            1.Ĭ�ϴ��޲ι��캯��
            2.��������������캯��ʱ��Ĭ���޲ι��캯��ʧЧ�ˣ���Ҫ��ʾ�������
 */
public class XiyoujiRole {

	//���ԣ���ɫ���ơ�������ս����������
	/**��ɫ����*/
	String roleName;
	
	/**����*/
	String wuQi;
	
	/**ս����*/
	String zhanDouLi;
	
	/**����*/
	String naiLi;
	
	/**�����������캯�������췽����*/
	public XiyoujiRole()
	{
		
	}
	/**���ع����������캯�������췽����*/
	public XiyoujiRole(String p_roleName,String p_wuQi,String p_zhanDouLi,String p_naiLi)
	{
		roleName = p_roleName;
		wuQi = p_wuQi;
		zhanDouLi = p_zhanDouLi;
		naiLi = p_naiLi;
	}
	
	//��Ϊ��ս������ȡ��ɫ��Ϣ
	/**ս��*/
	public void fight()
	{
		System.out.println("��Ѫ +11111111111111111111");
	}
	
	/**��ȡ��ɫ��Ϣ*/
	public void getRoleInfo()
	{
		System.out.println("��ɫ���ƣ�" + roleName + "\t������" + wuQi + "\tս����:" + zhanDouLi + "\t����:" + naiLi);
	}
	
	public static void main(String[] args) {
		/**
		 * ��new�����ٸ�ֵ
		 */
		//����һ������յĽ�ɫ��   ����   ������  = new ������();
		//����գ�����յ������ǽ𹿰���ս��������ǣ����������
		XiyoujiRole sunwukong = new XiyoujiRole();
		
		//ͨ��������.���Է��ʳ�Ա����
		sunwukong.roleName = "�����";
		sunwukong.wuQi = "�𹿰�";
		sunwukong.zhanDouLi = "������";
		sunwukong.naiLi = "������";
		
		//ͨ��������.�������ʳ�Ա����
		sunwukong.fight();
		sunwukong.getRoleInfo();
		
		/**
		 * new�����ͬʱ����ɳ�ʼ������
		 */
		//��  ɮ����ɮû��������ս����Ϊ�㣬���������
		XiyoujiRole tangSeng = new XiyoujiRole("��ɮ", "��", "������", "������");
		tangSeng.getRoleInfo();
		
		//��˽䣺��˽�������ǰ��ӣ�ս�����Ŀ��ǣ�����������
		XiyoujiRole zhuBaJie = new XiyoujiRole("��˽�", "����", "������", "������");
		zhuBaJie.getRoleInfo();
		
		//ɳ  ɮ��ɳɮ�������������� ��ս���������ǣ������Ŀ���
		XiyoujiRole shaSeng = new XiyoujiRole("ɳ ɮ", "������", "������", "������");
		shaSeng.getRoleInfo();
		
	}
}
