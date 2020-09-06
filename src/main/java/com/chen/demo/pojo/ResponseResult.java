package com.chen.demo.pojo;
import lombok.Data;

@Data
public class ResponseResult<T> {
    private int code;
    private String msg;
    private T data;
    public static<T> ResponseResult renderSuccess(T data){

        ResponseResult<T> objectResponseResult = new ResponseResult<>();
        objectResponseResult.setCode(0);
        objectResponseResult.setData(data);
        objectResponseResult.setMsg("操作成功");
        return objectResponseResult ;
    }
}
