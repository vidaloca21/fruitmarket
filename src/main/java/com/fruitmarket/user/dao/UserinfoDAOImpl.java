package com.fruitmarket.user.dao;

import com.fruitmarket.user.vo.UserinfoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserinfoDAOImpl extends SqlSessionDaoSupport implements UserinfoDAO {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public int getUserCount() {
        return getSqlSession().selectOne("getUserCount");
    }

    @Override
    public UserinfoVO getOneUser(String id) {
        return getSqlSession().selectOne("getOneUser", id);
    }

    @Override
    public int regist(UserinfoVO user) {
        return getSqlSession().insert("regist", user);
    }


}
