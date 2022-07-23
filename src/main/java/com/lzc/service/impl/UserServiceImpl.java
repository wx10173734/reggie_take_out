package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.User;
import com.lzc.mapper.UserMapper;
import com.lzc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/23
 * @apiNote
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
