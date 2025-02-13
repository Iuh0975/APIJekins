package com.rest.api.service.impl;

import com.rest.api.service.WokerService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements WokerService {

    @Override
    public void checkPosition() {

        System.out.println("Employee is working here !!!");
    }

}
