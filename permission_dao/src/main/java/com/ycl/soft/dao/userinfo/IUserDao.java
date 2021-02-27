package com.ycl.soft.dao.userinfo;

import com.ycl.soft.domain.Users;
import org.springframework.stereotype.Repository;

/**
 * 用户信息dao层
 * @author wonderland
 * @date 2020年09月02日
 */
@Repository
public interface IUserDao {

    /**
     * 通过用户名加载用户信息
     * @param username 用户名
     * @return 用户信息
     */
    Users loadUserByUsername(String username);
}
