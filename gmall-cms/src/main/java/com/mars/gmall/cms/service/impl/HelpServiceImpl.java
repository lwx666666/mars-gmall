package com.mars.gmall.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.cms.entity.Help;
import com.mars.gmall.cms.mapper.HelpMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帮助表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class HelpServiceImpl extends ServiceImpl<HelpMapper, Help> implements IService<Help> {

}
