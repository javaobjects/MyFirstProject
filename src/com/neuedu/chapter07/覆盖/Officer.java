package com.neuedu.chapter07.����;

//Ա�����ڰ칫�Ұ칫��Ա��
public class Officer extends Employee{

	//���ԣ���Ա������
	String department;
	
	//�޲ι��캯��
	public Officer()
	{
		super();//1.ֻ�ܳ���������Ĺ������У��ұ����ǵ�һ��
		System.out.println("����ʵ����----new Officer()");
	}
	//���������캯��
	public Officer(String name,String birth,double salary,String department)
	{
		super(name, birth, salary);
		this.department = department;
	}
	
	//��Ϊ����Ա������
	public void vehicleAllowance()
	{
		System.out.println("Officer�Ľ�ͨ������300");
	}
	
	@Override
	public void getDetail() {
		//super.getDetail();
		System.out.println("name:" + name + "   birth:" + birth + "  salary:" + salary + "  department:" + department);
	}
}
