package com.fruitmarket.trade.dao;

import com.fruitmarket.trade.vo.TradeVO;

import java.util.List;

public interface TradeDAO {
    public List<TradeVO> getTradeByUser(String userId);
    public int makeTrade(TradeVO tradeVO);
    public int userBuyFruit(TradeVO tradeVO);
    public int userSellFruit(TradeVO tradeVO);
}
