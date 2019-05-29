package com.da.consumer.controller;

import com.da.iprovider.service.UserinfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    //但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20888"，端口号和配置文件中保持一致
    @Reference(version = "1.0.0")
    private UserinfoService userinfoService;

    @GetMapping("/hello")
    public String sayHello (){
        String s = userinfoService.sayHello();
        System.out.println(s);
        return s;
    }

}
