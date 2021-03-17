package com.lidantao.ersc.dao;

import com.lidantao.ersc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lidantao
 * @data 2021/3/17 9:06
 */
@Mapper
public interface UserMapper {

    int loginUser(User user);

}
