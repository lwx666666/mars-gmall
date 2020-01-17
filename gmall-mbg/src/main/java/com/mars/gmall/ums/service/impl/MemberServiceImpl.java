package com.mars.gmall.ums.service.impl;

import com.mars.gmall.ums.entity.Member;
import com.mars.gmall.ums.mapper.MemberMapper;
import com.mars.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2020-01-17
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
