package com.neuedu.chapter07.��̬.��ϰ;
/**
 * 4�� Cola��˾�Ĺ�Ա��Ϊ���������ࣺ(֪ʶ�㣺��̬) [������]
		4.1  ColaEmployee ����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
		4.2  SalariedEmployee ��	ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н
		4.3  HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
		4.4  SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����
		4.5  ����һ����Company���ڸ�����дһ�����������ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ������дһ��������TestCompany,��main�����������ɸ������͵�Ա������һ��ColaEmployee ���������Ԫ��������ÿ��Ա�����µĹ��ʡ�
 */
//4.1  ColaEmployee ����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
public class ColaEmployee {

	//���ԣ�Ա��������,Ա���������·�
	String ename;
	
	int birthMonth;
	
	//���캯��
	public ColaEmployee()
	{
		
	}
	public ColaEmployee(String ename,int birthMonth)
	{
		this.ename = ename;
		this.birthMonth = birthMonth;
	}
	
	
	//������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
	public double getSalary(int month)
	{
		return 0.0;
	}
}
