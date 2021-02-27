package com.ycl.soft.service.impl;

import com.ycl.soft.dao.IProduceDao;
import com.ycl.soft.domain.Product;
import com.ycl.soft.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务接口的实现类
 * @author wonderland
 * @date 2020年09月02日
 */

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    final IProduceDao productDao;

    @Autowired
    public ProductServiceImpl(IProduceDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
