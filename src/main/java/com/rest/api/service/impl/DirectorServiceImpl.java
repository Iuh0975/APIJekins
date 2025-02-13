package com.rest.api.service.impl;

import com.rest.api.service.WokerService;
import org.springframework.stereotype.Service;

@Service("DirectorServiceImpl")
public class DirectorServiceImpl implements WokerService {

    @Override
    public void checkPosition() {

        System.out.println("Director is working here !!!");
    }

}
