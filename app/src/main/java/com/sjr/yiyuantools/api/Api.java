package com.sjr.yiyuantools.api;


import com.sjr.yiyuantools.base.BaseApi;

/**
 *
 */

public class Api {

//    private String baseUrl = "http://route.showapi.com/";
    private String baseUrl = "http://hn2.api.okayapi.com/";

    private volatile static ApiService apiService;

    public static ApiService getApiService() {
        if (apiService == null) {
            synchronized (Api.class) {
                if (apiService == null) {
                    new Api();
                }
            }
        }
        return apiService;
    }

    private Api() {
        BaseApi baseApi = new BaseApi();
        apiService = baseApi.getRetrofit(baseUrl).create(ApiService.class);
    }
}
