package com.ycl.soft.domain;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 用户实体类
 * @author wonderland
 */
public class Users implements UserDetails, CredentialsContainer {
    private static final long serialVersionUID = -1281593347783609316L;
    private String userId;
    private String userName;
    private String email;
    private String password;
    private String phoneNum;
    private int status;
    private String statusStr;
    private List<Role> roles;

    /**
     * 授权
     */
    private Set<GrantedAuthority> authorities;
    /**
     * 帐户是否过期
     */
    private boolean accountNonExpired;
    /**
     * 帐户是否锁定
     */
    private boolean accountNonLocked;
    /**
     * 认证是否过期
     */
    private boolean credentialsNonExpired;
    /**
     * 帐户是否可用
     */
    private boolean enabled;

    public Users() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    /**
     * 账户是否过期
     * @return true/false
     */
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    /**
     * 账户书否锁定
     * @return true/false
     */
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    /**
     * 认证是否过期
     * @return true/false
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    /**
     * 账户是否可用
     * @return true/false
     */
    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 清除凭证
     */
    @Override
    public void eraseCredentials() {
        authorities.clear();
    }

}
