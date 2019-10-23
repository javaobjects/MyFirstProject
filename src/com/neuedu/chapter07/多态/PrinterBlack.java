package com.neuedu.chapter07.多态;

//黑白打印机
public class PrinterBlack extends Printer {

	@Override
	public void print() {
		//super.print();
		System.out.println("打印黑白.....");
	}
}
