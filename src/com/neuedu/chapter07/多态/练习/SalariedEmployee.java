package com.neuedu.chapter07.多态.练习;

//4.2  SalariedEmployee ：	ColaEmployee 的子类，拿固定工资的员工。属性：月薪
public class SalariedEmployee extends ColaEmployee {

	//属性：月薪
	double monthSalary;

	//构造函数
	public SalariedEmployee() 
	{
		
	}
	public SalariedEmployee(String ename,int birthMonth,double monthSalary)
	{
		super(ename, birthMonth);
		this.monthSalary = monthSalary;
	}
	
	//重写父类的getSalary方法，获取月薪
	@Override
	public double getSalary(int month) {
		double totalSalary = monthSalary;
		
		//如果该月员工过生日，则公司会额外奖励100 元。
		if(birthMonth == month)
		{
			totalSalary += 100;
		}
		
		return totalSalary;
	}
}
