package com.fruitmarket.fruit.service;

import com.fruitmarket.fruit.vo.FruitVO;

import java.util.List;

public interface FruitService {
    public List<FruitVO> getAllFruits();
    public FruitVO getFruitVOById(String id);
}
