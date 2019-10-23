package com.neuedu.chapter07.封装;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee scott = new Employee();
		//scott.empno = 7788;
		//scott.ename = "斯卡特";
		//scott.salary = -10000;//属性已被private修饰，不允许类以外的人访问
		
		//调用set方法赋值
		scott.setEmpno(7788);
		scott.setEname(null); //雇员姓名不能为空
		scott.setEname("斯卡特");
		//scott.setSalary(-10000);//薪资不能小于2600
		scott.setSalary(2600);//薪资不能小于2600
		
		//调用get方法取值
		System.out.println(scott.getSalary());
	}

}
