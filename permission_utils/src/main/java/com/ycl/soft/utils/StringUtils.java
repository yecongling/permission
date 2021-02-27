package com.ycl.soft.utils;

import com.ycl.soft.utils.files.FileUtils;
import org.lionsoul.ip2region.DbConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

/**
 * 字符串工具类 继承自org.apache.commons.lang3.StringUtils类
 * @author wonderland
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils{

    private static final Logger log = LoggerFactory.getLogger(StringUtils.class);
    private static boolean ipLocal = false;
    private static File file = null;
    /**
     * 可根据IP地址获取信息
     */
    private static DbConfig config;
    private static final char SEPARATOR = '_';
    private static final String UNKNOWN = "unknown";

    static {
        SpringContextHolder.addCallBack(() -> {
            StringUtils.ipLocal = SpringContextHolder.getProperties("ip.local-parsing", false, Boolean.class);
            if (ipLocal){
                /**
                 * 此文件为独享，不必关闭
                 */
                String path = "ip2region/ip2region.db";
                String name = "ip2region.db";
                try{
                    config = new DbConfig();
                    file = FileUtils.inputStreamToFile(new ClassPathResource(path).getInputStream(), name);
                } catch (Exception e){
                    log.error(e.getMessage(), e);
                }
            }
        });
    }

}
