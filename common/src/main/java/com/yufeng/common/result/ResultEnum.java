package com.yufeng.common.result;


/**
 *
 * @author yangwu
 * @since 2021/5/7 11:37
 */
public enum ResultEnum {


    /**通用错误**/
    SUCCESS(200,"操作成功"),

    FAIL(500,"服务器内部错误");


    public int code;

    public String  msg;
    ResultEnum(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }
}
