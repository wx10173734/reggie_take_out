package com.lzc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.common.CustomException;
import com.lzc.entity.Category;
import com.lzc.entity.Dish;
import com.lzc.entity.Setmeal;
import com.lzc.mapper.CategoryMapper;
import com.lzc.service.CategoryService;
import com.lzc.service.DishService;
import com.lzc.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，删除之前需要进行判断
     *
     * @param id
     */
    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据分类Id进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);
        int dishCount = dishService.count(dishLambdaQueryWrapper);
        //查询当前分类是否关联菜品，如果已经关联，抛出一个业务异常
        if (dishCount > 0) {
            //已经关联，抛出一个异常
            throw new CustomException("当前分类下关联了菜品,不能删除");
        }
        //查询当前分类是否关联套餐，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);
        int setmealCount = setmealService.count(setmealLambdaQueryWrapper);
        if (setmealCount > 0) {
            //已经关联套餐，抛出异常
            throw new CustomException("当前分类下关联了套餐,不能删除");
        }
        //正常删除
        super.removeById(id);
    }
}
