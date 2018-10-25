package com.example.druid.service.serviceImp;

import com.example.druid.mapper.UserMapper;
import com.example.druid.entity.User;
import com.example.druid.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionServiceImp implements ActionService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
