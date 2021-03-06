package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/set")
    public Object set(String key,String value){
       redisTemplate.opsForValue().set(key,value);
        return "OK";
    }
    @GetMapping("/get")
    public Object get(String key){
        String o = (String) redisTemplate.opsForValue().get(key);
        return o;
    }
    @GetMapping("/del")
    public Object del(String key){
        redisTemplate.delete(key);
        return "OK";
    }
}
