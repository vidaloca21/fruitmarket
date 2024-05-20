package com.fruitmarket.trade.dao;

import com.fruitmarket.trade.vo.TradeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TradeDAOImpl extends SqlSessionDaoSupport implements TradeDAO {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public int makeTrade(TradeVO tradeVO) {
        return getSqlSession().insert("makeTrade", tradeVO);
    }
}
