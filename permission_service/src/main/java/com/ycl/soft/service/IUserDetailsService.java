package com.ycl.soft.service;

import com.ycl.soft.base.common.AjaxResult;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 验证用户信息服务接口
 * @author wonderland
 */
public interface IUserDetailsService {

    /**
     * 通过用户名加载用户信息
     * @param username 用户名
     * @param password 用户密码
     * @return 返回封装的信息
     * @throws UsernameNotFoundException 用户名未找到的异常
     */
    AjaxResult loadUserByUsername(String username, String password) throws UsernameNotFoundException;
}
