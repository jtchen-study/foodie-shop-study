package com.imooc.enums;

public enum PayMethod {
    WEIXIN(1,"微信"),
    ALIPAY(2,"支付宝");
    public  Integer type;
    public  String value;
    PayMethod(Integer type, String value){
        this.value = value;
        this.type = type;
    }
}
