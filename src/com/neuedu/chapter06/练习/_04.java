package com.neuedu.chapter06.��ϰ;

import java.util.Arrays;

/**
 * 4�����һ����Student���������������ѧ�źͳɼ������һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��[������]
 */
public class _04 {

	public static void main(String[] args) {
		//ѧ��������
		Student zhangsan = new Student();
		zhangsan.name = "����";
		zhangsan.sno = "201909001";
		zhangsan.score = 77;
		
		//ѧ��������
		Student lisi = new Student("����", "201909002", 88);
		
		//ѧ��������
		Student wangwu = new Student("����", "201909003", 99);
		
		//��ӡѧ������Ϣ
		zhangsan.print();
		lisi.print();
		wangwu.print();
		
		//���һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ
		Student[] array = new Student[]{zhangsan,lisi,wangwu};
		
		//�Ƚ�����
		for (int i = 1; i < array.length; i++) {
			
			//ÿһ�������Ƚ�
			for (int j = 0; j < array.length - i; j++) {
				if(array[j].score < array[j+1].score)
				{
					Student temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		//��ӡѧ����Ϣ
		for (Student student : array) {
			student.print();
		}
		
	}
}

//���һ����Student
class Student{
	
	//�������������ѧ�źͳɼ�
	String name;
	String sno;
	double score;
	
	//�޲ι��캯��
	public Student()
	{
		
	}
	//���ش������Ĺ��캯��
	public Student(String name,String sno,double score)
	{
		this.name = name;
		this.sno = sno;
		this.score = score;
	}
	
	//���ѧ������Ϣ
	public void print()
	{
		System.out.println("����:" + name + "\tѧ�ţ�" + sno + "\t�ɼ���" + score );
	}
}
