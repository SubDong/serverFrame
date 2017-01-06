package com.subdong.webserver.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by Rainbow
 *
 * @author SubDong
 * @version V2.0
 *          Copyright (c)2016 zyx-版权所有
 * @since 2017/1/6
 */
public class RedisUtils {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
}
