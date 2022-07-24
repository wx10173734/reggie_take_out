package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.OrderDetail;
import com.lzc.mapper.OrderDetailMapper;
import com.lzc.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/24
 * @apiNote
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
