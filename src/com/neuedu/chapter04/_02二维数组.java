package com.neuedu.chapter04;

public class _02二维数组 {
	/**
		二维数组：在数组中保存数组元素
		
			声明：
				数组类型[][] 数组名;
				数组类型    数组名[][];
				数组类型[] 数组名[];
			
			创建：
				数组名  = new 数组类型[R][C];
				数组名  = new 数组类型[R][];
				数组名  = new 数组类型[][C];----错误
				
			
			声明的同时创建：
				数组类型[][] 数组名 = new 数组类型[R][C];
				数组类型[][] 数组名 = new 数组类型[R][];
			
			声明的同时完成初始化：
				数组类型[][] 数组名 = new 数组类型[][]{
												{元素1，元素2，元素3},	
												{元素4，元素5，元素6},	
												{元素7，元素8，元素9},	
											  };
											  
				数组类型[][] 数组名 = {
									{元素1},	
									{元素4，元素5，元素6},	
									{元素7，元素8},	
								  };
			
		
	 */
	public static void main(String[] args) {
		//1.声明
		int[][] intArray;
		String  strArray[][];
		double[] doubleArray[];
		
		//2.创建
		intArray = new int[3][3];  //三行三列
		strArray = new String[3][];//三行N列
		//doubleArray = new double[][6];//三行N列 --------错误
		
		//3.声明的同时创建
		int[][] intArray2 = new int[4][3];//{  {0,0,0},
										  //   {0,0,0},
										  //   {0,0,0},
										  //   {0,0,0}
										  //}
		//4.声明的同时完成初始化
		int[][] intArray3 = new int[][]{
											{1,2,3},
											{4,5,6},
											{7,8,9}
									   };
									  
	    int[][] intArray4 =  {
								{11},
								{44,55,66},
								{77,88}
						     };
	   
	    //5.赋值
	    int[][] intArray5 = new int[3][4];
	    //第一行
	    int[] oneRow = new int[]{1,2,3,4};
	    intArray5[0] = oneRow;
	    //第二行
	    int[] twoRow = new int[]{5,6,7,8};
	    intArray5[1] = twoRow;
	    //第三行
	    int[] threeRow = new int[]{9,10,11,12};
	    intArray5[2] = threeRow;
	    
	    int[][] intArray6 = new int[3][4];
	    //第一行
	    intArray6[0][0] = 1;
	    intArray6[0][1] = 2;
	    intArray6[0][2] = 3;
	    intArray6[0][3] = 4;
	    //第二行
	    intArray6[1][0] = 5;
	    intArray6[1][1] = 6;
	    intArray6[1][2] = 7;
	    intArray6[1][3] = 8;
	    //第三行
	    intArray6[2][0] = 9;
	    intArray6[2][1] = 10;
	    intArray6[2][2] = 11;
	    intArray6[2][3] = 12;
	    
	    //6.取值
	    System.out.println(intArray6[2][3]);//12
	    
	    //7.遍历
	    //方式一
	    for (int i = 0; i < intArray6.length; i++) {
	    	//每一行的元素
			int[] row = intArray6[i];//{1,2,3,4}
			//遍历获取每一行的每一列值
			for (int j = 0; j < row.length; j++) {
				int column = row[j];
				System.out.println("第" + i + "行第 " + j + "列的值：" + column);
			}
		}
	    
	    //方式二
	    for (int i = 0; i < intArray6.length; i++) {
			//遍历获取每一行的每一列值
			for (int j = 0; j < intArray6[i].length; j++) {
				
				int column = intArray6[i][j];
				
				System.out.println("第" + i + "行第 " + j + "列的值：" + column);
			}
		}
	    
	}
	
}
