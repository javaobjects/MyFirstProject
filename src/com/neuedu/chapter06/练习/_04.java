package com.neuedu.chapter06.练习;

import java.util.Arrays;

/**
 * 4、设计一个类Student，该类包括姓名、学号和成绩。设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。[必做题]
 */
public class _04 {

	public static void main(String[] args) {
		//学生：张三
		Student zhangsan = new Student();
		zhangsan.name = "张三";
		zhangsan.sno = "201909001";
		zhangsan.score = 77;
		
		//学生：李四
		Student lisi = new Student("李四", "201909002", 88);
		
		//学生：王五
		Student wangwu = new Student("王五", "201909003", 99);
		
		//打印学生的信息
		zhangsan.print();
		lisi.print();
		wangwu.print();
		
		//设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息
		Student[] array = new Student[]{zhangsan,lisi,wangwu};
		
		//比较两次
		for (int i = 1; i < array.length; i++) {
			
			//每一次两两比较
			for (int j = 0; j < array.length - i; j++) {
				if(array[j].score < array[j+1].score)
				{
					Student temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		//打印学生信息
		for (Student student : array) {
			student.print();
		}
		
	}
}

//设计一个类Student
class Student{
	
	//该类包括姓名、学号和成绩
	String name;
	String sno;
	double score;
	
	//无参构造函数
	public Student()
	{
		
	}
	//重载带参数的构造函数
	public Student(String name,String sno,double score)
	{
		this.name = name;
		this.sno = sno;
		this.score = score;
	}
	
	//输出学生的信息
	public void print()
	{
		System.out.println("姓名:" + name + "\t学号：" + sno + "\t成绩：" + score );
	}
}
