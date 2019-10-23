package com.neuedu.chapter07.��̬.��ϰ;

//4.4  SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ��������ԣ������۶�����
public class SalesEmployee extends ColaEmployee {

	//���ԣ������۶�����
	double monthSales;
	
	double rate;
	
	//���캯��
	public SalesEmployee() 
	{
		
	}
	public SalesEmployee(String ename,int birthMonth,double monthSales,double rate)
	{
		super(ename, birthMonth);
		this.monthSales = monthSales;
		this.rate = rate;
	}
	
	@Override
	public double getSalary(int month) {
		
		//������Ա�������������۶������ʾ���
		double totalSalary = monthSales * rate;
		
		//�������Ա�������գ���˾����⽱��100 Ԫ��
		if(birthMonth == month)
		{
			totalSalary += 100;
		}
		
		return totalSalary;
	}
}
