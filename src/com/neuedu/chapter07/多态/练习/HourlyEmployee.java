package com.neuedu.chapter07.多态.练习;

//4.3  HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。属性：每小时的工资、每月工作的小时数
public class HourlyEmployee extends ColaEmployee {

	//属性：每小时的工资、每月工作的小时数
	double hourSalary;
	
	int hours;
	
	//构造函数
	public HourlyEmployee() 
	{
		
	}
	public HourlyEmployee(String ename,int birthMonth,double hourSalary,int hours)
	{
		super(ename, birthMonth);
		this.hourSalary = hourSalary;
		this.hours = hours;
	}
	
	//按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放
	@Override
	public double getSalary(int month) {
		double totalSalary = 0.0;
		
		//每月工作超出160 小时的部分按照1.5 倍工资发放
		if(hours <=160)
		{
			totalSalary = hourSalary * hours;
		}
		else
		{
			totalSalary = hourSalary * 160 + hourSalary * 1.5 * (hours-160);
		}
		
		//如果该月员工过生日，则公司会额外奖励100 元。
		if(birthMonth == month)
		{
			totalSalary += 100;
		}
		
		return totalSalary;
	}
	
}
