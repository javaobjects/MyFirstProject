package com.neuedu.chapter07.��̬.��ϰ;

//4.2  SalariedEmployee ��	ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н
public class SalariedEmployee extends ColaEmployee {

	//���ԣ���н
	double monthSalary;

	//���캯��
	public SalariedEmployee() 
	{
		
	}
	public SalariedEmployee(String ename,int birthMonth,double monthSalary)
	{
		super(ename, birthMonth);
		this.monthSalary = monthSalary;
	}
	
	//��д�����getSalary��������ȡ��н
	@Override
	public double getSalary(int month) {
		double totalSalary = monthSalary;
		
		//�������Ա�������գ���˾����⽱��100 Ԫ��
		if(birthMonth == month)
		{
			totalSalary += 100;
		}
		
		return totalSalary;
	}
}
