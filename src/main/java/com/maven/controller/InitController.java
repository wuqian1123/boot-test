package com.maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName InitController
 * @Author
 * @Date 2022/10/24 16:21
 * @Description InitController
 * @Version 1.0
 */
@RestController
public class InitController {

    @GetMapping("/init")
    public String init(){
        return "active";
    }
}
