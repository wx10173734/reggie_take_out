package com.lzc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzc.dto.SetmealDto;
import com.lzc.entity.Setmeal;

import java.util.List;

/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐同时保存套餐和菜品关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    //获取套餐信息，以及套餐菜品信息
    public SetmealDto getByIdWithSetmalDish(Long id);

    //更新套餐信息，同时更新菜品信息
    public void updateWithSetmalDish(SetmealDto setmealDto);
}
