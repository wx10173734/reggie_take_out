package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.Dish;
import com.lzc.mapper.DishMapper;
import com.lzc.service.DishService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
