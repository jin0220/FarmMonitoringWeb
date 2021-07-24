package com.example.FarmMonitoringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "content/home";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("signup")
    public String signup(){
        return "signup";
    }

    @GetMapping("information")
    public String information(){
        return "content/information";
    }

    @GetMapping("editor")
    public String editor(){
        return "content/editor";
    }

    @GetMapping("community")
    public String community(){
        return "content/community";
    }

    @GetMapping("notice")
    public String notice(){
        return "content/notice";
    }

    @GetMapping("guidely")
    public String guidely(){
        return "content/guidely";
    }

    @GetMapping("faq")
    public String faq(){
        return "content/faq";
    }

    @GetMapping("qna")
    public String qna(){
        return "content/qna";
    }
}
