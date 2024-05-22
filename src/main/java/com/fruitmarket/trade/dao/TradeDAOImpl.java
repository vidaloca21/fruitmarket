package com.fruitmarket.trade.dao;

import com.fruitmarket.trade.vo.TradeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TradeDAOImpl extends SqlSessionDaoSupport implements TradeDAO {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<TradeVO> getTradeByUser(String userId) {
        return getSqlSession().selectList("getTradeByUser", userId);
    }

    @Override
    public int makeTrade(TradeVO tradeVO) {
        return getSqlSession().insert("makeTrade", tradeVO);
    }

    @Override
    public int userBuyFruit(TradeVO tradeVO) {
        return getSqlSession().update("userBuyFruit", tradeVO);
    }

    @Override
    public int userSellFruit(TradeVO tradeVO) {
        return getSqlSession().update("userSellFruit", tradeVO);
    }
}
