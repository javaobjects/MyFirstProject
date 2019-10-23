package com.neuedu.chapter07.多态.练习;

//4.5  定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额，
//写一个测试类TestCompany,在main方法，把若干各种类型的员工放在一个ColaEmployee 数组里，并单元出数组中每个员工当月的工资。
public class TestCompany {

	public static void main(String[] args) {
		//月薪
		SalariedEmployee salariedEmployee = new SalariedEmployee("张三", 6, 7000);
		//System.out.println(salariedEmployee.getSalary(9));//7000
		//System.out.println(salariedEmployee.getSalary(6));//7100
		
		//时薪
		HourlyEmployee hourlyEmployee = new HourlyEmployee("李四", 9, 300, 150);
		//System.out.println(hourlyEmployee.getSalary(9));//45100.0
		
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee("李二四", 10, 300, 200);
		//System.out.println(hourlyEmployee2.getSalary(9));//66000.0
		
		//销售提成
		SalesEmployee salesEmployee = new SalesEmployee("王五", 3, 500000, 0.02);
		//System.out.println(salesEmployee.getSalary(9));//10000.0
		//System.out.println(salesEmployee.getSalary(3));//10100.0
		
		//1. 把若干各种类型的员工放在一个ColaEmployee 数组里
		ColaEmployee[] emps = new ColaEmployee[]{salariedEmployee,hourlyEmployee,hourlyEmployee2,salesEmployee};

		//2.并单元出数组中每个员工当月的工资。
		for (ColaEmployee emp : emps) {
			Company.print(emp, 9);
		}
	}

}
//4.5  定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额
class Company
{
	//调用该方法可以打印出某月某个员工的工资数额
	public static void print(ColaEmployee emp,int month)
	{
		double totalSalary = emp.getSalary(month);
		System.out.println(emp.ename + ":第[" + month + "]月份的工资为：" + totalSalary);
	}
}
