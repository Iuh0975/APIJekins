package com.rest.api.controller;

import com.rest.api.dto.request.UserDtoRequest;
import com.rest.api.dto.response.UserDtoResponse;
import com.rest.api.entity.User;
import com.rest.api.service.UserMapperInterface;
import com.rest.api.service.UserService;
import com.rest.api.service.WokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@Validated
//@ConfigurationProperties(prefix = "ctv.mail")
public class RestAPIController {

    @Value("${ctv.mail.port}")
    private int port;

    @Value("${ctv.mail.host}")
    private String host;



    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("DirectorServiceImpl")
    private WokerService wokerService;

    @Autowired
    private UserMapperInterface userMapperInterface;


    @RequestMapping(method = RequestMethod.DELETE, value = "/get-all")
    public User getUser(@RequestBody User user){

        System.out.println(host);
        System.out.println(port);
        userService.checkUser();
        return ResponseEntity.ok(user).getBody();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/position")
    public void checkWorkerPosition(){
        wokerService.checkPosition();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/map")
    public UserDtoResponse mapUser(@RequestBody UserDtoRequest userDtoRequest){
        return userMapperInterface.map(userDtoRequest);
    }

}
