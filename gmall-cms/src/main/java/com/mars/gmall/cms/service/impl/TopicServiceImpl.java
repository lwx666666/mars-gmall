package com.mars.gmall.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.cms.entity.Topic;
import com.mars.gmall.cms.mapper.TopicMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements IService<Topic> {

}
