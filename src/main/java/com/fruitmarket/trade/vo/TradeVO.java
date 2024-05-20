package com.fruitmarket.trade.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TradeVO {
    private String tradeId;
    private String userId;
    private String fruitId;
    private int quantity;
    private int price;
    private String tradePosition;
    private String tradeDate;
}
