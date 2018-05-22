/**  
 * All rights Reserved, Designed By www.seassoon.com
 * @Title:  JavaSparkPi.java   
 * @Package com.seassoon.suichao.xny.spark   
 * @Description:TODO(用一句话描述该文件做什么)   
 * @author: 徐建文
 * @date:   2018年5月16日 下午5:10:32
 * @version V2.0
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为
 */
package com.seassoon.suichao.xny.spark;

import org.apache.spark.SparkConf;

/**   
 * @ClassName:  JavaSparkPi   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 徐建文 
 * @date:2018年5月16日 下午5:10:32  
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为 
 */

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Computes an approximation to pi
 * Usage: JavaSparkPi [partitions]
 */
public class JavaSparkPi2 {

  public static void main(String[] args) throws Exception {
	String master = (args.length == 1) ? args[0] : "local";	
//	String master=args[0];
	System.out.println("master="+master);
	SparkConf conf = new SparkConf()
			.setAppName("JavaSparkPi")
//			.set("spark.driver.extraLibraryPath","/home/xujw/enc/JarEncrypt/jvmti/decrypt")
//			.set("spark.driver.extraJavaOptions", "-agentlib:xnydecrypt")
//			.set("spark.executor.extraLibraryPath","/home/xujw/enc/JarEncrypt/jvmti/decrypt")
//			.set("spark.executor.extraJavaOptions", "-agentlib:xnydecrypt")
			.setMaster(master)
			;
	SparkSession spark=SparkSession
            .builder()
            .config(conf)
            .getOrCreate();
//    SparkSession spark = SparkSession
//      .builder()
//      .appName("JavaSparkPi")
//      .master(master)
////      .master("local")
//      .getOrCreate();

    JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());

//    int slices = (args.length == 1) ? Integer.parseInt(args[0]) : 2;
    int slices =2;
    int n = 100000 * slices;
    List<Integer> l = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      l.add(i);
    }

    JavaRDD<Integer> dataSet = jsc.parallelize(l, slices);

    int count = dataSet.map(integer -> {
      double x = Math.random() * 2 - 1;
      double y = Math.random() * 2 - 1;
      return (x * x + y * y <= 1) ? 1 : 0;
    }).reduce((integer, integer2) -> integer + integer2);

    System.out.println("Pi is roughly " + 4.0 * count / n);

    spark.stop();
  }
}