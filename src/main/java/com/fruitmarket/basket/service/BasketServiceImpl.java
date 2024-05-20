package com.fruitmarket.basket.service;

import com.fruitmarket.basket.dao.BasketDAO;
import com.fruitmarket.basket.vo.BasketVO;
import com.fruitmarket.user.vo.UserinfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketDAO basketDAO;

    @Override
    public List<BasketVO> getBasketByUser(UserinfoVO userinfoVO) {
        return basketDAO.getBasketByUser(userinfoVO);
    }
}
