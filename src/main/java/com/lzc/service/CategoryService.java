package com.lzc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzc.entity.Category;

/**
 * @author luozouchen
 * @date 2022/7/19
 * @apiNote
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
