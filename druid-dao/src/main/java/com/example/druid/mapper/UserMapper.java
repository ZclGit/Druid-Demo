package com.example.druid.mapper;


import com.example.druid.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectUsers();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}