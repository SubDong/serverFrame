package com.subdong.webserver.service.account.impl;

import com.subdong.webserver.entity.TestEntity;
import com.subdong.webserver.service.BaseService;
import com.subdong.webserver.service.BaseServiceImpl;
import com.subdong.webserver.service.account.AccountService;
import org.springframework.stereotype.Service;

/**
 * Created by Rainbow
 *
 * @author SubDong
 * @version V2.0
 *          Copyright (c)2016 zyx-版权所有
 * @since 2017/1/6
 */
@Service("accountServiceImpl")
public class AccountServiceImpl extends BaseServiceImpl<TestEntity> implements AccountService {
    public AccountServiceImpl() {
        super(AccountServiceImpl.class);
    }
}
