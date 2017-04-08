package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HienD on 4/8/2017.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Das Boot, reporting your duty";
    }
}
