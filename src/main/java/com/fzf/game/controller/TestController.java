package com.fzf.game.controller;

import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class TestController {

    @RequestMapping("/error")
    Result error(){
        return Result.error();
    }

}
