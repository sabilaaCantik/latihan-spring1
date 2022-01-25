package com.example.helpers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orang {
    private String nama;

    private Integer umur;

    public Orang(String nama, Integer umur) {
        this.nama = nama;
        this.umur = umur;
    }
}
