package com.neuedu.chapter07.多态;

//彩色打印机
public class PrinterColor extends Printer {

	@Override
	public void print() {
		//super.print();
		System.out.println("打印彩色.....");
	}
}
