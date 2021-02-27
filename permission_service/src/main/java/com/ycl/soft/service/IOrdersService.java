package com.ycl.soft.service;

import com.ycl.soft.domain.Orders;

import java.util.List;

/**
 * @author wonderland
 * @Description: 订单服务的接口
 * @date 2020/10/1212:47
 */
public interface IOrdersService {
    /**
     * 查询所有的订单
     * @param page 页数
     * @param size 每页数据条数
     * @return 返回所有数据的集合
     * @throws Exception 抛出异常
     */
    List<Orders> findAll(int page, int size) throws Exception;
}
