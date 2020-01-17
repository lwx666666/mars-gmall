package com.mars.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.ums.entity.AdminRoleRelation;
import com.mars.gmall.ums.mapper.AdminRoleRelationMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationMapper, AdminRoleRelation> implements IService<AdminRoleRelation> {

}
