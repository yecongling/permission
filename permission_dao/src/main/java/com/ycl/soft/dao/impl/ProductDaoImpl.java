package com.ycl.soft.dao.impl;

import com.ycl.soft.dao.IProduceDao;
import com.ycl.soft.domain.Product;

import java.util.List;

/**
 * 产品的数据接口实现类
 * @author wonderland
 */
public class ProductDaoImpl implements IProduceDao {
    /**
     * 查询所有的商品信息
     *
     * @return 返回所有商品信息的集合
     * @throws Exception
     */
    @Override
    public List<Product> findAll() throws Exception {
        return null;
    }
}
