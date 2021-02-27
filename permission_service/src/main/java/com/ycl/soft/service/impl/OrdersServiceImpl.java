package com.ycl.soft.service.impl;

import com.github.pagehelper.PageHelper;
import com.ycl.soft.dao.IOrdersDao;
import com.ycl.soft.domain.Orders;
import com.ycl.soft.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wonderland
 * @Description: 订单业务的实现类
 * @date 2020/10/1212:48
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    final IOrdersDao ordersDao;

    @Autowired
    public OrdersServiceImpl(IOrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }
}
