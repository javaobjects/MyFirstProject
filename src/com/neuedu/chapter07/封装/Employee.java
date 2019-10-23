package com.neuedu.chapter07.封装;
/**
	封装：
		隐藏属性、方法或实现细节的过程称为封装
		
	   	特点：
	   		1.构造器与类一般使用public修饰
	   		2.属性一般使用private修饰，对外提供访问器访问属性，get方法取值，set方法赋值
	   	
   		好处：
   			1.隐藏类的实现细节
			2.让使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，限制对属性的不合理操作
			3.可进行数据检查
	
	-----------------------------------------------------------------------------
			
		 修饰类：               public <default>
		修饰变量、方法：public protected <default> private
		
		public:   同类、同包、不同包子类、不同包
		protected:同类、同包、不同包子类
		<default>:同类、同包
		private:  同类
 */
public class Employee {

	/**员工编号*/
	private int empno;
	
	/**员工姓名*/
	private String ename;
	
	/**员工工资*/
	private double salary;
	
	/**访问器（get与set）*/
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
		//3.可进行数据检查
		if(ename == null || "".equals(ename))
		{
			System.out.println("雇员姓名不能为空");
			return;
		}
		
		this.ename = ename;
	}
	
	public double getSalary()
	{
		//1.隐藏类的实现细节
		return calSalary();
	}
	public void setSalary(double salary)
	{
		//2.让使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，限制对属性的不合理操作
		if(salary < 2600)
		{
			 System.out.println("薪资不能小于2600");
			 return;
		}
		
		this.salary = salary;
	}
	
	//1.隐藏类的实现细节
	private double calSalary()
	{
		return salary + 5000 + 300 + 200 + (10000*0.1);
	}
}
