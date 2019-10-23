package com.neuedu.chapter07.覆盖;

//员工：在办公室办公的员工
public class Officer extends Employee{

	//属性（成员变量）
	String department;
	
	//无参构造函数
	public Officer()
	{
		super();//1.只能出现在子类的构造器中，且必须是第一行
		System.out.println("子类实例化----new Officer()");
	}
	//带参数构造函数
	public Officer(String name,String birth,double salary,String department)
	{
		super(name, birth, salary);
		this.department = department;
	}
	
	//行为（成员方法）
	public void vehicleAllowance()
	{
		System.out.println("Officer的交通补贴：300");
	}
	
	@Override
	public void getDetail() {
		//super.getDetail();
		System.out.println("name:" + name + "   birth:" + birth + "  salary:" + salary + "  department:" + department);
	}
}
