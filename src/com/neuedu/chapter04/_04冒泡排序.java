package com.neuedu.chapter04;

import java.util.Arrays;

public class _04冒泡排序 {

	public static void main(String[] args) {
		int[] array = new int[]{5,4,3,2,1};
		
		/*
		 * 总共N个数组，比较N-1轮
		 * 	
		 * 		第 1轮比较：[4, 3, 2, 1, 5] 比较4次
				第 2轮比较：[3, 2, 1, 4, 5] 比较3次
				第 3轮比较：[2, 1, 3, 4, 5] 比较2次
				第 4轮比较：[1, 2, 3, 4, 5] 比较1次

		 */
		//升序排序
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
			System.out.println("第 " + i + "轮比较：" + Arrays.toString(array));
		}
		
		System.out.println("---------------------------------------");
		
		//降序排序
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
			System.out.println("第 " + i + "轮比较：" + Arrays.toString(array));
		}

	}

}
