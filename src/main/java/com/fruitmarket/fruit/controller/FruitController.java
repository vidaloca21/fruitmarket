package com.fruitmarket.fruit.controller;

import com.fruitmarket.fruit.service.FruitService;
import com.fruitmarket.fruit.vo.FruitVO;
import com.fruitmarket.user.vo.UserinfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @GetMapping("/getfruit")
    public String getFruits(Model model) {
        List<FruitVO> fruits = fruitService.getAllFruits();
        model.addAttribute("fruits", fruits);
        return "market";
    }

    @ResponseBody
    @GetMapping("/fruit/{id}")
    public Map<String, FruitVO> getFruitById(@PathVariable String id) {
        Map<String, FruitVO> result = new HashMap<>();
        FruitVO fruitVO = fruitService.getFruitVOById(id);
        result.put("result", fruitVO);
        return result;
    }

}
