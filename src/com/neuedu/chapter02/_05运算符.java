package com.neuedu.chapter02;

public class _05����� {

	public static void main(String[] args) {
		/**
		 * ���������
		 */
		// + ����Ϊ�ӷ������  ��Ҳ����Ϊ�ַ���ƴ�ӷ���
		int num = 10;
		int num2 = 20;
		System.out.println(num + num2);   //30
		System.out.println(num + num2 + "AB");//30AB
		System.out.println("AB" + num + num2);//AB1020
		
		// /����:  �����������������ֻ������������
		int num3 = 10;
		int num4 = 3;
		int result = num3/num4;
		System.out.println(result);//3
		
		
		float num5 = 10;
		int num6 = 3;
		float result2 = num5/num6;
		System.out.println(result2);//3.3333333
		
		// % ȡ�࣬��ģ: ��ģ��Ϊ�������Ϊ������ģ��Ϊ�������Ϊ��
		System.out.println(10%3);  //1
		System.out.println(10%-3); //1
		System.out.println(-10%3); //-1
		System.out.println(-10%-3);//-1
		
		// ++ ����    num++���ȼ��㣬�ټ�1��++num���ȼ�1���ټ���
		int num7 = 10;
		System.out.println(num7++);//10
		System.out.println(num7);  //11
		
		// -- �Լ�    num--���ȼ��㣬�ټ�1��--num���ȼ�1���ټ���
		int num8 = 20;
		System.out.println(--num8);//19
		System.out.println(num8);  //19
		
		/**
		 * ��ֵ�����
		 */
		int x = 10;
		int y = 20;
		
		// +=,��ͬ�� x = x+y
		x += y;
		System.out.println(x);//30
		
		// -=,��ͬ�� x = x-y
		x -= y;
		System.out.println(x);//10
		
		// *=,��ͬ�� x = x*y
		x *= y;
		System.out.println(x);//200
		
		// /=,��ͬ�� x= x/y
		x /= y;
		System.out.println(x);//10
		
		/**
		 * ��ϵ��������Ƚ��������:
		 * 		"=="�ж��Ƿ���ȣ���Ҫд�� "="��ֵ�����
		 *      "!="�ж��Ƿ���ȣ���Ҫд��"<>"SQL�﷨
		 */
		int num9 = 10;
		int num10 = 20;
		System.out.println(num9 = num10); //20
		System.out.println(num9 == num10);//true
		
		System.out.println(num9 != num10);//false
		//System.out.println(num9 <> num10);//����
		
		/**
		 * �߼�������������������
		 */
		// &&(and):������������true�������Ϊtrue,ֻҪ������Ϊfalse,�����Ϊfalse
		System.out.println(true && true); //true
		System.out.println(true && false);//false
		System.out.println(false && true);//false   ��·����
		System.out.println(false && false);//false  ��·����
		
		//��·����
		int num11 = 10;
		boolean result3 = (num11 > 20) && (++num11 >= 11);
		System.out.println(num11);   //10
		System.out.println(result3); //false
		
		// ||(or) :ֻҪ������Ϊtrue,�����Ϊtrue�����������������false,�����Ϊfalse
		System.out.println(true || true); //true ��·����
		System.out.println(true || false);//true ��·����
		System.out.println(false || true);//true  
		System.out.println(false || false);//false  
		
		// ! (not)����ԭ�еĽ��ȡ��
		System.out.println(!true); //false
		System.out.println(!false);//true
		
		/**
		 * λ����(ֻ��byte��short��char��int��long��Ч)
		 */
		// & :������������true�������Ϊtrue,ֻҪ������Ϊfalse,�����Ϊfalse
		System.out.println(true & true); //true
		System.out.println(true & false);//false
		System.out.println(false & true);//false   �Ƕ�·����
		System.out.println(false & false);//false  �Ƕ�·����
		
		//�Ƕ�·����
		int num12 = 10;
		boolean result4 = (num12 > 20) & (++num12 >= 11);
		System.out.println(num12);   //11
		System.out.println(result4); //false
		
		//λ����   1 true   0 false
		System.out.println(1 & 1);//1
		System.out.println(1 & 0);//0
		System.out.println(0 & 1);//0   �Ƕ�·����
		System.out.println(0 & 0);//0  �Ƕ�·����
		
		// |:ֻҪ������Ϊtrue,�����Ϊtrue�����������������false,�����Ϊfalse
		System.out.println(true | true); //true �Ƕ�·����
		System.out.println(true | false);//true �Ƕ�·����
		System.out.println(false | true);//true  
		System.out.println(false | false);//false 
		
		//λ����   1 true   0 false
		System.out.println(1 | 1);//1
		System.out.println(1 | 0);//1
		System.out.println(0 | 1);//1   �Ƕ�·����
		System.out.println(0 | 0);//0  �Ƕ�·����
		
		/**
		 *  �߼��������&& ��||����λ�������& ��|�� ����ͬ�㣺
		 *  	
		 *     ��ͬ�㣺�����Խ����߼�����
		 *     
		 *     ��ͬ�㣺
		 *     		�� ���߼�����ʱ���߼��������&& ��||����������·���㣬λ�������& ��|������������·���㣬�߼������Ч�� > λ�����Ч��
		 * 
		 * 			�� λ�������������λ���㣬�����߼������������
		 */
		
		// ^ �������������߲�ͬ����true,������ͬ����false
		System.out.println(true ^ true); //false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true  
		System.out.println(false ^ false);//false 
		
		//λ����   1 true   0 false
		System.out.println(1 ^ 1);//0
		System.out.println(1 ^ 0);//1
		System.out.println(0 ^ 1);//1   
		System.out.println(0 ^ 0);//0 
		
		//��λ���㣬��λ�� &����λ�� |����λ���^
		int num13 = 3;
		int num14 = 4;
		
		System.out.println(num13 & num14);//0
		System.out.println(num13 | num14);//7
		System.out.println(num13 ^ num14);//7
		
		//3 0 0 1 1
		//4 0 1 0 0
		
		//& 0000   | 0111    ^ 0111
		
		/**
		 * ���ƺ����������൱��ʵ���������Ի����2��n�η�
		 */
		// << ����λ,�������Ķ�����ֵ�������ƶ�ָ��Nλ���ұ߿ճ�λ��Ĭ�ϲ�0
		int num15 = 4;
		System.out.println(num15 << 2);//num14 * 2^2 = 16
		
		// >> ����λ:a>>b,��a�Ķ�������������bλ��������λ��0����������������ƿյĲ��ֲ�0��������λ��1����������������ƿյĲ��ֲ�1
		int num16 = 4;
		System.out.println(num16 >> 2);//num16 / 2^2 = 1
		
		int num17 = -4; //1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1100
		System.out.println(num17 >> 2);//-1
		
		// >>> �޷�������λ:a>>>b,��a�Ķ�������������bλ������ƿյĲ��ֲ�0��
		int num18 = -4; //1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1100
		System.out.println(num18 >>> 2);//1073741823
		
		/**
		 * ˼����MD5�����㷨��
		 * 		123456 -> ����  -> 16���ֽڵ�����[-8,34,-12,....] -> ������Ϊ16���ֽڱ�ʾ��32λ��ʮ�������ַ���  -> F834567890ABCDEF1234567890ABCDEF
		 * 
		 * 		 34: 0010 0010  -> ��ʾΪ2��ʮ������ֵ  ����>0010 (2)   0010(2)
		 * 		123: 0111 1011  -> ��ʾΪ2��ʮ������ֵ  ����>0111 (7)   1011(A)
		 */
		byte b = -8;
		
		//������
		System.out.println(Integer.toBinaryString(b));      //  111111111111111111111111 1111 1000
		System.out.println(Integer.toBinaryString(b >>> 4));//  111111111111111111111111 1111 --�޷���������λ���������λ�Ƴ�
														    //& 000000000000000000000000 1111 ---��ʮ������F�������㣬Ϊ��ȥ��ǰ�����е�1
														    //  000000000000000000000000 1111
		System.out.println(Integer.toBinaryString(b >>> 4 & 0XF));//1111  �����λ
		System.out.println(Integer.toBinaryString(b & 0XF));//  111111111111111111111111 1111 1000
													  		//& 000000000000000000000000 0000 1111 ---��ʮ������F�������㣬Ϊ��ȥ��ǰ�����е�1
													        //  000000000000000000000000 0000 1000 
														    //  1000   �ұߵ���λ
		//ʮ����
		System.out.println(b >>> 4 & 0XF); //15
		System.out.println(b & 0XF);       //8
		
		//ʮ������
		System.out.println(Integer.toHexString(b >>> 4 & 0XF));//f  �����λ
		System.out.println(Integer.toHexString(b & 0XF));      //8     �ұ���λ
		
		
		 /**
		  * ��Ԫ����������ʽ1?���ʽ2�����ʽ3
		  */
		/*System.out.println(5 > 3 ? true : false);//true
		System.out.println(5 < 3 ? "�ǵ�" : "���ǵ�");//���ǵ�
		
		//��Ԫ�������= < + &&��
		System.out.println(5 + 3);//8
		
		//һԪ�����: ! 
		System.out.println(!true);//false
		System.out.println(++num18);//3*/
	}
	
}
