package com.lzc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzc.dto.DishDto;
import com.lzc.entity.Dish;

import java.util.List;

/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */
public interface DishService extends IService<Dish> {
    //新增菜品同时插入菜品对应的口味数据，需要操作两张表，dish,dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新口味信息
    public void updateWithFlavor(DishDto dishDto);

    //删除菜品信息，同时删除和套餐关联数据
    public void removeWithSetmeal(List<Long> ids);

}
