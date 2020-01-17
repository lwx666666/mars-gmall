package com.mars.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.ums.entity.Admin;
import com.mars.gmall.ums.mapper.AdminMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IService<Admin> {

}
