package com.fruitmarket.trade.controller;

import com.fruitmarket.trade.service.TradeService;
import com.fruitmarket.trade.vo.TradeVO;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @PostMapping("/doTrade")
    public String doTrade(@ModelAttribute("tradeVO") TradeVO tradeVO, HttpSession session) {
        if (session.getAttribute("_LOGIN_USER_") == null) {
            return "redirect:/login";
        }
        tradeService.makeTrade(tradeVO);
        return "redirect:/";
    }

}
