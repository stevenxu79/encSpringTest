/**  
 * All rights Reserved, Designed By www.seassoon.com
 * @Title:  HelloWorldController.java   
 * @Package com.seassoon.suichao.xny.controller   
 * @Description:TODO(用一句话描述该文件做什么)   
 * @author: 徐建文
 * @date:   2018年5月14日 上午10:49:54
 * @version V2.0
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为
 */
package com.seassoon.suichao.xny.controller;

/**   
 * @ClassName:  HelloWorldController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: 徐建文 
 * @date:2018年5月14日 上午10:49:54  
 * @Copyright: 2018 www.seassoon.com Inc. All rights reserved. 
 * 注意：本内容仅限于上海思贤信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业行为 
 */

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
	private String name="abc";
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
    	System.out.println("name="+name);
    	System.out.println("hello "+name);
        return "Hello " + name;
    }
}