package com.neuedu.chapter07.引用类型转换;

public class Test {

	public static void main(String[] args) {
		/**
		 * 上溯造型：子类 -> 父类，自动转换
		 * 
		 * 		前提：基于继承关系
		 * 
		 *      注意：转换过程中，会失去子类原有的属性与方法，仅能使用父类的属性与方法
		 */
		//子类 -- 钢铁侠
		SuperMan ironMan = new SuperMan();
		ironMan.fly();
		
		//子类  -> 父类   ---- 普通人
		Man man = ironMan;
		//man.fly();
		man.say();
		
		/**
		 * 下溯造型：父类 -> 子类，强制转换
		 * 
		 * 		前提：基于继承关系
		 * 
		 *      注意：曾经向上转换过的对象，才能再向下转换。对象不允许不经过上溯造型而直接下溯造型。
		 */
		//父类 -> 子类
		SuperMan ironMan2 = (SuperMan)man;
		ironMan2.fly();
		
		/*
		 * 对象不允许不经过上溯造型而直接下溯造型:
		 * 
		 * 	java.lang.ClassCastException: Man cannot be cast to SuperMan
		 */
		//父类
		Man laowang = new Man();
		laowang.walk();
		//父类 -> 子类
		SuperMan spiderMan = (SuperMan)laowang;
		spiderMan.fly();
		
		/*
		 * 子类与子类之间不允许相互转换
		 */
		//子类
		NormalMan normalMan  = new NormalMan();
		//子类
		//SuperMan antMan = (SuperMan)normalMan;
	}

}
