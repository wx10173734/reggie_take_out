package com.lzc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzc.entity.AddressBook;
import com.lzc.mapper.AddressBookMapper;
import com.lzc.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author luozouchen
 * @date 2022/7/23
 * @apiNote
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
