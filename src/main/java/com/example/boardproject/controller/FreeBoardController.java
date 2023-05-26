package com.example.boardproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class FreeBoardController {
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping ("/save")
    public String savePost() {
        return null;
    }
}
