package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.DishFlavor;
import com.lzc.mapper.DishFlavorMapper;
import com.lzc.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/21
 * @apiNote
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
