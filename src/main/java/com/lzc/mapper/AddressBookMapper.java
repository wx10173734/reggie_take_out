package com.lzc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzc.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luozouchen
 * @date 2022/7/23
 * @apiNote
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
