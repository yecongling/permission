package com.ycl.soft.service.system.impl;

import com.ycl.soft.service.system.IServiceMonitor;
import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.lang.management.ManagementFactory;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wonderland
 */
@Service
public class ServiceMonitorImpl implements IServiceMonitor {

    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    /**
     * 查询数据分页
     *
     * @return Map<String, Object>
     */
    @Override
    public Map<String, Object> getServers() throws Exception {
        Map<String, Object> resultMap = new LinkedHashMap<>(8);
        try {
            // 系统信息类
            SystemInfo systemInfo = new SystemInfo();
            // 获取操作系统的信息
            OperatingSystem operatingSystem= systemInfo.getOperatingSystem();
            // 获取硬件信息
            HardwareAbstractionLayer hardware = systemInfo.getHardware();

            // 系统信息
            resultMap.put("sys", getSystemInfo(operatingSystem));
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultMap;
    }

    /**
     * 获取系统相关信息 系统 运行天数 IP
     * @param operatingSystem 操作系统
     * @return /
     * @throws Exception /
     */
    public Map<String, Object> getSystemInfo(OperatingSystem operatingSystem) throws Exception{
        Map<String, Object> systemInfo = new LinkedHashMap<>();
        // JVM 运行时间
        long startTime = ManagementFactory.getRuntimeMXBean().getStartTime();
        Date date = new Date(startTime);

        systemInfo.put("os", operatingSystem.toString());
        systemInfo.put("", "");
        return systemInfo;
    }
}
