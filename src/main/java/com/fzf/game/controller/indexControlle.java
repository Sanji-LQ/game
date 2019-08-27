package com.fzf.game.controller;


import com.fzf.game.service.indexActivity;
import com.fzf.game.utils.ActivityMes;
import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/index")
public class indexControlle {
    @Resource
    indexActivity indexActivity;
    @RequestMapping("/activity")
    public Result indexActivity(int typeId){
        try {
            ActivityMes activityMes = indexActivity.queryActivity(typeId);
            return  Result.success(activityMes);
        }catch (Exception e){
            return Result.error();
        }

    }

}
