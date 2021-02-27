package com.ycl.soft.base.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName DataCacheDB
 * @Description 缓存数据操作类
 * @Author wonderland
 * @Date 2020/11/21 20:45
 * @Version 1.0
 **/
public final class DataCacheDB {

    /**
     * 定义存储缓存的容器
     */
    private static Map<String, Object> beanMap = new ConcurrentHashMap<>();

    /**
     * 获取缓存数据（首先从本地缓存中获取，若获取不到，然后在请求Redis）
     * @param key 定义的key
     * @return 返回定义的缓存bean
     */
    public static DataCacheBean getCacheData(String key) {
        return null;
    }

    /**
     * 移除缓存数据
     * @param key 缓存key
     */
    public static void removeCacheData(String key) {

    }
}
