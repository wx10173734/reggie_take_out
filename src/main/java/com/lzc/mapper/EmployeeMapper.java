package com.lzc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzc.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luozouchen
 * @date 2022/7/18
 * @apiNote
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
