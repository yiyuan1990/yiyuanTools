package com.sjr.yiyuantools.base;

public class BaseResponse<T> {
    /**
     * ret : 200
     * data : {"err_code":1,"err_msg":"登录失败，用户名不存在或密码错误","uuid":"","token":""}
     * msg : 当前请求接口：App.User.Login
     */

    private int ret;
    private T data;
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

//    private String msg;
//    private int code;
//    private T data;
//    private int showapi_res_code;
//    private String showapi_res_error;
//    private T showapi_res_body;
//
//    public int getShowapi_res_code() {
//        return showapi_res_code;
//    }
//
//    public void setShowapi_res_code(int showapi_res_code) {
//        this.showapi_res_code = showapi_res_code;
//    }
//
//    public String getShowapi_res_error() {
//        return showapi_res_error;
//    }
//
//    public void setShowapi_res_error(String showapi_res_error) {
//        this.showapi_res_error = showapi_res_error;
//    }
//
//    public T getShowapi_res_body() {
//        return showapi_res_body;
//    }
//
//    public void setShowapi_res_body(T showapi_res_body) {
//        this.showapi_res_body = showapi_res_body;
//    }
//
//    @Override
//    public String toString() {
//        return "BaseResponse{" +
//                "showapi_res_code=" + showapi_res_code +
//                ", showapi_res_error='" + showapi_res_error + '\'' +
//                ", showapi_res_body=" + showapi_res_body +
//                '}';
//    }



}
