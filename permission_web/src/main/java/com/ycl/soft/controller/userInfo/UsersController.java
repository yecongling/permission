package com.ycl.soft.controller.userInfo;

import com.ycl.soft.base.common.AjaxResult;
import com.ycl.soft.service.userInfo.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制层
 * @author wonderland
 * @date 2020/10/1711:09
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    final IUserService userService;

    public UsersController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 用户登录
     * @return 返回登录结果
     * @throws Exception 抛出查询数据异常
     */
    @RequestMapping("/login.do")
    @ResponseBody
    public AjaxResult usersLogin(@RequestParam(name = "username", required = true) String username, @RequestParam(name = "password", required = true)String password) throws Exception {
        return userService.loadUserByUsername(username, password);
    }
}
