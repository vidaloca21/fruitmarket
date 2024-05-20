package com.fruitmarket.basket.service;

import com.fruitmarket.basket.vo.BasketVO;
import com.fruitmarket.user.vo.UserinfoVO;

import java.util.List;

public interface BasketService {
    public List<BasketVO> getBasketByUser(UserinfoVO userinfoVO);
}
