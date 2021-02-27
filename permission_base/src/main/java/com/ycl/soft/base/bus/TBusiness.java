package com.ycl.soft.base.bus;

import org.dom4j.Element;

import javax.naming.InitialContext;
import javax.naming.spi.InitialContextFactory;

/**
 * 调用
 */
public class TBusiness implements  ICommand{
    /**
     * 初始化
     *
     * @throws Exception /
     */
    @Override
    public void init() throws Exception {

    }

    /**
     * 执行
     *
     * @param oprType
     * @param inEle
     * @return /
     * @throws Exception /
     */
    @Override
    public Object Execute(String oprType, Element inEle) throws Exception {



        return null;
    }

    /**
     * 摧毁
     *
     * @throws Exception /
     */
    @Override
    public void destroy() throws Exception {

    }
}
