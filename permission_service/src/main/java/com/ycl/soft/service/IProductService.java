package com.ycl.soft.service;

import com.ycl.soft.domain.Product;

import java.util.List;

/**
 * 产品的业务接口层
 * @author wonderland
 * @date 2020年09月02日
 */
public interface IProductService {

    /**
     * 获取所有的商品
     * @return 商品的集合
     * @throws Exception
     */
     List<Product> findAll() throws Exception;
}
