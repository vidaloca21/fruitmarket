package com.fruitmarket.fmController;

import com.fruitmarket.basket.service.BasketService;
import com.fruitmarket.basket.vo.BasketVO;
import com.fruitmarket.fruit.service.FruitService;
import com.fruitmarket.fruit.vo.FruitVO;
import com.fruitmarket.trade.service.TradeService;
import com.fruitmarket.trade.vo.TradeVO;
import com.fruitmarket.user.service.UserinfoService;
import com.fruitmarket.user.vo.UserinfoVO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FmController {

    @Autowired
    private UserinfoService userinfoService;
    @Autowired
    private FruitService fruitService;
    @Autowired
    private BasketService basketService;
    @Autowired
    private TradeService tradeService;

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        UserinfoVO user = (UserinfoVO) session.getAttribute("_LOGIN_USER_");
        if (user == null) {
            return "redirect:/login";
        }
        List<BasketVO> userBasket = basketService.getBasketByUser(user);
        List<FruitVO> fruits = fruitService.getAllFruits();
        List<TradeVO> tradeList = tradeService.getTradeByUser(user.getUserId());

        model.addAttribute("_LOGIN_USER_", session);
        model.addAttribute("fruits", fruits);
        model.addAttribute("userinfoVO", new UserinfoVO());
        model.addAttribute("userBasket", userBasket);
        model.addAttribute("tradeList", tradeList);
        return "index";
    }


}
