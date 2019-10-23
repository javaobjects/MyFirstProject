package com.neuedu.chapter07.覆盖;

//员工：总的父类
public class Employee extends Object{
	//属性（成员变量）
	String name;
	
	String birth;
	
	double salary;
	
	//无参构造函数
	public Employee()
	{
		System.out.println("父类实例化----new Employee()");
	}
	//带参数构造函数
	public Employee(String name,String birth,double salary)
	{
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}
	
	//行为（成员方法）
	public void getDetail()
	{
		System.out.println("name:" + name + "   birth:" + birth + "  salary:" + salary);
	}
	
	public double getSalary()
	{
		return salary;
	}
}