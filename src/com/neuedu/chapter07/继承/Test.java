package com.neuedu.chapter07.继承;

public class Test {

	public static void main(String[] args) {
		/**
		 * Worker
		 */
		/*Worker zhuzi = new Worker();
		//访问父类的属性
		zhuzi.name = "大柱子";
		zhuzi.birth = "2010-01-01";
		zhuzi.salary = 100;
		//访问父类的方法
		zhuzi.getDetail();
		
		//访问子类自有的方法
		zhuzi.dressAllowance();*/
		
		/**
		 * 子类实例化的过程：先实例化父类，再实例化子类
		 * 
		 * 		父类实例化----new Employee()
				子类实例化----new Officer()
		 */
		Officer lisi = new Officer();
		lisi.getDetail();
	}

}
