package com.mars.gmall.oms.service.impl;

import com.mars.gmall.oms.entity.Order;
import com.mars.gmall.oms.mapper.OrderMapper;
import com.mars.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
