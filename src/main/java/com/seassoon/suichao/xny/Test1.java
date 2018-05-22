/**  
 * All rights Reserved, Designed By www.seassoon.com
 * @Title:  Test1.java   
 * @Package com.seassoon.suichao.xny   
 * @Description:TODO(用一句话描述该文件做什么)   
 * @author: 徐建文
 * @date:   2018年5月13日 下午5:09:47
 * @version V2.0
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为
 */
package com.seassoon.suichao.xny;

/**   
 * @ClassName:  Test1   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 徐建文 
 * @date:2018年5月13日 下午5:09:47  
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为 
 */

public class Test1 {

	public static String getStr() {
		String str="hello enc";
		System.out.println("test1 str="+str);
		callTest2();
		return str;
	}
	public static void  callTest2() {
		Test2 test2= new Test2();
		test2.getStr();
	}
	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("test1");
		getStr();
		callTest2();
	}

}
