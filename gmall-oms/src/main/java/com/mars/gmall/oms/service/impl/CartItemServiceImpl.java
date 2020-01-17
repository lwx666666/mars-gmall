package com.mars.gmall.oms.service.impl;

import com.mars.gmall.oms.entity.CartItem;
import com.mars.gmall.oms.mapper.CartItemMapper;
import com.mars.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
