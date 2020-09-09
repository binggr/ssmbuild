package com.binggr.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author: bing
 * @date: 2020/9/9 10:18
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLoginPage")
    public String toLogin() throws Exception{
        return "login";
    }

    /**
     * 跳转到成功界面
     * @return
     */
    @RequestMapping("/toSuccessPage")
    public String toSuccess(Model model) throws Exception{
        return "success";
    }

    /**
     * 登录提交
     * @param session
     * @param username
     * @param pwd
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String pwd) throws Exception{
        System.out.println("接收前端==="+username);
        session.setAttribute("username",username);
        return "success";
    }

    /**
     * 退出登录 session 失效
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/logout")
    public String lgout(HttpSession session) throws Exception{
        session.invalidate();
        return "login";
    }

}
