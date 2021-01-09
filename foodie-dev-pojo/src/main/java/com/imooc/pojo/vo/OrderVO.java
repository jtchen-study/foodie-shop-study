package com.imooc.pojo.vo;

import com.imooc.pojo.bo.ShopcartBO;

import java.util.List;

public class OrderVO {
    private String orderId;
    private MerchantOrdersVO merchantOrdersVO;
    private List<ShopcartBO> toBeRemovedShopcatList;

    public List<ShopcartBO> getToBeRemovedShopcatList() {
        return toBeRemovedShopcatList;
    }

    public void setToBeRemovedShopcatList(List<ShopcartBO> toBeRemovedShopcatList) {
        this.toBeRemovedShopcatList = toBeRemovedShopcatList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public MerchantOrdersVO getMerchantOrdersVO() {
        return merchantOrdersVO;
    }

    public void setMerchantOrdersVO(MerchantOrdersVO merchantOrdersVO) {
        this.merchantOrdersVO = merchantOrdersVO;
    }
}
