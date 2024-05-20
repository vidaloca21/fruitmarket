package com.fruitmarket.user.dao;

import com.fruitmarket.user.vo.UserinfoVO;

public interface UserinfoDAO {
    public int getUserCount();
    public UserinfoVO getOneUser(String id);
    public int regist(UserinfoVO user);
}
