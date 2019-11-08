package com.sundayong.personal.mapper;

import com.sundayong.personal.model.Technology;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TechnologyMapper {

    @Select("select * from technology")
    List<Technology> list();
}
