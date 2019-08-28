package com.fzf.game.controller;


import com.fzf.game.domain.entity.Activity;
import com.fzf.game.service.indexActivity;
import com.fzf.game.utils.ActivityMes;
import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/index")
public class indexControlle {
    @Resource
    indexActivity indexActivity;
    @RequestMapping("/activity")
    public Result indexActivity(int typeId){
        try {
            List<Activity> activities = indexActivity.queryActivity(typeId);
            return  Result.success(activities);
        }catch (Exception e){
            return Result.error();
        }
    }
    @RequestMapping("/queryAll")
    public Result queryAll(@RequestParam(value = "page",required = false,defaultValue = "1") Integer page,
                             @RequestParam(value = "size",required = false,defaultValue = "10") Integer size){
        try {
            List<Activity> activities = indexActivity.queryAll(page,size);
            return  Result.success(activities);
        }catch (Exception e){
            return Result.error();
        }
    }


}
