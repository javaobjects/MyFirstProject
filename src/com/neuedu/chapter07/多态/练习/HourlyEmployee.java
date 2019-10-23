package com.neuedu.chapter07.��̬.��ϰ;

//4.3  HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
public class HourlyEmployee extends ColaEmployee {

	//���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
	double hourSalary;
	
	int hours;
	
	//���캯��
	public HourlyEmployee() 
	{
		
	}
	public HourlyEmployee(String ename,int birthMonth,double hourSalary,int hours)
	{
		super(ename, birthMonth);
		this.hourSalary = hourSalary;
		this.hours = hours;
	}
	
	//��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ���
	@Override
	public double getSalary(int month) {
		double totalSalary = 0.0;
		
		//ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5 �����ʷ���
		if(hours <=160)
		{
			totalSalary = hourSalary * hours;
		}
		else
		{
			totalSalary = hourSalary * 160 + hourSalary * 1.5 * (hours-160);
		}
		
		//�������Ա�������գ���˾����⽱��100 Ԫ��
		if(birthMonth == month)
		{
			totalSalary += 100;
		}
		
		return totalSalary;
	}
	
}
