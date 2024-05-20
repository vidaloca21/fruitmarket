package com.fruitmarket.fruit.service;

import com.fruitmarket.fruit.dao.FruitDAO;
import com.fruitmarket.fruit.vo.FruitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitDAO fruitDAO;

    @Override
    public List<FruitVO> getAllFruits() {
        return fruitDAO.getAllFruits();
    }

    @Override
    public FruitVO getFruitVOById(String id) {
        return fruitDAO.getFruitVOById(id);
    }

}
