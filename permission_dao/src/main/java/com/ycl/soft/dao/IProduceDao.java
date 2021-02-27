package com.ycl.soft.dao;

import com.ycl.soft.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 产品的数据接口类
 * @author wonderland
 * @date 2020年09月02日
 */
@Repository
public interface IProduceDao {

    /**
     * 查询所有的商品信息
     * @return 返回所有商品信息的集合
     * @throws Exception
     */
    List<Product> findAll() throws Exception;
}
