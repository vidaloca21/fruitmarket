package com.fruitmarket.user.service;

import com.fruitmarket.user.vo.UserinfoVO;

public interface UserinfoService {
    public int getUserCount();
    public UserinfoVO getOneUser(String id);
    public UserinfoVO login(UserinfoVO user);
    public int regist(UserinfoVO user);
}
