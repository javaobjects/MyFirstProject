/**
	包（package）：
	
			语法：  package 包名;
			
			注意:
				1.包名的路径必须与磁盘物理路径保持大小写，及层级结构一致
				2.package语句作为java源文件的第一条语句
				3.每个*.java源文件只能声明一个包
				4.如果没有package语句，则默认为无名包
				
	import导入包中的类：jdk中java.lang包中的类，自动导入，不需手动import
	
			1. 包名.路径名
				public class Package extends com.neuedu.chapter07.继承.Employee{}
				
			2. 使用import关键字引入其它包中的类
				//一个一个导入
				import com.neuedu.chapter07.继承.Employee;
				import com.neuedu.chapter07.继承.Officer;
				//批量导入
				import com.neuedu.chapter07.继承.*;
		
			3.同一个包中的类不需要导入
 */
package com.neuedu.chapter07.包;

//一个一个导入
//import com.neuedu.chapter07.继承.Employee;
//import com.neuedu.chapter07.继承.Officer;
//批量导入
import com.neuedu.chapter07.继承.*;

public class Package extends Employee{

}
class Test extends Officer
{
	
}
