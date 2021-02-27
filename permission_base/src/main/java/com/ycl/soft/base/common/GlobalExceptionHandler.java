package com.ycl.soft.base.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName GlobalExceptionHandler
 * @Description 全局异常处理类
 * @Author wonderland
 * @Date 2020/11/10 22:17
 * @Version 1.0
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义业务类异常
     * @param bs 业务异常
     * @return 封装的结果
     */
    @ExceptionHandler(value = Exception.class)
    public AjaxResult businessExceptionHandler(BusinessException bs){
        log.error(bs.getMessage(), bs);
        return AjaxResult.defineError(bs);
    }

    /**
     * 处理其他类异常
     * @param e 异常
     * @return 封装的结果
     */
    @ExceptionHandler(value = Exception.class)
    public AjaxResult otherExceptionHandler(Exception e){
        log.error(e.getMessage(), e);
        return AjaxResult.otherError(ResultCode.INTERNAL_SERVER_ERROR);
    }

}
