package com.neuedu.chapter04;

public class _02��ά���� {
	/**
		��ά���飺�������б�������Ԫ��
		
			������
				��������[][] ������;
				��������    ������[][];
				��������[] ������[];
			
			������
				������  = new ��������[R][C];
				������  = new ��������[R][];
				������  = new ��������[][C];----����
				
			
			������ͬʱ������
				��������[][] ������ = new ��������[R][C];
				��������[][] ������ = new ��������[R][];
			
			������ͬʱ��ɳ�ʼ����
				��������[][] ������ = new ��������[][]{
												{Ԫ��1��Ԫ��2��Ԫ��3},	
												{Ԫ��4��Ԫ��5��Ԫ��6},	
												{Ԫ��7��Ԫ��8��Ԫ��9},	
											  };
											  
				��������[][] ������ = {
									{Ԫ��1},	
									{Ԫ��4��Ԫ��5��Ԫ��6},	
									{Ԫ��7��Ԫ��8},	
								  };
			
		
	 */
	public static void main(String[] args) {
		//1.����
		int[][] intArray;
		String  strArray[][];
		double[] doubleArray[];
		
		//2.����
		intArray = new int[3][3];  //��������
		strArray = new String[3][];//����N��
		//doubleArray = new double[][6];//����N�� --------����
		
		//3.������ͬʱ����
		int[][] intArray2 = new int[4][3];//{  {0,0,0},
										  //   {0,0,0},
										  //   {0,0,0},
										  //   {0,0,0}
										  //}
		//4.������ͬʱ��ɳ�ʼ��
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
	   
	    //5.��ֵ
	    int[][] intArray5 = new int[3][4];
	    //��һ��
	    int[] oneRow = new int[]{1,2,3,4};
	    intArray5[0] = oneRow;
	    //�ڶ���
	    int[] twoRow = new int[]{5,6,7,8};
	    intArray5[1] = twoRow;
	    //������
	    int[] threeRow = new int[]{9,10,11,12};
	    intArray5[2] = threeRow;
	    
	    int[][] intArray6 = new int[3][4];
	    //��һ��
	    intArray6[0][0] = 1;
	    intArray6[0][1] = 2;
	    intArray6[0][2] = 3;
	    intArray6[0][3] = 4;
	    //�ڶ���
	    intArray6[1][0] = 5;
	    intArray6[1][1] = 6;
	    intArray6[1][2] = 7;
	    intArray6[1][3] = 8;
	    //������
	    intArray6[2][0] = 9;
	    intArray6[2][1] = 10;
	    intArray6[2][2] = 11;
	    intArray6[2][3] = 12;
	    
	    //6.ȡֵ
	    System.out.println(intArray6[2][3]);//12
	    
	    //7.����
	    //��ʽһ
	    for (int i = 0; i < intArray6.length; i++) {
	    	//ÿһ�е�Ԫ��
			int[] row = intArray6[i];//{1,2,3,4}
			//������ȡÿһ�е�ÿһ��ֵ
			for (int j = 0; j < row.length; j++) {
				int column = row[j];
				System.out.println("��" + i + "�е� " + j + "�е�ֵ��" + column);
			}
		}
	    
	    //��ʽ��
	    for (int i = 0; i < intArray6.length; i++) {
			//������ȡÿһ�е�ÿһ��ֵ
			for (int j = 0; j < intArray6[i].length; j++) {
				
				int column = intArray6[i][j];
				
				System.out.println("��" + i + "�е� " + j + "�е�ֵ��" + column);
			}
		}
	    
	}
	
}
