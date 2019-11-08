package com.sundayong.personal.service.impl;

import com.sundayong.personal.mapper.TechnologyMapper;
import com.sundayong.personal.model.Technology;
import com.sundayong.personal.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    private TechnologyMapper technologyMapper;

    @Override
    public List<Technology> technologyList() {
        return technologyMapper.list();
    }
}
