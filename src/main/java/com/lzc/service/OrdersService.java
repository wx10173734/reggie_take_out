package com.lzc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzc.entity.Orders;

/**
 * @author luozouchen
 * @date 2022/7/24
 * @apiNote
 */
public interface OrdersService extends IService<Orders> {
    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
