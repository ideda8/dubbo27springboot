package com.da.demoprovider.service.impl;


import com.da.iprovider.service.UserinfoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class UserInfoServiceImpl implements UserinfoService {
    @Override
    public String sayHello() {
        System.out.println("UserInfoServiceImpl.sayHello()");
        return "Hello World! DaDaDa";
    }


}
