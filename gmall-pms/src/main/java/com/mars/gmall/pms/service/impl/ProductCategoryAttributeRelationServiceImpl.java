package com.mars.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.gmall.pms.entity.ProductCategoryAttributeRelation;
import com.mars.gmall.pms.mapper.ProductCategoryAttributeRelationMapper;
import com.mars.gmall.pms.service.ProductCategoryAttributeRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
