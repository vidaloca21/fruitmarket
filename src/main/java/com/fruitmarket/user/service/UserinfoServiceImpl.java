package com.fruitmarket.user.service;

import com.fruitmarket.user.dao.UserinfoDAO;
import com.fruitmarket.user.vo.UserinfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoDAO userinfoDAO;

    @Override
    public int getUserCount() {
        return userinfoDAO.getUserCount();
    }

    @Override
    public UserinfoVO getOneUser(String id) {
        return userinfoDAO.getOneUser(id);
    }

    @Override
    public UserinfoVO login(UserinfoVO user) {
        UserinfoVO userinfo = getOneUser(user.getUserId());
        if (userinfo.getPassword().equals(user.getPassword())) {
            return userinfo;
        }
        return null;
    }

    @Override
    public int regist(UserinfoVO user) {
        return userinfoDAO.regist(user);
    }
}
