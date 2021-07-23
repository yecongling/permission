package com.ycl.soft.controller.system;

import com.ycl.soft.base.common.AjaxResult;
import com.ycl.soft.service.system.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录验证
 */
@Controller
public class SystemLoginController {

    private ISysUserService userService;

    @Autowired
    public void setUserService(ISysUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login.do")
    @ResponseBody
    public AjaxResult login(String username, String password){
        System.out.println(username);
        System.out.println(password);
        return AjaxResult.success();
    }

    @GetMapping("/login.do")
    public String ajaxLogin(){
        return "login/login";
    }

    @GetMapping("logout.do")
    public String loginOut(){
        return "login/login";
    }

}
