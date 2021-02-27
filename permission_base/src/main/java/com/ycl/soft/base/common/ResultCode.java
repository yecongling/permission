package com.ycl.soft.base.common;

/**
 * 错误信息枚举(注释中给的是一个区间范围使用的内容，其他的可在该区间范围内进行扩充)
 * @author wonderland
 */
public enum ResultCode {

    /*成功状态码*/
    SUCCESS(1, "成功"),
    /* 参数错误 1001-19991 */
    PARAM_IS_INVALID(1001, "参数无效"),
    PARAM_IS_BLACK(1002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(1003, "参数类型错误"),
    PARAM_NOT_COMPLETE(1004, "参数缺失"),
    /* 用户错误 2001-2999 */
    USER_NOT_LOGGED_IN(2001, "用户未登录，访问的路径需要验证，请登录"),
    USER_LOGIN_ERROR(2002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(2003, "账号已被禁用"),
    USER_NOT_EXIST(2004, "用户不存在"),
    USER_HAS_EXISTED(2005, "用户已存在"),
    /* 服务器异常 3001 - 3009*/
    INTERNAL_SERVER_ERROR(3001, "服务器异常，请联系管理员");

    /**
     * 错误状态码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String errorMsg;

    ResultCode(Integer code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
