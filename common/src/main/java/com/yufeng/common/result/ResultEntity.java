package com.yufeng.common.result;

import com.alibaba.fastjson.JSON;
import jdk.nashorn.internal.ir.debug.JSONWriter;

/**
 *
 * @author yangwu
 * @since 2021/5/7 11:37
 */
public class ResultEntity<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResultEntity() {
    }

    public ResultEntity(ResultEnum resultEnum) {
        this.code = resultEnum.code;
        this.msg = resultEnum.msg;
    }

    public Integer getCode() {
        return code;
    }

    public ResultEntity setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultEntity setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultEntity setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }



}
