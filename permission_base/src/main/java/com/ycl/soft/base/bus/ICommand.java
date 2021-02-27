package com.ycl.soft.base.bus;

import org.dom4j.Element;

/**
 * 接口
 */
public interface ICommand {
    /**
     * 初始化
     * @throws Exception /
     */
    public void init() throws Exception;

    /**
     * 执行
     * @return /
     * @throws Exception /
     */
    public Object Execute(String oprType, Element inEle) throws Exception;

    /**
     * 摧毁
     * @throws Exception /
     */
    public void destroy() throws Exception;
}
