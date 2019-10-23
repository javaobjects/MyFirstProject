package com.neuedu.chapter07.多态.练习;

//4.4  SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
public class SalesEmployee extends ColaEmployee {

	//属性：月销售额、提成率
	double monthSales;
	
	double rate;
	
	//构造函数
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
		
		//销售人员，工资由月销售额和提成率决定
		double totalSalary = monthSales * rate;
		
		//如果该月员工过生日，则公司会额外奖励100 元。
		if(birthMonth == month)
		{
			totalSalary += 100;
		}
		
		return totalSalary;
	}
}
