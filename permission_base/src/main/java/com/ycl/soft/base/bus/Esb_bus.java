package com.ycl.soft.base.bus;

import org.dom4j.Element;

import javax.naming.InitialContext;

public class Esb_bus {

    /**
     * 服务调用总线
     * @param oprType
     * @param inEle
     * @return
     * @throws Exception
     */
    public Object doEsb(String oprType, Element inEle) throws Exception {

        InitialContext context = new InitialContext();

        ICommand iCommand = (ICommand)context.lookup("ESB_JNDI");
        iCommand.Execute(oprType, inEle);
        
        return null;
    }

}
