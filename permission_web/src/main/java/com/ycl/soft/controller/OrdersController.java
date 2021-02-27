package com.ycl.soft.controller;

import com.github.pagehelper.PageInfo;
import com.ycl.soft.domain.Orders;
import com.ycl.soft.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 订单管理的控制层
 * @author wonderland
 * @date 2020/10/1212:44
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    final IOrdersService ordersService;

    @Autowired
    public OrdersController(IOrdersService service) {
        this.ordersService = service;
    }
 
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "4") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll(page, size);
        //PageInfo就是一个分页Bean
        PageInfo pageInfo=new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }
}
