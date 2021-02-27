package com.ycl.soft.service.system;

import java.util.Map;

/**
 * 系统监控的接口
 * @author wonderland
 */
public interface IServiceMonitor {
    /**
     * 查询数据分页
     * @return Map<String,Object>
     * @throws Exception e
     */
    Map<String,Object> getServers() throws Exception;
}
