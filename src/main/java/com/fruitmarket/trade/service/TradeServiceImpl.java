package com.fruitmarket.trade.service;

import com.fruitmarket.trade.dao.TradeDAO;
import com.fruitmarket.trade.vo.TradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeDAO tradeDAO;


    @Override
    public List<TradeVO> getTradeByUser(String userId) {
        return tradeDAO.getTradeByUser(userId);
    }

    @Transactional
    @Override
    public int makeTrade(TradeVO tradeVO) {
        if (tradeVO.getTradePosition().equals("BUY")) {
            tradeDAO.userBuyFruit(tradeVO);
        } else if (tradeVO.getTradePosition().equals("SELL")) {
            tradeDAO.userSellFruit(tradeVO);
        }
        return tradeDAO.makeTrade(tradeVO);
    }
}
