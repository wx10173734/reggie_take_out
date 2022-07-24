package com.lzc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzc.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luozouchen
 * @date 2022/7/24
 * @apiNote
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
