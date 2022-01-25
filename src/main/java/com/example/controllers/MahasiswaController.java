package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;

@Controller
@RequestMapping("")
public class MahasiswaController {
    @GetMapping
    public String index(Model model){
        model.addAttribute("data", "Hello world");
        int[] a={1,2,3,4,5};
        model.addAttribute("a", a);
        return "mahasiswa/index";
    }
}
