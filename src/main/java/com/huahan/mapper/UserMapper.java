package com.huahan.mapper;

import org.apache.ibatis.annotations.Param;

import com.huahan.config.mybatis.MyMapper;
import com.huahan.model.User;

public interface UserMapper extends MyMapper<User> {

    public User selectByCardNo(@Param("cardNo") int cardNo);

}