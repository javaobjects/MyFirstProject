package com.neuedu.chapter07.覆盖;

public class Test {

	public static void main(String[] args) {
		Officer lisi = new Officer("李四", "1996-10-22", 10000, "软件开发事业部");
		lisi.getDetail();//1.当子类officer重写父类的getDetail方法之后，再调用该方法时，执行子类自己重写过的方法
	}

}
