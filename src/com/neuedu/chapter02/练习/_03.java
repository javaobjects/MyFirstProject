package com.neuedu.chapter02.��ϰ;

/**
 * 3�������¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ�
 *                      �����϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�[ѡ����]
 */
public class _03 {

	public static void main(String[] args) {
		//�����¶�
		int degree= 93;
		
		//�����¶� -> �����¶�
		double degree2 = (degree - 32) * 5 /9.0;
		
		System.out.println("�����¶ȣ�" + degree);
		System.out.println("�����¶ȣ�" + degree2);
		
		//--------------------------------------------------------------
		//�����¶�
		int degree3 = 34;
		
		//�����¶� -> �����¶�
		double degree4 = degree3 * 9 / 5.0 + 32;
		
		System.out.println("�����¶ȣ�" + degree3);
		System.out.println("�����¶ȣ�" + degree4);
	}
	
}
