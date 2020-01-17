package com.mars.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.ums.entity.Role;
import com.mars.gmall.ums.mapper.RoleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IService<Role> {

}
