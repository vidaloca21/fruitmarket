package com.fruitmarket.user.controller;

import com.fruitmarket.user.service.UserinfoService;
import com.fruitmarket.user.vo.UserinfoVO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("/regist")
    public String regist(Model model, HttpSession session) {
        if (session.getAttribute("_LOGIN_USER_") != null) {
            session.invalidate();
        }
        model.addAttribute("userinfoVO", new UserinfoVO());
        return "regist";
    }

    @PostMapping("/regist")
    public String doregist(@ModelAttribute("userinfoVO") UserinfoVO userinfo) {
        int isSuccess = userinfoService.regist(userinfo);
        if (isSuccess == 1) {
            return "redirect:/";
        } else {
            return "regist";
        }
    }

    @GetMapping("/login")
    public String login(Model model, HttpSession session) {
        if (session.getAttribute("_LOGIN_USER_") != null) {
            session.invalidate();
        }
        model.addAttribute("userinfoVO", new UserinfoVO());
        return "login";
    }

    @PostMapping("/login")
    public String dologin(Model model, @ModelAttribute("userinfoVO") UserinfoVO userinfo, HttpSession session) {
        UserinfoVO userinfoVO = userinfoService.login(userinfo);
        session.setAttribute("_LOGIN_USER_", userinfoVO);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
//사용자 입력은 userinfo && DB 정보는 userinfoVO && view에 줄때는 user
}
