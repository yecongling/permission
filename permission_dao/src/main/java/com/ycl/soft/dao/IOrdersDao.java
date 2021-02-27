package com.ycl.soft.dao;

import com.ycl.soft.domain.Orders;
import com.ycl.soft.domain.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wonderland
 * @Description 订单数据访问接口
 * @date 2020/10/1212:50
 */
@Repository
public interface IOrdersDao {

    /**
     *  查询所有的订单信息
     * @return 返回所有订单信息的集合
     * @throws Exception /
     */
    @Select("select * from orders")
    @Results( {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "com.foo.ycl.IProductDao.findById"))
    })
    List<Orders> findAll() throws Exception;
}
