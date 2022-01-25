package com.example.controllers;

import com.example.helpers.Orang;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/barang")
public class BarangController {
    @GetMapping
    public Orang index(){
        return new Orang("Dion", 19);
    }
    @GetMapping("/c")
    public String index1(){
        return "mahasiswa/index";
    }
}
