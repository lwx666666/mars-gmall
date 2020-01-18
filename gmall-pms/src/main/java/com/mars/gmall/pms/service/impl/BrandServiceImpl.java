package com.mars.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.gmall.pms.entity.Brand;
import com.mars.gmall.pms.mapper.BrandMapper;
import com.mars.gmall.pms.service.BrandService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service // 使用dubbo注解暴露服务
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
