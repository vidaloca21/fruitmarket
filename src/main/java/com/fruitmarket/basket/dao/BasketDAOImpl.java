package com.fruitmarket.basket.dao;

import com.fruitmarket.basket.vo.BasketVO;
import com.fruitmarket.fruit.vo.FruitVO;
import com.fruitmarket.user.vo.UserinfoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BasketDAOImpl extends SqlSessionDaoSupport implements BasketDAO {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<BasketVO> getBasketByUser(UserinfoVO userinfoVO) {
        return getSqlSession().selectList("getBasketByUser", userinfoVO);
    }

}
