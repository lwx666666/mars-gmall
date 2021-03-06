package com.mars.gmall.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mars.gmall.cms.entity.MemberReport;
import com.mars.gmall.cms.mapper.MemberReportMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户举报表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class MemberReportServiceImpl extends ServiceImpl<MemberReportMapper, MemberReport> implements IService<MemberReport> {

}
