package com.neuedu.chapter04;

import java.util.Arrays;

public class _04ð������ {

	public static void main(String[] args) {
		int[] array = new int[]{5,4,3,2,1};
		
		/*
		 * �ܹ�N�����飬�Ƚ�N-1��
		 * 	
		 * 		�� 1�ֱȽϣ�[4, 3, 2, 1, 5] �Ƚ�4��
				�� 2�ֱȽϣ�[3, 2, 1, 4, 5] �Ƚ�3��
				�� 3�ֱȽϣ�[2, 1, 3, 4, 5] �Ƚ�2��
				�� 4�ֱȽϣ�[1, 2, 3, 4, 5] �Ƚ�1��

		 */
		//��������
		for(int i=1 ; i< array.length;i++)
		{
			for(int j=0; j<array.length-i;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println("�� " + i + "�ֱȽϣ�" + Arrays.toString(array));
		}
		
		System.out.println("---------------------------------------");
		
		//��������
		for(int i = 1 ; i< array.length;i++)
		{
			for(int j = 0; j<array.length - i;j++)
			{
				if(array[j] < array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println("�� " + i + "�ֱȽϣ�" + Arrays.toString(array));
		}

	}

}
