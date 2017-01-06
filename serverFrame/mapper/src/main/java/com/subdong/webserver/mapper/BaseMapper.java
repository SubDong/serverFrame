package com.subdong.webserver.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Rainbow
 *
 * @author SubDong
 * @version V2.0
 *          Copyright (c)2017 ShuZiDong(舒子栋)-版权所有
 * @since 2017/1/6
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
