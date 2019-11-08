package com.qf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname Demo1
 * @Description TODO
 * @Date 2019/10/30 11:50
 * @Created by
 */
@RestController
@PropertySource({"jdbc.properties"})
@ConfigurationProperties("jdbc")
public class Demo1 {
    @Value("${name}")
    private String name;
    @Value("${url}")
    private String url;
    @Value("${jdbc.usernames}")
    private String username;
    
    @RequestMapping("/info")
    public String getInfo(){
        System.out.println(name);
        return name+":"+url+":"+username;
    }
}
