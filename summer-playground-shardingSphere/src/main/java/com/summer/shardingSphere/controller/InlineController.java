package com.summer.shardingSphere.controller;

import cn.hutool.core.lang.generator.SnowflakeGenerator;
import com.summer.shardingSphere.model.User;
import com.summer.shardingSphere.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lijiawei
 */
@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class InlineController {

    private final UserService userService;

    @RequestMapping("add")
    public String add(String name, String sex) {
        User user = new User();
        user.setUserName(name);
        user.setSex(Byte.valueOf(sex));
        userService.save(user);
        return "1";
    }

    @RequestMapping("get")
    public User add(Long id) {
        return userService.getById(id);
    }

    @RequestMapping("list")
    public List<User> list() {
        return userService.list();
    }

}
