package com.neuedu.chapter07.����;

//Ա�����ܵĸ���
public class Employee extends Object{
	//���ԣ���Ա������
	String name;
	
	String birth;
	
	double salary;
	
	//�޲ι��캯��
	public Employee()
	{
		System.out.println("����ʵ����----new Employee()");
	}
	//���������캯��
	public Employee(String name,String birth,double salary)
	{
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}
	
	//��Ϊ����Ա������
	public void getDetail()
	{
		System.out.println("name:" + name + "   birth:" + birth + "  salary:" + salary);
	}
	
	public double getSalary()
	{
		return salary;
	}
}