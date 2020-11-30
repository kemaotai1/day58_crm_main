package com.kmt.controller;

import com.kmt.entity.Account;
import com.kmt.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<Account> list = accountService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("list");
        return mv;
    }

    public void test01() {
        System.out.println("aaaaa");
    }

    public void test02() {
        System.out.println("bbbbbbbb");
    }

    public void test03() {
        System.out.println("ccccccccc");
    }

}
