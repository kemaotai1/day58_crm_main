package com.kmt.controller;

import com.kmt.entity.User;
import com.kmt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws ParseException {
        List<User> userlist = userService.findAll();
        /*for (int i = 0; i < userlist.size(); i++) {
            User user = userlist.get(i);
            String time = new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday());
            user.setBirthday(time);
        }*/


        ModelAndView mv = new ModelAndView();
        mv.addObject("list", userlist);
        mv.setViewName("userlist");
        userlist.forEach(System.out::println);
        return mv;
    }
}
