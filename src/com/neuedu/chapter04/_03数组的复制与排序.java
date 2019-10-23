package com.neuedu.chapter04;

import java.util.Arrays;

public class _03����ĸ��������� {

	public static void main(String[] args) {
		
		/**
		 * ����ĸ���:System.arraycopy(src, 0, dest, 0, src.length)
		 * 	src:   Դ���飨source��
		 *  srcPos:��Դ���鿪ʼ���Ƶ��±꣨source position��
		 *  
		 *  dest:  Ŀ�����飨destination��
		 *  destPos����ָ�����±꿪ʼ���ø��Ƶ�Ԫ�أ�destination position��
		 *  
		 *  length:���Ƶ�Ԫ�صĸ���
		 *  
		 *  
		 *  Arrays.toString(����)�������鰴ָ����ʽ���ַ���������е�Ԫ��
		 *  Arrays.sort(����)�������������������
		 */
		int[] src = new int[]{1,2,3,4,5};
		int[] dest = new int[]{6,7,8,9,10,11,12,13,14};
		
		System.out.println("����ǰsrc:" + Arrays.toString(src));  //[1, 2, 3, 4, 5]
		System.out.println("����ǰdest:" + Arrays.toString(dest));//[6, 7, 8, 9, 10, 11, 12, 13, 14]
		
		//System.arraycopy(src, 0, dest, 0, src.length);
		
		System.out.println("���ƺ�src:" + Arrays.toString(src));  //[1, 2, 3, 4, 5]
		System.out.println("���ƺ�dest:" + Arrays.toString(dest));//[1, 2, 3, 4, 5, 11, 12, 13, 14]
		
		/**
		 * �ϲ���������
		 */
		//0.�����µ����飬����Ϊsrc�ĳ���+dest�ĳ���
		int[] merge = new int[src.length + dest.length];
		
		//1.����src����
		System.arraycopy(src, 0, merge, 0, src.length);
		System.out.println("����src֮���merge���飺" + Arrays.toString(merge));//[1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		//2.����dest����
		System.arraycopy(dest, 0, merge, src.length, dest.length);
		System.out.println("����dest֮���merge���飺" + Arrays.toString(merge));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
		
		/**
		 * Arrays.sort(array) �� ���������
		 */
		int[] array = new int[]{46,65,1,88,12,6,100};
		
		System.out.println("����ǰ��" + Arrays.toString(array));//[46, 65, 1, 88, 12, 6, 100]
		Arrays.sort(array);//����,Ĭ����������
		System.out.println("�����" + Arrays.toString(array));//[1, 6, 12, 46, 65, 88, 100]
		
		//����
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + "  \t");
		}
	}
}
