package com.lzc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzc.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
