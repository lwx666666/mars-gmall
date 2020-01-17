package com.mars.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.ums.entity.MemberTask;
import com.mars.gmall.ums.mapper.MemberTaskMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements IService<MemberTask> {

}
