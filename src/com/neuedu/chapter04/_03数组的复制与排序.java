package com.neuedu.chapter04;

import java.util.Arrays;

public class _03数组的复制与排序 {

	public static void main(String[] args) {
		
		/**
		 * 数组的复制:System.arraycopy(src, 0, dest, 0, src.length)
		 * 	src:   源数组（source）
		 *  srcPos:从源数组开始复制的下标（source position）
		 *  
		 *  dest:  目标数组（destination）
		 *  destPos：从指定的下标开始放置复制的元素（destination position）
		 *  
		 *  length:复制的元素的个数
		 *  
		 *  
		 *  Arrays.toString(数组)：将数组按指定格式的字符串输出所有的元素
		 *  Arrays.sort(数组)：将数组根据升序排序
		 */
		int[] src = new int[]{1,2,3,4,5};
		int[] dest = new int[]{6,7,8,9,10,11,12,13,14};
		
		System.out.println("复制前src:" + Arrays.toString(src));  //[1, 2, 3, 4, 5]
		System.out.println("复制前dest:" + Arrays.toString(dest));//[6, 7, 8, 9, 10, 11, 12, 13, 14]
		
		//System.arraycopy(src, 0, dest, 0, src.length);
		
		System.out.println("复制后src:" + Arrays.toString(src));  //[1, 2, 3, 4, 5]
		System.out.println("复制后dest:" + Arrays.toString(dest));//[1, 2, 3, 4, 5, 11, 12, 13, 14]
		
		/**
		 * 合并两个数组
		 */
		//0.定义新的数组，长度为src的长度+dest的长度
		int[] merge = new int[src.length + dest.length];
		
		//1.复制src数组
		System.arraycopy(src, 0, merge, 0, src.length);
		System.out.println("复制src之后的merge数组：" + Arrays.toString(merge));//[1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		//2.复制dest数组
		System.arraycopy(dest, 0, merge, src.length, dest.length);
		System.out.println("复制dest之后的merge数组：" + Arrays.toString(merge));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
		
		/**
		 * Arrays.sort(array) ： 数组的排序
		 */
		int[] array = new int[]{46,65,1,88,12,6,100};
		
		System.out.println("排序前：" + Arrays.toString(array));//[46, 65, 1, 88, 12, 6, 100]
		Arrays.sort(array);//排序,默认升序排序
		System.out.println("排序后：" + Arrays.toString(array));//[1, 6, 12, 46, 65, 88, 100]
		
		//降序
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + "  \t");
		}
	}
}
