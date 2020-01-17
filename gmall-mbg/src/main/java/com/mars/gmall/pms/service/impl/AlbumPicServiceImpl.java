package com.mars.gmall.pms.service.impl;

import com.mars.gmall.pms.entity.AlbumPic;
import com.mars.gmall.pms.mapper.AlbumPicMapper;
import com.mars.gmall.pms.service.AlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 * 逆向工程导入service
 *  1.先复制mapper
 *  2.给当前项目手动创建一个service包，再把impl导入
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
