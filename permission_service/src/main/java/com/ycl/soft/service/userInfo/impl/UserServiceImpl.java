package com.ycl.soft.service.userInfo.impl;

import com.ycl.soft.base.common.AjaxResult;
import com.ycl.soft.base.common.ResultCode;
import com.ycl.soft.dao.userinfo.IUserDao;
import com.ycl.soft.domain.Users;
import com.ycl.soft.service.userInfo.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wonderland
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {

    final IUserDao userDao;

    @Autowired
    public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 通过用户名加载用户信息
     *
     * @param username 用户名
     * @return 返回用户信息
     * @throws UsernameNotFoundException 用户名未找到的异常
     */
    @Override
    public AjaxResult loadUserByUsername(String username, String password) throws UsernameNotFoundException {
        Users user = userDao.loadUserByUsername(username);
        AjaxResult result = new AjaxResult();
        if (user == null){
            result.setMsg(ResultCode.USER_NOT_EXIST.getErrorMsg());
            result.setSuccess(false);
            result.setCode(ResultCode.USER_NOT_EXIST.getCode());
        } else {
            // 进行用户密码和可用性的检测
            String pwd = user.getPassword();
            int status = user.getStatus();
            if (password.equals(pwd) && status == 1){
                result.setMsg(ResultCode.SUCCESS.getErrorMsg());
                result.setSuccess(true);
                result.setCode(ResultCode.SUCCESS.getCode());
                result.setData(user);
            }
            if (!password.equals(pwd)){
                result.setMsg(ResultCode.USER_LOGIN_ERROR.getErrorMsg());
                result.setSuccess(false);
                result.setCode(ResultCode.USER_LOGIN_ERROR.getCode());
            }
            if (status != 1) {
                result.setMsg(ResultCode.USER_ACCOUNT_FORBIDDEN.getErrorMsg());
                result.setSuccess(false);
                result.setCode(ResultCode.USER_ACCOUNT_FORBIDDEN.getCode());
            }
        }
        return result;
    }
}
