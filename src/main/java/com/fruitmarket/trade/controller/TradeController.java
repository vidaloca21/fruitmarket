package com.fruitmarket.trade.controller;

import com.fruitmarket.trade.service.TradeService;
import com.fruitmarket.trade.vo.TradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @ResponseBody
    @PostMapping("/doTrade")
    public Map<String, Integer> doTrade(@ModelAttribute("tradeVO") TradeVO tradeVO) {
        Map<String, Integer> result = new HashMap<>();
        result.put("result", tradeService.makeTrade(tradeVO));
        return result;
    }

}
