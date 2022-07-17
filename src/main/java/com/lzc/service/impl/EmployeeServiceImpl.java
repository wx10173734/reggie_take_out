package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.Employee;
import com.lzc.mapper.EmployeeMapper;
import com.lzc.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/18
 * @apiNote
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
