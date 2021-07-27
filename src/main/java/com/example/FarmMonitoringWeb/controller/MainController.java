package com.example.FarmMonitoringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("category",1);
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
    public String information(Model model){
        model.addAttribute("category",3);
        return "content/information";
    }

    @GetMapping("editor")
    public String editor(Model model){
        model.addAttribute("category",2);
        return "content/editor";
    }

    @GetMapping("community")
    public String community(Model model){
        model.addAttribute("category",2);
        return "content/community";
    }

    @GetMapping("notice")
    public String notice(Model model){
        model.addAttribute("category",4);
        return "content/notice";
    }

    @GetMapping("guidely")
    public String guidely(Model model){
        model.addAttribute("category",4);
        return "content/guidely";
    }

    @GetMapping("faq")
    public String faq(Model model){
        model.addAttribute("category",4);
        return "content/faq";
    }

    @GetMapping("qna")
    public String qna(Model model){
        model.addAttribute("category",4);
        return "content/qna";
    }
}
