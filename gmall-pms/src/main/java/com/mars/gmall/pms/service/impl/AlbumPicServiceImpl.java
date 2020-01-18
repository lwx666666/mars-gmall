package com.mars.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.gmall.pms.entity.AlbumPic;
import com.mars.gmall.pms.mapper.AlbumPicMapper;
import com.mars.gmall.pms.service.AlbumPicService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
//@Service // 使用dubbo注解暴露服务
@Component
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
