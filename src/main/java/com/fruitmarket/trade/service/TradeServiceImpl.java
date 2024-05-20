package com.fruitmarket.trade.service;

import com.fruitmarket.trade.dao.TradeDAO;
import com.fruitmarket.trade.vo.TradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeDAO tradeDAO;

    @Transactional
    @Override
    public int makeTrade(TradeVO tradeVO) {
        return tradeDAO.makeTrade(tradeVO);
    }
}
