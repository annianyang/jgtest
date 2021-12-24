package com.example.springmybatis.controller;

import com.example.springmybatis.entity.TestUser;
import com.example.springmybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@Controller
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/cc")
    public String show1(@RequestParam("uid")Long id ,Model model){
        TestUser user =userService.getUserByid(id);
        model.addAttribute("user1",user);
        return "bb";

    }



    @ResponseBody
    @RequestMapping("/aa")
    public String getUserbyid(@RequestParam("uid") Long id){
        return userService.getUserByid(id).getUname();
    }

}
