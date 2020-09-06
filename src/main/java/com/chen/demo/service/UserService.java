package com.chen.demo.service;

import com.chen.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> selectList();

}
