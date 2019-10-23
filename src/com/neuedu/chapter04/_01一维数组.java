package com.neuedu.chapter04;

/**
 	一维数组：一种引用类型的数据
 	
 		特点：1.指定数据类型    2.指定长度
 		
 		声明：
 			数据类型      数组名[];
 			数据类型[] 数组名;
 			
 		创建：
 			数组名 = new 数据类型[N];
 		
 		声明的同时创建：
 			数据类型    数组名[] = new 数据类型[N];
 		
 		声明的同时完成初始化：
 		            数据类型    数组名[] = new 数据类型[]{元素1，元素2，元素3.....};
 		            数据类型    数组名[] = {元素1，元素2，元素3.....};
 		            
 		赋值：
 			数组名[索引] = 值;
 		
 		取值：
 			数组名[索引];
 			
 		属性：
 			获取数组的元素个数（长度）：length
 		
 		遍历：
 			for 或者 forEach
 		
 		----------------------------------------------------------------------------------
 		
 		数组下标越界异常  java.lang.ArrayIndexOutOfBoundsException
 		
 		----------------------------------------------------------------------------------
 		
 		stack(栈)：由系统分配，大小限制，先进后出
 		                             一般用于保存基本数据类型的局部变量 与 引用类型的地址值
 		                             
 		heap(堆)：由程序员控制，当使用new关键字时，开辟heap(堆)内存空间，用于保存引用对象的元素的值，先进先出
 		                            一般用于保存引用对象的属性值 或 数组的元素值
 			     
 */
public class _01一维数组 {

	public static void main(String[] args) {
		//1.声明
		int[] intArray = null;                     //开辟stack(栈)内存空间，用于保存引用对象的地址值
		String strArray[];
		
		//System.out.println(intArray.toString());//null 不能使用对象中的任何方法，此时地址为null，空指针异常  java.lang.NullPointerException
		//2.创建
		intArray = new int[5];				    //使用new关键字时，开辟heap(堆)内存空间，用于保存引用对象的元素的值
		System.out.println(intArray.toString());//[I@689d6d87 
		
		//3.声明的同时创建
		int[] intArray2 = new int[4];           //动态初始化：使用new创建数组后，所有元素其实已经被初始化，元素都是默认值
		
		//4.声明的同时完成初始化
		int[] intArray3 = new int[]{1,2,3,4,5};
		String[] strArray2 = {"a","b","c","d"}; //静态初始化：不使用new，而是在声明数组的同时就完成创建和初始化工作
		
		//5.赋值
		int[] intArray4 = new int[4]; 
		intArray4[0] = 11;
		intArray4[1] = 22;
		intArray4[2] = 33;
		intArray4[3] = 44;
		
		//6.取值
		System.out.println(intArray4[0]);
		System.out.println(intArray4[1]);
		System.out.println(intArray4[2]);
		System.out.println(intArray4[3]);
		//System.out.println(intArray4[4]);//数组下标越界异常  java.lang.ArrayIndexOutOfBoundsException: 4，因为数组的长度为4，下标为0-3之间
		
		//7.属性
		System.out.println(intArray4.length);//4
		
		//8.遍历
		//使用for循环遍历
		for (int i = 0; i < intArray4.length; i++) {
			
			int element = intArray4[i];
			
			System.out.println("数组元素：" + element);
		}
		
		//使用forEach遍历
		for (int element : intArray4) {
			System.out.println("foreach的数组元素：" + element);
		}
	}
}
