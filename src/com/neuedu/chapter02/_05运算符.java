package com.neuedu.chapter02;

public class _05运算符 {

	public static void main(String[] args) {
		/**
		 * 算数运算符
		 */
		// + 可以为加法运算符  ，也可以为字符串拼接符号
		int num = 10;
		int num2 = 20;
		System.out.println(num + num2);   //30
		System.out.println(num + num2 + "AB");//30AB
		System.out.println("AB" + num + num2);//AB1020
		
		// /除法:  若是两个整数相除，只保留整数部分
		int num3 = 10;
		int num4 = 3;
		int result = num3/num4;
		System.out.println(result);//3
		
		
		float num5 = 10;
		int num6 = 3;
		float result2 = num5/num6;
		System.out.println(result2);//3.3333333
		
		// % 取余，求模: 被模数为正，结果为正，被模数为负，结果为负
		System.out.println(10%3);  //1
		System.out.println(10%-3); //1
		System.out.println(-10%3); //-1
		System.out.println(-10%-3);//-1
		
		// ++ 自增    num++，先计算，再加1，++num，先加1，再计算
		int num7 = 10;
		System.out.println(num7++);//10
		System.out.println(num7);  //11
		
		// -- 自减    num--，先计算，再减1，--num，先减1，再计算
		int num8 = 20;
		System.out.println(--num8);//19
		System.out.println(num8);  //19
		
		/**
		 * 赋值运算符
		 */
		int x = 10;
		int y = 20;
		
		// +=,等同于 x = x+y
		x += y;
		System.out.println(x);//30
		
		// -=,等同于 x = x-y
		x -= y;
		System.out.println(x);//10
		
		// *=,等同于 x = x*y
		x *= y;
		System.out.println(x);//200
		
		// /=,等同于 x= x/y
		x /= y;
		System.out.println(x);//10
		
		/**
		 * 关系运算符（比较运算符）:
		 * 		"=="判断是否相等，不要写成 "="赋值运算符
		 *      "!="判断是否不相等，不要写成"<>"SQL语法
		 */
		int num9 = 10;
		int num10 = 20;
		System.out.println(num9 = num10); //20
		System.out.println(num9 == num10);//true
		
		System.out.println(num9 != num10);//false
		//System.out.println(num9 <> num10);//错误
		
		/**
		 * 逻辑运算符（布尔运算符）
		 */
		// &&(and):所有条件返回true，结果才为true,只要任意结果为false,结果即为false
		System.out.println(true && true); //true
		System.out.println(true && false);//false
		System.out.println(false && true);//false   短路运算
		System.out.println(false && false);//false  短路运算
		
		//短路运算
		int num11 = 10;
		boolean result3 = (num11 > 20) && (++num11 >= 11);
		System.out.println(num11);   //10
		System.out.println(result3); //false
		
		// ||(or) :只要任意结果为true,结果即为true，如果所有条件返回false,结果才为false
		System.out.println(true || true); //true 短路运算
		System.out.println(true || false);//true 短路运算
		System.out.println(false || true);//true  
		System.out.println(false || false);//false  
		
		// ! (not)：对原有的结果取反
		System.out.println(!true); //false
		System.out.println(!false);//true
		
		/**
		 * 位运算(只对byte、short、char、int、long有效)
		 */
		// & :所有条件返回true，结果才为true,只要任意结果为false,结果即为false
		System.out.println(true & true); //true
		System.out.println(true & false);//false
		System.out.println(false & true);//false   非短路运算
		System.out.println(false & false);//false  非短路运算
		
		//非短路运算
		int num12 = 10;
		boolean result4 = (num12 > 20) & (++num12 >= 11);
		System.out.println(num12);   //11
		System.out.println(result4); //false
		
		//位运算   1 true   0 false
		System.out.println(1 & 1);//1
		System.out.println(1 & 0);//0
		System.out.println(0 & 1);//0   非短路运算
		System.out.println(0 & 0);//0  非短路运算
		
		// |:只要任意结果为true,结果即为true，如果所有条件返回false,结果才为false
		System.out.println(true | true); //true 非短路运算
		System.out.println(true | false);//true 非短路运算
		System.out.println(false | true);//true  
		System.out.println(false | false);//false 
		
		//位运算   1 true   0 false
		System.out.println(1 | 1);//1
		System.out.println(1 | 0);//1
		System.out.println(0 | 1);//1   非短路运算
		System.out.println(0 | 0);//0  非短路运算
		
		/**
		 *  逻辑运算符（&& 、||）与位运算符（& 、|） 的异同点：
		 *  	
		 *     相同点：都可以进行逻辑运算
		 *     
		 *     不同点：
		 *     		① 做逻辑运算时，逻辑运算符（&& 、||）可以做短路运算，位运算符（& 、|）不可以做短路运算，逻辑运算符效率 > 位运算符效率
		 * 
		 * 			② 位运算符可以做按位运算，但是逻辑运算符不可以
		 */
		
		// ^ 异或运算符，两者不同返回true,两者相同返回false
		System.out.println(true ^ true); //false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true  
		System.out.println(false ^ false);//false 
		
		//位运算   1 true   0 false
		System.out.println(1 ^ 1);//0
		System.out.println(1 ^ 0);//1
		System.out.println(0 ^ 1);//1   
		System.out.println(0 ^ 0);//0 
		
		//按位运算，按位与 &、按位或 |、按位异或^
		int num13 = 3;
		int num14 = 4;
		
		System.out.println(num13 & num14);//0
		System.out.println(num13 | num14);//7
		System.out.println(num13 ^ num14);//7
		
		//3 0 0 1 1
		//4 0 1 0 0
		
		//& 0000   | 0111    ^ 0111
		
		/**
		 * 左移和右移运算相当于实现整数乘以或除以2的n次方
		 */
		// << 左移位,将整数的二进制值，往左移动指定N位，右边空出位置默认补0
		int num15 = 4;
		System.out.println(num15 << 2);//num14 * 2^2 = 16
		
		// >> 右移位:a>>b,将a的二进制数据右移b位，如果最高位是0（正数），则左边移空的部分补0，如果最高位是1（负数），则左边移空的部分补1
		int num16 = 4;
		System.out.println(num16 >> 2);//num16 / 2^2 = 1
		
		int num17 = -4; //1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1100
		System.out.println(num17 >> 2);//-1
		
		// >>> 无符号右移位:a>>>b,将a的二进制数据右移b位，左边移空的部分补0，
		int num18 = -4; //1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1100
		System.out.println(num18 >>> 2);//1073741823
		
		/**
		 * 思考：MD5加密算法：
		 * 		123456 -> 加密  -> 16个字节的数组[-8,34,-12,....] -> 将长度为16的字节表示成32位的十六进制字符串  -> F834567890ABCDEF1234567890ABCDEF
		 * 
		 * 		 34: 0010 0010  -> 表示为2个十六进制值  ——>0010 (2)   0010(2)
		 * 		123: 0111 1011  -> 表示为2个十六进制值  ——>0111 (7)   1011(A)
		 */
		byte b = -8;
		
		//二进制
		System.out.println(Integer.toBinaryString(b));      //  111111111111111111111111 1111 1000
		System.out.println(Integer.toBinaryString(b >>> 4));//  111111111111111111111111 1111 --无符号右移四位，将左边四位移出
														    //& 000000000000000000000000 1111 ---与十六进制F做与运算，为了去除前面所有的1
														    //  000000000000000000000000 1111
		System.out.println(Integer.toBinaryString(b >>> 4 & 0XF));//1111  左边四位
		System.out.println(Integer.toBinaryString(b & 0XF));//  111111111111111111111111 1111 1000
													  		//& 000000000000000000000000 0000 1111 ---与十六进制F做与运算，为了去除前面所有的1
													        //  000000000000000000000000 0000 1000 
														    //  1000   右边的四位
		//十进制
		System.out.println(b >>> 4 & 0XF); //15
		System.out.println(b & 0XF);       //8
		
		//十六进制
		System.out.println(Integer.toHexString(b >>> 4 & 0XF));//f  左边四位
		System.out.println(Integer.toHexString(b & 0XF));      //8     右边四位
		
		
		 /**
		  * 三元运算符：表达式1?表达式2：表达式3
		  */
		/*System.out.println(5 > 3 ? true : false);//true
		System.out.println(5 < 3 ? "是的" : "不是的");//不是的
		
		//二元运算符：= < + &&等
		System.out.println(5 + 3);//8
		
		//一元运算符: ! 
		System.out.println(!true);//false
		System.out.println(++num18);//3*/
	}
	
}
