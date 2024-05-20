package com.fruitmarket.fruit.dao;

import com.fruitmarket.fruit.vo.FruitVO;

import java.util.List;

public interface FruitDAO {
    public List<FruitVO> getAllFruits();
    public FruitVO getFruitVOById(String id);
}
