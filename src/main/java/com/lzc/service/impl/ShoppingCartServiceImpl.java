package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.ShoppingCart;
import com.lzc.mapper.ShoppingCartMapper;
import com.lzc.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/24
 * @apiNote
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
