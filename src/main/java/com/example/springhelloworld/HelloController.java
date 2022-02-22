package com.example.springhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class HelloController {
        @GetMapping("/")
        public String hei(String navn){
            int antallBokstaver = navn.length();
            return "Hei verden "+navn+ ", navnet dit har "+antallBokstaver+ " bokstaver!";
        }
    }


