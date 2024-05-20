package com.fruitmarket.fruit.dao;

import com.fruitmarket.fruit.vo.FruitVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FruitDAOImpl extends SqlSessionDaoSupport implements FruitDAO {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<FruitVO> getAllFruits() {
        return getSqlSession().selectList("getAllFruits");
    }

    @Override
    public FruitVO getFruitVOById(String id) {
        return getSqlSession().selectOne("getFruitVOById", id);
    }
}
