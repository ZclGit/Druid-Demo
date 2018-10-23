package com.example.druidsvc.service;


import com.example.druidmodule.entity.User;
import org.omg.CORBA.UnknownUserException;

import java.util.List;

public interface ActionService {
    List<User> getUsers();
}
