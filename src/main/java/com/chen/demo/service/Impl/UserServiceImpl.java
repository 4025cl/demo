package com.chen.demo.service.Impl;

import com.chen.demo.mapper.UseMapper;
import com.chen.demo.pojo.User;
import com.chen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UseMapper userMapper;
    @Override
    public List<User> selectList() {
        return userMapper.selectList(null);
    }
}
