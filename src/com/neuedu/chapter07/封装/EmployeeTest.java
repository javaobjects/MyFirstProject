package com.neuedu.chapter07.��װ;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee scott = new Employee();
		//scott.empno = 7788;
		//scott.ename = "˹����";
		//scott.salary = -10000;//�����ѱ�private���Σ���������������˷���
		
		//����set������ֵ
		scott.setEmpno(7788);
		scott.setEname(null); //��Ա��������Ϊ��
		scott.setEname("˹����");
		//scott.setSalary(-10000);//н�ʲ���С��2600
		scott.setSalary(2600);//н�ʲ���С��2600
		
		//����get����ȡֵ
		System.out.println(scott.getSalary());
	}

}
