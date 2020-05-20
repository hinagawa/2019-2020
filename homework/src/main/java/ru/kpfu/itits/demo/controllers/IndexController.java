package ru.kpfu.itits.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itits.demo.models.User;
import ru.kpfu.itits.demo.security.UserDetailsImpl;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String getIndexPage(Model model, Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        User user = userDetails.getUser();
        model.addAttribute("user", user);
        return "chat";
    }
}
