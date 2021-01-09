package com.imooc.mapper;

import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.vo.MyOrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrdersMapperCustom  {
    public List<MyOrderVO> queryMyOrders(@Param("paramsMap")Map<String,Object> map);

    public int getMyOrderStatusCounts(@Param("paramsMap")Map<String,Object> map);

    public List<OrderStatus> getMyOrderTrend(@Param("paramsMap")Map<String,Object> map);
}