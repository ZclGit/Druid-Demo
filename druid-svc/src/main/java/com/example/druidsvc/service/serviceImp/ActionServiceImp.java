package com.example.druidsvc.service.serviceImp;

import com.example.druiddao.mapper.UserMapper;
import com.example.druidmodule.entity.User;
import com.example.druidsvc.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionServiceImp implements ActionService {

    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
