package com.fruitmarket.basket.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasketVO {
    private String basketId;
    private String userId;
    private String fruitId;
    private int quantity;
    private int price;
}
