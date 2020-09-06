package com.chen.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UseMapper  extends BaseMapper<User> {
}
