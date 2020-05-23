package com.kuang.blog.service.impl;

import com.kuang.blog.entity.User;
import com.kuang.blog.mapper.UserMapper;
import com.kuang.blog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
