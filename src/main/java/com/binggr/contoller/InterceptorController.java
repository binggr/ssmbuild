package com.binggr.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: bing
 * @date: 2020/9/9 10:00
 */

@Controller
public class InterceptorController {

    /**
     * 拦截器实现测试
     * @return
     */
    @RequestMapping("/interceptor")
    @ResponseBody
    public String testFunction(){
        System.out.println("控制器的方法执行了");
        return "hello";
    }


}
