package com.fzf.game.utils;

import lombok.Data;

@Data
public class Result <T>{
    private String msg;
    private int status;
    private T data;

    public static Result success(Object obj){
        Result result=new Result();
        result.setMsg(Constants.SUCCESS_MSG);
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setData(obj);
        return result;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static Result error() {
        Result result = new Result();
        result.setStatus(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }


}
