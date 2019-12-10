package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.MedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Controller
public class MedListController {
    private MedList medList;

    @Autowired
    public MedListController(MedList medList) {
        this.medList = medList;
    }

    @GetMapping("/med/{id}")
    public String getMedList(@PathVariable("id") String id, Model model) {
        List<User> mlist = medList.findById(id);
        if (mlist != null)
            model.addAttribute("med", mlist);
        return "mList";
    }

    @PostMapping("/med/{id}")
    public String addToMedList(@PathVariable("id") String id, User user) {
        user.setUser(user);
    }

    @RequestMapping("/page/{userId}")
    public ModelAndView returnPage(@PathVariable("userId") String userId) {
        //ctrl+p 看传入参数
        User user = new User(userId, "Alice", "1234", "female", 12);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("page");
        return modelAndView;
    }
}
