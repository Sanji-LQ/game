package com.fzf.game.controller;

import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRightController {

    @RequestMapping("/error")
    Result error(){
        return Result.error();
    }

}
