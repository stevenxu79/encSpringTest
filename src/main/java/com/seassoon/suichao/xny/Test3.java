/**  
 * All rights Reserved, Designed By www.seassoon.com
 * @Title:  Test3.java   
 * @Package com.seassoon.suichao.xny   
 * @Description:TODO(用一句话描述该文件做什么)   
 * @author: 徐建文
 * @date:   2018年5月17日 上午8:42:49
 * @version V2.0
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为
 */
package com.seassoon.suichao.xny;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**   
 * @ClassName:  Test3   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 徐建文 
 * @date:2018年5月17日 上午8:42:49  
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为 
 */

public class Test3 {

	/**
	 * @throws IOException 
	 * @throws ClassNotFoundException    
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		 String className = "com.seassoon.suichao.xny.Test2";  
//	        Class clazz = Class.forName(className);
//	        System.out.println(clazz);
//	        System.out.println(clazz.getClass());
	        
	        Test2 p = new Test2();
	        Class clazz = p.getClass();
	        System.out.println(clazz);
	        Test2 p1 = new Test2();
	        Class clazz1 = p1.getClass();
	        System.out.println(clazz == clazz1);
	        
	        String className2 = "Test2.class";  
	        InputStream is = clazz1.getResourceAsStream(className2);
	        
	        inputStreamToFile(is,"E:\\lib\\kk.class");
	        
	}

	
	public static void inputStreamToFile(InputStream ins, String fileName) throws IOException {
		File file=new File(fileName);
		OutputStream os = new FileOutputStream(file);
		int bytesRead = 0;
		byte[] buffer = new byte[8192];
		while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
			os.write(buffer, 0, bytesRead);
		}
		os.close();
		ins.close();
	}
	/**  
	    * 将字节流转换成文件  
	    * @param filename  
	    * @param data  
	    * @throws Exception  
	    */    
	    public  void saveFile(String filename,byte [] data)throws Exception{     
	        if(data != null){     
	         String mLibPath="E:";
	          String filepath =mLibPath +"\\"+ filename;     
	          File file  = new File(filepath);     
	          if(file.exists()){     
	             file.delete();     
	          }     
	          FileOutputStream fos = new FileOutputStream(file);     
	          fos.write(data,0,data.length);     
	          fos.flush();     
	          fos.close();     
	        }     
	    }    

}
