package com.fruitmarket.trade.service;

import com.fruitmarket.trade.vo.TradeVO;

import java.util.List;

public interface TradeService {
    public List<TradeVO> getTradeByUser(String userId);
    public int makeTrade(TradeVO tradeVO);
}
