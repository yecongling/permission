package com.ycl.soft.base.common;

/**
 * 自定义业务类异常
 * @author wonderland
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -8772045863125750925L;

    /**
     * 错误状态码
     */
    private Integer errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public BusinessException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
