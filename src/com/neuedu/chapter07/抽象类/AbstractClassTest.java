package com.neuedu.chapter07.抽象类;

public class AbstractClassTest {

	public static void main(String[] args) {
		//抽象类不能被实例化
		//AbstractClass ac = new AbstractClass();
		
		//子类对抽象方法提供具体实现，再使用
		SubAbstractClass sac = new SubAbstractClass();
		sac.getSalary(9);

	}

}
