package com.mars.gmall.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.cms.entity.TopicCategory;
import com.mars.gmall.cms.mapper.TopicCategoryMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题分类表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class TopicCategoryServiceImpl extends ServiceImpl<TopicCategoryMapper, TopicCategory> implements IService<TopicCategory> {

}
