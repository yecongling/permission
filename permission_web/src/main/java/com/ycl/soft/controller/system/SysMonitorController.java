package com.ycl.soft.controller.system;

import com.ycl.soft.service.system.IServiceMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务监控使用
 * @author wonderland
 */
@Controller
@RequestMapping("/sys")
public class SysMonitorController {

    final IServiceMonitor monitor;

    @Autowired
    public SysMonitorController(IServiceMonitor serviceMonitor){
        this.monitor = serviceMonitor;
    }

    /**
     * 获取服务器信息
     * @return 服务器信息
     * @throws Exception 异常
     */
    @RequestMapping("/sysInfo.do")
    @ResponseBody
    public Map<String, Object> getServersInfo() throws  Exception {
        Map<String, Object> map = new HashMap<>(8);
        map.put("result", "1");
        return map;
    }
}
