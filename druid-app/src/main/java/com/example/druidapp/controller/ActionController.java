package com.example.druidapp.controller;

import com.example.druidmodule.module.User;
import com.example.druidsvc.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ActionController {

    @Autowired
    ActionService actionService;

    @ResponseBody
    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        List<User> users = actionService.getUsers();
        return users;
    }
}
