package com.fruitmarket.basket.dao;

import com.fruitmarket.basket.vo.BasketVO;
import com.fruitmarket.fruit.vo.FruitVO;
import com.fruitmarket.user.vo.UserinfoVO;

import java.util.List;

public interface BasketDAO {
    public List<BasketVO> getBasketByUser(UserinfoVO userinfoVO);
}
