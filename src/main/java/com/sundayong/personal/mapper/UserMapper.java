package com.sundayong.personal.mapper;

import com.sundayong.personal.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> list();

}
