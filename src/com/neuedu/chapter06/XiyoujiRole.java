package com.neuedu.chapter06;

/**
 * 西游记游戏软件中的游戏人物:
		孙悟空：孙悟空的武器是金箍棒，战斗力五颗星，耐力五颗星
		唐  僧：唐僧没有武器，战斗力为零，耐力五颗星
		猪八戒：猪八戒的武器是耙子，战斗力四颗星，耐力两颗星
		沙  僧：沙僧的武器是月牙铲 ，战斗力三颗星，耐力四颗星

	            属性：角色名称、武器、战斗力、耐力
	            行为：战斗、获取角色信息
	    
	------------------------------------------------------------------------- 
	    类是创建对象的模板，对象是类的实例
	    
	    创建对象：
	 	   类名   对象名  = new 构造器();
	------------------------------------------------------------------------- 
	 	   
	 构造器（构造方法/构造器/构造函数，Constructor）
			1.具有与类相同的名称
			2.不含返回值类型
			3.不能在方法中用return语句返回一个值
			4. 一般访问权限为public
		  
		         在一个类中，具有上述特征的方法就是构造器。
    
	构造器的作用：
			1.完成对象的创建，即完成对象的实例化。XiyoujiRole sunwukong = new XiyoujiRole();
			2.一般使用构造器来完成对成员变量的初始化。XiyoujiRole tangSeng = new XiyoujiRole("唐僧", "无", "☆☆☆☆☆", "★★★★★");
 
             注意：
            1.默认带无参构造函数
            2.当定义带参数构造函数时，默认无参构造函数失效了，需要显示定义出来
 */
public class XiyoujiRole {

	//属性：角色名称、武器、战斗力、耐力
	/**角色名称*/
	String roleName;
	
	/**武器*/
	String wuQi;
	
	/**战斗力*/
	String zhanDouLi;
	
	/**耐力*/
	String naiLi;
	
	/**构造器（构造函数、构造方法）*/
	public XiyoujiRole()
	{
		
	}
	/**重载构造器（构造函数、构造方法）*/
	public XiyoujiRole(String p_roleName,String p_wuQi,String p_zhanDouLi,String p_naiLi)
	{
		roleName = p_roleName;
		wuQi = p_wuQi;
		zhanDouLi = p_zhanDouLi;
		naiLi = p_naiLi;
	}
	
	//行为：战斗、获取角色信息
	/**战斗*/
	public void fight()
	{
		System.out.println("加血 +11111111111111111111");
	}
	
	/**获取角色信息*/
	public void getRoleInfo()
	{
		System.out.println("角色名称：" + roleName + "\t武器：" + wuQi + "\t战斗力:" + zhanDouLi + "\t耐力:" + naiLi);
	}
	
	public static void main(String[] args) {
		/**
		 * 先new对象，再赋值
		 */
		//创建一个孙悟空的角色：   类名   对象名  = new 构造器();
		//孙悟空：孙悟空的武器是金箍棒，战斗力五颗星，耐力五颗星
		XiyoujiRole sunwukong = new XiyoujiRole();
		
		//通过对象名.属性访问成员变量
		sunwukong.roleName = "孙悟空";
		sunwukong.wuQi = "金箍棒";
		sunwukong.zhanDouLi = "★★★★★";
		sunwukong.naiLi = "★★★★★";
		
		//通过对象名.方法访问成员方法
		sunwukong.fight();
		sunwukong.getRoleInfo();
		
		/**
		 * new对象的同时，完成初始化操作
		 */
		//唐  僧：唐僧没有武器，战斗力为零，耐力五颗星
		XiyoujiRole tangSeng = new XiyoujiRole("唐僧", "无", "☆☆☆☆☆", "★★★★★");
		tangSeng.getRoleInfo();
		
		//猪八戒：猪八戒的武器是耙子，战斗力四颗星，耐力两颗星
		XiyoujiRole zhuBaJie = new XiyoujiRole("猪八戒", "耙子", "★★★★☆", "★★☆☆☆");
		zhuBaJie.getRoleInfo();
		
		//沙  僧：沙僧的武器是月牙铲 ，战斗力三颗星，耐力四颗星
		XiyoujiRole shaSeng = new XiyoujiRole("沙 僧", "月牙铲", "★★★☆☆", "★★★★☆");
		shaSeng.getRoleInfo();
		
	}
}
