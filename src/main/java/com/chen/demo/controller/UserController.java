package com.chen.demo.controller;
import com.chen.demo.pojo.ResponseResult;
import com.chen.demo.pojo.User;
import com.chen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/findall")
    @ResponseBody
      public Object  userList(Model  model) {
        List<User> userList = userService.selectList();
        userList.forEach(System.out::println);
        model.addAttribute("list", userList);
        return ResponseResult.renderSuccess(userList);
    }



}
