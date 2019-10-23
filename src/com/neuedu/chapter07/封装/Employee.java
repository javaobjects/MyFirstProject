package com.neuedu.chapter07.��װ;
/**
	��װ��
		�������ԡ�������ʵ��ϸ�ڵĹ��̳�Ϊ��װ
		
	   	�ص㣺
	   		1.����������һ��ʹ��public����
	   		2.����һ��ʹ��private���Σ������ṩ�������������ԣ�get����ȡֵ��set������ֵ
	   	
   		�ô���
   			1.�������ʵ��ϸ��
			2.��ʹ����ֻ��ͨ�����ȶ��ƺõķ������������ݣ����Է���ؼ�������߼������ƶ����ԵĲ��������
			3.�ɽ������ݼ��
	
	-----------------------------------------------------------------------------
			
		 �����ࣺ               public <default>
		���α�����������public protected <default> private
		
		public:   ͬ�ࡢͬ������ͬ�����ࡢ��ͬ��
		protected:ͬ�ࡢͬ������ͬ������
		<default>:ͬ�ࡢͬ��
		private:  ͬ��
 */
public class Employee {

	/**Ա�����*/
	private int empno;
	
	/**Ա������*/
	private String ename;
	
	/**Ա������*/
	private double salary;
	
	/**��������get��set��*/
	public int getEmpno()
	{
		return empno;
	}
	public void setEmpno(int empno)
	{
		this.empno = empno;
	}
	
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		//3.�ɽ������ݼ��
		if(ename == null || "".equals(ename))
		{
			System.out.println("��Ա��������Ϊ��");
			return;
		}
		
		this.ename = ename;
	}
	
	public double getSalary()
	{
		//1.�������ʵ��ϸ��
		return calSalary();
	}
	public void setSalary(double salary)
	{
		//2.��ʹ����ֻ��ͨ�����ȶ��ƺõķ������������ݣ����Է���ؼ�������߼������ƶ����ԵĲ��������
		if(salary < 2600)
		{
			 System.out.println("н�ʲ���С��2600");
			 return;
		}
		
		this.salary = salary;
	}
	
	//1.�������ʵ��ϸ��
	private double calSalary()
	{
		return salary + 5000 + 300 + 200 + (10000*0.1);
	}
}
