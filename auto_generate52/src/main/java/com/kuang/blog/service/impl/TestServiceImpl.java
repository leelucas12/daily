package com.kuang.blog.service.impl;

import com.kuang.blog.entity.Test;
import com.kuang.blog.mapper.TestMapper;
import com.kuang.blog.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 狂神说
 * @since 2020-05-22
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
