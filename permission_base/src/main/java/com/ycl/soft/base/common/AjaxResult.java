package com.ycl.soft.base.common;

/**
 * @ClassName AjaxResult
 * @Description 同一封装返回结果类
 * @Author wonderland
 * @Date 2020/11/10 22:07
 * @Version 1.0
 **/
public class AjaxResult {

    /**
     * 是否成功
     */
    private Boolean success;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    /**
     * 无参构造
     */
    public AjaxResult() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 全参构造
     * @param success /
     * @param code /
     * @param msg /
     * @param data /
     */
    public AjaxResult(Boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 自定义业务异常的返回结果
     * @param bs 业务异常
     * @return 封装的结果
     */
    public static AjaxResult defineError(BusinessException bs){
        AjaxResult result = new AjaxResult();
        result.setSuccess(false);
        result.setCode(bs.getErrorCode());
        result.setMsg(bs.getErrorMsg());
        result.setData(null);
        return result;
    }

    /**
     * 其他异常处理的返回结果
     * @param resultCode 枚举的错误信息
     * @return 封装的结果
     */
    public static AjaxResult otherError(ResultCode resultCode){
        AjaxResult result = new AjaxResult();
        result.setSuccess(false);
        result.setCode(resultCode.getCode());
        result.setMsg(result.getMsg());
        result.setData(null);
        return result;
    }

    /**
     * 返回成功
     * @return 结果
     */
    public static AjaxResult success(){
        AjaxResult result = new AjaxResult();
        result.setCode(ResultCode.SUCCESS.getCode());
        return result;
    }

    /**
     * 返回成功
     * @param data 数据
     * @return 结果
     */
    public static AjaxResult success(Object data){
        AjaxResult result = new AjaxResult();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setData(data);
        return result;
    }

    /**
     * 返回失败
     * @param resultCode 失败信息
     * @return 结果
     */
    public static AjaxResult fail(ResultCode resultCode){
        AjaxResult result = new AjaxResult();
        result.setCode(resultCode.getCode());
        result.setMsg(result.getMsg());
        return result;
    }

    /**
     * 返回失败
     * @param resultCode 失败信息
     * @param data 数据
     * @return 结果
     */
    public static AjaxResult fail(ResultCode resultCode, Object data){
        AjaxResult result = new AjaxResult();
        result.setCode(resultCode.getCode());
        result.setMsg(resultCode.getErrorMsg());
        result.setData(data);
        return result;
    }
}
