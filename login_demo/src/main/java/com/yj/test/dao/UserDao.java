package com.yj.test.dao;

import com.yj.test.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);

}
