package cn.itcast.service.impl;

import cn.itcast.dao.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 该类的作用:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List findAll() {
        return userMapper.selectList(null);
    }
}
