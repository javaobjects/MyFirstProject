package com.neuedu.chapter07.��̬.��ϰ;

//4.5  ����һ����Company���ڸ�����дһ�����������ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ������
//дһ��������TestCompany,��main�����������ɸ������͵�Ա������һ��ColaEmployee ���������Ԫ��������ÿ��Ա�����µĹ��ʡ�
public class TestCompany {

	public static void main(String[] args) {
		//��н
		SalariedEmployee salariedEmployee = new SalariedEmployee("����", 6, 7000);
		//System.out.println(salariedEmployee.getSalary(9));//7000
		//System.out.println(salariedEmployee.getSalary(6));//7100
		
		//ʱн
		HourlyEmployee hourlyEmployee = new HourlyEmployee("����", 9, 300, 150);
		//System.out.println(hourlyEmployee.getSalary(9));//45100.0
		
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee("�����", 10, 300, 200);
		//System.out.println(hourlyEmployee2.getSalary(9));//66000.0
		
		//�������
		SalesEmployee salesEmployee = new SalesEmployee("����", 3, 500000, 0.02);
		//System.out.println(salesEmployee.getSalary(9));//10000.0
		//System.out.println(salesEmployee.getSalary(3));//10100.0
		
		//1. �����ɸ������͵�Ա������һ��ColaEmployee ������
		ColaEmployee[] emps = new ColaEmployee[]{salariedEmployee,hourlyEmployee,hourlyEmployee2,salesEmployee};

		//2.����Ԫ��������ÿ��Ա�����µĹ��ʡ�
		for (ColaEmployee emp : emps) {
			Company.print(emp, 9);
		}
	}

}
//4.5  ����һ����Company���ڸ�����дһ�����������ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ�������
class Company
{
	//���ø÷������Դ�ӡ��ĳ��ĳ��Ա���Ĺ�������
	public static void print(ColaEmployee emp,int month)
	{
		double totalSalary = emp.getSalary(month);
		System.out.println(emp.ename + ":��[" + month + "]�·ݵĹ���Ϊ��" + totalSalary);
	}
}
