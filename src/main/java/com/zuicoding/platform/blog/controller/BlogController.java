package com.zuicoding.platform.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Stephen on 2017/6/15.<br/>
 * Description : <p></p>
 **/
@RequestMapping("/blog")
@Controller
public class BlogController {


    @RequestMapping("list.html")
    public String blogList(Model model){

        return "blog/blog_list";
    }
}
